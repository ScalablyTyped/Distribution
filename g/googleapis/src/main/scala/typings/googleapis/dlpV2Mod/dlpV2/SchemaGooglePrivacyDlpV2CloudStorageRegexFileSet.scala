package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Message representing a set of files in a Cloud Storage bucket. Regular
  * expressions are used to allow fine-grained control over which files in the
  * bucket to include.  Included files are those that match at least one item
  * in `include_regex` and do not match any items in `exclude_regex`. Note that
  * a file that matches items from both lists will _not_ be included. For a
  * match to occur, the entire file path (i.e., everything in the url after the
  * bucket name) must match the regular expression.  For example, given the
  * input `{bucket_name: &quot;mybucket&quot;, include_regex:
  * [&quot;directory1/.*&quot;], exclude_regex:
  * [&quot;directory1/excluded.*&quot;]}`:  * `gs://mybucket/directory1/myfile`
  * will be included * `gs://mybucket/directory1/directory2/myfile` will be
  * included (`.*` matches across `/`) *
  * `gs://mybucket/directory0/directory1/myfile` will _not_ be included (the
  * full path doesn&#39;t match any items in `include_regex`) *
  * `gs://mybucket/directory1/excludedfile` will _not_ be included (the path
  * matches an item in `exclude_regex`)  If `include_regex` is left empty, it
  * will match all files by default (this is equivalent to setting
  * `include_regex: [&quot;.*&quot;]`).  Some other common use cases:  *
  * `{bucket_name: &quot;mybucket&quot;, exclude_regex: [&quot;.*\.pdf&quot;]}`
  * will include all files in `mybucket` except for .pdf files * `{bucket_name:
  * &quot;mybucket&quot;, include_regex: [&quot;directory/[^/]+&quot;]}` will
  * include all files directly under `gs://mybucket/directory/`, without
  * matching across `/`
  */
trait SchemaGooglePrivacyDlpV2CloudStorageRegexFileSet extends StObject {
  
  /**
    * The name of a Cloud Storage bucket. Required.
    */
  var bucketName: js.UndefOr[String] = js.undefined
  
  /**
    * A list of regular expressions matching file paths to exclude. All files
    * in the bucket that match at least one of these regular expressions will
    * be excluded from the scan.  Regular expressions use RE2
    * [syntax](https://github.com/google/re2/wiki/Syntax); a guide can be found
    * under the google/re2 repository on GitHub.
    */
  var excludeRegex: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * A list of regular expressions matching file paths to include. All files
    * in the bucket that match at least one of these regular expressions will
    * be included in the set of files, except for those that also match an item
    * in `exclude_regex`. Leaving this field empty will match all files by
    * default (this is equivalent to including `.*` in the list).  Regular
    * expressions use RE2 [syntax](https://github.com/google/re2/wiki/Syntax);
    * a guide can be found under the google/re2 repository on GitHub.
    */
  var includeRegex: js.UndefOr[js.Array[String]] = js.undefined
}
object SchemaGooglePrivacyDlpV2CloudStorageRegexFileSet {
  
  inline def apply(): SchemaGooglePrivacyDlpV2CloudStorageRegexFileSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2CloudStorageRegexFileSet]
  }
  
  extension [Self <: SchemaGooglePrivacyDlpV2CloudStorageRegexFileSet](x: Self) {
    
    inline def setBucketName(value: String): Self = StObject.set(x, "bucketName", value.asInstanceOf[js.Any])
    
    inline def setBucketNameUndefined: Self = StObject.set(x, "bucketName", js.undefined)
    
    inline def setExcludeRegex(value: js.Array[String]): Self = StObject.set(x, "excludeRegex", value.asInstanceOf[js.Any])
    
    inline def setExcludeRegexUndefined: Self = StObject.set(x, "excludeRegex", js.undefined)
    
    inline def setExcludeRegexVarargs(value: String*): Self = StObject.set(x, "excludeRegex", js.Array(value :_*))
    
    inline def setIncludeRegex(value: js.Array[String]): Self = StObject.set(x, "includeRegex", value.asInstanceOf[js.Any])
    
    inline def setIncludeRegexUndefined: Self = StObject.set(x, "includeRegex", js.undefined)
    
    inline def setIncludeRegexVarargs(value: String*): Self = StObject.set(x, "includeRegex", js.Array(value :_*))
  }
}

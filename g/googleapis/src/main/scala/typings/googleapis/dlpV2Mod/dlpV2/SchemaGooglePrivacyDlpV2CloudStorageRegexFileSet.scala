package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGooglePrivacyDlpV2CloudStorageRegexFileSet extends StObject {
  
  /**
    * The name of a Cloud Storage bucket. Required.
    */
  var bucketName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A list of regular expressions matching file paths to exclude. All files in the bucket that match at least one of these regular expressions will be excluded from the scan. Regular expressions use RE2 [syntax](https://github.com/google/re2/wiki/Syntax); a guide can be found under the google/re2 repository on GitHub.
    */
  var excludeRegex: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * A list of regular expressions matching file paths to include. All files in the bucket that match at least one of these regular expressions will be included in the set of files, except for those that also match an item in `exclude_regex`. Leaving this field empty will match all files by default (this is equivalent to including `.*` in the list). Regular expressions use RE2 [syntax](https://github.com/google/re2/wiki/Syntax); a guide can be found under the google/re2 repository on GitHub.
    */
  var includeRegex: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaGooglePrivacyDlpV2CloudStorageRegexFileSet {
  
  inline def apply(): SchemaGooglePrivacyDlpV2CloudStorageRegexFileSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2CloudStorageRegexFileSet]
  }
  
  extension [Self <: SchemaGooglePrivacyDlpV2CloudStorageRegexFileSet](x: Self) {
    
    inline def setBucketName(value: String): Self = StObject.set(x, "bucketName", value.asInstanceOf[js.Any])
    
    inline def setBucketNameNull: Self = StObject.set(x, "bucketName", null)
    
    inline def setBucketNameUndefined: Self = StObject.set(x, "bucketName", js.undefined)
    
    inline def setExcludeRegex(value: js.Array[String]): Self = StObject.set(x, "excludeRegex", value.asInstanceOf[js.Any])
    
    inline def setExcludeRegexNull: Self = StObject.set(x, "excludeRegex", null)
    
    inline def setExcludeRegexUndefined: Self = StObject.set(x, "excludeRegex", js.undefined)
    
    inline def setExcludeRegexVarargs(value: String*): Self = StObject.set(x, "excludeRegex", js.Array(value*))
    
    inline def setIncludeRegex(value: js.Array[String]): Self = StObject.set(x, "includeRegex", value.asInstanceOf[js.Any])
    
    inline def setIncludeRegexNull: Self = StObject.set(x, "includeRegex", null)
    
    inline def setIncludeRegexUndefined: Self = StObject.set(x, "includeRegex", js.undefined)
    
    inline def setIncludeRegexVarargs(value: String*): Self = StObject.set(x, "includeRegex", js.Array(value*))
  }
}

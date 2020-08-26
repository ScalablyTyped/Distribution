package typings.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
@js.native
trait SchemaGooglePrivacyDlpV2CloudStorageRegexFileSet extends js.Object {
  /**
    * The name of a Cloud Storage bucket. Required.
    */
  var bucketName: js.UndefOr[String] = js.native
  /**
    * A list of regular expressions matching file paths to exclude. All files
    * in the bucket that match at least one of these regular expressions will
    * be excluded from the scan.  Regular expressions use RE2
    * [syntax](https://github.com/google/re2/wiki/Syntax); a guide can be found
    * under the google/re2 repository on GitHub.
    */
  var excludeRegex: js.UndefOr[js.Array[String]] = js.native
  /**
    * A list of regular expressions matching file paths to include. All files
    * in the bucket that match at least one of these regular expressions will
    * be included in the set of files, except for those that also match an item
    * in `exclude_regex`. Leaving this field empty will match all files by
    * default (this is equivalent to including `.*` in the list).  Regular
    * expressions use RE2 [syntax](https://github.com/google/re2/wiki/Syntax);
    * a guide can be found under the google/re2 repository on GitHub.
    */
  var includeRegex: js.UndefOr[js.Array[String]] = js.native
}

object SchemaGooglePrivacyDlpV2CloudStorageRegexFileSet {
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2CloudStorageRegexFileSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2CloudStorageRegexFileSet]
  }
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2CloudStorageRegexFileSetOps[Self <: SchemaGooglePrivacyDlpV2CloudStorageRegexFileSet] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBucketName(value: String): Self = this.set("bucketName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBucketName: Self = this.set("bucketName", js.undefined)
    @scala.inline
    def setExcludeRegexVarargs(value: String*): Self = this.set("excludeRegex", js.Array(value :_*))
    @scala.inline
    def setExcludeRegex(value: js.Array[String]): Self = this.set("excludeRegex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExcludeRegex: Self = this.set("excludeRegex", js.undefined)
    @scala.inline
    def setIncludeRegexVarargs(value: String*): Self = this.set("includeRegex", js.Array(value :_*))
    @scala.inline
    def setIncludeRegex(value: js.Array[String]): Self = this.set("includeRegex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeRegex: Self = this.set("includeRegex", js.undefined)
  }
  
}


package typings.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Set of files to scan.
  */
@js.native
trait SchemaGooglePrivacyDlpV2FileSet extends js.Object {
  /**
    * The regex-filtered set of files to scan. Exactly one of `url` or
    * `regex_file_set` must be set.
    */
  var regexFileSet: js.UndefOr[SchemaGooglePrivacyDlpV2CloudStorageRegexFileSet] = js.native
  /**
    * The Cloud Storage url of the file(s) to scan, in the format
    * `gs://&lt;bucket&gt;/&lt;path&gt;`. Trailing wildcard in the path is
    * allowed.  If the url ends in a trailing slash, the bucket or directory
    * represented by the url will be scanned non-recursively (content in
    * sub-directories will not be scanned). This means that `gs://mybucket/` is
    * equivalent to `gs://mybucket/x, and `gs://mybucket/directory/` is
    * equivalent to `gs://mybucket/directory/x.  Exactly one of `url` or
    * `regex_file_set` must be set.
    */
  var url: js.UndefOr[String] = js.native
}

object SchemaGooglePrivacyDlpV2FileSet {
  @scala.inline
  def apply(regexFileSet: SchemaGooglePrivacyDlpV2CloudStorageRegexFileSet = null, url: String = null): SchemaGooglePrivacyDlpV2FileSet = {
    val __obj = js.Dynamic.literal()
    if (regexFileSet != null) __obj.updateDynamic("regexFileSet")(regexFileSet.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2FileSet]
  }
}


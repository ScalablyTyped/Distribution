package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Set of files to scan.
  */
trait SchemaGooglePrivacyDlpV2FileSet extends StObject {
  
  /**
    * The regex-filtered set of files to scan. Exactly one of `url` or
    * `regex_file_set` must be set.
    */
  var regexFileSet: js.UndefOr[SchemaGooglePrivacyDlpV2CloudStorageRegexFileSet] = js.undefined
  
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
  var url: js.UndefOr[String] = js.undefined
}
object SchemaGooglePrivacyDlpV2FileSet {
  
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2FileSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2FileSet]
  }
  
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2FileSetMutableBuilder[Self <: SchemaGooglePrivacyDlpV2FileSet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRegexFileSet(value: SchemaGooglePrivacyDlpV2CloudStorageRegexFileSet): Self = StObject.set(x, "regexFileSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegexFileSetUndefined: Self = StObject.set(x, "regexFileSet", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}

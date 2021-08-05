package typings.googleapis.healthcareV1alphaMod.healthcareV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The Google Cloud Storage location for the input content.
  */
trait SchemaGoogleCloudHealthcareV1alphaGcsSource extends StObject {
  
  /**
    * Points to a [Google Cloud Storage](https://cloud.google.com/storage/) URI
    * containing file(s) with content only. The URI must be in the following
    * format: `gs://bucket-id/object-id`. The URI can include wildcards in
    * `object-id` and thus identify multiple files. Supported wildcards:
    * &#39;*&#39; to match 0 or more non-separator characters  &#39;**&#39; to
    * match 0 or more characters (including separators). Must be used at the
    * end of a path and with no other wildcards in the       path. Can also be
    * used with a file extension (such as .dcm), which       imports all files
    * with the extension in the specified directory and       its
    * sub-directories. For example,       `gs://bucket-id/directory-id/ **.dcm`
    * imports all files with .dcm       extensions in `directory-id/` and its
    * sub-directories.  &#39;?&#39; to match 1 character Returns
    * [google.rpc.Code.INVALID_ARGUMENT] for all other URI formats. Files
    * matching the wildcard are expected to contain content only, no metadata.
    */
  var contentUri: js.UndefOr[String] = js.undefined
}
object SchemaGoogleCloudHealthcareV1alphaGcsSource {
  
  inline def apply(): SchemaGoogleCloudHealthcareV1alphaGcsSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudHealthcareV1alphaGcsSource]
  }
  
  extension [Self <: SchemaGoogleCloudHealthcareV1alphaGcsSource](x: Self) {
    
    inline def setContentUri(value: String): Self = StObject.set(x, "contentUri", value.asInstanceOf[js.Any])
    
    inline def setContentUriUndefined: Self = StObject.set(x, "contentUri", js.undefined)
  }
}

package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleDocsResultInfo extends StObject {
  
  /** The SHA1 hash of the object in Drive, if any. */
  var attachmentSha1: js.UndefOr[String] = js.undefined
  
  /**
    * The storage identifier for the object in Cosmo. This field is intended to used by Stratus/Moonshine integration only. It should not be exposed externally (please refer to
    * encrypted_id for that purpose).
    */
  var cosmoId: js.UndefOr[Id] = js.undefined
  
  /**
    * For Cosmo objects, the Cosmo namespace the object was in. This allows downstream clients to identify whether a document was created in Writely or Kix, Presently or Punch, or whether
    * it was uploaded from GDrive. See storage_cosmo.Id.NAME_SPACE for a list of all Cosmo name spaces.
    */
  var cosmoNameSpace: js.UndefOr[Double] = js.undefined
  
  /** The encrypted (user-visible) id of this object. Knowing the id is sufficient to create a canonical URL for this document. */
  var encryptedId: js.UndefOr[String] = js.undefined
  
  /** The mimetype of the document. */
  var mimeType: js.UndefOr[String] = js.undefined
  
  /** The visibility indicator in the UI will be based upon this. */
  var shareScope: js.UndefOr[ShareScope] = js.undefined
}
object GoogleDocsResultInfo {
  
  inline def apply(): GoogleDocsResultInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleDocsResultInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleDocsResultInfo] (val x: Self) extends AnyVal {
    
    inline def setAttachmentSha1(value: String): Self = StObject.set(x, "attachmentSha1", value.asInstanceOf[js.Any])
    
    inline def setAttachmentSha1Undefined: Self = StObject.set(x, "attachmentSha1", js.undefined)
    
    inline def setCosmoId(value: Id): Self = StObject.set(x, "cosmoId", value.asInstanceOf[js.Any])
    
    inline def setCosmoIdUndefined: Self = StObject.set(x, "cosmoId", js.undefined)
    
    inline def setCosmoNameSpace(value: Double): Self = StObject.set(x, "cosmoNameSpace", value.asInstanceOf[js.Any])
    
    inline def setCosmoNameSpaceUndefined: Self = StObject.set(x, "cosmoNameSpace", js.undefined)
    
    inline def setEncryptedId(value: String): Self = StObject.set(x, "encryptedId", value.asInstanceOf[js.Any])
    
    inline def setEncryptedIdUndefined: Self = StObject.set(x, "encryptedId", js.undefined)
    
    inline def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
    
    inline def setMimeTypeUndefined: Self = StObject.set(x, "mimeType", js.undefined)
    
    inline def setShareScope(value: ShareScope): Self = StObject.set(x, "shareScope", value.asInstanceOf[js.Any])
    
    inline def setShareScopeUndefined: Self = StObject.set(x, "shareScope", js.undefined)
  }
}

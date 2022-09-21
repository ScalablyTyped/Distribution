package typings.maximMazurokGapiClientBinaryauthorization.gapi.client.binaryauthorization

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Attestor extends StObject {
  
  /** Optional. A descriptive comment. This field may be updated. The field may be displayed in chooser dialogs. */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. A checksum, returned by the server, that can be sent on update requests to ensure the attestor has an up-to-date value before attempting to update it. See
    * https://google.aip.dev/154.
    */
  var etag: js.UndefOr[String] = js.undefined
  
  /** Required. The resource name, in the format: `projects/ *‍/attestors/ *`. This field may not be updated. */
  var name: js.UndefOr[String] = js.undefined
  
  /** Output only. Time when the attestor was last updated. */
  var updateTime: js.UndefOr[String] = js.undefined
  
  /** This specifies how an attestation will be read, and how it will be used during policy enforcement. */
  var userOwnedGrafeasNote: js.UndefOr[UserOwnedGrafeasNote] = js.undefined
}
object Attestor {
  
  inline def apply(): Attestor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Attestor]
  }
  
  extension [Self <: Attestor](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
    
    inline def setUserOwnedGrafeasNote(value: UserOwnedGrafeasNote): Self = StObject.set(x, "userOwnedGrafeasNote", value.asInstanceOf[js.Any])
    
    inline def setUserOwnedGrafeasNoteUndefined: Self = StObject.set(x, "userOwnedGrafeasNote", js.undefined)
  }
}

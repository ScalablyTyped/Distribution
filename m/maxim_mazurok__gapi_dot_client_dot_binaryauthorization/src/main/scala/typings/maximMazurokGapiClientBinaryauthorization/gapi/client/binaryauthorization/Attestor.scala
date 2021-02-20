package typings.maximMazurokGapiClientBinaryauthorization.gapi.client.binaryauthorization

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Attestor extends StObject {
  
  /** Optional. A descriptive comment. This field may be updated. The field may be displayed in chooser dialogs. */
  var description: js.UndefOr[String] = js.native
  
  /** Required. The resource name, in the format: `projects/∗/attestors/ *`. This field may not be updated. */
  var name: js.UndefOr[String] = js.native
  
  /** Output only. Time when the attestor was last updated. */
  var updateTime: js.UndefOr[String] = js.native
  
  /** This specifies how an attestation will be read, and how it will be used during policy enforcement. */
  var userOwnedGrafeasNote: js.UndefOr[UserOwnedGrafeasNote] = js.native
}
object Attestor {
  
  @scala.inline
  def apply(): Attestor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Attestor]
  }
  
  @scala.inline
  implicit class AttestorMutableBuilder[Self <: Attestor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
    
    @scala.inline
    def setUserOwnedGrafeasNote(value: UserOwnedGrafeasNote): Self = StObject.set(x, "userOwnedGrafeasNote", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserOwnedGrafeasNoteUndefined: Self = StObject.set(x, "userOwnedGrafeasNote", js.undefined)
  }
}

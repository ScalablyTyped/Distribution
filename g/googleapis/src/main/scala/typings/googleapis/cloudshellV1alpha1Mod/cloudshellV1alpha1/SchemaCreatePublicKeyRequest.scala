package typings.googleapis.cloudshellV1alpha1Mod.cloudshellV1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request message for CreatePublicKey.
  */
@js.native
trait SchemaCreatePublicKeyRequest extends js.Object {
  
  /**
    * Key that should be added to the environment.
    */
  var key: js.UndefOr[SchemaPublicKey] = js.native
}
object SchemaCreatePublicKeyRequest {
  
  @scala.inline
  def apply(): SchemaCreatePublicKeyRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreatePublicKeyRequest]
  }
  
  @scala.inline
  implicit class SchemaCreatePublicKeyRequestOps[Self <: SchemaCreatePublicKeyRequest] (val x: Self) extends AnyVal {
    
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
    def setKey(value: SchemaPublicKey): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
  }
}

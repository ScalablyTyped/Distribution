package typings.googleapis.cloudshellV1alpha1Mod.cloudshellV1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A public SSH key, corresponding to a private SSH key held by the client.
  */
@js.native
trait SchemaPublicKey extends js.Object {
  
  /**
    * Required. Format of this key&#39;s content.
    */
  var format: js.UndefOr[String] = js.native
  
  /**
    * Required. Content of this key.
    */
  var key: js.UndefOr[String] = js.native
  
  /**
    * Output only. Full name of this resource, in the format
    * `users/{owner_email}/environments/{environment_id}/publicKeys/{key_id}`.
    * `{owner_email}` is the email address of the user to whom the key belongs.
    * `{environment_id}` is the identifier of the environment to which the key
    * grants access. `{key_id}` is the unique identifier of the key. For
    * example,
    * `users/someone@example.com/environments/default/publicKeys/myKey`.
    */
  var name: js.UndefOr[String] = js.native
}
object SchemaPublicKey {
  
  @scala.inline
  def apply(): SchemaPublicKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPublicKey]
  }
  
  @scala.inline
  implicit class SchemaPublicKeyOps[Self <: SchemaPublicKey] (val x: Self) extends AnyVal {
    
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
    def setFormat(value: String): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
}

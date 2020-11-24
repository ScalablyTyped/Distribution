package typings.maximMazurokGapiClientCloudbuild.gapi.client.cloudbuild

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NotifierSecretRef extends js.Object {
  
  /** The value of `secret_ref` should be a `name` that is registered in a `Secret` in the `secrets` list of the `Spec`. */
  var secretRef: js.UndefOr[String] = js.native
}
object NotifierSecretRef {
  
  @scala.inline
  def apply(): NotifierSecretRef = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotifierSecretRef]
  }
  
  @scala.inline
  implicit class NotifierSecretRefOps[Self <: NotifierSecretRef] (val x: Self) extends AnyVal {
    
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
    def setSecretRef(value: String): Self = this.set("secretRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecretRef: Self = this.set("secretRef", js.undefined)
  }
}

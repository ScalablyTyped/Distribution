package typings.keycloakJs.keycloakAuthzMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeycloakAuthorizationPromise extends js.Object {
  
  def `then`(
    onGrant: js.Function1[/* rpt */ String, Unit],
    onDeny: js.Function0[Unit],
    onError: js.Function0[Unit]
  ): Unit = js.native
}
object KeycloakAuthorizationPromise {
  
  @scala.inline
  def apply(`then`: (js.Function1[/* rpt */ String, Unit], js.Function0[Unit], js.Function0[Unit]) => Unit): KeycloakAuthorizationPromise = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("then")(js.Any.fromFunction3(`then`))
    __obj.asInstanceOf[KeycloakAuthorizationPromise]
  }
  
  @scala.inline
  implicit class KeycloakAuthorizationPromiseOps[Self <: KeycloakAuthorizationPromise] (val x: Self) extends AnyVal {
    
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
    def setThen(value: (js.Function1[/* rpt */ String, Unit], js.Function0[Unit], js.Function0[Unit]) => Unit): Self = this.set("then", js.Any.fromFunction3(value))
  }
}

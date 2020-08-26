package typings.keystonejsAppAdminUi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Authentication[UserType /* <: js.Object */, ListNames /* <: String */] extends js.Object {
  var authentication: Item[UserType, ListNames] = js.native
}

object Authentication {
  @scala.inline
  def apply[/* <: js.Object */ UserType, /* <: java.lang.String */ ListNames](authentication: Item[UserType, ListNames]): Authentication[UserType, ListNames] = {
    val __obj = js.Dynamic.literal(authentication = authentication.asInstanceOf[js.Any])
    __obj.asInstanceOf[Authentication[UserType, ListNames]]
  }
  @scala.inline
  implicit class AuthenticationOps[Self <: Authentication[_, _], /* <: js.Object */ UserType, /* <: java.lang.String */ ListNames] (val x: Self with (Authentication[UserType, ListNames])) extends AnyVal {
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
    def setAuthentication(value: Item[UserType, ListNames]): Self = this.set("authentication", value.asInstanceOf[js.Any])
  }
  
}


package typings.inversifyExpressUtils.interfacesMod.interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Principal extends js.Object {
  var details: js.Any = js.native
  def isAuthenticated(): js.Promise[Boolean] = js.native
  def isInRole(role: String): js.Promise[Boolean] = js.native
  def isResourceOwner(resourceId: js.Any): js.Promise[Boolean] = js.native
}

object Principal {
  @scala.inline
  def apply(
    details: js.Any,
    isAuthenticated: () => js.Promise[Boolean],
    isInRole: String => js.Promise[Boolean],
    isResourceOwner: js.Any => js.Promise[Boolean]
  ): Principal = {
    val __obj = js.Dynamic.literal(details = details.asInstanceOf[js.Any], isAuthenticated = js.Any.fromFunction0(isAuthenticated), isInRole = js.Any.fromFunction1(isInRole), isResourceOwner = js.Any.fromFunction1(isResourceOwner))
    __obj.asInstanceOf[Principal]
  }
  @scala.inline
  implicit class PrincipalOps[Self <: Principal] (val x: Self) extends AnyVal {
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
    def setDetails(value: js.Any): Self = this.set("details", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsAuthenticated(value: () => js.Promise[Boolean]): Self = this.set("isAuthenticated", js.Any.fromFunction0(value))
    @scala.inline
    def setIsInRole(value: String => js.Promise[Boolean]): Self = this.set("isInRole", js.Any.fromFunction1(value))
    @scala.inline
    def setIsResourceOwner(value: js.Any => js.Promise[Boolean]): Self = this.set("isResourceOwner", js.Any.fromFunction1(value))
  }
  
}


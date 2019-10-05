package typings.inversifyDashExpressDashUtils.dtsInterfacesMod.interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Principal extends js.Object {
  var details: js.Any
  def isAuthenticated(): js.Promise[Boolean]
  def isInRole(role: String): js.Promise[Boolean]
  def isResourceOwner(resourceId: js.Any): js.Promise[Boolean]
}

object Principal {
  @scala.inline
  def apply(
    details: js.Any,
    isAuthenticated: () => js.Promise[Boolean],
    isInRole: String => js.Promise[Boolean],
    isResourceOwner: js.Any => js.Promise[Boolean]
  ): Principal = {
    val __obj = js.Dynamic.literal(details = details, isAuthenticated = js.Any.fromFunction0(isAuthenticated), isInRole = js.Any.fromFunction1(isInRole), isResourceOwner = js.Any.fromFunction1(isResourceOwner))
  
    __obj.asInstanceOf[Principal]
  }
}


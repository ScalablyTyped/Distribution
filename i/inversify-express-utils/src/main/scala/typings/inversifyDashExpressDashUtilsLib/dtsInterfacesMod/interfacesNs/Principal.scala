package typings
package inversifyDashExpressDashUtilsLib.dtsInterfacesMod.interfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Principal extends js.Object {
  var details: js.Any
  def isAuthenticated(): js.Promise[scala.Boolean]
  def isInRole(role: java.lang.String): js.Promise[scala.Boolean]
  def isResourceOwner(resourceId: js.Any): js.Promise[scala.Boolean]
}

object Principal {
  @scala.inline
  def apply(
    details: js.Any,
    isAuthenticated: () => js.Promise[scala.Boolean],
    isInRole: java.lang.String => js.Promise[scala.Boolean],
    isResourceOwner: js.Any => js.Promise[scala.Boolean]
  ): Principal = {
    val __obj = js.Dynamic.literal(details = details, isAuthenticated = js.Any.fromFunction0(isAuthenticated), isInRole = js.Any.fromFunction1(isInRole), isResourceOwner = js.Any.fromFunction1(isResourceOwner))
  
    __obj.asInstanceOf[Principal]
  }
}


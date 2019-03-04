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
    isAuthenticated: js.Function0[js.Promise[scala.Boolean]],
    isInRole: js.Function1[java.lang.String, js.Promise[scala.Boolean]],
    isResourceOwner: js.Function1[js.Any, js.Promise[scala.Boolean]]
  ): Principal = {
    val __obj = js.Dynamic.literal(details = details, isAuthenticated = isAuthenticated, isInRole = isInRole, isResourceOwner = isResourceOwner)
  
    __obj.asInstanceOf[Principal]
  }
}


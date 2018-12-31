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


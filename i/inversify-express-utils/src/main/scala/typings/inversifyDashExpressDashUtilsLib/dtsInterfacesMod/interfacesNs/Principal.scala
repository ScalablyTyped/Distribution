package typings
package inversifyDashExpressDashUtilsLib.dtsInterfacesMod.interfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Principal extends js.Object {
  var details: js.Any
  def isAuthenticated(): stdLib.Promise[scala.Boolean]
  def isInRole(role: java.lang.String): stdLib.Promise[scala.Boolean]
  def isResourceOwner(resourceId: js.Any): stdLib.Promise[scala.Boolean]
}


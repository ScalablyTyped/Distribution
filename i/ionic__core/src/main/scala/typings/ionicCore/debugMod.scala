package typings.ionicCore

import typings.ionicCore.interfaceMod.RouteEntry
import typings.ionicCore.interfaceMod.RouteRedirect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/core/dist/types/components/router/utils/debug", JSImport.Namespace)
@js.native
object debugMod extends js.Object {
  def printRedirects(redirects: js.Array[RouteRedirect]): Unit = js.native
  def printRoutes(routes: js.Array[js.Array[RouteEntry]]): Unit = js.native
}


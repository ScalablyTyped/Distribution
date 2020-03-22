package typings.ionicCore

import typings.ionicCore.interfaceMod.RouteChain
import typings.ionicCore.interfaceMod.RouteRedirect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/core/dist/types/components/router/utils/debug", JSImport.Namespace)
@js.native
object debugMod extends js.Object {
  def printRedirects(redirects: js.Array[RouteRedirect]): Unit = js.native
  def printRoutes(routes: js.Array[RouteChain]): Unit = js.native
}


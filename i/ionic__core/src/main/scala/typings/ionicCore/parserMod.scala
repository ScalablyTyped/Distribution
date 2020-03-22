package typings.ionicCore

import typings.ionicCore.interfaceMod.RouteChain
import typings.ionicCore.interfaceMod.RouteRedirect
import typings.ionicCore.interfaceMod.RouteTree
import typings.std.Element
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/core/dist/types/components/router/utils/parser", JSImport.Namespace)
@js.native
object parserMod extends js.Object {
  def flattenRouterTree(nodes: RouteTree): js.Array[RouteChain] = js.native
  def readProp(el: HTMLElement, prop: String): js.UndefOr[String | Null] = js.native
  def readRedirects(root: Element): js.Array[RouteRedirect] = js.native
  def readRouteNodes(root: Element): RouteTree = js.native
  def readRouteNodes(root: Element, node: Element): RouteTree = js.native
  def readRoutes(root: Element): js.Array[RouteChain] = js.native
}


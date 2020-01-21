package typings.ionicCore

import typings.ionicCore.interfaceMod.RouteEntry
import typings.ionicCore.interfaceMod.RouteNode
import typings.ionicCore.interfaceMod.RouteRedirect
import typings.std.Element
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/core/dist/types/components/router/utils/parser", JSImport.Namespace)
@js.native
object parserMod extends js.Object {
  def flattenRouterTree(nodes: js.Array[RouteNode]): js.Array[js.Array[RouteEntry]] = js.native
  def readProp(el: HTMLElement, prop: String): js.UndefOr[String | Null] = js.native
  def readRedirects(root: Element): js.Array[RouteRedirect] = js.native
  def readRouteNodes(root: Element): js.Array[RouteNode] = js.native
  def readRouteNodes(root: Element, node: Element): js.Array[RouteNode] = js.native
  def readRoutes(root: Element): js.Array[js.Array[RouteEntry]] = js.native
}


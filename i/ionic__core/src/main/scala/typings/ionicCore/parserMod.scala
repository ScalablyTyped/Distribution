package typings.ionicCore

import typings.ionicCore.interfaceMod.RouteChain
import typings.ionicCore.interfaceMod.RouteRedirect
import typings.ionicCore.interfaceMod.RouteTree
import typings.std.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parserMod {
  
  @JSImport("@ionic/core/dist/types/components/router/utils/parser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def flattenRouterTree(nodes: RouteTree): js.Array[RouteChain] = ^.asInstanceOf[js.Dynamic].applyDynamic("flattenRouterTree")(nodes.asInstanceOf[js.Any]).asInstanceOf[js.Array[RouteChain]]
  
  @scala.inline
  def readProp(el: HTMLElement, prop: String): js.UndefOr[String | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("readProp")(el.asInstanceOf[js.Any], prop.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String | Null]]
  
  @scala.inline
  def readRedirects(root: Element): js.Array[RouteRedirect] = ^.asInstanceOf[js.Dynamic].applyDynamic("readRedirects")(root.asInstanceOf[js.Any]).asInstanceOf[js.Array[RouteRedirect]]
  
  @scala.inline
  def readRouteNodes(root: Element): RouteTree = ^.asInstanceOf[js.Dynamic].applyDynamic("readRouteNodes")(root.asInstanceOf[js.Any]).asInstanceOf[RouteTree]
  @scala.inline
  def readRouteNodes(root: Element, node: Element): RouteTree = (^.asInstanceOf[js.Dynamic].applyDynamic("readRouteNodes")(root.asInstanceOf[js.Any], node.asInstanceOf[js.Any])).asInstanceOf[RouteTree]
  
  @scala.inline
  def readRoutes(root: Element): js.Array[RouteChain] = ^.asInstanceOf[js.Dynamic].applyDynamic("readRoutes")(root.asInstanceOf[js.Any]).asInstanceOf[js.Array[RouteChain]]
}

package typings
package atIonicReactLib.distTypesComponentsNavigationRoutingNavContextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavContextState extends js.Object {
  var viewStacks: ViewStacks = js.native
  def goBack(): scala.Unit = js.native
  def goBack(defaultHref: java.lang.String): scala.Unit = js.native
  def hideView(viewId: java.lang.String): scala.Unit = js.native
  def removeViewStack(stack: java.lang.String): scala.Unit = js.native
  def renderChild(item: atIonicReactLib.distTypesComponentsNavigationRoutingReactRouterViewItemMod.ViewItem[_]): scala.Unit = js.native
  def setupIonRouter(
    id: java.lang.String,
    children: reactLib.reactMod.ReactNode,
    routerOutlet: atIonicCoreLib.distTypesComponentsMod.Global.HTMLIonRouterOutletElement
  ): scala.Unit = js.native
  def transitionView(
    enteringEl: stdLib.HTMLElement,
    leavingEl: stdLib.HTMLElement,
    ionRouterOuter: atIonicCoreLib.distTypesComponentsMod.Global.HTMLIonRouterOutletElement,
    direction: atIonicCoreLib.distTypesComponentsNavNavDashInterfaceMod.NavDirection
  ): scala.Unit = js.native
}


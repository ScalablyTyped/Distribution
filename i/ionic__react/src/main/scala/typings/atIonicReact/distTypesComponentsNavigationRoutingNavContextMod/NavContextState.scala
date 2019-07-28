package typings.atIonicReact.distTypesComponentsNavigationRoutingNavContextMod

import typings.atIonicCore.distTypesComponentsMod.Global.HTMLIonRouterOutletElement
import typings.atIonicReact.distTypesComponentsNavigationRoutingReactRouterViewItemMod.ViewItem
import typings.react.reactMod.ReactNode
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavContextState extends js.Object {
  var viewStacks: ViewStacks = js.native
  def goBack(): Unit = js.native
  def goBack(defaultHref: String): Unit = js.native
  def hideView(viewId: String): Unit = js.native
  def removeViewStack(stack: String): Unit = js.native
  def renderChild(item: ViewItem[_]): Unit = js.native
  def setupIonRouter(id: String, children: ReactNode, routerOutlet: HTMLIonRouterOutletElement): Unit = js.native
  def transitionView(
    enteringEl: HTMLElement,
    leavingEl: HTMLElement,
    ionRouterOuter: HTMLIonRouterOutletElement,
    direction: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify NavDirection */ js.Any
  ): Unit = js.native
}


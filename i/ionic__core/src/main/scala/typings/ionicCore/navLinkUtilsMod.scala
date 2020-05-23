package typings.ionicCore

import typings.ionicCore.interfaceMod.RouterDirection
import typings.ionicCore.mod.ComponentProps
import typings.ionicCore.viewControllerMod.ViewController
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/core/dist/types/components/nav-link/nav-link-utils", JSImport.Namespace)
@js.native
object navLinkUtilsMod extends js.Object {
  def navLink(el: HTMLElement, routerDirection: RouterDirection): js.Promise[Boolean] = js.native
  def navLink(el: HTMLElement, routerDirection: RouterDirection, component: String): js.Promise[Boolean] = js.native
  def navLink(
    el: HTMLElement,
    routerDirection: RouterDirection,
    component: String,
    componentProps: ComponentProps[Null]
  ): js.Promise[Boolean] = js.native
  def navLink(el: HTMLElement, routerDirection: RouterDirection, component: js.Function): js.Promise[Boolean] = js.native
  def navLink(
    el: HTMLElement,
    routerDirection: RouterDirection,
    component: js.Function,
    componentProps: ComponentProps[Null]
  ): js.Promise[Boolean] = js.native
  def navLink(
    el: HTMLElement,
    routerDirection: RouterDirection,
    component: Null,
    componentProps: ComponentProps[Null]
  ): js.Promise[Boolean] = js.native
  def navLink(el: HTMLElement, routerDirection: RouterDirection, component: ViewController): js.Promise[Boolean] = js.native
  def navLink(
    el: HTMLElement,
    routerDirection: RouterDirection,
    component: ViewController,
    componentProps: ComponentProps[Null]
  ): js.Promise[Boolean] = js.native
  def navLink(el: HTMLElement, routerDirection: RouterDirection, component: HTMLElement): js.Promise[Boolean] = js.native
  def navLink(
    el: HTMLElement,
    routerDirection: RouterDirection,
    component: HTMLElement,
    componentProps: ComponentProps[Null]
  ): js.Promise[Boolean] = js.native
}


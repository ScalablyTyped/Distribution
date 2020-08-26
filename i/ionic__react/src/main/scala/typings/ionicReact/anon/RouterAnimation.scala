package typings.ionicReact.anon

import typings.ionicCore.animationInterfaceMod.Animation
import typings.ionicCore.animationInterfaceMod.AnimationBuilder
import typings.ionicReact.routerDirectionMod.RouterDirection
import typings.ionicReact.routerOptionsMod.RouterOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RouterAnimation extends js.Object {
  var routerAnimation: js.UndefOr[AnimationBuilder] = js.native
  var routerDirection: js.UndefOr[RouterDirection] = js.native
  var routerLink: js.UndefOr[String] = js.native
  var routerOptions: js.UndefOr[RouterOptions] = js.native
}

object RouterAnimation {
  @scala.inline
  def apply(): RouterAnimation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RouterAnimation]
  }
  @scala.inline
  implicit class RouterAnimationOps[Self <: RouterAnimation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setRouterAnimation(value: (/* baseEl */ js.Any, /* opts */ js.UndefOr[js.Any]) => Animation): Self = this.set("routerAnimation", js.Any.fromFunction2(value))
    @scala.inline
    def deleteRouterAnimation: Self = this.set("routerAnimation", js.undefined)
    @scala.inline
    def setRouterDirection(value: RouterDirection): Self = this.set("routerDirection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRouterDirection: Self = this.set("routerDirection", js.undefined)
    @scala.inline
    def setRouterLink(value: String): Self = this.set("routerLink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRouterLink: Self = this.set("routerLink", js.undefined)
    @scala.inline
    def setRouterOptions(value: RouterOptions): Self = this.set("routerOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRouterOptions: Self = this.set("routerOptions", js.undefined)
  }
  
}


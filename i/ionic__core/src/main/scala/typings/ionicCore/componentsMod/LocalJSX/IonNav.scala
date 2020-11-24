package typings.ionicCore.componentsMod.LocalJSX

import typings.ionicCore.animationInterfaceMod.Animation
import typings.ionicCore.animationInterfaceMod.AnimationBuilder
import typings.ionicCore.mod.ComponentProps
import typings.ionicCore.navInterfaceMod.NavComponent
import typings.std.CustomEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IonNav extends js.Object {
  
  /**
    * If `true`, the nav should animate the transition of components.
    */
  var animated: js.UndefOr[Boolean] = js.native
  
  /**
    * By default `ion-nav` animates transition between pages based in the mode (ios or material design). However, this property allows to create custom transition using `AnimateBuilder` functions.
    */
  var animation: js.UndefOr[AnimationBuilder] = js.native
  
  /**
    * Event fired when the nav has changed components
    */
  var onIonNavDidChange: js.UndefOr[js.Function1[/* event */ CustomEvent[Unit], Unit]] = js.native
  
  /**
    * Event fired when the nav will change components
    */
  var onIonNavWillChange: js.UndefOr[js.Function1[/* event */ CustomEvent[Unit], Unit]] = js.native
  
  /**
    * Root NavComponent to load
    */
  var root: js.UndefOr[NavComponent] = js.native
  
  /**
    * Any parameters for the root component
    */
  var rootParams: js.UndefOr[ComponentProps[Null]] = js.native
  
  /**
    * If the nav component should allow for swipe-to-go-back.
    */
  var swipeGesture: js.UndefOr[Boolean] = js.native
}
object IonNav {
  
  @scala.inline
  def apply(): IonNav = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IonNav]
  }
  
  @scala.inline
  implicit class IonNavOps[Self <: IonNav] (val x: Self) extends AnyVal {
    
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
    def setAnimated(value: Boolean): Self = this.set("animated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimated: Self = this.set("animated", js.undefined)
    
    @scala.inline
    def setAnimation(value: (/* baseEl */ js.Any, /* opts */ js.UndefOr[js.Any]) => Animation): Self = this.set("animation", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteAnimation: Self = this.set("animation", js.undefined)
    
    @scala.inline
    def setOnIonNavDidChange(value: /* event */ CustomEvent[Unit] => Unit): Self = this.set("onIonNavDidChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnIonNavDidChange: Self = this.set("onIonNavDidChange", js.undefined)
    
    @scala.inline
    def setOnIonNavWillChange(value: /* event */ CustomEvent[Unit] => Unit): Self = this.set("onIonNavWillChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnIonNavWillChange: Self = this.set("onIonNavWillChange", js.undefined)
    
    @scala.inline
    def setRoot(value: NavComponent): Self = this.set("root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
    
    @scala.inline
    def setRootNull: Self = this.set("root", null)
    
    @scala.inline
    def setRootParams(value: ComponentProps[Null]): Self = this.set("rootParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRootParams: Self = this.set("rootParams", js.undefined)
    
    @scala.inline
    def setSwipeGesture(value: Boolean): Self = this.set("swipeGesture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSwipeGesture: Self = this.set("swipeGesture", js.undefined)
  }
}

package typings.ionicCore

import typings.ionicCore.animationInterfaceMod.Animation
import typings.ionicCore.componentsMod.global.HTMLIonModalElement
import typings.ionicCore.gestureMod.Gesture
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object swipeToCloseMod {
  
  @JSImport("@ionic/core/dist/types/components/modal/gestures/swipe-to-close", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object SwipeToCloseDefaults {
    
    @JSImport("@ionic/core/dist/types/components/modal/gestures/swipe-to-close", "SwipeToCloseDefaults")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@ionic/core/dist/types/components/modal/gestures/swipe-to-close", "SwipeToCloseDefaults.MIN_PRESENTING_SCALE")
    @js.native
    def MIN_PRESENTING_SCALE: Double = js.native
    @scala.inline
    def MIN_PRESENTING_SCALE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MIN_PRESENTING_SCALE")(x.asInstanceOf[js.Any])
  }
  
  @scala.inline
  def createSwipeToCloseGesture(el: HTMLIonModalElement, animation: Animation, onDismiss: js.Function0[Unit]): Gesture = (^.asInstanceOf[js.Dynamic].applyDynamic("createSwipeToCloseGesture")(el.asInstanceOf[js.Any], animation.asInstanceOf[js.Any], onDismiss.asInstanceOf[js.Any])).asInstanceOf[Gesture]
}

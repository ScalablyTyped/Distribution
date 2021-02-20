package typings.ionicCore

import typings.ionicCore.animationInterfaceMod.Animation
import typings.ionicCore.componentsMod.global.HTMLIonModalElement
import typings.ionicCore.gestureMod.Gesture
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object swipeToCloseMod {
  
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
  
  @JSImport("@ionic/core/dist/types/components/modal/gestures/swipe-to-close", "createSwipeToCloseGesture")
  @js.native
  def createSwipeToCloseGesture(el: HTMLIonModalElement, animation: Animation, onDismiss: js.Function0[Unit]): Gesture = js.native
}

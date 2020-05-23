package typings.ionicCore

import typings.ionicCore.animationInterfaceMod.Animation
import typings.ionicCore.componentsMod.global.HTMLIonModalElement
import typings.ionicCore.gestureMod.Gesture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/core/dist/types/components/modal/gestures/swipe-to-close", JSImport.Namespace)
@js.native
object swipeToCloseMod extends js.Object {
  def createSwipeToCloseGesture(el: HTMLIonModalElement, animation: Animation, onDismiss: js.Function0[Unit]): Gesture = js.native
  @js.native
  object SwipeToCloseDefaults extends js.Object {
    var MIN_PRESENTING_SCALE: Double = js.native
  }
  
}


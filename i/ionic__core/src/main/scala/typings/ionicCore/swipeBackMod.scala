package typings.ionicCore

import typings.ionicCore.gestureMod.Gesture
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object swipeBackMod {
  
  @JSImport("@ionic/core/dist/types/utils/gesture/swipe-back", "createSwipeBackGesture")
  @js.native
  def createSwipeBackGesture(
    el: HTMLElement,
    canStartHandler: js.Function0[Boolean],
    onStartHandler: js.Function0[Unit],
    onMoveHandler: js.Function1[/* step */ Double, Unit],
    onEndHandler: js.Function3[/* shouldComplete */ Boolean, /* step */ Double, /* dur */ Double, Unit]
  ): Gesture = js.native
}

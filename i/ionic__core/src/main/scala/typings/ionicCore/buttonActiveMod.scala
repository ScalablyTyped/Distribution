package typings.ionicCore

import typings.ionicCore.gestureMod.Gesture
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buttonActiveMod {
  
  @JSImport("@ionic/core/dist/types/utils/gesture/button-active", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def createButtonActiveGesture(el: HTMLElement, isButton: js.Function1[/* refEl */ HTMLElement, Boolean]): Gesture = (^.asInstanceOf[js.Dynamic].applyDynamic("createButtonActiveGesture")(el.asInstanceOf[js.Any], isButton.asInstanceOf[js.Any])).asInstanceOf[Gesture]
}

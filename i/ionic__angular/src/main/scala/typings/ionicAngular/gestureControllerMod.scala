package typings.ionicAngular

import typings.ionicCore.gestureMod.Gesture
import typings.ionicCore.gestureMod.GestureConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/angular/providers/gesture-controller", JSImport.Namespace)
@js.native
object gestureControllerMod extends js.Object {
  @js.native
  class GestureController () extends js.Object {
    /**
      * Create a new gesture
      */
    def create(opts: GestureConfig): Gesture = js.native
  }
  
}


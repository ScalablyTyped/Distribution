package typings.ionicAngular

import typings.angularCore.mod.NgZone
import typings.ionicCore.gestureMod.Gesture
import typings.ionicCore.gestureMod.GestureConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/angular/providers/gesture-controller", JSImport.Namespace)
@js.native
object gestureControllerMod extends js.Object {
  @js.native
  class GestureController protected () extends js.Object {
    def this(zone: NgZone) = this()
    var zone: js.Any = js.native
    /**
      * Create a new gesture
      */
    def create(opts: GestureConfig): Gesture = js.native
    def create(opts: GestureConfig, runInsideAngularZone: Boolean): Gesture = js.native
  }
  
}


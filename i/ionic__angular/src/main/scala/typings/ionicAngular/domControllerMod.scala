package typings.ionicAngular

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/angular/providers/dom-controller", JSImport.Namespace)
@js.native
object domControllerMod extends js.Object {
  @js.native
  class DomController () extends js.Object {
    /**
      * Schedules a task to run during the READ phase of the next frame.
      * This task should only read the DOM, but never modify it.
      */
    def read(cb: RafCallback): Unit = js.native
    /**
      * Schedules a task to run during the WRITE phase of the next frame.
      * This task should write the DOM, but never READ it.
      */
    def write(cb: RafCallback): Unit = js.native
  }
  
  type RafCallback = js.Function1[/* timeStamp */ js.UndefOr[Double], Unit]
}


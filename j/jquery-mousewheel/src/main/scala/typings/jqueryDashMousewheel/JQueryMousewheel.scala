package typings.jqueryDashMousewheel

import typings.jquery.JQueryEventObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("JQueryMousewheel")
@js.native
object JQueryMousewheel extends js.Object {
  @js.native
  trait JQueryMousewheelEventObject extends JQueryEventObject {
    var absDelta: Double = js.native
    var deltaFactor: Double = js.native
    var deltaMode: Double = js.native
    var deltaX: Double = js.native
    var deltaY: Double = js.native
  }
  
}


package typings
package atIonicCoreLib.distTypesUtilsGestureGestureDashControllerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GestureController extends js.Object {
  var capturedId: js.UndefOr[js.Any] = js.native
  var disabledGestures: js.Any = js.native
  var disabledScroll: js.Any = js.native
  var doc: js.Any = js.native
  var gestureId: js.Any = js.native
  var newID: js.Any = js.native
  var requestedStart: js.Any = js.native
  def canStart(gestureName: java.lang.String): scala.Boolean = js.native
  def capture(gestureName: java.lang.String, id: scala.Double, priority: scala.Double): scala.Boolean = js.native
  /**
    * Creates a blocker that will block any other gesture events from firing. Set in the ion-gesture component.
    */
  def createBlocker(): BlockerDelegate = js.native
  def createBlocker(opts: BlockerConfig): BlockerDelegate = js.native
  /**
    * Creates a gesture delegate based on the GestureConfig passed
    */
  def createGesture(config: GestureConfig): GestureDelegate = js.native
  def disableGesture(gestureName: java.lang.String, id: scala.Double): scala.Unit = js.native
  def disableScroll(id: scala.Double): scala.Unit = js.native
  def enableGesture(gestureName: java.lang.String, id: scala.Double): scala.Unit = js.native
  def enableScroll(id: scala.Double): scala.Unit = js.native
  def isCaptured(): scala.Boolean = js.native
  def isDisabled(gestureName: java.lang.String): scala.Boolean = js.native
  def isScrollDisabled(): scala.Boolean = js.native
  def release(id: scala.Double): scala.Unit = js.native
  def start(gestureName: java.lang.String, id: scala.Double, priority: scala.Double): scala.Boolean = js.native
}


package typings
package gyronormLib.gyronormMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gyronorm", "GyroNorm")
@js.native
class GyroNorm () extends js.Object {
  def init(options: Options): js.Promise[scala.Unit] = js.native
  def start(callback: js.Function1[/* data */ MotionAndOrientationPayload, scala.Unit]): scala.Unit = js.native
  def startLogging(listener: LogListener): scala.Unit = js.native
  def stopLogging(): scala.Unit = js.native
}

/* static members */
@JSImport("gyronorm", "GyroNorm")
@js.native
object GyroNorm extends js.Object {
  var ACCELERATION: java.lang.String = js.native
  var ACCELERATION_INCLUDING_GRAVITY: java.lang.String = js.native
  var DEVICE_ORIENTATION: java.lang.String = js.native
  var GAME: java.lang.String = js.native
  var ROTATION_RATE: java.lang.String = js.native
  var WORLD: java.lang.String = js.native
}


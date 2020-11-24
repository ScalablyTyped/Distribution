package typings.gyronorm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gyronorm", "GyroNorm")
@js.native
class GyroNorm () extends js.Object {
  
  def init(options: Options): js.Promise[Unit] = js.native
  
  def start(callback: js.Function1[/* data */ MotionAndOrientationPayload, Unit]): Unit = js.native
  
  def startLogging(listener: LogListener): Unit = js.native
  
  def stopLogging(): Unit = js.native
}
/* static members */
@JSImport("gyronorm", "GyroNorm")
@js.native
object GyroNorm extends js.Object {
  
  var ACCELERATION: String = js.native
  
  var ACCELERATION_INCLUDING_GRAVITY: String = js.native
  
  var DEVICE_ORIENTATION: String = js.native
  
  var GAME: String = js.native
  
  var ROTATION_RATE: String = js.native
  
  var WORLD: String = js.native
}

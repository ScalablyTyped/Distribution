package typings.leapmotionts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("leapmotionts", "LeapEvent")
@js.native
class LeapEvent protected () extends js.Object {
  def this(`type`: String, targetListener: Listener) = this()
  def this(`type`: String, targetListener: Listener, frame: Frame) = this()
  
  var _target: js.Any = js.native
  
  var _type: js.Any = js.native
  
  var frame: Frame = js.native
  
  def getTarget(): js.Any = js.native
  
  def getType(): String = js.native
}
/* static members */
@JSImport("leapmotionts", "LeapEvent")
@js.native
object LeapEvent extends js.Object {
  
  var LEAPMOTION_CONNECTED: String = js.native
  
  var LEAPMOTION_DISCONNECTED: String = js.native
  
  var LEAPMOTION_EXIT: String = js.native
  
  var LEAPMOTION_FRAME: String = js.native
  
  var LEAPMOTION_INIT: String = js.native
}

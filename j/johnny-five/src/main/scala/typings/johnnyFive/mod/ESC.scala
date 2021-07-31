package typings.johnnyFive.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("johnny-five", "ESC")
@js.native
class ESC protected () extends StObject {
  def this(option: String) = this()
  def this(option: Double) = this()
  def this(option: ESCOption) = this()
  
  def brake(): this.type = js.native
  
  var id: String = js.native
  
  var pin: Double | String = js.native
  
  var pwmRange: js.Array[Double] = js.native
  
  def throttle(value: Double): this.type = js.native
  
  val value: Double = js.native
}
/* static members */
object ESC {
  
  @JSImport("johnny-five", "ESC")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("johnny-five", "ESC.Collection")
  @js.native
  def Collection: ESCs = js.native
  @scala.inline
  def Collection_=(x: ESCs): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Collection")(x.asInstanceOf[js.Any])
}

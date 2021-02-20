package typings.johnnyFive.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("johnny-five", "ESCs")
@js.native
class ESCs protected () extends Collection[ESC] {
  def this(option: js.Array[Double | String | ESCOption]) = this()
  
  def brake(): this.type = js.native
  
  def throttle(value: Double): this.type = js.native
}

package typings.johnnyFive.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GyroAnalogOption extends GyroGeneralOption {
  
  var pins: js.Array[String] = js.native
  
  var resolution: js.UndefOr[Double] = js.native
  
  var sensitivity: Double = js.native
}
object GyroAnalogOption {
  
  @scala.inline
  def apply(pins: js.Array[String], sensitivity: Double): GyroAnalogOption = {
    val __obj = js.Dynamic.literal(pins = pins.asInstanceOf[js.Any], sensitivity = sensitivity.asInstanceOf[js.Any])
    __obj.asInstanceOf[GyroAnalogOption]
  }
  
  @scala.inline
  implicit class GyroAnalogOptionMutableBuilder[Self <: GyroAnalogOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPins(value: js.Array[String]): Self = StObject.set(x, "pins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPinsVarargs(value: String*): Self = StObject.set(x, "pins", js.Array(value :_*))
    
    @scala.inline
    def setResolution(value: Double): Self = StObject.set(x, "resolution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolutionUndefined: Self = StObject.set(x, "resolution", js.undefined)
    
    @scala.inline
    def setSensitivity(value: Double): Self = StObject.set(x, "sensitivity", value.asInstanceOf[js.Any])
  }
}

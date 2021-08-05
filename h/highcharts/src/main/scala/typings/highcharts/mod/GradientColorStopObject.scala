package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GradientColorStopObject extends StObject {
  
  var `0`: Double
  
  var `1`: ColorString
  
  var color: js.UndefOr[Color_] = js.undefined
}
object GradientColorStopObject {
  
  inline def apply(`0`: Double, `1`: ColorString): GradientColorStopObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("0")(`0`.asInstanceOf[js.Any])
    __obj.updateDynamic("1")(`1`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GradientColorStopObject]
  }
  
  extension [Self <: GradientColorStopObject](x: Self) {
    
    inline def set0(value: Double): Self = StObject.set(x, "0", value.asInstanceOf[js.Any])
    
    inline def set1(value: ColorString): Self = StObject.set(x, "1", value.asInstanceOf[js.Any])
    
    inline def setColor(value: Color_): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
  }
}

package typings.mathjax.MathJax

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ZoomStruct extends StObject {
  
  /*The vertical offset from the top of the span to the baseline of the mathematics*/
  var Y: Double
  
  /*The height of the original mathematics element*/
  var mH: Double
  
  /*The width of the original mathematics element*/
  var mW: Double
  
  /*The height of the zoomed math*/
  var zH: Double
  
  /*The width of the zoomed math*/
  var zW: Double
}
object ZoomStruct {
  
  inline def apply(Y: Double, mH: Double, mW: Double, zH: Double, zW: Double): ZoomStruct = {
    val __obj = js.Dynamic.literal(Y = Y.asInstanceOf[js.Any], mH = mH.asInstanceOf[js.Any], mW = mW.asInstanceOf[js.Any], zH = zH.asInstanceOf[js.Any], zW = zW.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZoomStruct]
  }
  
  extension [Self <: ZoomStruct](x: Self) {
    
    inline def setMH(value: Double): Self = StObject.set(x, "mH", value.asInstanceOf[js.Any])
    
    inline def setMW(value: Double): Self = StObject.set(x, "mW", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "Y", value.asInstanceOf[js.Any])
    
    inline def setZH(value: Double): Self = StObject.set(x, "zH", value.asInstanceOf[js.Any])
    
    inline def setZW(value: Double): Self = StObject.set(x, "zW", value.asInstanceOf[js.Any])
  }
}

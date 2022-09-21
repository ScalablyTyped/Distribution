package typings.hlsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FPSDropData extends StObject {
  
  var currentDecoded: Double
  
  var currentDropped: Double
  
  var totalDroppedFrames: Double
}
object FPSDropData {
  
  inline def apply(currentDecoded: Double, currentDropped: Double, totalDroppedFrames: Double): FPSDropData = {
    val __obj = js.Dynamic.literal(currentDecoded = currentDecoded.asInstanceOf[js.Any], currentDropped = currentDropped.asInstanceOf[js.Any], totalDroppedFrames = totalDroppedFrames.asInstanceOf[js.Any])
    __obj.asInstanceOf[FPSDropData]
  }
  
  extension [Self <: FPSDropData](x: Self) {
    
    inline def setCurrentDecoded(value: Double): Self = StObject.set(x, "currentDecoded", value.asInstanceOf[js.Any])
    
    inline def setCurrentDropped(value: Double): Self = StObject.set(x, "currentDropped", value.asInstanceOf[js.Any])
    
    inline def setTotalDroppedFrames(value: Double): Self = StObject.set(x, "totalDroppedFrames", value.asInstanceOf[js.Any])
  }
}

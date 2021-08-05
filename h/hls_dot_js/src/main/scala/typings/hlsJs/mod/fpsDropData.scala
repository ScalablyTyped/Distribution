package typings.hlsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait fpsDropData extends StObject {
  
  var currentDecoded: Double
  
  var currentDropped: Double
  
  var totalDroppedFragmes: Double
}
object fpsDropData {
  
  inline def apply(currentDecoded: Double, currentDropped: Double, totalDroppedFragmes: Double): fpsDropData = {
    val __obj = js.Dynamic.literal(currentDecoded = currentDecoded.asInstanceOf[js.Any], currentDropped = currentDropped.asInstanceOf[js.Any], totalDroppedFragmes = totalDroppedFragmes.asInstanceOf[js.Any])
    __obj.asInstanceOf[fpsDropData]
  }
  
  extension [Self <: fpsDropData](x: Self) {
    
    inline def setCurrentDecoded(value: Double): Self = StObject.set(x, "currentDecoded", value.asInstanceOf[js.Any])
    
    inline def setCurrentDropped(value: Double): Self = StObject.set(x, "currentDropped", value.asInstanceOf[js.Any])
    
    inline def setTotalDroppedFragmes(value: Double): Self = StObject.set(x, "totalDroppedFragmes", value.asInstanceOf[js.Any])
  }
}

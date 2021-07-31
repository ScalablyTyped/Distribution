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
  
  @scala.inline
  def apply(currentDecoded: Double, currentDropped: Double, totalDroppedFragmes: Double): fpsDropData = {
    val __obj = js.Dynamic.literal(currentDecoded = currentDecoded.asInstanceOf[js.Any], currentDropped = currentDropped.asInstanceOf[js.Any], totalDroppedFragmes = totalDroppedFragmes.asInstanceOf[js.Any])
    __obj.asInstanceOf[fpsDropData]
  }
  
  @scala.inline
  implicit class fpsDropDataMutableBuilder[Self <: fpsDropData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrentDecoded(value: Double): Self = StObject.set(x, "currentDecoded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentDropped(value: Double): Self = StObject.set(x, "currentDropped", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalDroppedFragmes(value: Double): Self = StObject.set(x, "totalDroppedFragmes", value.asInstanceOf[js.Any])
  }
}

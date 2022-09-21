package typings.hlsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ElementaryStreamInfo extends StObject {
  
  var endDTS: Double
  
  var endPTS: Double
  
  var partial: js.UndefOr[Boolean] = js.undefined
  
  var startDTS: Double
  
  var startPTS: Double
}
object ElementaryStreamInfo {
  
  inline def apply(endDTS: Double, endPTS: Double, startDTS: Double, startPTS: Double): ElementaryStreamInfo = {
    val __obj = js.Dynamic.literal(endDTS = endDTS.asInstanceOf[js.Any], endPTS = endPTS.asInstanceOf[js.Any], startDTS = startDTS.asInstanceOf[js.Any], startPTS = startPTS.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementaryStreamInfo]
  }
  
  extension [Self <: ElementaryStreamInfo](x: Self) {
    
    inline def setEndDTS(value: Double): Self = StObject.set(x, "endDTS", value.asInstanceOf[js.Any])
    
    inline def setEndPTS(value: Double): Self = StObject.set(x, "endPTS", value.asInstanceOf[js.Any])
    
    inline def setPartial(value: Boolean): Self = StObject.set(x, "partial", value.asInstanceOf[js.Any])
    
    inline def setPartialUndefined: Self = StObject.set(x, "partial", js.undefined)
    
    inline def setStartDTS(value: Double): Self = StObject.set(x, "startDTS", value.asInstanceOf[js.Any])
    
    inline def setStartPTS(value: Double): Self = StObject.set(x, "startPTS", value.asInstanceOf[js.Any])
  }
}

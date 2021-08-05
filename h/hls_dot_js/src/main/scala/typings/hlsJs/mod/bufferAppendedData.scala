package typings.hlsJs.mod

import typings.hlsJs.anon.Audio
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait bufferAppendedData extends StObject {
  
  var pending: Double
  
  var timeRanges: Audio
}
object bufferAppendedData {
  
  inline def apply(pending: Double, timeRanges: Audio): bufferAppendedData = {
    val __obj = js.Dynamic.literal(pending = pending.asInstanceOf[js.Any], timeRanges = timeRanges.asInstanceOf[js.Any])
    __obj.asInstanceOf[bufferAppendedData]
  }
  
  extension [Self <: bufferAppendedData](x: Self) {
    
    inline def setPending(value: Double): Self = StObject.set(x, "pending", value.asInstanceOf[js.Any])
    
    inline def setTimeRanges(value: Audio): Self = StObject.set(x, "timeRanges", value.asInstanceOf[js.Any])
  }
}

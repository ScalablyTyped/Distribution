package typings.hafasClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LinesWithRealtimeData
  extends StObject
     with RealtimeDataUpdatedAt {
  
  var lines: js.UndefOr[js.Array[Line]] = js.undefined
}
object LinesWithRealtimeData {
  
  inline def apply(): LinesWithRealtimeData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LinesWithRealtimeData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LinesWithRealtimeData] (val x: Self) extends AnyVal {
    
    inline def setLines(value: js.Array[Line]): Self = StObject.set(x, "lines", value.asInstanceOf[js.Any])
    
    inline def setLinesUndefined: Self = StObject.set(x, "lines", js.undefined)
    
    inline def setLinesVarargs(value: Line*): Self = StObject.set(x, "lines", js.Array(value*))
  }
}

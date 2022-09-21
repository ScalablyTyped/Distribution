package typings.matrixJsSdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchResult extends StObject {
  
  var context: EventContext
  
  var rank: Double
  
  var result: MatrixEvent[EventContentTypeMessage, EventType]
}
object SearchResult {
  
  inline def apply(context: EventContext, rank: Double, result: MatrixEvent[EventContentTypeMessage, EventType]): SearchResult = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], rank = rank.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchResult]
  }
  
  extension [Self <: SearchResult](x: Self) {
    
    inline def setContext(value: EventContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setRank(value: Double): Self = StObject.set(x, "rank", value.asInstanceOf[js.Any])
    
    inline def setResult(value: MatrixEvent[EventContentTypeMessage, EventType]): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
  }
}

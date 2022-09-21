package typings.matrixJsSdk.anon

import org.scalablytyped.runtime.StringDictionary
import typings.matrixJsSdk.mod.EventContentTypeMessage
import typings.matrixJsSdk.mod.EventType
import typings.matrixJsSdk.mod.GroupValue
import typings.matrixJsSdk.mod.MatrixEvent
import typings.matrixJsSdk.mod.SearchResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Count extends StObject {
  
  var count: Double
  
  var groups: js.UndefOr[GroupValue] = js.undefined
  
  var highlights: js.Array[String]
  
  var next_batch: js.UndefOr[String] = js.undefined
  
  var results: js.Array[SearchResult]
  
  var state: js.UndefOr[StringDictionary[js.Array[MatrixEvent[EventContentTypeMessage, EventType]]]] = js.undefined
}
object Count {
  
  inline def apply(count: Double, highlights: js.Array[String], results: js.Array[SearchResult]): Count = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], highlights = highlights.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any])
    __obj.asInstanceOf[Count]
  }
  
  extension [Self <: Count](x: Self) {
    
    inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setGroups(value: GroupValue): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
    
    inline def setGroupsUndefined: Self = StObject.set(x, "groups", js.undefined)
    
    inline def setHighlights(value: js.Array[String]): Self = StObject.set(x, "highlights", value.asInstanceOf[js.Any])
    
    inline def setHighlightsVarargs(value: String*): Self = StObject.set(x, "highlights", js.Array(value*))
    
    inline def setNext_batch(value: String): Self = StObject.set(x, "next_batch", value.asInstanceOf[js.Any])
    
    inline def setNext_batchUndefined: Self = StObject.set(x, "next_batch", js.undefined)
    
    inline def setResults(value: js.Array[SearchResult]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    inline def setResultsVarargs(value: SearchResult*): Self = StObject.set(x, "results", js.Array(value*))
    
    inline def setState(value: StringDictionary[js.Array[MatrixEvent[EventContentTypeMessage, EventType]]]): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}

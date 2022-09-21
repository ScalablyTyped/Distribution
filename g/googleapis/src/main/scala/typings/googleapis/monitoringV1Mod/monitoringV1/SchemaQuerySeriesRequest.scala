package typings.googleapis.monitoringV1Mod.monitoringV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaQuerySeriesRequest extends StObject {
  
  /**
    * The end time to evaluate the query for. Either floating point UNIX seconds or RFC3339 formatted timestamp.
    */
  var end: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The start time to evaluate the query for. Either floating point UNIX seconds or RFC3339 formatted timestamp.
    */
  var start: js.UndefOr[String | Null] = js.undefined
}
object SchemaQuerySeriesRequest {
  
  inline def apply(): SchemaQuerySeriesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaQuerySeriesRequest]
  }
  
  extension [Self <: SchemaQuerySeriesRequest](x: Self) {
    
    inline def setEnd(value: String): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setEndNull: Self = StObject.set(x, "end", null)
    
    inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    inline def setStart(value: String): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setStartNull: Self = StObject.set(x, "start", null)
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
  }
}

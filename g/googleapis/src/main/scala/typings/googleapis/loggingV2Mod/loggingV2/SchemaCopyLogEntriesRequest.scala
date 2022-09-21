package typings.googleapis.loggingV2Mod.loggingV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCopyLogEntriesRequest extends StObject {
  
  /**
    * Required. Destination to which to copy log entries.
    */
  var destination: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. A filter specifying which log entries to copy. The filter must be no more than 20k characters. An empty filter matches all log entries.
    */
  var filter: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. Log bucket from which to copy log entries.For example:"projects/my-project/locations/global/buckets/my-source-bucket"
    */
  var name: js.UndefOr[String | Null] = js.undefined
}
object SchemaCopyLogEntriesRequest {
  
  inline def apply(): SchemaCopyLogEntriesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCopyLogEntriesRequest]
  }
  
  extension [Self <: SchemaCopyLogEntriesRequest](x: Self) {
    
    inline def setDestination(value: String): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    
    inline def setDestinationNull: Self = StObject.set(x, "destination", null)
    
    inline def setDestinationUndefined: Self = StObject.set(x, "destination", js.undefined)
    
    inline def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterNull: Self = StObject.set(x, "filter", null)
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}

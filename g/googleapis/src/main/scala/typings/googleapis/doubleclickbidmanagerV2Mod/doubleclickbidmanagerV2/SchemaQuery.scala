package typings.googleapis.doubleclickbidmanagerV2Mod.doubleclickbidmanagerV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaQuery extends StObject {
  
  /**
    * Query metadata.
    */
  var metadata: js.UndefOr[SchemaQueryMetadata] = js.undefined
  
  /**
    * Query parameters.
    */
  var params: js.UndefOr[SchemaParameters] = js.undefined
  
  /**
    * Output only. Query ID.
    */
  var queryId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Information on how often and when to run a query. If `ONE_TIME` is set to the frequency field, the query will only be run at the time of creation.
    */
  var schedule: js.UndefOr[SchemaQuerySchedule] = js.undefined
}
object SchemaQuery {
  
  inline def apply(): SchemaQuery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaQuery]
  }
  
  extension [Self <: SchemaQuery](x: Self) {
    
    inline def setMetadata(value: SchemaQueryMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setParams(value: SchemaParameters): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
    
    inline def setQueryId(value: String): Self = StObject.set(x, "queryId", value.asInstanceOf[js.Any])
    
    inline def setQueryIdNull: Self = StObject.set(x, "queryId", null)
    
    inline def setQueryIdUndefined: Self = StObject.set(x, "queryId", js.undefined)
    
    inline def setSchedule(value: SchemaQuerySchedule): Self = StObject.set(x, "schedule", value.asInstanceOf[js.Any])
    
    inline def setScheduleUndefined: Self = StObject.set(x, "schedule", js.undefined)
  }
}

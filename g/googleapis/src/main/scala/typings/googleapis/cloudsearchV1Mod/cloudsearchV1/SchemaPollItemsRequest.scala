package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPollItemsRequest extends StObject {
  
  /**
    * The name of connector making this call. Format: datasources/{source_id\}/connectors/{ID\}
    */
  var connectorName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Common debug options.
    */
  var debugOptions: js.UndefOr[SchemaDebugOptions] = js.undefined
  
  /**
    * Maximum number of items to return. The maximum value is 100 and the default value is 20.
    */
  var limit: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Queue name to fetch items from. If unspecified, PollItems will fetch from 'default' queue. The maximum length is 100 characters.
    */
  var queue: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Limit the items polled to the ones with these statuses.
    */
  var statusCodes: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaPollItemsRequest {
  
  inline def apply(): SchemaPollItemsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPollItemsRequest]
  }
  
  extension [Self <: SchemaPollItemsRequest](x: Self) {
    
    inline def setConnectorName(value: String): Self = StObject.set(x, "connectorName", value.asInstanceOf[js.Any])
    
    inline def setConnectorNameNull: Self = StObject.set(x, "connectorName", null)
    
    inline def setConnectorNameUndefined: Self = StObject.set(x, "connectorName", js.undefined)
    
    inline def setDebugOptions(value: SchemaDebugOptions): Self = StObject.set(x, "debugOptions", value.asInstanceOf[js.Any])
    
    inline def setDebugOptionsUndefined: Self = StObject.set(x, "debugOptions", js.undefined)
    
    inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    inline def setLimitNull: Self = StObject.set(x, "limit", null)
    
    inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    inline def setQueue(value: String): Self = StObject.set(x, "queue", value.asInstanceOf[js.Any])
    
    inline def setQueueNull: Self = StObject.set(x, "queue", null)
    
    inline def setQueueUndefined: Self = StObject.set(x, "queue", js.undefined)
    
    inline def setStatusCodes(value: js.Array[String]): Self = StObject.set(x, "statusCodes", value.asInstanceOf[js.Any])
    
    inline def setStatusCodesNull: Self = StObject.set(x, "statusCodes", null)
    
    inline def setStatusCodesUndefined: Self = StObject.set(x, "statusCodes", js.undefined)
    
    inline def setStatusCodesVarargs(value: String*): Self = StObject.set(x, "statusCodes", js.Array(value*))
  }
}

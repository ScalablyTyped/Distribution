package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPollItemsRequest extends StObject {
  
  /**
    * Name of connector making this call. &lt;br /&gt;Format:
    * datasources/{source_id}/connectors/{ID}
    */
  var connectorName: js.UndefOr[String] = js.undefined
  
  /**
    * Common debug options.
    */
  var debugOptions: js.UndefOr[SchemaDebugOptions] = js.undefined
  
  /**
    * Maximum number of items to return. &lt;br /&gt;The maximum and the
    * default value is 1000
    */
  var limit: js.UndefOr[Double] = js.undefined
  
  /**
    * Queue name to fetch items from.  If unspecified, PollItems will fetch
    * from &#39;default&#39; queue. The maximum length is 100 characters.
    */
  var queue: js.UndefOr[String] = js.undefined
  
  /**
    * Limit the items polled to the ones with these statuses.
    */
  var statusCodes: js.UndefOr[js.Array[String]] = js.undefined
}
object SchemaPollItemsRequest {
  
  @scala.inline
  def apply(): SchemaPollItemsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPollItemsRequest]
  }
  
  @scala.inline
  implicit class SchemaPollItemsRequestMutableBuilder[Self <: SchemaPollItemsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnectorName(value: String): Self = StObject.set(x, "connectorName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectorNameUndefined: Self = StObject.set(x, "connectorName", js.undefined)
    
    @scala.inline
    def setDebugOptions(value: SchemaDebugOptions): Self = StObject.set(x, "debugOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebugOptionsUndefined: Self = StObject.set(x, "debugOptions", js.undefined)
    
    @scala.inline
    def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    @scala.inline
    def setQueue(value: String): Self = StObject.set(x, "queue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueueUndefined: Self = StObject.set(x, "queue", js.undefined)
    
    @scala.inline
    def setStatusCodes(value: js.Array[String]): Self = StObject.set(x, "statusCodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusCodesUndefined: Self = StObject.set(x, "statusCodes", js.undefined)
    
    @scala.inline
    def setStatusCodesVarargs(value: String*): Self = StObject.set(x, "statusCodes", js.Array(value :_*))
  }
}

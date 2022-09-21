package typings.googleapis.realtimebiddingV1Mod.realtimebiddingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPolicyCompliance extends StObject {
  
  /**
    * Serving status for the given transaction type (e.g., open auction, deals) or region (e.g., China, Russia). Can be used to filter the response of the creatives.list method.
    */
  var status: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Topics related to the policy compliance for this transaction type (e.g., open auction, deals) or region (e.g., China, Russia). Topics may be present only if status is DISAPPROVED.
    */
  var topics: js.UndefOr[js.Array[SchemaPolicyTopicEntry]] = js.undefined
}
object SchemaPolicyCompliance {
  
  inline def apply(): SchemaPolicyCompliance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPolicyCompliance]
  }
  
  extension [Self <: SchemaPolicyCompliance](x: Self) {
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusNull: Self = StObject.set(x, "status", null)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setTopics(value: js.Array[SchemaPolicyTopicEntry]): Self = StObject.set(x, "topics", value.asInstanceOf[js.Any])
    
    inline def setTopicsUndefined: Self = StObject.set(x, "topics", js.undefined)
    
    inline def setTopicsVarargs(value: SchemaPolicyTopicEntry*): Self = StObject.set(x, "topics", js.Array(value*))
  }
}

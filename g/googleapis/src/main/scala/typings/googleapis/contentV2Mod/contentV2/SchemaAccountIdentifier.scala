package typings.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaAccountIdentifier extends StObject {
  
  /**
    * The aggregator ID, set for aggregators and subaccounts (in that case, it
    * represents the aggregator of the subaccount).
    */
  var aggregatorId: js.UndefOr[String] = js.native
  
  /**
    * The merchant account ID, set for individual accounts and subaccounts.
    */
  var merchantId: js.UndefOr[String] = js.native
}
object SchemaAccountIdentifier {
  
  @scala.inline
  def apply(): SchemaAccountIdentifier = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAccountIdentifier]
  }
  
  @scala.inline
  implicit class SchemaAccountIdentifierMutableBuilder[Self <: SchemaAccountIdentifier] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAggregatorId(value: String): Self = StObject.set(x, "aggregatorId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAggregatorIdUndefined: Self = StObject.set(x, "aggregatorId", js.undefined)
    
    @scala.inline
    def setMerchantId(value: String): Self = StObject.set(x, "merchantId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMerchantIdUndefined: Self = StObject.set(x, "merchantId", js.undefined)
  }
}

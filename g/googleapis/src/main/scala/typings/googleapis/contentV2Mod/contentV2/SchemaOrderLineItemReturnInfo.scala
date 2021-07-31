package typings.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaOrderLineItemReturnInfo extends StObject {
  
  /**
    * How many days later the item can be returned.
    */
  var daysToReturn: js.UndefOr[Double] = js.undefined
  
  /**
    * Whether the item is returnable.
    */
  var isReturnable: js.UndefOr[Boolean] = js.undefined
  
  /**
    * URL of the item return policy.
    */
  var policyUrl: js.UndefOr[String] = js.undefined
}
object SchemaOrderLineItemReturnInfo {
  
  @scala.inline
  def apply(): SchemaOrderLineItemReturnInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrderLineItemReturnInfo]
  }
  
  @scala.inline
  implicit class SchemaOrderLineItemReturnInfoMutableBuilder[Self <: SchemaOrderLineItemReturnInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDaysToReturn(value: Double): Self = StObject.set(x, "daysToReturn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDaysToReturnUndefined: Self = StObject.set(x, "daysToReturn", js.undefined)
    
    @scala.inline
    def setIsReturnable(value: Boolean): Self = StObject.set(x, "isReturnable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsReturnableUndefined: Self = StObject.set(x, "isReturnable", js.undefined)
    
    @scala.inline
    def setPolicyUrl(value: String): Self = StObject.set(x, "policyUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyUrlUndefined: Self = StObject.set(x, "policyUrl", js.undefined)
  }
}

package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReturnPolicySeasonalOverride extends StObject {
  
  /** Required. Last day on which the override applies. In ISO 8601 format. */
  var endDate: js.UndefOr[String] = js.native
  
  /** Required. The name of the seasonal override as shown in Merchant Center. */
  var name: js.UndefOr[String] = js.native
  
  /** Required. The policy which is in effect during that time. */
  var policy: js.UndefOr[ReturnPolicyPolicy] = js.native
  
  /** Required. First day on which the override applies. In ISO 8601 format. */
  var startDate: js.UndefOr[String] = js.native
}
object ReturnPolicySeasonalOverride {
  
  @scala.inline
  def apply(): ReturnPolicySeasonalOverride = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReturnPolicySeasonalOverride]
  }
  
  @scala.inline
  implicit class ReturnPolicySeasonalOverrideMutableBuilder[Self <: ReturnPolicySeasonalOverride] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndDate(value: String): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndDateUndefined: Self = StObject.set(x, "endDate", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPolicy(value: ReturnPolicyPolicy): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyUndefined: Self = StObject.set(x, "policy", js.undefined)
    
    @scala.inline
    def setStartDate(value: String): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartDateUndefined: Self = StObject.set(x, "startDate", js.undefined)
  }
}

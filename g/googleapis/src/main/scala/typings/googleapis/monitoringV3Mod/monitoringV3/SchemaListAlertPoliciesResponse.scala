package typings.googleapis.monitoringV3Mod.monitoringV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The protocol for the ListAlertPolicies response.
  */
trait SchemaListAlertPoliciesResponse extends StObject {
  
  /**
    * The returned alert policies.
    */
  var alertPolicies: js.UndefOr[js.Array[SchemaAlertPolicy]] = js.undefined
  
  /**
    * If there might be more results than were returned, then this field is set
    * to a non-empty value. To see the additional results, use that value as
    * pageToken in the next call to this method.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object SchemaListAlertPoliciesResponse {
  
  @scala.inline
  def apply(): SchemaListAlertPoliciesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListAlertPoliciesResponse]
  }
  
  @scala.inline
  implicit class SchemaListAlertPoliciesResponseMutableBuilder[Self <: SchemaListAlertPoliciesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlertPolicies(value: js.Array[SchemaAlertPolicy]): Self = StObject.set(x, "alertPolicies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlertPoliciesUndefined: Self = StObject.set(x, "alertPolicies", js.undefined)
    
    @scala.inline
    def setAlertPoliciesVarargs(value: SchemaAlertPolicy*): Self = StObject.set(x, "alertPolicies", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}

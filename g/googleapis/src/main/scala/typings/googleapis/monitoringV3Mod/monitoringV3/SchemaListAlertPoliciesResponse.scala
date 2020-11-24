package typings.googleapis.monitoringV3Mod.monitoringV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The protocol for the ListAlertPolicies response.
  */
@js.native
trait SchemaListAlertPoliciesResponse extends js.Object {
  
  /**
    * The returned alert policies.
    */
  var alertPolicies: js.UndefOr[js.Array[SchemaAlertPolicy]] = js.native
  
  /**
    * If there might be more results than were returned, then this field is set
    * to a non-empty value. To see the additional results, use that value as
    * pageToken in the next call to this method.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}
object SchemaListAlertPoliciesResponse {
  
  @scala.inline
  def apply(): SchemaListAlertPoliciesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListAlertPoliciesResponse]
  }
  
  @scala.inline
  implicit class SchemaListAlertPoliciesResponseOps[Self <: SchemaListAlertPoliciesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAlertPoliciesVarargs(value: SchemaAlertPolicy*): Self = this.set("alertPolicies", js.Array(value :_*))
    
    @scala.inline
    def setAlertPolicies(value: js.Array[SchemaAlertPolicy]): Self = this.set("alertPolicies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlertPolicies: Self = this.set("alertPolicies", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
}

package typings.googleapis.v4Mod.analyticsreportingV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The main response class which holds the reports from the Reporting API
  * `batchGet` call.
  */
@js.native
trait SchemaGetReportsResponse extends StObject {
  
  /**
    * The amount of resource quota tokens deducted to execute the query.
    * Includes all responses.
    */
  var queryCost: js.UndefOr[Double] = js.native
  
  /**
    * Responses corresponding to each of the request.
    */
  var reports: js.UndefOr[js.Array[SchemaReport]] = js.native
  
  /**
    * The amount of resource quota remaining for the property.
    */
  var resourceQuotasRemaining: js.UndefOr[SchemaResourceQuotasRemaining] = js.native
}
object SchemaGetReportsResponse {
  
  @scala.inline
  def apply(): SchemaGetReportsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGetReportsResponse]
  }
  
  @scala.inline
  implicit class SchemaGetReportsResponseMutableBuilder[Self <: SchemaGetReportsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQueryCost(value: Double): Self = StObject.set(x, "queryCost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryCostUndefined: Self = StObject.set(x, "queryCost", js.undefined)
    
    @scala.inline
    def setReports(value: js.Array[SchemaReport]): Self = StObject.set(x, "reports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReportsUndefined: Self = StObject.set(x, "reports", js.undefined)
    
    @scala.inline
    def setReportsVarargs(value: SchemaReport*): Self = StObject.set(x, "reports", js.Array(value :_*))
    
    @scala.inline
    def setResourceQuotasRemaining(value: SchemaResourceQuotasRemaining): Self = StObject.set(x, "resourceQuotasRemaining", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceQuotasRemainingUndefined: Self = StObject.set(x, "resourceQuotasRemaining", js.undefined)
  }
}

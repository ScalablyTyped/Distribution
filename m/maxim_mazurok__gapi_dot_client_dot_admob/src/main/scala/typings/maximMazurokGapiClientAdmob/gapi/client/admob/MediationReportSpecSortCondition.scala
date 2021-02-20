package typings.maximMazurokGapiClientAdmob.gapi.client.admob

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediationReportSpecSortCondition extends StObject {
  
  /** Sort by the specified dimension. */
  var dimension: js.UndefOr[String] = js.native
  
  /** Sort by the specified metric. */
  var metric: js.UndefOr[String] = js.native
  
  /** Sorting order of the dimension or metric. */
  var order: js.UndefOr[String] = js.native
}
object MediationReportSpecSortCondition {
  
  @scala.inline
  def apply(): MediationReportSpecSortCondition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediationReportSpecSortCondition]
  }
  
  @scala.inline
  implicit class MediationReportSpecSortConditionMutableBuilder[Self <: MediationReportSpecSortCondition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDimension(value: String): Self = StObject.set(x, "dimension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDimensionUndefined: Self = StObject.set(x, "dimension", js.undefined)
    
    @scala.inline
    def setMetric(value: String): Self = StObject.set(x, "metric", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricUndefined: Self = StObject.set(x, "metric", js.undefined)
    
    @scala.inline
    def setOrder(value: String): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
  }
}

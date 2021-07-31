package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The metric short id is returned to the user alongside an offset into
  * ReportWorkItemStatusRequest
  */
trait SchemaMetricShortId extends StObject {
  
  /**
    * The index of the corresponding metric in the ReportWorkItemStatusRequest.
    * Required.
    */
  var metricIndex: js.UndefOr[Double] = js.undefined
  
  /**
    * The service-generated short identifier for the metric.
    */
  var shortId: js.UndefOr[String] = js.undefined
}
object SchemaMetricShortId {
  
  @scala.inline
  def apply(): SchemaMetricShortId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMetricShortId]
  }
  
  @scala.inline
  implicit class SchemaMetricShortIdMutableBuilder[Self <: SchemaMetricShortId] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMetricIndex(value: Double): Self = StObject.set(x, "metricIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricIndexUndefined: Self = StObject.set(x, "metricIndex", js.undefined)
    
    @scala.inline
    def setShortId(value: String): Self = StObject.set(x, "shortId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShortIdUndefined: Self = StObject.set(x, "shortId", js.undefined)
  }
}

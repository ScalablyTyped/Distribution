package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The number of impressions with the specified dimension values where the
  * corresponding bid request or bid response was not successful, as described
  * by the specified callout status.
  */
trait SchemaCalloutStatusRow extends StObject {
  
  /**
    * The ID of the callout status. See
    * [callout-status-codes](https://developers.google.com/authorized-buyers/rtb/downloads/callout-status-codes).
    */
  var calloutStatusId: js.UndefOr[Double] = js.undefined
  
  /**
    * The number of impressions for which there was a bid request or bid
    * response with the specified callout status.
    */
  var impressionCount: js.UndefOr[SchemaMetricValue] = js.undefined
  
  /**
    * The values of all dimensions associated with metric values in this row.
    */
  var rowDimensions: js.UndefOr[SchemaRowDimensions] = js.undefined
}
object SchemaCalloutStatusRow {
  
  inline def apply(): SchemaCalloutStatusRow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCalloutStatusRow]
  }
  
  extension [Self <: SchemaCalloutStatusRow](x: Self) {
    
    inline def setCalloutStatusId(value: Double): Self = StObject.set(x, "calloutStatusId", value.asInstanceOf[js.Any])
    
    inline def setCalloutStatusIdUndefined: Self = StObject.set(x, "calloutStatusId", js.undefined)
    
    inline def setImpressionCount(value: SchemaMetricValue): Self = StObject.set(x, "impressionCount", value.asInstanceOf[js.Any])
    
    inline def setImpressionCountUndefined: Self = StObject.set(x, "impressionCount", js.undefined)
    
    inline def setRowDimensions(value: SchemaRowDimensions): Self = StObject.set(x, "rowDimensions", value.asInstanceOf[js.Any])
    
    inline def setRowDimensionsUndefined: Self = StObject.set(x, "rowDimensions", js.undefined)
  }
}

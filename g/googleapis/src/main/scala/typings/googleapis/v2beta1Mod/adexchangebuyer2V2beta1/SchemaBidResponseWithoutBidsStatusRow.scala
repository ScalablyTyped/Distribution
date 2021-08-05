package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The number of impressions with the specified dimension values that were
  * considered to have no applicable bids, as described by the specified
  * status.
  */
trait SchemaBidResponseWithoutBidsStatusRow extends StObject {
  
  /**
    * The number of impressions for which there was a bid response with the
    * specified status.
    */
  var impressionCount: js.UndefOr[SchemaMetricValue] = js.undefined
  
  /**
    * The values of all dimensions associated with metric values in this row.
    */
  var rowDimensions: js.UndefOr[SchemaRowDimensions] = js.undefined
  
  /**
    * The status specifying why the bid responses were considered to have no
    * applicable bids.
    */
  var status: js.UndefOr[String] = js.undefined
}
object SchemaBidResponseWithoutBidsStatusRow {
  
  inline def apply(): SchemaBidResponseWithoutBidsStatusRow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBidResponseWithoutBidsStatusRow]
  }
  
  extension [Self <: SchemaBidResponseWithoutBidsStatusRow](x: Self) {
    
    inline def setImpressionCount(value: SchemaMetricValue): Self = StObject.set(x, "impressionCount", value.asInstanceOf[js.Any])
    
    inline def setImpressionCountUndefined: Self = StObject.set(x, "impressionCount", js.undefined)
    
    inline def setRowDimensions(value: SchemaRowDimensions): Self = StObject.set(x, "rowDimensions", value.asInstanceOf[js.Any])
    
    inline def setRowDimensionsUndefined: Self = StObject.set(x, "rowDimensions", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}

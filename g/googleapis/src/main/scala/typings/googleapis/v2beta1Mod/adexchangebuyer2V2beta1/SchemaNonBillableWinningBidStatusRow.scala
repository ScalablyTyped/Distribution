package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The number of winning bids with the specified dimension values for which
  * the buyer was not billed, as described by the specified status.
  */
trait SchemaNonBillableWinningBidStatusRow extends StObject {
  
  /**
    * The number of bids with the specified status.
    */
  var bidCount: js.UndefOr[SchemaMetricValue] = js.undefined
  
  /**
    * The values of all dimensions associated with metric values in this row.
    */
  var rowDimensions: js.UndefOr[SchemaRowDimensions] = js.undefined
  
  /**
    * The status specifying why the winning bids were not billed.
    */
  var status: js.UndefOr[String] = js.undefined
}
object SchemaNonBillableWinningBidStatusRow {
  
  inline def apply(): SchemaNonBillableWinningBidStatusRow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNonBillableWinningBidStatusRow]
  }
  
  extension [Self <: SchemaNonBillableWinningBidStatusRow](x: Self) {
    
    inline def setBidCount(value: SchemaMetricValue): Self = StObject.set(x, "bidCount", value.asInstanceOf[js.Any])
    
    inline def setBidCountUndefined: Self = StObject.set(x, "bidCount", js.undefined)
    
    inline def setRowDimensions(value: SchemaRowDimensions): Self = StObject.set(x, "rowDimensions", value.asInstanceOf[js.Any])
    
    inline def setRowDimensionsUndefined: Self = StObject.set(x, "rowDimensions", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}

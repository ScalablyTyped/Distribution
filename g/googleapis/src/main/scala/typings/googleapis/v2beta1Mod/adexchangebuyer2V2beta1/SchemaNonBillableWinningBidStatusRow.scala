package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The number of winning bids with the specified dimension values for which
  * the buyer was not billed, as described by the specified status.
  */
@js.native
trait SchemaNonBillableWinningBidStatusRow extends StObject {
  
  /**
    * The number of bids with the specified status.
    */
  var bidCount: js.UndefOr[SchemaMetricValue] = js.native
  
  /**
    * The values of all dimensions associated with metric values in this row.
    */
  var rowDimensions: js.UndefOr[SchemaRowDimensions] = js.native
  
  /**
    * The status specifying why the winning bids were not billed.
    */
  var status: js.UndefOr[String] = js.native
}
object SchemaNonBillableWinningBidStatusRow {
  
  @scala.inline
  def apply(): SchemaNonBillableWinningBidStatusRow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNonBillableWinningBidStatusRow]
  }
  
  @scala.inline
  implicit class SchemaNonBillableWinningBidStatusRowMutableBuilder[Self <: SchemaNonBillableWinningBidStatusRow] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBidCount(value: SchemaMetricValue): Self = StObject.set(x, "bidCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBidCountUndefined: Self = StObject.set(x, "bidCount", js.undefined)
    
    @scala.inline
    def setRowDimensions(value: SchemaRowDimensions): Self = StObject.set(x, "rowDimensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowDimensionsUndefined: Self = StObject.set(x, "rowDimensions", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}

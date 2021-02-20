package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The number of filtered bids with the specified dimension values, among
  * those filtered due to the requested filtering reason (i.e. creative
  * status), that have the specified detail.
  */
@js.native
trait SchemaFilteredBidDetailRow extends StObject {
  
  /**
    * The number of bids with the specified detail.
    */
  var bidCount: js.UndefOr[SchemaMetricValue] = js.native
  
  /**
    * The ID of the detail. The associated value can be looked up in the
    * dictionary file corresponding to the DetailType in the response message.
    */
  var detailId: js.UndefOr[Double] = js.native
  
  /**
    * The values of all dimensions associated with metric values in this row.
    */
  var rowDimensions: js.UndefOr[SchemaRowDimensions] = js.native
}
object SchemaFilteredBidDetailRow {
  
  @scala.inline
  def apply(): SchemaFilteredBidDetailRow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFilteredBidDetailRow]
  }
  
  @scala.inline
  implicit class SchemaFilteredBidDetailRowMutableBuilder[Self <: SchemaFilteredBidDetailRow] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBidCount(value: SchemaMetricValue): Self = StObject.set(x, "bidCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBidCountUndefined: Self = StObject.set(x, "bidCount", js.undefined)
    
    @scala.inline
    def setDetailId(value: Double): Self = StObject.set(x, "detailId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetailIdUndefined: Self = StObject.set(x, "detailId", js.undefined)
    
    @scala.inline
    def setRowDimensions(value: SchemaRowDimensions): Self = StObject.set(x, "rowDimensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowDimensionsUndefined: Self = StObject.set(x, "rowDimensions", js.undefined)
  }
}

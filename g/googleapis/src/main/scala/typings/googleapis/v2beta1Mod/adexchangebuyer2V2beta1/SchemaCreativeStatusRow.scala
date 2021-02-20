package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The number of bids with the specified dimension values that did not win the
  * auction (either were filtered pre-auction or lost the auction), as
  * described by the specified creative status.
  */
@js.native
trait SchemaCreativeStatusRow extends StObject {
  
  /**
    * The number of bids with the specified status.
    */
  var bidCount: js.UndefOr[SchemaMetricValue] = js.native
  
  /**
    * The ID of the creative status. See
    * [creative-status-codes](https://developers.google.com/authorized-buyers/rtb/downloads/creative-status-codes).
    */
  var creativeStatusId: js.UndefOr[Double] = js.native
  
  /**
    * The values of all dimensions associated with metric values in this row.
    */
  var rowDimensions: js.UndefOr[SchemaRowDimensions] = js.native
}
object SchemaCreativeStatusRow {
  
  @scala.inline
  def apply(): SchemaCreativeStatusRow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreativeStatusRow]
  }
  
  @scala.inline
  implicit class SchemaCreativeStatusRowMutableBuilder[Self <: SchemaCreativeStatusRow] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBidCount(value: SchemaMetricValue): Self = StObject.set(x, "bidCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBidCountUndefined: Self = StObject.set(x, "bidCount", js.undefined)
    
    @scala.inline
    def setCreativeStatusId(value: Double): Self = StObject.set(x, "creativeStatusId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreativeStatusIdUndefined: Self = StObject.set(x, "creativeStatusId", js.undefined)
    
    @scala.inline
    def setRowDimensions(value: SchemaRowDimensions): Self = StObject.set(x, "rowDimensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowDimensionsUndefined: Self = StObject.set(x, "rowDimensions", js.undefined)
  }
}

package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The number of bids with the specified dimension values that did not win the
  * auction (either were filtered pre-auction or lost the auction), as
  * described by the specified creative status.
  */
trait SchemaCreativeStatusRow extends StObject {
  
  /**
    * The number of bids with the specified status.
    */
  var bidCount: js.UndefOr[SchemaMetricValue] = js.undefined
  
  /**
    * The ID of the creative status. See
    * [creative-status-codes](https://developers.google.com/authorized-buyers/rtb/downloads/creative-status-codes).
    */
  var creativeStatusId: js.UndefOr[Double] = js.undefined
  
  /**
    * The values of all dimensions associated with metric values in this row.
    */
  var rowDimensions: js.UndefOr[SchemaRowDimensions] = js.undefined
}
object SchemaCreativeStatusRow {
  
  inline def apply(): SchemaCreativeStatusRow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreativeStatusRow]
  }
  
  extension [Self <: SchemaCreativeStatusRow](x: Self) {
    
    inline def setBidCount(value: SchemaMetricValue): Self = StObject.set(x, "bidCount", value.asInstanceOf[js.Any])
    
    inline def setBidCountUndefined: Self = StObject.set(x, "bidCount", js.undefined)
    
    inline def setCreativeStatusId(value: Double): Self = StObject.set(x, "creativeStatusId", value.asInstanceOf[js.Any])
    
    inline def setCreativeStatusIdUndefined: Self = StObject.set(x, "creativeStatusId", js.undefined)
    
    inline def setRowDimensions(value: SchemaRowDimensions): Self = StObject.set(x, "rowDimensions", value.asInstanceOf[js.Any])
    
    inline def setRowDimensionsUndefined: Self = StObject.set(x, "rowDimensions", js.undefined)
  }
}

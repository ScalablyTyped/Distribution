package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaFilteredBidCreativeRow extends StObject {
  
  /**
    * The number of bids with the specified creative.
    */
  var bidCount: js.UndefOr[SchemaMetricValue] = js.undefined
  
  /**
    * The ID of the creative.
    */
  var creativeId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The values of all dimensions associated with metric values in this row.
    */
  var rowDimensions: js.UndefOr[SchemaRowDimensions] = js.undefined
}
object SchemaFilteredBidCreativeRow {
  
  inline def apply(): SchemaFilteredBidCreativeRow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFilteredBidCreativeRow]
  }
  
  extension [Self <: SchemaFilteredBidCreativeRow](x: Self) {
    
    inline def setBidCount(value: SchemaMetricValue): Self = StObject.set(x, "bidCount", value.asInstanceOf[js.Any])
    
    inline def setBidCountUndefined: Self = StObject.set(x, "bidCount", js.undefined)
    
    inline def setCreativeId(value: String): Self = StObject.set(x, "creativeId", value.asInstanceOf[js.Any])
    
    inline def setCreativeIdNull: Self = StObject.set(x, "creativeId", null)
    
    inline def setCreativeIdUndefined: Self = StObject.set(x, "creativeId", js.undefined)
    
    inline def setRowDimensions(value: SchemaRowDimensions): Self = StObject.set(x, "rowDimensions", value.asInstanceOf[js.Any])
    
    inline def setRowDimensionsUndefined: Self = StObject.set(x, "rowDimensions", js.undefined)
  }
}

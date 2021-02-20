package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The number of filtered bids with the specified dimension values that have
  * the specified creative.
  */
@js.native
trait SchemaFilteredBidCreativeRow extends StObject {
  
  /**
    * The number of bids with the specified creative.
    */
  var bidCount: js.UndefOr[SchemaMetricValue] = js.native
  
  /**
    * The ID of the creative.
    */
  var creativeId: js.UndefOr[String] = js.native
  
  /**
    * The values of all dimensions associated with metric values in this row.
    */
  var rowDimensions: js.UndefOr[SchemaRowDimensions] = js.native
}
object SchemaFilteredBidCreativeRow {
  
  @scala.inline
  def apply(): SchemaFilteredBidCreativeRow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFilteredBidCreativeRow]
  }
  
  @scala.inline
  implicit class SchemaFilteredBidCreativeRowMutableBuilder[Self <: SchemaFilteredBidCreativeRow] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBidCount(value: SchemaMetricValue): Self = StObject.set(x, "bidCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBidCountUndefined: Self = StObject.set(x, "bidCount", js.undefined)
    
    @scala.inline
    def setCreativeId(value: String): Self = StObject.set(x, "creativeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreativeIdUndefined: Self = StObject.set(x, "creativeId", js.undefined)
    
    @scala.inline
    def setRowDimensions(value: SchemaRowDimensions): Self = StObject.set(x, "rowDimensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowDimensionsUndefined: Self = StObject.set(x, "rowDimensions", js.undefined)
  }
}

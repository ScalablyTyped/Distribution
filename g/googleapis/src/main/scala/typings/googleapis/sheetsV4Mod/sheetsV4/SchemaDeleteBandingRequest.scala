package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Removes the banded range with the given ID from the spreadsheet.
  */
trait SchemaDeleteBandingRequest extends StObject {
  
  /**
    * The ID of the banded range to delete.
    */
  var bandedRangeId: js.UndefOr[Double] = js.undefined
}
object SchemaDeleteBandingRequest {
  
  @scala.inline
  def apply(): SchemaDeleteBandingRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeleteBandingRequest]
  }
  
  @scala.inline
  implicit class SchemaDeleteBandingRequestMutableBuilder[Self <: SchemaDeleteBandingRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBandedRangeId(value: Double): Self = StObject.set(x, "bandedRangeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBandedRangeIdUndefined: Self = StObject.set(x, "bandedRangeId", js.undefined)
  }
}

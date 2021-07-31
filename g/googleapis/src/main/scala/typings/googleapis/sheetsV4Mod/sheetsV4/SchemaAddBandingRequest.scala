package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Adds a new banded range to the spreadsheet.
  */
trait SchemaAddBandingRequest extends StObject {
  
  /**
    * The banded range to add. The bandedRangeId field is optional; if one is
    * not set, an id will be randomly generated. (It is an error to specify the
    * ID of a range that already exists.)
    */
  var bandedRange: js.UndefOr[SchemaBandedRange] = js.undefined
}
object SchemaAddBandingRequest {
  
  @scala.inline
  def apply(): SchemaAddBandingRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAddBandingRequest]
  }
  
  @scala.inline
  implicit class SchemaAddBandingRequestMutableBuilder[Self <: SchemaAddBandingRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBandedRange(value: SchemaBandedRange): Self = StObject.set(x, "bandedRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBandedRangeUndefined: Self = StObject.set(x, "bandedRange", js.undefined)
  }
}

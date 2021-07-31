package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The result of adding a banded range.
  */
trait SchemaAddBandingResponse extends StObject {
  
  /**
    * The banded range that was added.
    */
  var bandedRange: js.UndefOr[SchemaBandedRange] = js.undefined
}
object SchemaAddBandingResponse {
  
  @scala.inline
  def apply(): SchemaAddBandingResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAddBandingResponse]
  }
  
  @scala.inline
  implicit class SchemaAddBandingResponseMutableBuilder[Self <: SchemaAddBandingResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBandedRange(value: SchemaBandedRange): Self = StObject.set(x, "bandedRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBandedRangeUndefined: Self = StObject.set(x, "bandedRange", js.undefined)
  }
}

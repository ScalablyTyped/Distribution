package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Updates properties of the supplied banded range.
  */
@js.native
trait SchemaUpdateBandingRequest extends StObject {
  
  /**
    * The banded range to update with the new properties.
    */
  var bandedRange: js.UndefOr[SchemaBandedRange] = js.native
  
  /**
    * The fields that should be updated.  At least one field must be specified.
    * The root `bandedRange` is implied and should not be specified. A single
    * `&quot;*&quot;` can be used as short-hand for listing every field.
    */
  var fields: js.UndefOr[String] = js.native
}
object SchemaUpdateBandingRequest {
  
  @scala.inline
  def apply(): SchemaUpdateBandingRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUpdateBandingRequest]
  }
  
  @scala.inline
  implicit class SchemaUpdateBandingRequestMutableBuilder[Self <: SchemaUpdateBandingRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBandedRange(value: SchemaBandedRange): Self = StObject.set(x, "bandedRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBandedRangeUndefined: Self = StObject.set(x, "bandedRange", js.undefined)
    
    @scala.inline
    def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
  }
}

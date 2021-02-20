package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Automatically resizes one or more dimensions based on the contents of the
  * cells in that dimension.
  */
@js.native
trait SchemaAutoResizeDimensionsRequest extends StObject {
  
  /**
    * The dimensions to automatically resize.
    */
  var dimensions: js.UndefOr[SchemaDimensionRange] = js.native
}
object SchemaAutoResizeDimensionsRequest {
  
  @scala.inline
  def apply(): SchemaAutoResizeDimensionsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAutoResizeDimensionsRequest]
  }
  
  @scala.inline
  implicit class SchemaAutoResizeDimensionsRequestMutableBuilder[Self <: SchemaAutoResizeDimensionsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDimensions(value: SchemaDimensionRange): Self = StObject.set(x, "dimensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDimensionsUndefined: Self = StObject.set(x, "dimensions", js.undefined)
  }
}

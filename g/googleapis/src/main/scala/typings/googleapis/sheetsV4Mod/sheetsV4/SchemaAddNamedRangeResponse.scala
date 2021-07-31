package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The result of adding a named range.
  */
trait SchemaAddNamedRangeResponse extends StObject {
  
  /**
    * The named range to add.
    */
  var namedRange: js.UndefOr[SchemaNamedRange] = js.undefined
}
object SchemaAddNamedRangeResponse {
  
  @scala.inline
  def apply(): SchemaAddNamedRangeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAddNamedRangeResponse]
  }
  
  @scala.inline
  implicit class SchemaAddNamedRangeResponseMutableBuilder[Self <: SchemaAddNamedRangeResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNamedRange(value: SchemaNamedRange): Self = StObject.set(x, "namedRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamedRangeUndefined: Self = StObject.set(x, "namedRange", js.undefined)
  }
}

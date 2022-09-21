package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAddDimensionGroupRequest extends StObject {
  
  /**
    * The range over which to create a group.
    */
  var range: js.UndefOr[SchemaDimensionRange] = js.undefined
}
object SchemaAddDimensionGroupRequest {
  
  inline def apply(): SchemaAddDimensionGroupRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAddDimensionGroupRequest]
  }
  
  extension [Self <: SchemaAddDimensionGroupRequest](x: Self) {
    
    inline def setRange(value: SchemaDimensionRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
  }
}

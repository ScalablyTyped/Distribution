package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDeleteDimensionGroupRequest extends StObject {
  
  /**
    * The range of the group to be deleted.
    */
  var range: js.UndefOr[SchemaDimensionRange] = js.undefined
}
object SchemaDeleteDimensionGroupRequest {
  
  inline def apply(): SchemaDeleteDimensionGroupRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeleteDimensionGroupRequest]
  }
  
  extension [Self <: SchemaDeleteDimensionGroupRequest](x: Self) {
    
    inline def setRange(value: SchemaDimensionRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
  }
}

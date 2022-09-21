package typings.googleapis.slidesV1Mod.slidesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTableColumnProperties extends StObject {
  
  /**
    * Width of a column.
    */
  var columnWidth: js.UndefOr[SchemaDimension] = js.undefined
}
object SchemaTableColumnProperties {
  
  inline def apply(): SchemaTableColumnProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTableColumnProperties]
  }
  
  extension [Self <: SchemaTableColumnProperties](x: Self) {
    
    inline def setColumnWidth(value: SchemaDimension): Self = StObject.set(x, "columnWidth", value.asInstanceOf[js.Any])
    
    inline def setColumnWidthUndefined: Self = StObject.set(x, "columnWidth", js.undefined)
  }
}

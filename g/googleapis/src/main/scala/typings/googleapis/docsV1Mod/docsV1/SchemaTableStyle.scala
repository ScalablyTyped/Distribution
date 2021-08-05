package typings.googleapis.docsV1Mod.docsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Styles that apply to a table.
  */
trait SchemaTableStyle extends StObject {
  
  /**
    * The properties of each column.  Note that in Docs, tables contain rows
    * and rows contain cells, similar to HTML. So the properties for a row can
    * be found on the row&#39;s table_row_style.
    */
  var tableColumnProperties: js.UndefOr[js.Array[SchemaTableColumnProperties]] = js.undefined
}
object SchemaTableStyle {
  
  inline def apply(): SchemaTableStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTableStyle]
  }
  
  extension [Self <: SchemaTableStyle](x: Self) {
    
    inline def setTableColumnProperties(value: js.Array[SchemaTableColumnProperties]): Self = StObject.set(x, "tableColumnProperties", value.asInstanceOf[js.Any])
    
    inline def setTableColumnPropertiesUndefined: Self = StObject.set(x, "tableColumnProperties", js.undefined)
    
    inline def setTableColumnPropertiesVarargs(value: SchemaTableColumnProperties*): Self = StObject.set(x, "tableColumnProperties", js.Array(value :_*))
  }
}

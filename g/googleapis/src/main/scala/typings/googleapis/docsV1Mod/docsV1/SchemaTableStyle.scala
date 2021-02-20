package typings.googleapis.docsV1Mod.docsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Styles that apply to a table.
  */
@js.native
trait SchemaTableStyle extends StObject {
  
  /**
    * The properties of each column.  Note that in Docs, tables contain rows
    * and rows contain cells, similar to HTML. So the properties for a row can
    * be found on the row&#39;s table_row_style.
    */
  var tableColumnProperties: js.UndefOr[js.Array[SchemaTableColumnProperties]] = js.native
}
object SchemaTableStyle {
  
  @scala.inline
  def apply(): SchemaTableStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTableStyle]
  }
  
  @scala.inline
  implicit class SchemaTableStyleMutableBuilder[Self <: SchemaTableStyle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTableColumnProperties(value: js.Array[SchemaTableColumnProperties]): Self = StObject.set(x, "tableColumnProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableColumnPropertiesUndefined: Self = StObject.set(x, "tableColumnProperties", js.undefined)
    
    @scala.inline
    def setTableColumnPropertiesVarargs(value: SchemaTableColumnProperties*): Self = StObject.set(x, "tableColumnProperties", js.Array(value :_*))
  }
}

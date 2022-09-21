package typings.googleapis.docsV1Mod.docsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTableRowStyle extends StObject {
  
  /**
    * The minimum height of the row. The row will be rendered in the Docs editor at a height equal to or greater than this value in order to show all the content in the row's cells.
    */
  var minRowHeight: js.UndefOr[SchemaDimension] = js.undefined
  
  /**
    * Whether the row cannot overflow across page or column boundaries.
    */
  var preventOverflow: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Whether the row is a table header.
    */
  var tableHeader: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaTableRowStyle {
  
  inline def apply(): SchemaTableRowStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTableRowStyle]
  }
  
  extension [Self <: SchemaTableRowStyle](x: Self) {
    
    inline def setMinRowHeight(value: SchemaDimension): Self = StObject.set(x, "minRowHeight", value.asInstanceOf[js.Any])
    
    inline def setMinRowHeightUndefined: Self = StObject.set(x, "minRowHeight", js.undefined)
    
    inline def setPreventOverflow(value: Boolean): Self = StObject.set(x, "preventOverflow", value.asInstanceOf[js.Any])
    
    inline def setPreventOverflowNull: Self = StObject.set(x, "preventOverflow", null)
    
    inline def setPreventOverflowUndefined: Self = StObject.set(x, "preventOverflow", js.undefined)
    
    inline def setTableHeader(value: Boolean): Self = StObject.set(x, "tableHeader", value.asInstanceOf[js.Any])
    
    inline def setTableHeaderNull: Self = StObject.set(x, "tableHeader", null)
    
    inline def setTableHeaderUndefined: Self = StObject.set(x, "tableHeader", js.undefined)
  }
}

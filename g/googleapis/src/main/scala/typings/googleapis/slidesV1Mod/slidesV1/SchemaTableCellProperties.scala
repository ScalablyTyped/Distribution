package typings.googleapis.slidesV1Mod.slidesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The properties of the TableCell.
  */
trait SchemaTableCellProperties extends StObject {
  
  /**
    * The alignment of the content in the table cell. The default alignment
    * matches the alignment for newly created table cells in the Slides editor.
    */
  var contentAlignment: js.UndefOr[String] = js.undefined
  
  /**
    * The background fill of the table cell. The default fill matches the fill
    * for newly created table cells in the Slides editor.
    */
  var tableCellBackgroundFill: js.UndefOr[SchemaTableCellBackgroundFill] = js.undefined
}
object SchemaTableCellProperties {
  
  inline def apply(): SchemaTableCellProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTableCellProperties]
  }
  
  extension [Self <: SchemaTableCellProperties](x: Self) {
    
    inline def setContentAlignment(value: String): Self = StObject.set(x, "contentAlignment", value.asInstanceOf[js.Any])
    
    inline def setContentAlignmentUndefined: Self = StObject.set(x, "contentAlignment", js.undefined)
    
    inline def setTableCellBackgroundFill(value: SchemaTableCellBackgroundFill): Self = StObject.set(x, "tableCellBackgroundFill", value.asInstanceOf[js.Any])
    
    inline def setTableCellBackgroundFillUndefined: Self = StObject.set(x, "tableCellBackgroundFill", js.undefined)
  }
}

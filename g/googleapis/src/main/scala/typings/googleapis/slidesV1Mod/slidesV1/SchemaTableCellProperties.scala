package typings.googleapis.slidesV1Mod.slidesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The properties of the TableCell.
  */
@js.native
trait SchemaTableCellProperties extends StObject {
  
  /**
    * The alignment of the content in the table cell. The default alignment
    * matches the alignment for newly created table cells in the Slides editor.
    */
  var contentAlignment: js.UndefOr[String] = js.native
  
  /**
    * The background fill of the table cell. The default fill matches the fill
    * for newly created table cells in the Slides editor.
    */
  var tableCellBackgroundFill: js.UndefOr[SchemaTableCellBackgroundFill] = js.native
}
object SchemaTableCellProperties {
  
  @scala.inline
  def apply(): SchemaTableCellProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTableCellProperties]
  }
  
  @scala.inline
  implicit class SchemaTableCellPropertiesMutableBuilder[Self <: SchemaTableCellProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContentAlignment(value: String): Self = StObject.set(x, "contentAlignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentAlignmentUndefined: Self = StObject.set(x, "contentAlignment", js.undefined)
    
    @scala.inline
    def setTableCellBackgroundFill(value: SchemaTableCellBackgroundFill): Self = StObject.set(x, "tableCellBackgroundFill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableCellBackgroundFillUndefined: Self = StObject.set(x, "tableCellBackgroundFill", js.undefined)
  }
}

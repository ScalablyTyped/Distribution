package typings.googleapis.docsV1Mod.docsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Styles that apply to a table row.
  */
trait SchemaTableRowStyle extends StObject {
  
  /**
    * The minimum height of the row. The row will be rendered in the Docs
    * editor at a height equal to or greater than this value in order to show
    * all the content in the row&#39;s cells.
    */
  var minRowHeight: js.UndefOr[SchemaDimension] = js.undefined
}
object SchemaTableRowStyle {
  
  @scala.inline
  def apply(): SchemaTableRowStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTableRowStyle]
  }
  
  @scala.inline
  implicit class SchemaTableRowStyleMutableBuilder[Self <: SchemaTableRowStyle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMinRowHeight(value: SchemaDimension): Self = StObject.set(x, "minRowHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinRowHeightUndefined: Self = StObject.set(x, "minRowHeight", js.undefined)
  }
}

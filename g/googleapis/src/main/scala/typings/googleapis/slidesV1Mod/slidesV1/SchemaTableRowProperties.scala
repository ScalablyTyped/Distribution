package typings.googleapis.slidesV1Mod.slidesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Properties of each row in a table.
  */
@js.native
trait SchemaTableRowProperties extends StObject {
  
  /**
    * Minimum height of the row. The row will be rendered in the Slides editor
    * at a height equal to or greater than this value in order to show all the
    * text in the row&#39;s cell(s).
    */
  var minRowHeight: js.UndefOr[SchemaDimension] = js.native
}
object SchemaTableRowProperties {
  
  @scala.inline
  def apply(): SchemaTableRowProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTableRowProperties]
  }
  
  @scala.inline
  implicit class SchemaTableRowPropertiesMutableBuilder[Self <: SchemaTableRowProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMinRowHeight(value: SchemaDimension): Self = StObject.set(x, "minRowHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinRowHeightUndefined: Self = StObject.set(x, "minRowHeight", js.undefined)
  }
}

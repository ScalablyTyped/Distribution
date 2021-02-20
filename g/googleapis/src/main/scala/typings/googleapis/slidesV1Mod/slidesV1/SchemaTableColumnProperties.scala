package typings.googleapis.slidesV1Mod.slidesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Properties of each column in a table.
  */
@js.native
trait SchemaTableColumnProperties extends StObject {
  
  /**
    * Width of a column.
    */
  var columnWidth: js.UndefOr[SchemaDimension] = js.native
}
object SchemaTableColumnProperties {
  
  @scala.inline
  def apply(): SchemaTableColumnProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTableColumnProperties]
  }
  
  @scala.inline
  implicit class SchemaTableColumnPropertiesMutableBuilder[Self <: SchemaTableColumnProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumnWidth(value: SchemaDimension): Self = StObject.set(x, "columnWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnWidthUndefined: Self = StObject.set(x, "columnWidth", js.undefined)
  }
}

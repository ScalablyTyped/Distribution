package typings.googleapis.docsV1Mod.docsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The properties of a column in a table.
  */
@js.native
trait SchemaTableColumnProperties extends StObject {
  
  /**
    * The width of the column. Set when the column&#39;s `width_type` is
    * FIXED_WIDTH.
    */
  var width: js.UndefOr[SchemaDimension] = js.native
  
  /**
    * The width type of the column.
    */
  var widthType: js.UndefOr[String] = js.native
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
    def setWidth(value: SchemaDimension): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthType(value: String): Self = StObject.set(x, "widthType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthTypeUndefined: Self = StObject.set(x, "widthType", js.undefined)
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}

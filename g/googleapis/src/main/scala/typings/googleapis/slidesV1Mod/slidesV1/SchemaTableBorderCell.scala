package typings.googleapis.slidesV1Mod.slidesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The properties of each border cell.
  */
@js.native
trait SchemaTableBorderCell extends StObject {
  
  /**
    * The location of the border within the border table.
    */
  var location: js.UndefOr[SchemaTableCellLocation] = js.native
  
  /**
    * The border properties.
    */
  var tableBorderProperties: js.UndefOr[SchemaTableBorderProperties] = js.native
}
object SchemaTableBorderCell {
  
  @scala.inline
  def apply(): SchemaTableBorderCell = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTableBorderCell]
  }
  
  @scala.inline
  implicit class SchemaTableBorderCellMutableBuilder[Self <: SchemaTableBorderCell] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLocation(value: SchemaTableCellLocation): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    @scala.inline
    def setTableBorderProperties(value: SchemaTableBorderProperties): Self = StObject.set(x, "tableBorderProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableBorderPropertiesUndefined: Self = StObject.set(x, "tableBorderProperties", js.undefined)
  }
}

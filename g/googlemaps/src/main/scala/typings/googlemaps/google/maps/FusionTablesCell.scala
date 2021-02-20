package typings.googlemaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// TODO find source documentation
@js.native
trait FusionTablesCell extends StObject {
  
  var columnName: js.UndefOr[String] = js.native
  
  var value: js.UndefOr[String] = js.native
}
object FusionTablesCell {
  
  @scala.inline
  def apply(): FusionTablesCell = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FusionTablesCell]
  }
  
  @scala.inline
  implicit class FusionTablesCellMutableBuilder[Self <: FusionTablesCell] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumnName(value: String): Self = StObject.set(x, "columnName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnNameUndefined: Self = StObject.set(x, "columnName", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}

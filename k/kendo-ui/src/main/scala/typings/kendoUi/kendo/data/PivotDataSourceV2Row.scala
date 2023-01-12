package typings.kendoUi.kendo.data

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PivotDataSourceV2Row extends StObject {
  
  var expand: js.UndefOr[Boolean] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
}
object PivotDataSourceV2Row {
  
  inline def apply(): PivotDataSourceV2Row = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PivotDataSourceV2Row]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PivotDataSourceV2Row] (val x: Self) extends AnyVal {
    
    inline def setExpand(value: Boolean): Self = StObject.set(x, "expand", value.asInstanceOf[js.Any])
    
    inline def setExpandUndefined: Self = StObject.set(x, "expand", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}

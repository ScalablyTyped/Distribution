package typings.kendoUi.kendo.data

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PivotDataSourceAxisOptions extends StObject {
  
  var expand: js.UndefOr[Boolean] = js.undefined
  
  var name: String
}
object PivotDataSourceAxisOptions {
  
  inline def apply(name: String): PivotDataSourceAxisOptions = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[PivotDataSourceAxisOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PivotDataSourceAxisOptions] (val x: Self) extends AnyVal {
    
    inline def setExpand(value: Boolean): Self = StObject.set(x, "expand", value.asInstanceOf[js.Any])
    
    inline def setExpandUndefined: Self = StObject.set(x, "expand", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}

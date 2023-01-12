package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PivotContainerOptions extends StObject {
  
  var configuratorPosition: js.UndefOr[String] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
}
object PivotContainerOptions {
  
  inline def apply(): PivotContainerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PivotContainerOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PivotContainerOptions] (val x: Self) extends AnyVal {
    
    inline def setConfiguratorPosition(value: String): Self = StObject.set(x, "configuratorPosition", value.asInstanceOf[js.Any])
    
    inline def setConfiguratorPositionUndefined: Self = StObject.set(x, "configuratorPosition", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}

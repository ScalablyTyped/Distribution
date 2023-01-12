package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MapControlsNavigator extends StObject {
  
  var position: js.UndefOr[String] = js.undefined
}
object MapControlsNavigator {
  
  inline def apply(): MapControlsNavigator = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapControlsNavigator]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MapControlsNavigator] (val x: Self) extends AnyVal {
    
    inline def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
  }
}

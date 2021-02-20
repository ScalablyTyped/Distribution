package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MapControlsNavigator extends StObject {
  
  var position: js.UndefOr[String] = js.native
}
object MapControlsNavigator {
  
  @scala.inline
  def apply(): MapControlsNavigator = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapControlsNavigator]
  }
  
  @scala.inline
  implicit class MapControlsNavigatorMutableBuilder[Self <: MapControlsNavigator] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
  }
}

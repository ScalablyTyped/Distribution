package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MapControlsAttribution extends StObject {
  
  var position: js.UndefOr[String] = js.native
}
object MapControlsAttribution {
  
  @scala.inline
  def apply(): MapControlsAttribution = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapControlsAttribution]
  }
  
  @scala.inline
  implicit class MapControlsAttributionMutableBuilder[Self <: MapControlsAttribution] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
  }
}

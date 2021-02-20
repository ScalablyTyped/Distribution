package typings.googlemaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// TODO find source documentation
@js.native
trait FusionTablesHeatmap extends StObject {
  
  var enabled: Boolean = js.native
}
object FusionTablesHeatmap {
  
  @scala.inline
  def apply(enabled: Boolean): FusionTablesHeatmap = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[FusionTablesHeatmap]
  }
  
  @scala.inline
  implicit class FusionTablesHeatmapMutableBuilder[Self <: FusionTablesHeatmap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
  }
}

package typings.googlemaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// TODO find source documentation
@js.native
trait FusionTablesMarkerOptions extends StObject {
  
  var iconName: String = js.native
}
object FusionTablesMarkerOptions {
  
  @scala.inline
  def apply(iconName: String): FusionTablesMarkerOptions = {
    val __obj = js.Dynamic.literal(iconName = iconName.asInstanceOf[js.Any])
    __obj.asInstanceOf[FusionTablesMarkerOptions]
  }
  
  @scala.inline
  implicit class FusionTablesMarkerOptionsMutableBuilder[Self <: FusionTablesMarkerOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIconName(value: String): Self = StObject.set(x, "iconName", value.asInstanceOf[js.Any])
  }
}

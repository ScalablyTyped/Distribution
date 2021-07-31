package typings.leaflet.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IconOptions
  extends StObject
     with BaseIconOptions {
  
  @JSName("iconUrl")
  var iconUrl_IconOptions: String
}
object IconOptions {
  
  @scala.inline
  def apply(iconUrl: String): IconOptions = {
    val __obj = js.Dynamic.literal(iconUrl = iconUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[IconOptions]
  }
  
  @scala.inline
  implicit class IconOptionsMutableBuilder[Self <: IconOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIconUrl(value: String): Self = StObject.set(x, "iconUrl", value.asInstanceOf[js.Any])
  }
}

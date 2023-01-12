package typings.leaflet.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IconOptions
  extends StObject
     with BaseIconOptions {
  
  var crossOrigin: js.UndefOr[CrossOrigin | Boolean] = js.undefined
  
  @JSName("iconUrl")
  var iconUrl_IconOptions: String
}
object IconOptions {
  
  inline def apply(iconUrl: String): IconOptions = {
    val __obj = js.Dynamic.literal(iconUrl = iconUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[IconOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IconOptions] (val x: Self) extends AnyVal {
    
    inline def setCrossOrigin(value: CrossOrigin | Boolean): Self = StObject.set(x, "crossOrigin", value.asInstanceOf[js.Any])
    
    inline def setCrossOriginUndefined: Self = StObject.set(x, "crossOrigin", js.undefined)
    
    inline def setIconUrl(value: String): Self = StObject.set(x, "iconUrl", value.asInstanceOf[js.Any])
  }
}

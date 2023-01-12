package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppsDynamiteSharedIcon extends StObject {
  
  /** The description of the icon, used for accessibility. The default value is provided if you don't specify one. */
  var altText: js.UndefOr[String] = js.undefined
  
  /** The icon specified by a URL. */
  var iconUrl: js.UndefOr[String] = js.undefined
  
  /** The crop style applied to the image. In some cases, applying a `CIRCLE` crop causes the image to be drawn larger than a standard icon. */
  var imageType: js.UndefOr[String] = js.undefined
  
  /** The icon specified by the string name of a list of known icons */
  var knownIcon: js.UndefOr[String] = js.undefined
}
object AppsDynamiteSharedIcon {
  
  inline def apply(): AppsDynamiteSharedIcon = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppsDynamiteSharedIcon]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AppsDynamiteSharedIcon] (val x: Self) extends AnyVal {
    
    inline def setAltText(value: String): Self = StObject.set(x, "altText", value.asInstanceOf[js.Any])
    
    inline def setAltTextUndefined: Self = StObject.set(x, "altText", js.undefined)
    
    inline def setIconUrl(value: String): Self = StObject.set(x, "iconUrl", value.asInstanceOf[js.Any])
    
    inline def setIconUrlUndefined: Self = StObject.set(x, "iconUrl", js.undefined)
    
    inline def setImageType(value: String): Self = StObject.set(x, "imageType", value.asInstanceOf[js.Any])
    
    inline def setImageTypeUndefined: Self = StObject.set(x, "imageType", js.undefined)
    
    inline def setKnownIcon(value: String): Self = StObject.set(x, "knownIcon", value.asInstanceOf[js.Any])
    
    inline def setKnownIconUndefined: Self = StObject.set(x, "knownIcon", js.undefined)
  }
}

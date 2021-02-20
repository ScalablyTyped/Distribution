package typings.googlemaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// TODO find source documentation
@js.native
trait Attribution extends StObject {
  
  var iosDeepLinkId: js.UndefOr[String] = js.native
  
  var source: js.UndefOr[String] = js.native
  
  var webUrl: js.UndefOr[String] = js.native
}
object Attribution {
  
  @scala.inline
  def apply(): Attribution = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Attribution]
  }
  
  @scala.inline
  implicit class AttributionMutableBuilder[Self <: Attribution] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIosDeepLinkId(value: String): Self = StObject.set(x, "iosDeepLinkId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIosDeepLinkIdUndefined: Self = StObject.set(x, "iosDeepLinkId", js.undefined)
    
    @scala.inline
    def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    @scala.inline
    def setWebUrl(value: String): Self = StObject.set(x, "webUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebUrlUndefined: Self = StObject.set(x, "webUrl", js.undefined)
  }
}

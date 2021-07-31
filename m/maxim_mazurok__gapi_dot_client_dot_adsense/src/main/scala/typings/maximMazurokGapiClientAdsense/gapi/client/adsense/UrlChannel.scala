package typings.maximMazurokGapiClientAdsense.gapi.client.adsense

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UrlChannel extends StObject {
  
  /** Unique identifier of this URL channel. This should be considered an opaque identifier; it is not safe to rely on it being in any particular format. */
  var id: js.UndefOr[String] = js.undefined
  
  /** Kind of resource this is, in this case adsense#urlChannel. */
  var kind: js.UndefOr[String] = js.undefined
  
  /** URL Pattern of this URL channel. Does not include "http://" or "https://". Example: www.example.com/home */
  var urlPattern: js.UndefOr[String] = js.undefined
}
object UrlChannel {
  
  @scala.inline
  def apply(): UrlChannel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UrlChannel]
  }
  
  @scala.inline
  implicit class UrlChannelMutableBuilder[Self <: UrlChannel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setUrlPattern(value: String): Self = StObject.set(x, "urlPattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlPatternUndefined: Self = StObject.set(x, "urlPattern", js.undefined)
  }
}

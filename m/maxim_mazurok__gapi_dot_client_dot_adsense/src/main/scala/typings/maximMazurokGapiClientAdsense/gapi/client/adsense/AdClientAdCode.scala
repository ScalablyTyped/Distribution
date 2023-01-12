package typings.maximMazurokGapiClientAdsense.gapi.client.adsense

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdClientAdCode extends StObject {
  
  /** Output only. The AdSense code snippet to add to the head of an HTML page. */
  var adCode: js.UndefOr[String] = js.undefined
  
  /** Output only. The AdSense code snippet to add to the body of an AMP page. */
  var ampBody: js.UndefOr[String] = js.undefined
  
  /** Output only. The AdSense code snippet to add to the head of an AMP page. */
  var ampHead: js.UndefOr[String] = js.undefined
}
object AdClientAdCode {
  
  inline def apply(): AdClientAdCode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdClientAdCode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AdClientAdCode] (val x: Self) extends AnyVal {
    
    inline def setAdCode(value: String): Self = StObject.set(x, "adCode", value.asInstanceOf[js.Any])
    
    inline def setAdCodeUndefined: Self = StObject.set(x, "adCode", js.undefined)
    
    inline def setAmpBody(value: String): Self = StObject.set(x, "ampBody", value.asInstanceOf[js.Any])
    
    inline def setAmpBodyUndefined: Self = StObject.set(x, "ampBody", js.undefined)
    
    inline def setAmpHead(value: String): Self = StObject.set(x, "ampHead", value.asInstanceOf[js.Any])
    
    inline def setAmpHeadUndefined: Self = StObject.set(x, "ampHead", js.undefined)
  }
}

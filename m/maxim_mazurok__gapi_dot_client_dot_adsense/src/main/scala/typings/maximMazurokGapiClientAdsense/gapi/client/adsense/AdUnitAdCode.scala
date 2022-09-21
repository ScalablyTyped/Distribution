package typings.maximMazurokGapiClientAdsense.gapi.client.adsense

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdUnitAdCode extends StObject {
  
  /** Output only. The code snippet to add to the body of an HTML page. */
  var adCode: js.UndefOr[String] = js.undefined
}
object AdUnitAdCode {
  
  inline def apply(): AdUnitAdCode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdUnitAdCode]
  }
  
  extension [Self <: AdUnitAdCode](x: Self) {
    
    inline def setAdCode(value: String): Self = StObject.set(x, "adCode", value.asInstanceOf[js.Any])
    
    inline def setAdCodeUndefined: Self = StObject.set(x, "adCode", js.undefined)
  }
}

package typings.maximMazurokGapiClientAdsensehost.gapi.client.adsensehost

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdCode extends StObject {
  
  /** The ad code snippet. */
  var adCode: js.UndefOr[String] = js.undefined
  
  /** Kind this is, in this case adsensehost#adCode. */
  var kind: js.UndefOr[String] = js.undefined
}
object AdCode {
  
  inline def apply(): AdCode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdCode]
  }
  
  extension [Self <: AdCode](x: Self) {
    
    inline def setAdCode(value: String): Self = StObject.set(x, "adCode", value.asInstanceOf[js.Any])
    
    inline def setAdCodeUndefined: Self = StObject.set(x, "adCode", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}

package typings.maximMazurokGapiClientAdsense.gapi.client.adsense

import typings.maximMazurokGapiClientAdsense.anon.Background
import typings.maximMazurokGapiClientAdsense.anon.Family
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdStyle extends StObject {
  
  /** The colors which are included in the style. These are represented as six hexadecimal characters, similar to HTML color codes, but without the leading hash. */
  var colors: js.UndefOr[Background] = js.undefined
  
  /** The style of the corners in the ad (deprecated: never populated, ignored). */
  var corners: js.UndefOr[String] = js.undefined
  
  /** The font which is included in the style. */
  var font: js.UndefOr[Family] = js.undefined
  
  /** Kind this is, in this case adsense#adStyle. */
  var kind: js.UndefOr[String] = js.undefined
}
object AdStyle {
  
  inline def apply(): AdStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdStyle]
  }
  
  extension [Self <: AdStyle](x: Self) {
    
    inline def setColors(value: Background): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
    
    inline def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
    
    inline def setCorners(value: String): Self = StObject.set(x, "corners", value.asInstanceOf[js.Any])
    
    inline def setCornersUndefined: Self = StObject.set(x, "corners", js.undefined)
    
    inline def setFont(value: Family): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}

package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BannerClickEventUIParam extends StObject {
  
  /**
    * Get the banner html element in the DOM.
    */
  var bannerElement: js.UndefOr[Any] = js.undefined
}
object BannerClickEventUIParam {
  
  inline def apply(): BannerClickEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BannerClickEventUIParam]
  }
  
  extension [Self <: BannerClickEventUIParam](x: Self) {
    
    inline def setBannerElement(value: Any): Self = StObject.set(x, "bannerElement", value.asInstanceOf[js.Any])
    
    inline def setBannerElementUndefined: Self = StObject.set(x, "bannerElement", js.undefined)
  }
}

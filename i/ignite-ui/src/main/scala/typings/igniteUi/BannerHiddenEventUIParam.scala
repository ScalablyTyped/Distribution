package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BannerHiddenEventUIParam extends StObject {
  
  /**
    * Get the banner object from the banners array.
    */
  var banner: js.UndefOr[Any] = js.undefined
  
  /**
    * Get the banner html element in the DOM.
    */
  var bannerElement: js.UndefOr[Any] = js.undefined
  
  /**
    * Get the banner index in the banners array.
    */
  var index: js.UndefOr[Double] = js.undefined
}
object BannerHiddenEventUIParam {
  
  inline def apply(): BannerHiddenEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BannerHiddenEventUIParam]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BannerHiddenEventUIParam] (val x: Self) extends AnyVal {
    
    inline def setBanner(value: Any): Self = StObject.set(x, "banner", value.asInstanceOf[js.Any])
    
    inline def setBannerElement(value: Any): Self = StObject.set(x, "bannerElement", value.asInstanceOf[js.Any])
    
    inline def setBannerElementUndefined: Self = StObject.set(x, "bannerElement", js.undefined)
    
    inline def setBannerUndefined: Self = StObject.set(x, "banner", js.undefined)
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
  }
}

package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BannerVisibleEventUIParam extends StObject {
  
  /**
    * Get the banner object from the banners array.
    */
  var banner: js.UndefOr[js.Any] = js.native
  
  /**
    * Get the banner html element in the DOM.
    */
  var bannerElement: js.UndefOr[js.Any] = js.native
  
  /**
    * Get the banner index in the banners array.
    */
  var index: js.UndefOr[Double] = js.native
}
object BannerVisibleEventUIParam {
  
  @scala.inline
  def apply(): BannerVisibleEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BannerVisibleEventUIParam]
  }
  
  @scala.inline
  implicit class BannerVisibleEventUIParamMutableBuilder[Self <: BannerVisibleEventUIParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBanner(value: js.Any): Self = StObject.set(x, "banner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBannerElement(value: js.Any): Self = StObject.set(x, "bannerElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBannerElementUndefined: Self = StObject.set(x, "bannerElement", js.undefined)
    
    @scala.inline
    def setBannerUndefined: Self = StObject.set(x, "banner", js.undefined)
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
  }
}

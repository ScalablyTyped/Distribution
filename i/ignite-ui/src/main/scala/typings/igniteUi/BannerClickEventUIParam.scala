package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BannerClickEventUIParam extends StObject {
  
  /**
    * Get the banner html element in the DOM.
    */
  var bannerElement: js.UndefOr[js.Any] = js.native
}
object BannerClickEventUIParam {
  
  @scala.inline
  def apply(): BannerClickEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BannerClickEventUIParam]
  }
  
  @scala.inline
  implicit class BannerClickEventUIParamMutableBuilder[Self <: BannerClickEventUIParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBannerElement(value: js.Any): Self = StObject.set(x, "bannerElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBannerElementUndefined: Self = StObject.set(x, "bannerElement", js.undefined)
  }
}

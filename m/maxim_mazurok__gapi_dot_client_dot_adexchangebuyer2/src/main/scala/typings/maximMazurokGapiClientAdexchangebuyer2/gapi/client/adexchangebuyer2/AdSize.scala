package typings.maximMazurokGapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdSize extends StObject {
  
  /** The height of the ad slot in pixels. This field will be present only when size type is `PIXEL`. */
  var height: js.UndefOr[String] = js.undefined
  
  /** The size type of the ad slot. */
  var sizeType: js.UndefOr[String] = js.undefined
  
  /** The width of the ad slot in pixels. This field will be present only when size type is `PIXEL`. */
  var width: js.UndefOr[String] = js.undefined
}
object AdSize {
  
  @scala.inline
  def apply(): AdSize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdSize]
  }
  
  @scala.inline
  implicit class AdSizeMutableBuilder[Self <: AdSize] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setSizeType(value: String): Self = StObject.set(x, "sizeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeTypeUndefined: Self = StObject.set(x, "sizeType", js.undefined)
    
    @scala.inline
    def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}

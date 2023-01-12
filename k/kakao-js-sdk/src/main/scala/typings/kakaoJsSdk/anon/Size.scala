package typings.kakaoJsSdk.anon

import typings.kakaoJsSdk.Kakao.Channel.ButtonSize
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Size extends StObject {
  
  var channelPublicId: String
  
  var container: String | HTMLElement
  
  var size: js.UndefOr[ButtonSize] = js.undefined
  
  // default 'small'
  var supportMultipleDensities: js.UndefOr[Boolean] = js.undefined
}
object Size {
  
  inline def apply(channelPublicId: String, container: String | HTMLElement): Size = {
    val __obj = js.Dynamic.literal(channelPublicId = channelPublicId.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any])
    __obj.asInstanceOf[Size]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Size] (val x: Self) extends AnyVal {
    
    inline def setChannelPublicId(value: String): Self = StObject.set(x, "channelPublicId", value.asInstanceOf[js.Any])
    
    inline def setContainer(value: String | HTMLElement): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setSize(value: ButtonSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setSupportMultipleDensities(value: Boolean): Self = StObject.set(x, "supportMultipleDensities", value.asInstanceOf[js.Any])
    
    inline def setSupportMultipleDensitiesUndefined: Self = StObject.set(x, "supportMultipleDensities", js.undefined)
  }
}

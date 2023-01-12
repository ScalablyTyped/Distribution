package typings.kakaoJsSdk.anon

import typings.kakaoJsSdk.Kakao.Channel.ButtonSize
import typings.kakaoJsSdk.Kakao.Channel.Shape
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Color extends StObject {
  
  var channelPublicId: String
  
  // default 'small'
  var color: js.UndefOr[typings.kakaoJsSdk.Kakao.Channel.Color] = js.undefined
  
  var container: String | HTMLElement
  
  // default 'yellow'
  var shape: js.UndefOr[Shape] = js.undefined
  
  // default 'consult'
  var size: js.UndefOr[ButtonSize] = js.undefined
  
  // default 'pc'
  var supportMultipleDensities: js.UndefOr[Boolean] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
}
object Color {
  
  inline def apply(channelPublicId: String, container: String | HTMLElement): Color = {
    val __obj = js.Dynamic.literal(channelPublicId = channelPublicId.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any])
    __obj.asInstanceOf[Color]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Color] (val x: Self) extends AnyVal {
    
    inline def setChannelPublicId(value: String): Self = StObject.set(x, "channelPublicId", value.asInstanceOf[js.Any])
    
    inline def setColor(value: typings.kakaoJsSdk.Kakao.Channel.Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setContainer(value: String | HTMLElement): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setShape(value: Shape): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
    
    inline def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
    
    inline def setSize(value: ButtonSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setSupportMultipleDensities(value: Boolean): Self = StObject.set(x, "supportMultipleDensities", value.asInstanceOf[js.Any])
    
    inline def setSupportMultipleDensitiesUndefined: Self = StObject.set(x, "supportMultipleDensities", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}

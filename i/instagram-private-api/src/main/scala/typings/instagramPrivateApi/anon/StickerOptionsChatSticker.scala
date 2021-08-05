package typings.instagramPrivateApi.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined instagram-private-api.instagram-private-api/dist/sticker-builder/sticker-builder.StickerOptions<instagram-private-api.instagram-private-api/dist/sticker-builder/stickers.ChatSticker> */
trait StickerOptionsChatSticker extends StObject {
  
  var additionalConfigureProperties: js.UndefOr[js.Function0[js.Any]] = js.undefined
  
  var bottom: js.UndefOr[js.Function0[this.type]] = js.undefined
  
  var center: js.UndefOr[js.Function0[this.type]] = js.undefined
  
  var endBackgroundColor: js.UndefOr[String] = js.undefined
  
  var hasStartedChat: js.UndefOr[Boolean] = js.undefined
  
  var height: js.UndefOr[Double] = js.undefined
  
  var id: js.UndefOr[js.Function0[String]] = js.undefined
  
  var isSticker: js.UndefOr[Boolean] = js.undefined
  
  var key: js.UndefOr[js.Function0[String]] = js.undefined
  
  var left: js.UndefOr[js.Function0[this.type]] = js.undefined
  
  var moveBackwards: js.UndefOr[js.Function1[/* layers */ js.UndefOr[Double], this.type]] = js.undefined
  
  var moveForward: js.UndefOr[js.Function1[/* layers */ js.UndefOr[Double], this.type]] = js.undefined
  
  var right: js.UndefOr[js.Function0[this.type]] = js.undefined
  
  var rotateDeg: js.UndefOr[js.Function1[/* deg */ Double, this.type]] = js.undefined
  
  var rotation: js.UndefOr[Double] = js.undefined
  
  var scale: js.UndefOr[js.Function1[/* factor */ Double, this.type]] = js.undefined
  
  var startBackgroundColor: js.UndefOr[String] = js.undefined
  
  var text: String
  
  var toJSON: js.UndefOr[js.Function0[StringDictionary[js.Any]]] = js.undefined
  
  var top: js.UndefOr[js.Function0[this.type]] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
  
  var x: js.UndefOr[Double] = js.undefined
  
  var y: js.UndefOr[Double] = js.undefined
  
  var z: js.UndefOr[Double] = js.undefined
}
object StickerOptionsChatSticker {
  
  inline def apply(text: String): StickerOptionsChatSticker = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[StickerOptionsChatSticker]
  }
  
  extension [Self <: StickerOptionsChatSticker](x: Self) {
    
    inline def setAdditionalConfigureProperties(value: () => js.Any): Self = StObject.set(x, "additionalConfigureProperties", js.Any.fromFunction0(value))
    
    inline def setAdditionalConfigurePropertiesUndefined: Self = StObject.set(x, "additionalConfigureProperties", js.undefined)
    
    inline def setBottom(value: () => StickerOptionsChatSticker): Self = StObject.set(x, "bottom", js.Any.fromFunction0(value))
    
    inline def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
    
    inline def setCenter(value: () => StickerOptionsChatSticker): Self = StObject.set(x, "center", js.Any.fromFunction0(value))
    
    inline def setCenterUndefined: Self = StObject.set(x, "center", js.undefined)
    
    inline def setEndBackgroundColor(value: String): Self = StObject.set(x, "endBackgroundColor", value.asInstanceOf[js.Any])
    
    inline def setEndBackgroundColorUndefined: Self = StObject.set(x, "endBackgroundColor", js.undefined)
    
    inline def setHasStartedChat(value: Boolean): Self = StObject.set(x, "hasStartedChat", value.asInstanceOf[js.Any])
    
    inline def setHasStartedChatUndefined: Self = StObject.set(x, "hasStartedChat", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setId(value: () => String): Self = StObject.set(x, "id", js.Any.fromFunction0(value))
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setIsSticker(value: Boolean): Self = StObject.set(x, "isSticker", value.asInstanceOf[js.Any])
    
    inline def setIsStickerUndefined: Self = StObject.set(x, "isSticker", js.undefined)
    
    inline def setKey(value: () => String): Self = StObject.set(x, "key", js.Any.fromFunction0(value))
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setLeft(value: () => StickerOptionsChatSticker): Self = StObject.set(x, "left", js.Any.fromFunction0(value))
    
    inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
    
    inline def setMoveBackwards(value: /* layers */ js.UndefOr[Double] => StickerOptionsChatSticker): Self = StObject.set(x, "moveBackwards", js.Any.fromFunction1(value))
    
    inline def setMoveBackwardsUndefined: Self = StObject.set(x, "moveBackwards", js.undefined)
    
    inline def setMoveForward(value: /* layers */ js.UndefOr[Double] => StickerOptionsChatSticker): Self = StObject.set(x, "moveForward", js.Any.fromFunction1(value))
    
    inline def setMoveForwardUndefined: Self = StObject.set(x, "moveForward", js.undefined)
    
    inline def setRight(value: () => StickerOptionsChatSticker): Self = StObject.set(x, "right", js.Any.fromFunction0(value))
    
    inline def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
    
    inline def setRotateDeg(value: /* deg */ Double => StickerOptionsChatSticker): Self = StObject.set(x, "rotateDeg", js.Any.fromFunction1(value))
    
    inline def setRotateDegUndefined: Self = StObject.set(x, "rotateDeg", js.undefined)
    
    inline def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
    
    inline def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
    
    inline def setScale(value: /* factor */ Double => StickerOptionsChatSticker): Self = StObject.set(x, "scale", js.Any.fromFunction1(value))
    
    inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
    
    inline def setStartBackgroundColor(value: String): Self = StObject.set(x, "startBackgroundColor", value.asInstanceOf[js.Any])
    
    inline def setStartBackgroundColorUndefined: Self = StObject.set(x, "startBackgroundColor", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setToJSON(value: () => StringDictionary[js.Any]): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
    
    inline def setToJSONUndefined: Self = StObject.set(x, "toJSON", js.undefined)
    
    inline def setTop(value: () => StickerOptionsChatSticker): Self = StObject.set(x, "top", js.Any.fromFunction0(value))
    
    inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    
    inline def setZ(value: Double): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
    
    inline def setZUndefined: Self = StObject.set(x, "z", js.undefined)
  }
}

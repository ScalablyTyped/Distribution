package typings.instagramPrivateApi.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<instagram-private-api.instagram-private-api/dist/sticker-builder/stickers.InstaSticker> */
trait PartialInstaSticker extends StObject {
  
  var additionalConfigureProperties: js.UndefOr[js.Function0[js.Any]] = js.undefined
  
  var bottom: js.UndefOr[js.Function0[this.type]] = js.undefined
  
  var center: js.UndefOr[js.Function0[this.type]] = js.undefined
  
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
  
  var toJSON: js.UndefOr[js.Function0[StringDictionary[js.Any]]] = js.undefined
  
  var top: js.UndefOr[js.Function0[this.type]] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
  
  var x: js.UndefOr[Double] = js.undefined
  
  var y: js.UndefOr[Double] = js.undefined
  
  var z: js.UndefOr[Double] = js.undefined
}
object PartialInstaSticker {
  
  @scala.inline
  def apply(): PartialInstaSticker = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialInstaSticker]
  }
  
  @scala.inline
  implicit class PartialInstaStickerMutableBuilder[Self <: PartialInstaSticker] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdditionalConfigureProperties(value: () => js.Any): Self = StObject.set(x, "additionalConfigureProperties", js.Any.fromFunction0(value))
    
    @scala.inline
    def setAdditionalConfigurePropertiesUndefined: Self = StObject.set(x, "additionalConfigureProperties", js.undefined)
    
    @scala.inline
    def setBottom(value: () => PartialInstaSticker): Self = StObject.set(x, "bottom", js.Any.fromFunction0(value))
    
    @scala.inline
    def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
    
    @scala.inline
    def setCenter(value: () => PartialInstaSticker): Self = StObject.set(x, "center", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCenterUndefined: Self = StObject.set(x, "center", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setId(value: () => String): Self = StObject.set(x, "id", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setIsSticker(value: Boolean): Self = StObject.set(x, "isSticker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsStickerUndefined: Self = StObject.set(x, "isSticker", js.undefined)
    
    @scala.inline
    def setKey(value: () => String): Self = StObject.set(x, "key", js.Any.fromFunction0(value))
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setLeft(value: () => PartialInstaSticker): Self = StObject.set(x, "left", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
    
    @scala.inline
    def setMoveBackwards(value: /* layers */ js.UndefOr[Double] => PartialInstaSticker): Self = StObject.set(x, "moveBackwards", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMoveBackwardsUndefined: Self = StObject.set(x, "moveBackwards", js.undefined)
    
    @scala.inline
    def setMoveForward(value: /* layers */ js.UndefOr[Double] => PartialInstaSticker): Self = StObject.set(x, "moveForward", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMoveForwardUndefined: Self = StObject.set(x, "moveForward", js.undefined)
    
    @scala.inline
    def setRight(value: () => PartialInstaSticker): Self = StObject.set(x, "right", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
    
    @scala.inline
    def setRotateDeg(value: /* deg */ Double => PartialInstaSticker): Self = StObject.set(x, "rotateDeg", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRotateDegUndefined: Self = StObject.set(x, "rotateDeg", js.undefined)
    
    @scala.inline
    def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
    
    @scala.inline
    def setScale(value: /* factor */ Double => PartialInstaSticker): Self = StObject.set(x, "scale", js.Any.fromFunction1(value))
    
    @scala.inline
    def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
    
    @scala.inline
    def setToJSON(value: () => StringDictionary[js.Any]): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
    
    @scala.inline
    def setToJSONUndefined: Self = StObject.set(x, "toJSON", js.undefined)
    
    @scala.inline
    def setTop(value: () => PartialInstaSticker): Self = StObject.set(x, "top", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    
    @scala.inline
    def setZ(value: Double): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZUndefined: Self = StObject.set(x, "z", js.undefined)
  }
}

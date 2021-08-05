package typings.instagramPrivateApi.anon

import org.scalablytyped.runtime.StringDictionary
import typings.instagramPrivateApi.pollStickerMod.Tallies
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined instagram-private-api.instagram-private-api/dist/sticker-builder/sticker-builder.StickerOptions<instagram-private-api.instagram-private-api/dist/sticker-builder/stickers.PollSticker> */
trait StickerOptionsPollSticker extends StObject {
  
  var _tallies: js.Any
  
  var additionalConfigureProperties: js.UndefOr[js.Function0[js.Any]] = js.undefined
  
  var bottom: js.UndefOr[js.Function0[this.type]] = js.undefined
  
  var center: js.UndefOr[js.Function0[this.type]] = js.undefined
  
  var finished: js.UndefOr[Boolean] = js.undefined
  
  var height: js.UndefOr[Double] = js.undefined
  
  var id: js.UndefOr[js.Function0[String]] = js.undefined
  
  var isSharedResult: js.UndefOr[Boolean] = js.undefined
  
  var isSticker: js.UndefOr[Boolean] = js.undefined
  
  var key: js.UndefOr[js.Function0[String]] = js.undefined
  
  var left: js.UndefOr[js.Function0[this.type]] = js.undefined
  
  var moveBackwards: js.UndefOr[js.Function1[/* layers */ js.UndefOr[Double], this.type]] = js.undefined
  
  var moveForward: js.UndefOr[js.Function1[/* layers */ js.UndefOr[Double], this.type]] = js.undefined
  
  var question: String
  
  var right: js.UndefOr[js.Function0[this.type]] = js.undefined
  
  var rotateDeg: js.UndefOr[js.Function1[/* deg */ Double, this.type]] = js.undefined
  
  var rotation: js.UndefOr[Double] = js.undefined
  
  var scale: js.UndefOr[js.Function1[/* factor */ Double, this.type]] = js.undefined
  
  def tallies(): Tallies
  @JSName("tallies")
  var tallies_Original: js.Function0[Tallies]
  
  var toJSON: js.UndefOr[js.Function0[StringDictionary[js.Any]]] = js.undefined
  
  var top: js.UndefOr[js.Function0[this.type]] = js.undefined
  
  var viewerCanVote: js.UndefOr[Boolean] = js.undefined
  
  var viewerVote: js.UndefOr[Double] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
  
  var x: js.UndefOr[Double] = js.undefined
  
  var y: js.UndefOr[Double] = js.undefined
  
  var z: js.UndefOr[Double] = js.undefined
}
object StickerOptionsPollSticker {
  
  inline def apply(_tallies: js.Any, question: String, tallies: () => Tallies): StickerOptionsPollSticker = {
    val __obj = js.Dynamic.literal(_tallies = _tallies.asInstanceOf[js.Any], question = question.asInstanceOf[js.Any], tallies = js.Any.fromFunction0(tallies))
    __obj.asInstanceOf[StickerOptionsPollSticker]
  }
  
  extension [Self <: StickerOptionsPollSticker](x: Self) {
    
    inline def setAdditionalConfigureProperties(value: () => js.Any): Self = StObject.set(x, "additionalConfigureProperties", js.Any.fromFunction0(value))
    
    inline def setAdditionalConfigurePropertiesUndefined: Self = StObject.set(x, "additionalConfigureProperties", js.undefined)
    
    inline def setBottom(value: () => StickerOptionsPollSticker): Self = StObject.set(x, "bottom", js.Any.fromFunction0(value))
    
    inline def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
    
    inline def setCenter(value: () => StickerOptionsPollSticker): Self = StObject.set(x, "center", js.Any.fromFunction0(value))
    
    inline def setCenterUndefined: Self = StObject.set(x, "center", js.undefined)
    
    inline def setFinished(value: Boolean): Self = StObject.set(x, "finished", value.asInstanceOf[js.Any])
    
    inline def setFinishedUndefined: Self = StObject.set(x, "finished", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setId(value: () => String): Self = StObject.set(x, "id", js.Any.fromFunction0(value))
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setIsSharedResult(value: Boolean): Self = StObject.set(x, "isSharedResult", value.asInstanceOf[js.Any])
    
    inline def setIsSharedResultUndefined: Self = StObject.set(x, "isSharedResult", js.undefined)
    
    inline def setIsSticker(value: Boolean): Self = StObject.set(x, "isSticker", value.asInstanceOf[js.Any])
    
    inline def setIsStickerUndefined: Self = StObject.set(x, "isSticker", js.undefined)
    
    inline def setKey(value: () => String): Self = StObject.set(x, "key", js.Any.fromFunction0(value))
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setLeft(value: () => StickerOptionsPollSticker): Self = StObject.set(x, "left", js.Any.fromFunction0(value))
    
    inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
    
    inline def setMoveBackwards(value: /* layers */ js.UndefOr[Double] => StickerOptionsPollSticker): Self = StObject.set(x, "moveBackwards", js.Any.fromFunction1(value))
    
    inline def setMoveBackwardsUndefined: Self = StObject.set(x, "moveBackwards", js.undefined)
    
    inline def setMoveForward(value: /* layers */ js.UndefOr[Double] => StickerOptionsPollSticker): Self = StObject.set(x, "moveForward", js.Any.fromFunction1(value))
    
    inline def setMoveForwardUndefined: Self = StObject.set(x, "moveForward", js.undefined)
    
    inline def setQuestion(value: String): Self = StObject.set(x, "question", value.asInstanceOf[js.Any])
    
    inline def setRight(value: () => StickerOptionsPollSticker): Self = StObject.set(x, "right", js.Any.fromFunction0(value))
    
    inline def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
    
    inline def setRotateDeg(value: /* deg */ Double => StickerOptionsPollSticker): Self = StObject.set(x, "rotateDeg", js.Any.fromFunction1(value))
    
    inline def setRotateDegUndefined: Self = StObject.set(x, "rotateDeg", js.undefined)
    
    inline def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
    
    inline def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
    
    inline def setScale(value: /* factor */ Double => StickerOptionsPollSticker): Self = StObject.set(x, "scale", js.Any.fromFunction1(value))
    
    inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
    
    inline def setTallies(value: () => Tallies): Self = StObject.set(x, "tallies", js.Any.fromFunction0(value))
    
    inline def setToJSON(value: () => StringDictionary[js.Any]): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
    
    inline def setToJSONUndefined: Self = StObject.set(x, "toJSON", js.undefined)
    
    inline def setTop(value: () => StickerOptionsPollSticker): Self = StObject.set(x, "top", js.Any.fromFunction0(value))
    
    inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    
    inline def setViewerCanVote(value: Boolean): Self = StObject.set(x, "viewerCanVote", value.asInstanceOf[js.Any])
    
    inline def setViewerCanVoteUndefined: Self = StObject.set(x, "viewerCanVote", js.undefined)
    
    inline def setViewerVote(value: Double): Self = StObject.set(x, "viewerVote", value.asInstanceOf[js.Any])
    
    inline def setViewerVoteUndefined: Self = StObject.set(x, "viewerVote", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    
    inline def setZ(value: Double): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
    
    inline def setZUndefined: Self = StObject.set(x, "z", js.undefined)
    
    inline def set_tallies(value: js.Any): Self = StObject.set(x, "_tallies", value.asInstanceOf[js.Any])
  }
}

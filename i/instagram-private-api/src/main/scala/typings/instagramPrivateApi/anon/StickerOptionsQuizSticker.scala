package typings.instagramPrivateApi.anon

import org.scalablytyped.runtime.StringDictionary
import typings.instagramPrivateApi.quizStickerMod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined instagram-private-api.instagram-private-api/dist/sticker-builder/sticker-builder.StickerOptions<instagram-private-api.instagram-private-api/dist/sticker-builder/stickers.QuizSticker> */
trait StickerOptionsQuizSticker extends StObject {
  
  var _options: js.Any
  
  var additionalConfigureProperties: js.UndefOr[js.Function0[js.Any]] = js.undefined
  
  var bottom: js.UndefOr[js.Function0[this.type]] = js.undefined
  
  var center: js.UndefOr[js.Function0[this.type]] = js.undefined
  
  var correctAnswer: Double
  
  var endBackgroundColor: js.UndefOr[String] = js.undefined
  
  var height: js.UndefOr[Double] = js.undefined
  
  var id: js.UndefOr[js.Function0[String]] = js.undefined
  
  var isSticker: js.UndefOr[Boolean] = js.undefined
  
  var key: js.UndefOr[js.Function0[String]] = js.undefined
  
  var left: js.UndefOr[js.Function0[this.type]] = js.undefined
  
  var moveBackwards: js.UndefOr[js.Function1[/* layers */ js.UndefOr[Double], this.type]] = js.undefined
  
  var moveForward: js.UndefOr[js.Function1[/* layers */ js.UndefOr[Double], this.type]] = js.undefined
  
  def options(value: js.Array[String] | Options): js.Any
  @JSName("options")
  var options_Original: js.Function1[/* value */ js.Array[String] | Options, js.Any]
  
  var question: String
  
  var right: js.UndefOr[js.Function0[this.type]] = js.undefined
  
  var rotateDeg: js.UndefOr[js.Function1[/* deg */ Double, this.type]] = js.undefined
  
  var rotation: js.UndefOr[Double] = js.undefined
  
  var scale: js.UndefOr[js.Function1[/* factor */ Double, this.type]] = js.undefined
  
  var startBackgroundColor: js.UndefOr[String] = js.undefined
  
  var textColor: js.UndefOr[String] = js.undefined
  
  var toJSON: js.UndefOr[js.Function0[StringDictionary[js.Any]]] = js.undefined
  
  var top: js.UndefOr[js.Function0[this.type]] = js.undefined
  
  var viewerAnswer: js.UndefOr[Double] = js.undefined
  
  var viewerCanAnswer: js.UndefOr[Boolean] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
  
  var x: js.UndefOr[Double] = js.undefined
  
  var y: js.UndefOr[Double] = js.undefined
  
  var z: js.UndefOr[Double] = js.undefined
}
object StickerOptionsQuizSticker {
  
  @scala.inline
  def apply(
    _options: js.Any,
    correctAnswer: Double,
    options: /* value */ js.Array[String] | Options => js.Any,
    question: String
  ): StickerOptionsQuizSticker = {
    val __obj = js.Dynamic.literal(_options = _options.asInstanceOf[js.Any], correctAnswer = correctAnswer.asInstanceOf[js.Any], options = js.Any.fromFunction1(options), question = question.asInstanceOf[js.Any])
    __obj.asInstanceOf[StickerOptionsQuizSticker]
  }
  
  @scala.inline
  implicit class StickerOptionsQuizStickerMutableBuilder[Self <: StickerOptionsQuizSticker] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdditionalConfigureProperties(value: () => js.Any): Self = StObject.set(x, "additionalConfigureProperties", js.Any.fromFunction0(value))
    
    @scala.inline
    def setAdditionalConfigurePropertiesUndefined: Self = StObject.set(x, "additionalConfigureProperties", js.undefined)
    
    @scala.inline
    def setBottom(value: () => StickerOptionsQuizSticker): Self = StObject.set(x, "bottom", js.Any.fromFunction0(value))
    
    @scala.inline
    def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
    
    @scala.inline
    def setCenter(value: () => StickerOptionsQuizSticker): Self = StObject.set(x, "center", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCenterUndefined: Self = StObject.set(x, "center", js.undefined)
    
    @scala.inline
    def setCorrectAnswer(value: Double): Self = StObject.set(x, "correctAnswer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndBackgroundColor(value: String): Self = StObject.set(x, "endBackgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndBackgroundColorUndefined: Self = StObject.set(x, "endBackgroundColor", js.undefined)
    
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
    def setLeft(value: () => StickerOptionsQuizSticker): Self = StObject.set(x, "left", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
    
    @scala.inline
    def setMoveBackwards(value: /* layers */ js.UndefOr[Double] => StickerOptionsQuizSticker): Self = StObject.set(x, "moveBackwards", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMoveBackwardsUndefined: Self = StObject.set(x, "moveBackwards", js.undefined)
    
    @scala.inline
    def setMoveForward(value: /* layers */ js.UndefOr[Double] => StickerOptionsQuizSticker): Self = StObject.set(x, "moveForward", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMoveForwardUndefined: Self = StObject.set(x, "moveForward", js.undefined)
    
    @scala.inline
    def setOptions(value: /* value */ js.Array[String] | Options => js.Any): Self = StObject.set(x, "options", js.Any.fromFunction1(value))
    
    @scala.inline
    def setQuestion(value: String): Self = StObject.set(x, "question", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRight(value: () => StickerOptionsQuizSticker): Self = StObject.set(x, "right", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
    
    @scala.inline
    def setRotateDeg(value: /* deg */ Double => StickerOptionsQuizSticker): Self = StObject.set(x, "rotateDeg", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRotateDegUndefined: Self = StObject.set(x, "rotateDeg", js.undefined)
    
    @scala.inline
    def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
    
    @scala.inline
    def setScale(value: /* factor */ Double => StickerOptionsQuizSticker): Self = StObject.set(x, "scale", js.Any.fromFunction1(value))
    
    @scala.inline
    def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
    
    @scala.inline
    def setStartBackgroundColor(value: String): Self = StObject.set(x, "startBackgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartBackgroundColorUndefined: Self = StObject.set(x, "startBackgroundColor", js.undefined)
    
    @scala.inline
    def setTextColor(value: String): Self = StObject.set(x, "textColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextColorUndefined: Self = StObject.set(x, "textColor", js.undefined)
    
    @scala.inline
    def setToJSON(value: () => StringDictionary[js.Any]): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
    
    @scala.inline
    def setToJSONUndefined: Self = StObject.set(x, "toJSON", js.undefined)
    
    @scala.inline
    def setTop(value: () => StickerOptionsQuizSticker): Self = StObject.set(x, "top", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    
    @scala.inline
    def setViewerAnswer(value: Double): Self = StObject.set(x, "viewerAnswer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewerAnswerUndefined: Self = StObject.set(x, "viewerAnswer", js.undefined)
    
    @scala.inline
    def setViewerCanAnswer(value: Boolean): Self = StObject.set(x, "viewerCanAnswer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewerCanAnswerUndefined: Self = StObject.set(x, "viewerCanAnswer", js.undefined)
    
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
    
    @scala.inline
    def set_options(value: js.Any): Self = StObject.set(x, "_options", value.asInstanceOf[js.Any])
  }
}

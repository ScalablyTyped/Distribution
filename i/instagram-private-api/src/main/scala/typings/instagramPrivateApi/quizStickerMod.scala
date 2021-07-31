package typings.instagramPrivateApi

import typings.instagramPrivateApi.anon.Count
import typings.instagramPrivateApi.instaStickerMod.InstaSticker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object quizStickerMod {
  
  @JSImport("instagram-private-api/dist/sticker-builder/stickers/quiz.sticker", "QuizSticker")
  @js.native
  class QuizSticker () extends InstaSticker {
    
    var _options: js.Any = js.native
    
    var correctAnswer: Double = js.native
    
    var endBackgroundColor: js.UndefOr[String] = js.native
    
    def options: js.Array[String] | Options = js.native
    def options_=(value: js.Array[String] | Options): Unit = js.native
    
    var question: String = js.native
    
    var startBackgroundColor: js.UndefOr[String] = js.native
    
    var textColor: js.UndefOr[String] = js.native
    
    var viewerAnswer: js.UndefOr[Double] = js.native
    
    var viewerCanAnswer: js.UndefOr[Boolean] = js.native
  }
  
  type Options = js.Array[Count]
}

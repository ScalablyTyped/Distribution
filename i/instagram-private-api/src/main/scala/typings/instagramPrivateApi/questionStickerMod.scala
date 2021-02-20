package typings.instagramPrivateApi

import typings.instagramPrivateApi.instaStickerMod.InstaSticker
import typings.instagramPrivateApi.instagramPrivateApiStrings.music
import typings.instagramPrivateApi.instagramPrivateApiStrings.text_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object questionStickerMod {
  
  @JSImport("instagram-private-api/dist/sticker-builder/stickers/question.sticker", "QuestionSticker")
  @js.native
  class QuestionSticker () extends InstaSticker {
    
    var backgroundColor: js.UndefOr[String] = js.native
    
    var profilePicUrl: js.UndefOr[String] = js.native
    
    var question: String = js.native
    
    var questionType: js.UndefOr[text_ | music] = js.native
    
    var textColor: js.UndefOr[String] = js.native
    
    var viewerCanInteract: js.UndefOr[Boolean] = js.native
  }
}

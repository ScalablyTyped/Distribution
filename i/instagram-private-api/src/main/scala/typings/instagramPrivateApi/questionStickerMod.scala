package typings.instagramPrivateApi

import typings.instagramPrivateApi.instaStickerMod.InstaSticker
import typings.instagramPrivateApi.instagramPrivateApiStrings.music
import typings.instagramPrivateApi.instagramPrivateApiStrings.text_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("instagram-private-api/dist/sticker-builder/stickers/question.sticker", JSImport.Namespace)
@js.native
object questionStickerMod extends js.Object {
  
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

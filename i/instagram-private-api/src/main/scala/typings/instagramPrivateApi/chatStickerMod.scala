package typings.instagramPrivateApi

import typings.instagramPrivateApi.instaStickerMod.InstaSticker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object chatStickerMod {
  
  @JSImport("instagram-private-api/dist/sticker-builder/stickers/chat.sticker", "ChatSticker")
  @js.native
  class ChatSticker () extends InstaSticker {
    
    var endBackgroundColor: js.UndefOr[String] = js.native
    
    var hasStartedChat: js.UndefOr[Boolean] = js.native
    
    var startBackgroundColor: js.UndefOr[String] = js.native
    
    var text: String = js.native
  }
}

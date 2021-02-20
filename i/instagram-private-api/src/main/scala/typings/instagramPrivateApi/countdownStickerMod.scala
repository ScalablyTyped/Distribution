package typings.instagramPrivateApi

import typings.instagramPrivateApi.instaStickerMod.InstaSticker
import typings.luxon.mod.DateTime
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object countdownStickerMod {
  
  @JSImport("instagram-private-api/dist/sticker-builder/stickers/countdown.sticker", "CountdownSticker")
  @js.native
  class CountdownSticker () extends InstaSticker {
    
    var _endTs: js.Any = js.native
    
    var digitCardColor: js.UndefOr[String] = js.native
    
    var digitColor: js.UndefOr[String] = js.native
    
    var endBackgroundColor: js.UndefOr[String] = js.native
    
    def endTs: DateTime | Double = js.native
    def endTs_=(value: DateTime | Double): Unit = js.native
    
    var followingEnabled: js.UndefOr[Boolean] = js.native
    
    var startBackgroundColor: js.UndefOr[String] = js.native
    
    var text: String = js.native
    
    var textColor: js.UndefOr[String] = js.native
  }
}

package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppsDynamiteCustomEmojiMetadata extends StObject {
  
  var customEmoji: js.UndefOr[AppsDynamiteSharedCustomEmoji] = js.undefined
}
object AppsDynamiteCustomEmojiMetadata {
  
  inline def apply(): AppsDynamiteCustomEmojiMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppsDynamiteCustomEmojiMetadata]
  }
  
  extension [Self <: AppsDynamiteCustomEmojiMetadata](x: Self) {
    
    inline def setCustomEmoji(value: AppsDynamiteSharedCustomEmoji): Self = StObject.set(x, "customEmoji", value.asInstanceOf[js.Any])
    
    inline def setCustomEmojiUndefined: Self = StObject.set(x, "customEmoji", js.undefined)
  }
}

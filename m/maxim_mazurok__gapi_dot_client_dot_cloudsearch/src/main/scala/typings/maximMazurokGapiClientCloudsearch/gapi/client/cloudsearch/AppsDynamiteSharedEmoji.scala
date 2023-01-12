package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppsDynamiteSharedEmoji extends StObject {
  
  /** A custom emoji. */
  var customEmoji: js.UndefOr[AppsDynamiteSharedCustomEmoji] = js.undefined
  
  /** A basic emoji represented by a unicode string. */
  var unicode: js.UndefOr[String] = js.undefined
}
object AppsDynamiteSharedEmoji {
  
  inline def apply(): AppsDynamiteSharedEmoji = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppsDynamiteSharedEmoji]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AppsDynamiteSharedEmoji] (val x: Self) extends AnyVal {
    
    inline def setCustomEmoji(value: AppsDynamiteSharedCustomEmoji): Self = StObject.set(x, "customEmoji", value.asInstanceOf[js.Any])
    
    inline def setCustomEmojiUndefined: Self = StObject.set(x, "customEmoji", js.undefined)
    
    inline def setUnicode(value: String): Self = StObject.set(x, "unicode", value.asInstanceOf[js.Any])
    
    inline def setUnicodeUndefined: Self = StObject.set(x, "unicode", js.undefined)
  }
}

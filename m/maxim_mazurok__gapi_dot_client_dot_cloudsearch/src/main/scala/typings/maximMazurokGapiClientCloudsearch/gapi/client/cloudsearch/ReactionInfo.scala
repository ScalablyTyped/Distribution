package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReactionInfo extends StObject {
  
  /** Unicode string representing a single emoji. */
  var emoji: js.UndefOr[String] = js.undefined
}
object ReactionInfo {
  
  inline def apply(): ReactionInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReactionInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReactionInfo] (val x: Self) extends AnyVal {
    
    inline def setEmoji(value: String): Self = StObject.set(x, "emoji", value.asInstanceOf[js.Any])
    
    inline def setEmojiUndefined: Self = StObject.set(x, "emoji", js.undefined)
  }
}

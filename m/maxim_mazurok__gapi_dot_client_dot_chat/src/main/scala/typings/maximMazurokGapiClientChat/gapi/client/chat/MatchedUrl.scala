package typings.maximMazurokGapiClientChat.gapi.client.chat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MatchedUrl extends StObject {
  
  /** Output only. The url that was matched. */
  var url: js.UndefOr[String] = js.undefined
}
object MatchedUrl {
  
  inline def apply(): MatchedUrl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MatchedUrl]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MatchedUrl] (val x: Self) extends AnyVal {
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}

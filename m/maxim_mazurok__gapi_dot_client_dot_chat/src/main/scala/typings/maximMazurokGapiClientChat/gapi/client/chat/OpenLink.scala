package typings.maximMazurokGapiClientChat.gapi.client.chat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OpenLink extends StObject {
  
  /** The URL to open. */
  var url: js.UndefOr[String] = js.undefined
}
object OpenLink {
  
  inline def apply(): OpenLink = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OpenLink]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OpenLink] (val x: Self) extends AnyVal {
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}

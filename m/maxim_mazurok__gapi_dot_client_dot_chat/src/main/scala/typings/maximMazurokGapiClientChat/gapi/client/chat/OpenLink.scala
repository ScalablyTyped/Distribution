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
  
  extension [Self <: OpenLink](x: Self) {
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}

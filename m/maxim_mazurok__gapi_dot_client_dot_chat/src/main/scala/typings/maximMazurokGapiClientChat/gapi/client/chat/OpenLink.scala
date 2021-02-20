package typings.maximMazurokGapiClientChat.gapi.client.chat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OpenLink extends StObject {
  
  /** The URL to open. */
  var url: js.UndefOr[String] = js.native
}
object OpenLink {
  
  @scala.inline
  def apply(): OpenLink = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OpenLink]
  }
  
  @scala.inline
  implicit class OpenLinkMutableBuilder[Self <: OpenLink] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}

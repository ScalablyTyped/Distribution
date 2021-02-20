package typings.ionic.definitionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OAuthIdentityDetails extends StObject {
  
  var html_url: String = js.native
  
  var name: String = js.native
  
  var username: String = js.native
}
object OAuthIdentityDetails {
  
  @scala.inline
  def apply(html_url: String, name: String, username: String): OAuthIdentityDetails = {
    val __obj = js.Dynamic.literal(html_url = html_url.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[OAuthIdentityDetails]
  }
  
  @scala.inline
  implicit class OAuthIdentityDetailsMutableBuilder[Self <: OAuthIdentityDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHtml_url(value: String): Self = StObject.set(x, "html_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
  }
}

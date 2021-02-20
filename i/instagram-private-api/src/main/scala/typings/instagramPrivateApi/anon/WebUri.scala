package typings.instagramPrivateApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebUri extends StObject {
  
  var webUri: String = js.native
}
object WebUri {
  
  @scala.inline
  def apply(webUri: String): WebUri = {
    val __obj = js.Dynamic.literal(webUri = webUri.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebUri]
  }
  
  @scala.inline
  implicit class WebUriMutableBuilder[Self <: WebUri] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setWebUri(value: String): Self = StObject.set(x, "webUri", value.asInstanceOf[js.Any])
  }
}

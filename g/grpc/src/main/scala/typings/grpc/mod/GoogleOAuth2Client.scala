package typings.grpc.mod

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleOAuth2Client extends StObject {
  
  def getRequestMetadata(optUri: String, metadataCallback: js.Function2[/* err */ Error, /* headers */ js.Any, Unit]): Unit = js.native
}
object GoogleOAuth2Client {
  
  @scala.inline
  def apply(getRequestMetadata: (String, js.Function2[/* err */ Error, /* headers */ js.Any, Unit]) => Unit): GoogleOAuth2Client = {
    val __obj = js.Dynamic.literal(getRequestMetadata = js.Any.fromFunction2(getRequestMetadata))
    __obj.asInstanceOf[GoogleOAuth2Client]
  }
  
  @scala.inline
  implicit class GoogleOAuth2ClientMutableBuilder[Self <: GoogleOAuth2Client] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetRequestMetadata(value: (String, js.Function2[/* err */ Error, /* headers */ js.Any, Unit]) => Unit): Self = StObject.set(x, "getRequestMetadata", js.Any.fromFunction2(value))
  }
}

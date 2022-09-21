package typings.grpc.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleOAuth2Client extends StObject {
  
  def getRequestMetadata(optUri: String, metadataCallback: js.Function2[/* err */ js.Error, /* headers */ Any, Unit]): Unit
}
object GoogleOAuth2Client {
  
  inline def apply(getRequestMetadata: (String, js.Function2[/* err */ js.Error, /* headers */ Any, Unit]) => Unit): GoogleOAuth2Client = {
    val __obj = js.Dynamic.literal(getRequestMetadata = js.Any.fromFunction2(getRequestMetadata))
    __obj.asInstanceOf[GoogleOAuth2Client]
  }
  
  extension [Self <: GoogleOAuth2Client](x: Self) {
    
    inline def setGetRequestMetadata(value: (String, js.Function2[/* err */ js.Error, /* headers */ Any, Unit]) => Unit): Self = StObject.set(x, "getRequestMetadata", js.Any.fromFunction2(value))
  }
}

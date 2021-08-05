package typings.instagramPrivateApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebUri extends StObject {
  
  var webUri: String
}
object WebUri {
  
  inline def apply(webUri: String): WebUri = {
    val __obj = js.Dynamic.literal(webUri = webUri.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebUri]
  }
  
  extension [Self <: WebUri](x: Self) {
    
    inline def setWebUri(value: String): Self = StObject.set(x, "webUri", value.asInstanceOf[js.Any])
  }
}

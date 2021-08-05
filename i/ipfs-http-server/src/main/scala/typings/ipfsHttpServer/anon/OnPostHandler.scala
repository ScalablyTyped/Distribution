package typings.ipfsHttpServer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnPostHandler extends StObject {
  
  var onPostHandler: `1`
}
object OnPostHandler {
  
  inline def apply(onPostHandler: `1`): OnPostHandler = {
    val __obj = js.Dynamic.literal(onPostHandler = onPostHandler.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnPostHandler]
  }
  
  extension [Self <: OnPostHandler](x: Self) {
    
    inline def setOnPostHandler(value: `1`): Self = StObject.set(x, "onPostHandler", value.asInstanceOf[js.Any])
  }
}

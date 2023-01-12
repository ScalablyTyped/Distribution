package typings.ipfsHttpServer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnPostHandler extends StObject {
  
  var onPostHandler: MethodAny
}
object OnPostHandler {
  
  inline def apply(onPostHandler: MethodAny): OnPostHandler = {
    val __obj = js.Dynamic.literal(onPostHandler = onPostHandler.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnPostHandler]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OnPostHandler] (val x: Self) extends AnyVal {
    
    inline def setOnPostHandler(value: MethodAny): Self = StObject.set(x, "onPostHandler", value.asInstanceOf[js.Any])
  }
}

package typings.ipfsHttpServer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnPostHandler extends StObject {
  
  var onPostHandler: `1` = js.native
}
object OnPostHandler {
  
  @scala.inline
  def apply(onPostHandler: `1`): OnPostHandler = {
    val __obj = js.Dynamic.literal(onPostHandler = onPostHandler.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnPostHandler]
  }
  
  @scala.inline
  implicit class OnPostHandlerMutableBuilder[Self <: OnPostHandler] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnPostHandler(value: `1`): Self = StObject.set(x, "onPostHandler", value.asInstanceOf[js.Any])
  }
}

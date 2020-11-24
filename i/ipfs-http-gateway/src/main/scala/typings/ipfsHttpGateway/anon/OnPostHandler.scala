package typings.ipfsHttpGateway.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnPostHandler extends js.Object {
  
  var onPostHandler: Method = js.native
}
object OnPostHandler {
  
  @scala.inline
  def apply(onPostHandler: Method): OnPostHandler = {
    val __obj = js.Dynamic.literal(onPostHandler = onPostHandler.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnPostHandler]
  }
  
  @scala.inline
  implicit class OnPostHandlerOps[Self <: OnPostHandler] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setOnPostHandler(value: Method): Self = this.set("onPostHandler", value.asInstanceOf[js.Any])
  }
}

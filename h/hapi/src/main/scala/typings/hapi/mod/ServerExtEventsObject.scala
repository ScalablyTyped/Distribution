package typings.hapi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServerExtEventsObject extends js.Object {
  
  /**
    * (required) a function or an array of functions to be executed at a specified point during request processing. The required extension function signature is:
    * * server extension points: async function(server) where:
    * * * server - the server object.
    * * * this - the object provided via options.bind or the current active context set with server.bind().
    * * request extension points: a lifecycle method.
    */
  var method: ServerExtPointFunction | js.Array[ServerExtPointFunction] = js.native
  
  var options: js.UndefOr[ServerExtOptions] = js.native
  
  /**
    * (required) the extension point event name. The available extension points include the request extension points as well as the following server extension points:
    * * 'onPreStart' - called before the connection listeners are started.
    * * 'onPostStart' - called after the connection listeners are started.
    * * 'onPreStop' - called before the connection listeners are stopped.
    */
  var `type`: ServerExtType = js.native
}
object ServerExtEventsObject {
  
  @scala.inline
  def apply(method: ServerExtPointFunction | js.Array[ServerExtPointFunction], `type`: ServerExtType): ServerExtEventsObject = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerExtEventsObject]
  }
  
  @scala.inline
  implicit class ServerExtEventsObjectOps[Self <: ServerExtEventsObject] (val x: Self) extends AnyVal {
    
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
    def setMethodVarargs(value: ServerExtPointFunction*): Self = this.set("method", js.Array(value :_*))
    
    @scala.inline
    def setMethodFunction1(value: /* server */ Server => Unit): Self = this.set("method", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMethod(value: ServerExtPointFunction | js.Array[ServerExtPointFunction]): Self = this.set("method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: ServerExtType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptions(value: ServerExtOptions): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
  }
}

package typings
package hapiLib.hapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerExtEventsObject extends js.Object {
  /**
    * (required) a function or an array of functions to be executed at a specified point during request processing. The required extension function signature is:
    * * server extension points: async function(server) where:
    * * * server - the server object.
    * * * this - the object provided via options.bind or the current active context set with server.bind().
    * * request extension points: a lifecycle method.
    */
  var method: ServerExtPointFunction | js.Array[ServerExtPointFunction]
  var options: js.UndefOr[ServerExtOptions] = js.undefined
  /**
    * (required) the extension point event name. The available extension points include the request extension points as well as the following server extension points:
    * * 'onPreStart' - called before the connection listeners are started.
    * * 'onPostStart' - called after the connection listeners are started.
    * * 'onPreStop' - called before the connection listeners are stopped.
    */
  var `type`: ServerExtType
}

object ServerExtEventsObject {
  @scala.inline
  def apply(
    method: ServerExtPointFunction | js.Array[ServerExtPointFunction],
    `type`: ServerExtType,
    options: ServerExtOptions = null
  ): ServerExtEventsObject = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options)
    __obj.asInstanceOf[ServerExtEventsObject]
  }
}


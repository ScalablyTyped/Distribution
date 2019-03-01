package typings
package hapiLib.hapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerExtEventsRequestObject extends js.Object {
  /**
    * (required) a function or an array of functions to be executed at a specified point during request processing. The required extension function signature is:
    * * server extension points: async function(server) where:
    * * * server - the server object.
    * * * this - the object provided via options.bind or the current active context set with server.bind().
    * * request extension points: a lifecycle method.
    */
  var method: hapiLib.hapiMod.LifecycleNs.Method | js.Array[hapiLib.hapiMod.LifecycleNs.Method]
  /**
    * (optional) an object with the following:
    * * before - a string or array of strings of plugin names this method must execute before (on the same event). Otherwise, extension methods are executed in the order added.
    * * after - a string or array of strings of plugin names this method must execute after (on the same event). Otherwise, extension methods are executed in the order added.
    * * bind - a context object passed back to the provided method (via this) when called. Ignored if the method is an arrow function.
    * * sandbox - if set to 'plugin' when adding a request extension points the extension is only added to routes defined by the current plugin. Not allowed when configuring route-level extensions,
    * or when adding server extensions. Defaults to 'server' which applies to any route added to the server the extension is added to.
    */
  var options: js.UndefOr[ServerExtOptions] = js.undefined
  /**
    * (required) the extension point event name. The available extension points include the request extension points as well as the following server extension points:
    * * 'onPreStart' - called before the connection listeners are started.
    * * 'onPostStart' - called after the connection listeners are started.
    * * 'onPreStop' - called before the connection listeners are stopped.
    * * 'onPostStop' - called after the connection listeners are stopped.
    */
  var `type`: ServerRequestExtType
}

object ServerExtEventsRequestObject {
  @scala.inline
  def apply(
    method: hapiLib.hapiMod.LifecycleNs.Method | js.Array[hapiLib.hapiMod.LifecycleNs.Method],
    `type`: ServerRequestExtType,
    options: ServerExtOptions = null
  ): ServerExtEventsRequestObject = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options)
    __obj.asInstanceOf[ServerExtEventsRequestObject]
  }
}


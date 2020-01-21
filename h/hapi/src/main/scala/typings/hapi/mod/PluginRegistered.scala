package typings.hapi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluginRegistered extends js.Object {
  /**
    * the plugin name.
    */
  var name: String
  /**
    * options used to register the plugin.
    */
  var options: js.Object
  /**
    * the plugin version.
    */
  var version: String
}

object PluginRegistered {
  @scala.inline
  def apply(name: String, options: js.Object, version: String): PluginRegistered = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PluginRegistered]
  }
}


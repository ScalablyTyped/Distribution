package typings
package hapiLib.hapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluginRegistered extends js.Object {
  /**
    * the plugin name.
    */
  var name: java.lang.String
  /**
    * options used to register the plugin.
    */
  var options: js.Object
  /**
    * the plugin version.
    */
  var version: java.lang.String
}

object PluginRegistered {
  @scala.inline
  def apply(name: java.lang.String, options: js.Object, version: java.lang.String): PluginRegistered = {
    val __obj = js.Dynamic.literal(name = name, options = options, version = version)
  
    __obj.asInstanceOf[PluginRegistered]
  }
}


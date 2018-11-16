package typings
package hapiLib.hapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ServerRegisterPluginObject[T] extends ServerRegisterOptions {
  /**
       * options passed to the plugin during registration.
       */
  var options: js.UndefOr[T] = js.undefined
  /**
       * a plugin object.
       */
  var plugin: Plugin[T]
}


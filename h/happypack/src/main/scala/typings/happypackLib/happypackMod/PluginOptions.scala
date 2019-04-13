package typings
package happypackLib.happypackMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluginOptions extends js.Object {
  var id: js.UndefOr[java.lang.String] = js.undefined
  var loaders: js.Any
  var threads: js.UndefOr[scala.Double] = js.undefined
}

object PluginOptions {
  @scala.inline
  def apply(loaders: js.Any, id: java.lang.String = null, threads: scala.Int | scala.Double = null): PluginOptions = {
    val __obj = js.Dynamic.literal(loaders = loaders)
    if (id != null) __obj.updateDynamic("id")(id)
    if (threads != null) __obj.updateDynamic("threads")(threads.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginOptions]
  }
}


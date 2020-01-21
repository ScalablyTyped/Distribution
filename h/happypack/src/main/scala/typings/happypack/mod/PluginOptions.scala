package typings.happypack.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluginOptions extends js.Object {
  var id: js.UndefOr[String] = js.undefined
  var loaders: js.Any
  var threads: js.UndefOr[Double] = js.undefined
}

object PluginOptions {
  @scala.inline
  def apply(loaders: js.Any, id: String = null, threads: Int | Double = null): PluginOptions = {
    val __obj = js.Dynamic.literal(loaders = loaders.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (threads != null) __obj.updateDynamic("threads")(threads.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginOptions]
  }
}


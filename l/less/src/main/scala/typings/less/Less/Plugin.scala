package typings.less.Less

import typings.less.LessStatic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Plugin extends js.Object {
  def install(less: LessStatic, pluginManager: PluginManager): Unit
}

object Plugin {
  @scala.inline
  def apply(install: (LessStatic, PluginManager) => Unit): Plugin = {
    val __obj = js.Dynamic.literal(install = js.Any.fromFunction2(install))
  
    __obj.asInstanceOf[Plugin]
  }
}


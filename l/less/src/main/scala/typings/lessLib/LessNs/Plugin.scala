package typings
package lessLib.LessNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Plugin extends js.Object {
  def install(less: lessLib.LessStatic, pluginManager: PluginManager): scala.Unit
}

object Plugin {
  @scala.inline
  def apply(install: js.Function2[lessLib.LessStatic, PluginManager, scala.Unit]): Plugin = {
    val __obj = js.Dynamic.literal(install = install)
  
    __obj.asInstanceOf[Plugin]
  }
}


package typings
package lessLib.LessNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Less.PluginManager")
@js.native
class PluginManager protected () extends js.Object {
  def this(less: lessLib.LessStatic) = this()
  def addPreProcessor(preProcessor: PreProcessor): scala.Unit = js.native
  def addPreProcessor(preProcessor: PreProcessor, priority: scala.Double): scala.Unit = js.native
}


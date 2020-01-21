package typings.less.Less_

import typings.less.LessStatic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Less.PluginManager")
@js.native
class PluginManager protected () extends js.Object {
  def this(less: LessStatic) = this()
  def addPreProcessor(preProcessor: PreProcessor): Unit = js.native
  def addPreProcessor(preProcessor: PreProcessor, priority: Double): Unit = js.native
}


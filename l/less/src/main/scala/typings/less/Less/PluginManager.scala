package typings.less.Less

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PluginManager extends js.Object {
  def addPreProcessor(preProcessor: PreProcessor): Unit = js.native
  def addPreProcessor(preProcessor: PreProcessor, priority: Double): Unit = js.native
}


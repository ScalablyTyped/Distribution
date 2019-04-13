package typings
package hexoDashBunyanLib.hexoDashBunyanMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hexo-bunyan", JSImport.Namespace)
@js.native
class ^ protected ()
  extends bunyanLib.bunyanMod.^ {
  def this(options: bunyanLib.bunyanMod.LoggerOptions) = this()
}

@JSImport("hexo-bunyan", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val DEBUG: scala.Double = js.native
  val ERROR: scala.Double = js.native
  val FATAL: scala.Double = js.native
  val INFO: scala.Double = js.native
  val TRACE: scala.Double = js.native
  val WARN: scala.Double = js.native
  val stdSerializers: bunyanLib.bunyanMod.StdSerializers = js.native
  def createLogger(options: bunyanLib.bunyanMod.LoggerOptions): bunyanLib.bunyanMod.Logger = js.native
  def resolveLevel(value: bunyanLib.bunyanMod.LogLevel): scala.Double = js.native
  def safeCycles(): js.Function2[/* key */ java.lang.String, /* value */ js.Any, _] = js.native
}


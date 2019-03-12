package typings
package logglyLib.logglyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("loggly", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val version: scala.Double = js.native
  def createClient(options: LogglyOptions): LogglyInstance = js.native
}


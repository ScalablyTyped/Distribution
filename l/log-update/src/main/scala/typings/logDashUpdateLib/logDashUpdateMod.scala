package typings
package logDashUpdateLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("log-update", JSImport.Namespace)
@js.native
object logDashUpdateMod extends js.Object {
  val stderr: (js.Function1[/* repeated */ java.lang.String, scala.Unit]) with logDashUpdateLib.Anon_Clear = js.native
  def apply(text: java.lang.String*): scala.Unit = js.native
  def clear(): scala.Unit = js.native
  def create(stream: nodeLib.NodeJSNs.WritableStream): (js.Function1[/* repeated */ java.lang.String, scala.Unit]) with logDashUpdateLib.Anon_Clear = js.native
  def done(): scala.Unit = js.native
}


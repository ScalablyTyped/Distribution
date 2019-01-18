package typings
package isDashProgressiveLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("is-progressive", JSImport.Namespace)
@js.native
object isDashProgressiveMod extends js.Object {
  def buffer(buffer: nodeLib.Buffer): scala.Boolean = js.native
  def file(filepath: java.lang.String): js.Promise[scala.Boolean] = js.native
  def fileSync(filepath: java.lang.String): scala.Boolean = js.native
  def stream(stream: nodeLib.streamMod.Readable): js.Promise[scala.Boolean] = js.native
}


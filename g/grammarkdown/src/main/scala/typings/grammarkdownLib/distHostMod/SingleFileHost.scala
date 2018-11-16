package typings
package grammarkdownLib.distHostMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown/dist/host", "SingleFileHost")
@js.native
class SingleFileHost protected () extends Host {
  def this(content: java.lang.String) = this()
  def this(content: java.lang.String, file: java.lang.String) = this()
  def this(content: java.lang.String, file: java.lang.String, hostFallback: Host) = this()
  val content: java.lang.String = js.native
  val file: java.lang.String = js.native
  var hostFallback: js.Any = js.native
}


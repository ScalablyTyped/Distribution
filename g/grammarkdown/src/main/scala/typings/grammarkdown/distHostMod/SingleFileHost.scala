package typings.grammarkdown.distHostMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown/dist/host", "SingleFileHost")
@js.native
class SingleFileHost protected () extends Host {
  def this(content: String) = this()
  def this(content: String, file: String) = this()
  def this(content: String, file: String, hostFallback: Host) = this()
  val content: String = js.native
  val file: String = js.native
  var hostFallback: js.Any = js.native
}


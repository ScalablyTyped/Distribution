package typings.grammarkdown.hostMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown/dist/host", "SyncSingleFileHost")
@js.native
class SyncSingleFileHost protected () extends SyncHost {
  def this(file: String, content: String) = this()
  def this(file: String, content: String, hostFallback: SyncHost) = this()
  val content: String = js.native
  val file: String = js.native
  var hostFallback: js.Any = js.native
}


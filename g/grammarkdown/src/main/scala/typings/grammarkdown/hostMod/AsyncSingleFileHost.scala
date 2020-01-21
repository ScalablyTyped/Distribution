package typings.grammarkdown.hostMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown/dist/host", "AsyncSingleFileHost")
@js.native
class AsyncSingleFileHost protected () extends AsyncHost {
  def this(file: String, content: String) = this()
  def this(file: String, content: String, hostFallback: AsyncHost) = this()
  val content: String = js.native
  val file: String = js.native
  var hostFallback: js.UndefOr[js.Any] = js.native
}


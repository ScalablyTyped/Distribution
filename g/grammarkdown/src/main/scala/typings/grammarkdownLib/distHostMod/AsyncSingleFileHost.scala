package typings
package grammarkdownLib.distHostMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown/dist/host", "AsyncSingleFileHost")
@js.native
class AsyncSingleFileHost protected () extends AsyncHost {
  def this(file: java.lang.String, content: java.lang.String) = this()
  def this(file: java.lang.String, content: java.lang.String, hostFallback: AsyncHost) = this()
  val content: java.lang.String = js.native
  val file: java.lang.String = js.native
  var hostFallback: js.UndefOr[js.Any] = js.native
}


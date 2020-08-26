package typings.grammarkdown.mod

import typings.grammarkdown.hostMod.AsyncHostOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown", "AsyncHost")
@js.native
class AsyncHost ()
  extends typings.grammarkdown.hostMod.AsyncHost {
  def this(hasReadFileWriteFileBaseOptions: AsyncHostOptions) = this()
}

/* static members */
@JSImport("grammarkdown", "AsyncHost")
@js.native
object AsyncHost extends js.Object {
  def forFile(content: String): typings.grammarkdown.hostMod.AsyncSingleFileHost = js.native
  def forFile(
    content: String,
    file: js.UndefOr[scala.Nothing],
    hostFallback: typings.grammarkdown.hostMod.AsyncHost
  ): typings.grammarkdown.hostMod.AsyncSingleFileHost = js.native
  def forFile(content: String, file: String): typings.grammarkdown.hostMod.AsyncSingleFileHost = js.native
  def forFile(content: String, file: String, hostFallback: typings.grammarkdown.hostMod.AsyncHost): typings.grammarkdown.hostMod.AsyncSingleFileHost = js.native
}


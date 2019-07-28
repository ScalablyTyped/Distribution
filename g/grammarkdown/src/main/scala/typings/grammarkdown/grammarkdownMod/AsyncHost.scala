package typings.grammarkdown.grammarkdownMod

import typings.grammarkdown.distHostMod.AsyncHostOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown", "AsyncHost")
@js.native
class AsyncHost ()
  extends typings.grammarkdown.distHostMod.AsyncHost {
  def this(hasReadFileWriteFileBaseOptions: AsyncHostOptions) = this()
}

/* static members */
@JSImport("grammarkdown", "AsyncHost")
@js.native
object AsyncHost extends js.Object {
  def forFile(content: String): typings.grammarkdown.distHostMod.AsyncSingleFileHost = js.native
  def forFile(content: String, file: String): typings.grammarkdown.distHostMod.AsyncSingleFileHost = js.native
  def forFile(content: String, file: String, hostFallback: typings.grammarkdown.distHostMod.AsyncHost): typings.grammarkdown.distHostMod.AsyncSingleFileHost = js.native
}


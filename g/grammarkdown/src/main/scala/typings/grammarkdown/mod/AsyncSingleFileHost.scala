package typings.grammarkdown.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown", "AsyncSingleFileHost")
@js.native
class AsyncSingleFileHost protected ()
  extends typings.grammarkdown.hostMod.AsyncSingleFileHost {
  def this(file: String, content: String) = this()
  def this(file: String, content: String, hostFallback: typings.grammarkdown.hostMod.AsyncHost) = this()
}


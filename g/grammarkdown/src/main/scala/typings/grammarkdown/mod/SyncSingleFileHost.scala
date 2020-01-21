package typings.grammarkdown.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown", "SyncSingleFileHost")
@js.native
class SyncSingleFileHost protected ()
  extends typings.grammarkdown.hostMod.SyncSingleFileHost {
  def this(file: String, content: String) = this()
  def this(file: String, content: String, hostFallback: typings.grammarkdown.hostMod.SyncHost) = this()
}


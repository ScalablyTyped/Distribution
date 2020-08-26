package typings.grammarkdown.mod

import typings.grammarkdown.hostMod.SyncHostOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown", "SyncHost")
@js.native
class SyncHost ()
  extends typings.grammarkdown.hostMod.SyncHost {
  def this(hasReadFileSyncWriteFileSyncBaseOptions: SyncHostOptions) = this()
}

/* static members */
@JSImport("grammarkdown", "SyncHost")
@js.native
object SyncHost extends js.Object {
  def forFile(content: String): typings.grammarkdown.hostMod.SyncSingleFileHost = js.native
  def forFile(
    content: String,
    file: js.UndefOr[scala.Nothing],
    hostFallback: typings.grammarkdown.hostMod.SyncHost
  ): typings.grammarkdown.hostMod.SyncSingleFileHost = js.native
  def forFile(content: String, file: String): typings.grammarkdown.hostMod.SyncSingleFileHost = js.native
  def forFile(content: String, file: String, hostFallback: typings.grammarkdown.hostMod.SyncHost): typings.grammarkdown.hostMod.SyncSingleFileHost = js.native
}


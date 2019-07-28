package typings.grammarkdown.grammarkdownMod

import typings.grammarkdown.distHostMod.SyncHostOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown", "SyncHost")
@js.native
class SyncHost ()
  extends typings.grammarkdown.distHostMod.SyncHost {
  def this(hasReadFileSyncWriteFileSyncBaseOptions: SyncHostOptions) = this()
}

/* static members */
@JSImport("grammarkdown", "SyncHost")
@js.native
object SyncHost extends js.Object {
  def forFile(content: String): typings.grammarkdown.distHostMod.SyncSingleFileHost = js.native
  def forFile(content: String, file: String): typings.grammarkdown.distHostMod.SyncSingleFileHost = js.native
  def forFile(content: String, file: String, hostFallback: typings.grammarkdown.distHostMod.SyncHost): typings.grammarkdown.distHostMod.SyncSingleFileHost = js.native
}


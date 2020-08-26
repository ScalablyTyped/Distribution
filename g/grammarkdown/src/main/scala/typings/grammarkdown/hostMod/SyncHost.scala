package typings.grammarkdown.hostMod

import typings.esfxCancelable.distMod.Cancelable
import typings.grammarkdown.nodesMod.SourceFile
import typings.prex.mod.CancellationToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown/dist/host", "SyncHost")
@js.native
class SyncHost () extends HostBase {
  def this(hasReadFileSyncWriteFileSyncBaseOptions: SyncHostOptions) = this()
  var readFileSyncCallback: js.Any = js.native
  var writeFileSyncCallback: js.Any = js.native
  def getSourceFileSync(file: String): js.UndefOr[SourceFile] = js.native
  def getSourceFileSync(file: String, cancelable: Cancelable): js.UndefOr[SourceFile] = js.native
  def getSourceFileSync(file: String, cancelable: CancellationToken): js.UndefOr[SourceFile] = js.native
  def readFileSync(file: String): js.UndefOr[String] = js.native
  def readFileSync(file: String, cancelable: Cancelable): js.UndefOr[String] = js.native
  def readFileSync(file: String, cancelable: CancellationToken): js.UndefOr[String] = js.native
  def writeFileSync(file: String, text: String): Unit = js.native
  def writeFileSync(file: String, text: String, cancelable: Cancelable): Unit = js.native
  def writeFileSync(file: String, text: String, cancelable: CancellationToken): Unit = js.native
}

/* static members */
@JSImport("grammarkdown/dist/host", "SyncHost")
@js.native
object SyncHost extends js.Object {
  def forFile(content: String): SyncSingleFileHost = js.native
  def forFile(content: String, file: js.UndefOr[scala.Nothing], hostFallback: SyncHost): SyncSingleFileHost = js.native
  def forFile(content: String, file: String): SyncSingleFileHost = js.native
  def forFile(content: String, file: String, hostFallback: SyncHost): SyncSingleFileHost = js.native
}


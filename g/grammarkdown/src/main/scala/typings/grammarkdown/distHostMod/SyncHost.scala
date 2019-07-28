package typings.grammarkdown.distHostMod

import typings.grammarkdown.distNodesMod.SourceFile
import typings.prex.prexMod.CancellationToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown/dist/host", "SyncHost")
@js.native
class SyncHost () extends HostBase {
  def this(hasReadFileSyncWriteFileSyncBaseOptions: SyncHostOptions) = this()
  var readFileSyncCallback: js.UndefOr[js.Any] = js.native
  var writeFileSyncCallback: js.UndefOr[js.Any] = js.native
  def getSourceFileSync(file: String): js.UndefOr[SourceFile] = js.native
  def getSourceFileSync(file: String, cancellationToken: CancellationToken): js.UndefOr[SourceFile] = js.native
  def readFileSync(file: String): js.UndefOr[String] = js.native
  def readFileSync(file: String, cancellationToken: CancellationToken): js.UndefOr[String] = js.native
  def writeFileSync(file: String, text: String): Unit = js.native
  def writeFileSync(file: String, text: String, cancellationToken: CancellationToken): Unit = js.native
}

/* static members */
@JSImport("grammarkdown/dist/host", "SyncHost")
@js.native
object SyncHost extends js.Object {
  def forFile(content: String): SyncSingleFileHost = js.native
  def forFile(content: String, file: String): SyncSingleFileHost = js.native
  def forFile(content: String, file: String, hostFallback: SyncHost): SyncSingleFileHost = js.native
}


package typings
package grammarkdownLib.distHostMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown/dist/host", "SyncHost")
@js.native
class SyncHost () extends HostBase {
  def this(hasReadFileSyncWriteFileSyncBaseOptions: SyncHostOptions) = this()
  var readFileSyncCallback: js.UndefOr[js.Any] = js.native
  var writeFileSyncCallback: js.UndefOr[js.Any] = js.native
  def getSourceFileSync(file: java.lang.String): js.UndefOr[grammarkdownLib.distNodesMod.SourceFile] = js.native
  def getSourceFileSync(file: java.lang.String, cancellationToken: prexLib.prexMod.CancellationToken): js.UndefOr[grammarkdownLib.distNodesMod.SourceFile] = js.native
  def readFileSync(file: java.lang.String): js.UndefOr[java.lang.String] = js.native
  def readFileSync(file: java.lang.String, cancellationToken: prexLib.prexMod.CancellationToken): js.UndefOr[java.lang.String] = js.native
  def writeFileSync(file: java.lang.String, text: java.lang.String): scala.Unit = js.native
  def writeFileSync(
    file: java.lang.String,
    text: java.lang.String,
    cancellationToken: prexLib.prexMod.CancellationToken
  ): scala.Unit = js.native
}

/* static members */
@JSImport("grammarkdown/dist/host", "SyncHost")
@js.native
object SyncHost extends js.Object {
  def forFile(content: java.lang.String): grammarkdownLib.distHostMod.SyncSingleFileHost = js.native
  def forFile(content: java.lang.String, file: java.lang.String): grammarkdownLib.distHostMod.SyncSingleFileHost = js.native
  def forFile(
    content: java.lang.String,
    file: java.lang.String,
    hostFallback: grammarkdownLib.distHostMod.SyncHost
  ): grammarkdownLib.distHostMod.SyncSingleFileHost = js.native
}


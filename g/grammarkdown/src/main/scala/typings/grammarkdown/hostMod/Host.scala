package typings.grammarkdown.hostMod

import typings.grammarkdown.nodesMod.SourceFile
import typings.prex.mod.CancellationToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown/dist/host", "Host")
@js.native
class Host () extends HostBase {
  def this(hasReadFileReadFileSyncWriteFileWriteFileSyncBaseOptions: HostOptions) = this()
  var getSourceFilePossiblyAsync: js.Any = js.native
  var readFileCallback: js.UndefOr[js.Any] = js.native
  var readFilePossiblyAsync: js.Any = js.native
  var readFileSyncCallback: js.UndefOr[js.Any] = js.native
  var writeFileCallback: js.UndefOr[js.Any] = js.native
  var writeFilePossiblyAsync: js.Any = js.native
  var writeFileSyncCallback: js.UndefOr[js.Any] = js.native
  def getSourceFile(file: String): js.Promise[js.UndefOr[SourceFile]] = js.native
  def getSourceFile(file: String, cancellationToken: CancellationToken): js.Promise[js.UndefOr[SourceFile]] = js.native
  def getSourceFileSync(file: String): js.UndefOr[SourceFile] = js.native
  def getSourceFileSync(file: String, cancellationToken: CancellationToken): js.UndefOr[SourceFile] = js.native
  def readFile(file: String): js.Promise[js.UndefOr[String]] = js.native
  def readFile(file: String, cancellationToken: CancellationToken): js.Promise[js.UndefOr[String]] = js.native
  def readFileSync(file: String): js.UndefOr[String] = js.native
  def readFileSync(file: String, cancellationToken: CancellationToken): js.UndefOr[String] = js.native
  def writeFile(file: String, text: String): js.Promise[Unit] = js.native
  def writeFile(file: String, text: String, cancellationToken: CancellationToken): js.Promise[Unit] = js.native
  def writeFileSync(file: String, text: String): Unit = js.native
  def writeFileSync(file: String, text: String, cancellationToken: CancellationToken): Unit = js.native
}


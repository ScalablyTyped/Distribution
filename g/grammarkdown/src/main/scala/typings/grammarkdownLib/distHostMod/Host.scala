package typings
package grammarkdownLib.distHostMod

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
  def getSourceFile(file: java.lang.String): stdLib.Promise[js.UndefOr[grammarkdownLib.distNodesMod.SourceFile]] = js.native
  def getSourceFile(file: java.lang.String, cancellationToken: prexLib.prexMod.CancellationToken): stdLib.Promise[js.UndefOr[grammarkdownLib.distNodesMod.SourceFile]] = js.native
  def getSourceFileSync(file: java.lang.String): js.UndefOr[grammarkdownLib.distNodesMod.SourceFile] = js.native
  def getSourceFileSync(file: java.lang.String, cancellationToken: prexLib.prexMod.CancellationToken): js.UndefOr[grammarkdownLib.distNodesMod.SourceFile] = js.native
  def readFile(file: java.lang.String): stdLib.Promise[js.UndefOr[java.lang.String]] = js.native
  def readFile(file: java.lang.String, cancellationToken: prexLib.prexMod.CancellationToken): stdLib.Promise[js.UndefOr[java.lang.String]] = js.native
  def readFileSync(file: java.lang.String): js.UndefOr[java.lang.String] = js.native
  def readFileSync(file: java.lang.String, cancellationToken: prexLib.prexMod.CancellationToken): js.UndefOr[java.lang.String] = js.native
  def writeFile(file: java.lang.String, text: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  def writeFile(
    file: java.lang.String,
    text: java.lang.String,
    cancellationToken: prexLib.prexMod.CancellationToken
  ): stdLib.Promise[scala.Unit] = js.native
  def writeFileSync(file: java.lang.String, text: java.lang.String): scala.Unit = js.native
  def writeFileSync(
    file: java.lang.String,
    text: java.lang.String,
    cancellationToken: prexLib.prexMod.CancellationToken
  ): scala.Unit = js.native
}


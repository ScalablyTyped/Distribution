package typings
package grammarkdownLib.distHostMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown/dist/host", "AsyncHost")
@js.native
class AsyncHost () extends HostBase {
  def this(hasReadFileWriteFileBaseOptions: AsyncHostOptions) = this()
  var readFileCallback: js.UndefOr[js.Any] = js.native
  var writeFileCallback: js.UndefOr[js.Any] = js.native
  def getSourceFile(file: java.lang.String): js.Promise[js.UndefOr[grammarkdownLib.distNodesMod.SourceFile]] = js.native
  def getSourceFile(file: java.lang.String, cancellationToken: prexLib.prexMod.CancellationToken): js.Promise[js.UndefOr[grammarkdownLib.distNodesMod.SourceFile]] = js.native
  def readFile(file: java.lang.String): js.Promise[js.UndefOr[java.lang.String]] = js.native
  def readFile(file: java.lang.String, cancellationToken: prexLib.prexMod.CancellationToken): js.Promise[js.UndefOr[java.lang.String]] = js.native
  def writeFile(file: java.lang.String, text: java.lang.String): js.Promise[scala.Unit] = js.native
  def writeFile(
    file: java.lang.String,
    text: java.lang.String,
    cancellationToken: prexLib.prexMod.CancellationToken
  ): js.Promise[scala.Unit] = js.native
}

@JSImport("grammarkdown/dist/host", "AsyncHost")
@js.native
object AsyncHost extends js.Object {
  def forFile(content: java.lang.String): grammarkdownLib.distHostMod.AsyncSingleFileHost = js.native
  def forFile(content: java.lang.String, file: java.lang.String): grammarkdownLib.distHostMod.AsyncSingleFileHost = js.native
  def forFile(
    content: java.lang.String,
    file: java.lang.String,
    hostFallback: grammarkdownLib.distHostMod.AsyncHost
  ): grammarkdownLib.distHostMod.AsyncSingleFileHost = js.native
}


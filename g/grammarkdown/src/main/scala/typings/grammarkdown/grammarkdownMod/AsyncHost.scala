package typings.grammarkdown.grammarkdownMod

import typings.esfxCancelable.distMod.Cancelable
import typings.prex.mod.CancellationToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grammarkdown/dist/grammarkdown", "AsyncHost")
@js.native
class AsyncHost () extends HostBase {
  def this(hasReadFileWriteFileBaseOptions: AsyncHostOptions) = this()
  
  def getSourceFile(file: String): js.Promise[js.UndefOr[SourceFile]] = js.native
  def getSourceFile(file: String, cancelable: Cancelable): js.Promise[js.UndefOr[SourceFile]] = js.native
  def getSourceFile(file: String, cancelable: CancellationToken): js.Promise[js.UndefOr[SourceFile]] = js.native
  
  def readFile(file: String): js.Promise[js.UndefOr[String]] = js.native
  def readFile(file: String, cancelable: Cancelable): js.Promise[js.UndefOr[String]] = js.native
  def readFile(file: String, cancelable: CancellationToken): js.Promise[js.UndefOr[String]] = js.native
  
  var readFileCallback: js.Any = js.native
  
  def writeFile(file: String, text: String): js.Promise[Unit] = js.native
  def writeFile(file: String, text: String, cancelable: Cancelable): js.Promise[Unit] = js.native
  def writeFile(file: String, text: String, cancelable: CancellationToken): js.Promise[Unit] = js.native
  
  var writeFileCallback: js.Any = js.native
}
/* static members */
@JSImport("grammarkdown/dist/grammarkdown", "AsyncHost")
@js.native
object AsyncHost extends js.Object {
  
  def forFile(content: String): AsyncSingleFileHost = js.native
  def forFile(content: String, file: js.UndefOr[scala.Nothing], hostFallback: AsyncHost): AsyncSingleFileHost = js.native
  def forFile(content: String, file: String): AsyncSingleFileHost = js.native
  def forFile(content: String, file: String, hostFallback: AsyncHost): AsyncSingleFileHost = js.native
}

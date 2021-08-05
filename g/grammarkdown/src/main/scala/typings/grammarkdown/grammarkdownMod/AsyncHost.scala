package typings.grammarkdown.grammarkdownMod

import typings.esfxCancelable.distMod.Cancelable
import typings.prex.mod.CancellationToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
  
  /* private */ var readFileCallback: js.Any = js.native
  
  def writeFile(file: String, text: String): js.Promise[Unit] = js.native
  def writeFile(file: String, text: String, cancelable: Cancelable): js.Promise[Unit] = js.native
  def writeFile(file: String, text: String, cancelable: CancellationToken): js.Promise[Unit] = js.native
  
  /* private */ var writeFileCallback: js.Any = js.native
}
/* static members */
object AsyncHost {
  
  @JSImport("grammarkdown/dist/grammarkdown", "AsyncHost")
  @js.native
  val ^ : js.Any = js.native
  
  inline def forFile(content: String): AsyncSingleFileHost = ^.asInstanceOf[js.Dynamic].applyDynamic("forFile")(content.asInstanceOf[js.Any]).asInstanceOf[AsyncSingleFileHost]
  inline def forFile(content: String, file: String): AsyncSingleFileHost = (^.asInstanceOf[js.Dynamic].applyDynamic("forFile")(content.asInstanceOf[js.Any], file.asInstanceOf[js.Any])).asInstanceOf[AsyncSingleFileHost]
  inline def forFile(content: String, file: String, hostFallback: AsyncHost): AsyncSingleFileHost = (^.asInstanceOf[js.Dynamic].applyDynamic("forFile")(content.asInstanceOf[js.Any], file.asInstanceOf[js.Any], hostFallback.asInstanceOf[js.Any])).asInstanceOf[AsyncSingleFileHost]
  inline def forFile(content: String, file: Unit, hostFallback: AsyncHost): AsyncSingleFileHost = (^.asInstanceOf[js.Dynamic].applyDynamic("forFile")(content.asInstanceOf[js.Any], file.asInstanceOf[js.Any], hostFallback.asInstanceOf[js.Any])).asInstanceOf[AsyncSingleFileHost]
}

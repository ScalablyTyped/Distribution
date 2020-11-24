package typings.grammarkdown.nodeMod

import typings.esfxCancelable.distMod.Cancelable
import typings.grammarkdown.hostMod.HostBase
import typings.grammarkdown.nodesMod.SourceFile
import typings.prex.mod.CancellationToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grammarkdown/dist/hosts/node", "Host")
@js.native
class Host () extends HostBase {
  def this(options: HostOptions) = this()
  
  var _readFileCallback: js.Any = js.native
  
  var _readFileSyncCallback: js.Any = js.native
  
  var _writeFileCallback: js.Any = js.native
  
  var _writeFileSyncCallback: js.Any = js.native
  
  def getSourceFile(file: String): js.Promise[js.UndefOr[SourceFile]] = js.native
  def getSourceFile(file: String, cancelable: Cancelable): js.Promise[js.UndefOr[SourceFile]] = js.native
  def getSourceFile(file: String, cancelable: CancellationToken): js.Promise[js.UndefOr[SourceFile]] = js.native
  
  var getSourceFilePossiblyAsync: js.Any = js.native
  
  def getSourceFileSync(file: String): js.UndefOr[SourceFile] = js.native
  def getSourceFileSync(file: String, cancelable: Cancelable): js.UndefOr[SourceFile] = js.native
  def getSourceFileSync(file: String, cancelable: CancellationToken): js.UndefOr[SourceFile] = js.native
  
  def readFile(file: String): js.Promise[js.UndefOr[String]] = js.native
  def readFile(file: String, cancelable: Cancelable): js.Promise[js.UndefOr[String]] = js.native
  def readFile(file: String, cancelable: CancellationToken): js.Promise[js.UndefOr[String]] = js.native
  
  var readFilePossiblyAsync: js.Any = js.native
  
  def readFileSync(file: String): js.UndefOr[String] = js.native
  def readFileSync(file: String, cancelable: Cancelable): js.UndefOr[String] = js.native
  def readFileSync(file: String, cancelable: CancellationToken): js.UndefOr[String] = js.native
  
  def writeFile(file: String, text: String): js.Promise[Unit] = js.native
  def writeFile(file: String, text: String, cancelable: Cancelable): js.Promise[Unit] = js.native
  def writeFile(file: String, text: String, cancelable: CancellationToken): js.Promise[Unit] = js.native
  
  var writeFilePossiblyAsync: js.Any = js.native
  
  def writeFileSync(file: String, text: String): Unit = js.native
  def writeFileSync(file: String, text: String, cancelable: Cancelable): Unit = js.native
  def writeFileSync(file: String, text: String, cancelable: CancellationToken): Unit = js.native
}

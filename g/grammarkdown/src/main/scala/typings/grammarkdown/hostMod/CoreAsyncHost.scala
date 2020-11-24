package typings.grammarkdown.hostMod

import typings.esfxAsyncCanceltoken.mod.CancelToken
import typings.esfxCancelable.distMod.Cancelable
import typings.grammarkdown.nodesMod.SourceFile
import typings.prex.mod.CancellationToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grammarkdown/dist/host", "CoreAsyncHost")
@js.native
class CoreAsyncHost protected () extends HostBase {
  /**
    * @param options The options used to configure the host.
    * @param hostFallback An optional host to use as a fallback for operations not supported by this host.
    */
  def this(options: CoreAsyncHostOptions) = this()
  def this(options: CoreAsyncHostOptions, hostFallback: CoreAsyncHost) = this()
  def this(options: CoreAsyncHostOptions, hostFallback: CoreSyncHost) = this()
  
  var _hostFallback: js.Any = js.native
  
  var _normalizeFile: js.Any = js.native
  
  var _normalizeFileCallback: js.Any = js.native
  
  var _normalizeFileFallback: js.Any = js.native
  
  var _readFile: js.Any = js.native
  
  var _readFileCallback: js.Any = js.native
  
  var _readFileFallback: js.Any = js.native
  
  var _resolveFile: js.Any = js.native
  
  var _resolveFileCallback: js.Any = js.native
  
  var _resolveFileFallback: js.Any = js.native
  
  var _resolveKnownGrammar: js.Any = js.native
  
  var _resolveKnownGrammarCallback: js.Any = js.native
  
  var _resolveKnownGrammarFallback: js.Any = js.native
  
  var _writeFile: js.Any = js.native
  
  var _writeFileCallback: js.Any = js.native
  
  var _writeFileFallback: js.Any = js.native
  
  /**
    * Reads and parses a source file from the host.
    * @param file The path to the file.
    * @param cancelable A cancelable object that can be used to abort the operation.
    * @returns A `Promise` for either the parsed {@link SourceFile} of the file if the file could be read, or `undefined` if it could not be read.
    */
  def getSourceFile(file: String): js.Promise[js.UndefOr[SourceFile]] = js.native
  def getSourceFile(file: String, cancelable: Cancelable): js.Promise[js.UndefOr[SourceFile]] = js.native
  def getSourceFile(file: String, cancelable: CancellationToken): js.Promise[js.UndefOr[SourceFile]] = js.native
  
  /**
    * Reads a file from the host.
    * @param file The path to the file.
    * @param cancelable A cancelable object that can be used to abort the operation.
    * @returns A `Promise` for either a `string` containing the content if the file could be read, or `undefined` if the file could not be read.
    */
  def readFile(file: String): js.Promise[js.UndefOr[String]] = js.native
  def readFile(file: String, cancelable: Cancelable): js.Promise[js.UndefOr[String]] = js.native
  def readFile(file: String, cancelable: CancellationToken): js.Promise[js.UndefOr[String]] = js.native
  
  /**
    * When overridden in a derived class, reads a file from the host.
    * @param file The path to the file.
    * @param cancelToken A cancellation token that can be used by the caller to abort the operation.
    * @returns A `Promise` for either a `string` containing the content if the file could be read, or `undefined` if the file could not be read.
    * @virtual
    */
  /* protected */ def readFileCore(file: String): js.Promise[js.UndefOr[String]] = js.native
  /* protected */ def readFileCore(file: String, cancelToken: CancelToken): js.Promise[js.UndefOr[String]] = js.native
  
  /**
    * Writes a file to the host.
    * @param file The path to the file.
    * @param text The contents of the file.
    * @param cancelable A cancelable object that can be used to abort the operation.
    * @returns A `Promise` that is settled when the operation completes.
    */
  def writeFile(file: String, text: String): js.Promise[Unit] = js.native
  def writeFile(file: String, text: String, cancelable: Cancelable): js.Promise[Unit] = js.native
  def writeFile(file: String, text: String, cancelable: CancellationToken): js.Promise[Unit] = js.native
  
  /**
    * When overridden in a derived class, writes a file to the host.
    * @param file The path to the file.
    * @param text The contents of the file.
    * @param cancelToken A cancellation token that can be used by the caller to abort the operation.
    * @returns A `Promise` that is settled when the operation completes.
    * @virtual
    */
  /* protected */ def writeFileCore(file: String, content: String): js.Promise[Unit] = js.native
  /* protected */ def writeFileCore(file: String, content: String, cancelToken: CancelToken): js.Promise[Unit] = js.native
}
/* static members */
@JSImport("grammarkdown/dist/host", "CoreAsyncHost")
@js.native
object CoreAsyncHost extends js.Object {
  
  def forFile(content: String): StringAsyncHost = js.native
  def forFile(content: String, file: js.UndefOr[scala.Nothing], hostFallback: CoreAsyncHost): StringAsyncHost = js.native
  def forFile(content: String, file: js.UndefOr[scala.Nothing], hostFallback: CoreSyncHost): StringAsyncHost = js.native
  def forFile(content: String, file: String): StringAsyncHost = js.native
  def forFile(content: String, file: String, hostFallback: CoreAsyncHost): StringAsyncHost = js.native
  def forFile(content: String, file: String, hostFallback: CoreSyncHost): StringAsyncHost = js.native
  /**
    * Creates a {@link StringAsyncHost} for the provided content.
    * @param content The content of the file.
    * @param file The file name for the content.
    * @param hostFallback An optional host to use as a fallback for operations not supported by this host.
    */
  def forFile(content: js.Thenable[String]): StringAsyncHost = js.native
  def forFile(content: js.Thenable[String], file: js.UndefOr[scala.Nothing], hostFallback: CoreAsyncHost): StringAsyncHost = js.native
  def forFile(content: js.Thenable[String], file: js.UndefOr[scala.Nothing], hostFallback: CoreSyncHost): StringAsyncHost = js.native
  def forFile(content: js.Thenable[String], file: String): StringAsyncHost = js.native
  def forFile(content: js.Thenable[String], file: String, hostFallback: CoreAsyncHost): StringAsyncHost = js.native
  def forFile(content: js.Thenable[String], file: String, hostFallback: CoreSyncHost): StringAsyncHost = js.native
  
  /**
    * Creates a `CoreAsyncHost`.
    * @param options The options used to configure the host.
    * @param hostFallback An optional host to use as a fallback for operations not supported by this host.
    */
  def from(custom: CoreAsyncHostOptions): CoreAsyncHost = js.native
  def from(custom: CoreAsyncHostOptions, hostFallback: CoreAsyncHost): CoreAsyncHost = js.native
  def from(custom: CoreAsyncHostOptions, hostFallback: CoreSyncHost): CoreAsyncHost = js.native
}

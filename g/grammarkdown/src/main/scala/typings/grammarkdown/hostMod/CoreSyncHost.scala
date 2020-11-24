package typings.grammarkdown.hostMod

import typings.esfxAsyncCanceltoken.mod.CancelToken
import typings.esfxCancelable.distMod.Cancelable
import typings.grammarkdown.nodesMod.SourceFile
import typings.prex.mod.CancellationToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grammarkdown/dist/host", "CoreSyncHost")
@js.native
class CoreSyncHost protected () extends HostBase {
  /**
    * @param options The options used to configure the host.
    * @param hostFallback An optional host to use as a fallback for operations not supported by this host.
    */
  def this(options: CoreSyncHostOptions) = this()
  def this(options: CoreSyncHostOptions, hostFallback: CoreSyncHost) = this()
  
  var _hostFallback: js.Any = js.native
  
  var _normalizeFile: js.Any = js.native
  
  var _normalizeFileCallback: js.Any = js.native
  
  var _normalizeFileFallback: js.Any = js.native
  
  var _readFileSync: js.Any = js.native
  
  var _readFileSyncCallback: js.Any = js.native
  
  var _readFileSyncFallback: js.Any = js.native
  
  var _resolveFile: js.Any = js.native
  
  var _resolveFileCallback: js.Any = js.native
  
  var _resolveFileFallback: js.Any = js.native
  
  var _resolveKnownGrammar: js.Any = js.native
  
  var _resolveKnownGrammarCallback: js.Any = js.native
  
  var _resolveKnownGrammarFallback: js.Any = js.native
  
  var _writeFileSync: js.Any = js.native
  
  var _writeFileSyncCallback: js.Any = js.native
  
  var _writeFileSyncFallback: js.Any = js.native
  
  /**
    * Reads and parses a source file from the host.
    * @param file The path to the file.
    * @param cancelable A cancelable object that can be used to abort the operation.
    * @returns The parsed {@link SourceFile} of the file if the file could be read; otherwise, `undefined`.
    */
  def getSourceFileSync(file: String): js.UndefOr[SourceFile] = js.native
  def getSourceFileSync(file: String, cancelable: Cancelable): js.UndefOr[SourceFile] = js.native
  def getSourceFileSync(file: String, cancelable: CancellationToken): js.UndefOr[SourceFile] = js.native
  
  /**
    * Reads a file from the host.
    * @param file The path to the file.
    * @param cancelable A cancelable object that can be used to abort the operation.
    * @returns A `string` containing the content if the file could be read; otherwise, `undefined`.
    */
  def readFileSync(file: String): js.UndefOr[String] = js.native
  def readFileSync(file: String, cancelable: Cancelable): js.UndefOr[String] = js.native
  def readFileSync(file: String, cancelable: CancellationToken): js.UndefOr[String] = js.native
  
  /**
    * When overridden in a derived class, reads a file from the host.
    * @param file The path to the file.
    * @param cancelToken A cancellation token that can be used by the caller to abort the operation.
    * @returns A `string` containing the content if the file could be read; otherwise, `undefined`.
    * @virtual
    */
  /* protected */ def readFileSyncCore(file: String): js.UndefOr[String] = js.native
  /* protected */ def readFileSyncCore(file: String, cancelToken: CancelToken): js.UndefOr[String] = js.native
  
  /**
    * Writes a file to the host.
    * @param file The path to the file.
    * @param text The contents of the file.
    * @param cancelable A cancelable object that can be used to abort the operation.
    */
  def writeFileSync(file: String, text: String): Unit = js.native
  def writeFileSync(file: String, text: String, cancelable: Cancelable): Unit = js.native
  def writeFileSync(file: String, text: String, cancelable: CancellationToken): Unit = js.native
  
  /**
    * When overridden in a derived class, writes a file to the host.
    * @param file The path to the file.
    * @param text The contents of the file.
    * @param cancelToken A cancellation token that can be used by the caller to abort the operation.
    * @virtual
    */
  /* protected */ def writeFileSyncCore(file: String, content: String): Unit = js.native
  /* protected */ def writeFileSyncCore(file: String, content: String, cancelToken: CancelToken): Unit = js.native
}
/* static members */
@JSImport("grammarkdown/dist/host", "CoreSyncHost")
@js.native
object CoreSyncHost extends js.Object {
  
  /**
    * Creates a {@link StringSyncHost} for the provided content.
    * @param content The content of the file.
    * @param file The file name for the content.
    * @param hostFallback An optional host to use as a fallback for operations not supported by this host.
    */
  def forFile(content: String): StringSyncHost = js.native
  def forFile(content: String, file: js.UndefOr[scala.Nothing], hostFallback: CoreSyncHost): StringSyncHost = js.native
  def forFile(content: String, file: String): StringSyncHost = js.native
  def forFile(content: String, file: String, hostFallback: CoreSyncHost): StringSyncHost = js.native
  
  /**
    * Creates a `CoreSyncHost`.
    * @param options The options used to configure the host.
    * @param hostFallback An optional host to use as a fallback for operations not supported by this host.
    */
  def from(options: CoreSyncHostOptions): CoreSyncHost = js.native
  def from(options: CoreSyncHostOptions, hostFallback: CoreSyncHost): CoreSyncHost = js.native
}

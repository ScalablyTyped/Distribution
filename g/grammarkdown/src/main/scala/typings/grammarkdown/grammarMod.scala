package typings.grammarkdown

import typings.esfxAsyncCanceltoken.mod.CancelToken
import typings.esfxCancelable.distMod.Cancelable
import typings.grammarkdown.binderMod.Binder
import typings.grammarkdown.binderMod.BindingTable
import typings.grammarkdown.checkerMod.Checker
import typings.grammarkdown.checkerMod.Resolver
import typings.grammarkdown.diagnosticsMod.DiagnosticMessages
import typings.grammarkdown.emitterMod.Emitter
import typings.grammarkdown.hostMod.AsyncHost
import typings.grammarkdown.hostMod.Host
import typings.grammarkdown.hostMod.SyncHost
import typings.grammarkdown.nodesMod.SourceFile
import typings.grammarkdown.optionsMod.CompilerOptions
import typings.prex.mod.CancellationToken
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown/dist/grammar", JSImport.Namespace)
@js.native
object grammarMod extends js.Object {
  @js.native
  class Grammar protected () extends js.Object {
    def this(rootNames: Iterable[String]) = this()
    def this(rootNames: Iterable[String], options: CompilerOptions) = this()
    def this(rootNames: Iterable[String], options: CompilerOptions, host: AsyncHost) = this()
    def this(rootNames: Iterable[String], options: CompilerOptions, host: Host) = this()
    def this(rootNames: Iterable[String], options: CompilerOptions, host: SyncHost) = this()
    var beginParsePossiblyAsync: js.Any = js.native
    var bindPossiblyAsync: js.Any = js.native
    var bindings: js.Any = js.native
    var checkPossiblyAsync: js.Any = js.native
    var diagnostics: DiagnosticMessages = js.native
    var emitOnePossiblyAsync: js.Any = js.native
    var emitPossiblyAsync: js.Any = js.native
    var emitStringPossiblyAsync: js.Any = js.native
    var endBind: js.Any = js.native
    var endCheck: js.Any = js.native
    var endEmitPossiblyAsync: js.Any = js.native
    var endParse: js.Any = js.native
    var endProcessFilePossiblyAsync: js.Any = js.native
    var endProcessRootFile: js.Any = js.native
    var getSourceFileNoResolve: js.Any = js.native
    val host: Host | SyncHost | AsyncHost = js.native
    var innerBinder: js.Any = js.native
    var innerChecker: js.Any = js.native
    var innerEmitter: js.Any = js.native
    var innerResolver: js.Any = js.native
    var normalizeFile: js.Any = js.native
    var options: CompilerOptions = js.native
    var parsePossiblyAsync: js.Any = js.native
    var parsePromise: js.Any = js.native
    var parseState: js.Any = js.native
    var processFilePossiblyAsync: js.Any = js.native
    var processImportsPossiblyAsync: js.Any = js.native
    var processRootFilePossiblyAsync: js.Any = js.native
    var resolveFile: js.Any = js.native
    var rootNames: js.Any = js.native
    var setSourceFileNoResolve: js.Any = js.native
    var writeFileFallback: js.Any = js.native
    var writeFileSyncFallback: js.Any = js.native
    def bind(): js.Promise[Unit] = js.native
    def bind(cancelable: Cancelable): js.Promise[Unit] = js.native
    def bind(cancelable: CancellationToken): js.Promise[Unit] = js.native
    def bindSync(): Unit = js.native
    def bindSync(cancelable: Cancelable): Unit = js.native
    def bindSync(cancelable: CancellationToken): Unit = js.native
    /* protected */ def binder: Binder = js.native
    def check(): js.Promise[Unit] = js.native
    def check(sourceFile: SourceFile): js.Promise[Unit] = js.native
    def check(sourceFile: SourceFile, cancelable: Cancelable): js.Promise[Unit] = js.native
    def check(sourceFile: SourceFile, cancelable: CancellationToken): js.Promise[Unit] = js.native
    def checkSync(): Unit = js.native
    def checkSync(sourceFile: SourceFile): Unit = js.native
    def checkSync(sourceFile: SourceFile, cancelable: Cancelable): Unit = js.native
    def checkSync(sourceFile: SourceFile, cancelable: CancellationToken): Unit = js.native
    /* protected */ def checker: Checker = js.native
    /* protected */ def createBinder(options: CompilerOptions): Binder = js.native
    /* protected */ def createChecker(options: CompilerOptions): Checker = js.native
    /* protected */ def createEmitter(options: CompilerOptions): Emitter = js.native
    /* protected */ def createResolver(bindings: BindingTable): Resolver = js.native
    def emit(): js.Promise[Unit] = js.native
    def emit(sourceFile: SourceFile): js.Promise[Unit] = js.native
    def emit(
      sourceFile: SourceFile,
      writeFile: js.Function2[/* file */ String, /* output */ String, Unit | js.Thenable[Unit]]
    ): js.Promise[Unit] = js.native
    def emit(
      sourceFile: SourceFile,
      writeFile: js.Function2[/* file */ String, /* output */ String, Unit | js.Thenable[Unit]],
      cancelable: Cancelable
    ): js.Promise[Unit] = js.native
    def emit(
      sourceFile: SourceFile,
      writeFile: js.Function2[/* file */ String, /* output */ String, Unit | js.Thenable[Unit]],
      cancelable: CancellationToken
    ): js.Promise[Unit] = js.native
    def emit(
      sourceFile: SourceFile,
      writeFile: js.Function3[
          /* file */ String, 
          /* output */ String, 
          /* cancelToken */ js.UndefOr[CancelToken], 
          Unit | js.Thenable[Unit]
        ]
    ): js.Promise[Unit] = js.native
    def emit(
      sourceFile: SourceFile,
      writeFile: js.Function3[
          /* file */ String, 
          /* output */ String, 
          /* cancelToken */ js.UndefOr[CancelToken], 
          Unit | js.Thenable[Unit]
        ],
      cancelable: Cancelable
    ): js.Promise[Unit] = js.native
    def emitString(sourceFile: SourceFile): js.Promise[String] = js.native
    def emitString(sourceFile: SourceFile, cancelable: Cancelable): js.Promise[String] = js.native
    def emitString(sourceFile: SourceFile, cancelable: CancellationToken): js.Promise[String] = js.native
    def emitStringSync(sourceFile: SourceFile): String = js.native
    def emitStringSync(sourceFile: SourceFile, cancelable: Cancelable): String = js.native
    def emitStringSync(sourceFile: SourceFile, cancelable: CancellationToken): String = js.native
    def emitSync(): Unit = js.native
    def emitSync(sourceFile: SourceFile): Unit = js.native
    def emitSync(sourceFile: SourceFile, writeFile: js.Function2[/* file */ String, /* output */ String, Unit]): Unit = js.native
    def emitSync(
      sourceFile: SourceFile,
      writeFile: js.Function2[/* file */ String, /* output */ String, Unit],
      cancelable: Cancelable
    ): Unit = js.native
    def emitSync(
      sourceFile: SourceFile,
      writeFile: js.Function2[/* file */ String, /* output */ String, Unit],
      cancelable: CancellationToken
    ): Unit = js.native
    def emitSync(
      sourceFile: SourceFile,
      writeFile: js.Function3[
          /* file */ String, 
          /* output */ String, 
          /* cancelToken */ js.UndefOr[CancelToken], 
          Unit
        ]
    ): Unit = js.native
    def emitSync(
      sourceFile: SourceFile,
      writeFile: js.Function3[
          /* file */ String, 
          /* output */ String, 
          /* cancelToken */ js.UndefOr[CancelToken], 
          Unit
        ],
      cancelable: Cancelable
    ): Unit = js.native
    /* protected */ def emitter: Emitter = js.native
    def getSourceFile(file: String): js.UndefOr[SourceFile] = js.native
    def isBound: Boolean = js.native
    def isParsed: Boolean = js.native
    def parse(): js.Promise[Unit] = js.native
    def parse(cancelable: Cancelable): js.Promise[Unit] = js.native
    def parse(cancelable: CancellationToken): js.Promise[Unit] = js.native
    def parseSync(): Unit = js.native
    def parseSync(cancelable: Cancelable): Unit = js.native
    def parseSync(cancelable: CancellationToken): Unit = js.native
    /* protected */ def readFile(file: String): js.UndefOr[js.Promise[js.UndefOr[String]] | String] = js.native
    /* protected */ def readFile(file: String, cancelToken: CancelToken): js.UndefOr[js.Promise[js.UndefOr[String]] | String] = js.native
    /* protected */ def readFileSync(file: String): js.UndefOr[js.Promise[js.UndefOr[String]] | String] = js.native
    def resolver: Resolver = js.native
    def rootFiles: js.Array[SourceFile] = js.native
    def sourceFiles: js.Array[SourceFile] = js.native
    /* protected */ def writeFile(file: String, content: String): Unit | js.Promise[Unit] = js.native
    /* protected */ def writeFile(file: String, content: String, cancelToken: CancelToken): Unit | js.Promise[Unit] = js.native
    /* protected */ def writeFileSync(file: String, content: String): Unit = js.native
  }
  
  /* static members */
  @js.native
  object Grammar extends js.Object {
    /** @deprecated since 2.1.0 - `prex.CancellationToken` may no longer be accepted in future releases. Please use a token that implements `@esfx/cancelable.Cancelable` */
    def convert(content: String): String = js.native
    def convert(content: String, options: CompilerOptions): String = js.native
    def convert(content: String, options: CompilerOptions, hostFallback: AsyncHost): String = js.native
    def convert(content: String, options: CompilerOptions, hostFallback: AsyncHost, cancelable: Cancelable): String = js.native
    def convert(content: String, options: CompilerOptions, hostFallback: AsyncHost, cancelable: CancellationToken): String = js.native
    def convert(content: String, options: CompilerOptions, hostFallback: Host): String = js.native
    def convert(content: String, options: CompilerOptions, hostFallback: Host, cancelable: Cancelable): String = js.native
    def convert(content: String, options: CompilerOptions, hostFallback: Host, cancelable: CancellationToken): String = js.native
    def convert(content: String, options: CompilerOptions, hostFallback: SyncHost): String = js.native
    def convert(content: String, options: CompilerOptions, hostFallback: SyncHost, cancelable: Cancelable): String = js.native
    def convert(content: String, options: CompilerOptions, hostFallback: SyncHost, cancelable: CancellationToken): String = js.native
  }
  
}


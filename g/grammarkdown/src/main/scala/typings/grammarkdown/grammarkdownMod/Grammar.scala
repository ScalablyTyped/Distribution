package typings.grammarkdown.grammarkdownMod

import typings.esfxAsyncCanceltoken.mod.CancelToken
import typings.esfxCancelable.distMod.Cancelable
import typings.prex.mod.CancellationToken
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grammarkdown/dist/grammarkdown", "Grammar")
@js.native
class Grammar protected () extends StObject {
  def this(rootNames: Iterable[String]) = this()
  def this(rootNames: Iterable[String], options: CompilerOptions) = this()
  def this(rootNames: Iterable[String], options: Unit, host: AsyncHost) = this()
  def this(rootNames: Iterable[String], options: Unit, host: Host) = this()
  def this(rootNames: Iterable[String], options: Unit, host: SyncHost) = this()
  def this(rootNames: Iterable[String], options: CompilerOptions, host: AsyncHost) = this()
  def this(rootNames: Iterable[String], options: CompilerOptions, host: Host) = this()
  def this(rootNames: Iterable[String], options: CompilerOptions, host: SyncHost) = this()
  
  var beginParsePossiblyAsync: js.Any = js.native
  
  def bind(): js.Promise[Unit] = js.native
  def bind(cancelable: Cancelable): js.Promise[Unit] = js.native
  def bind(cancelable: CancellationToken): js.Promise[Unit] = js.native
  
  var bindPossiblyAsync: js.Any = js.native
  
  def bindSync(): Unit = js.native
  def bindSync(cancelable: Cancelable): Unit = js.native
  def bindSync(cancelable: CancellationToken): Unit = js.native
  
  /* protected */ def binder: Binder = js.native
  
  var bindings: js.Any = js.native
  
  def check(): js.Promise[Unit] = js.native
  def check(sourceFile: Unit, cancelable: Cancelable): js.Promise[Unit] = js.native
  def check(sourceFile: Unit, cancelable: CancellationToken): js.Promise[Unit] = js.native
  def check(sourceFile: SourceFile): js.Promise[Unit] = js.native
  def check(sourceFile: SourceFile, cancelable: Cancelable): js.Promise[Unit] = js.native
  def check(sourceFile: SourceFile, cancelable: CancellationToken): js.Promise[Unit] = js.native
  
  var checkPossiblyAsync: js.Any = js.native
  
  def checkSync(): Unit = js.native
  def checkSync(sourceFile: Unit, cancelable: Cancelable): Unit = js.native
  def checkSync(sourceFile: Unit, cancelable: CancellationToken): Unit = js.native
  def checkSync(sourceFile: SourceFile): Unit = js.native
  def checkSync(sourceFile: SourceFile, cancelable: Cancelable): Unit = js.native
  def checkSync(sourceFile: SourceFile, cancelable: CancellationToken): Unit = js.native
  
  /* protected */ def checker: Checker = js.native
  
  /* protected */ def createBinder(options: CompilerOptions): Binder = js.native
  
  /* protected */ def createChecker(options: CompilerOptions): Checker = js.native
  
  /* protected */ def createEmitter(options: CompilerOptions): Emitter = js.native
  
  /* protected */ def createResolver(bindings: BindingTable): Resolver = js.native
  
  var diagnostics: DiagnosticMessages = js.native
  
  def emit(): js.Promise[Unit] = js.native
  def emit(
    sourceFile: Unit,
    writeFile: js.Function2[/* file */ String, /* output */ String, Unit | js.Thenable[Unit]]
  ): js.Promise[Unit] = js.native
  def emit(
    sourceFile: Unit,
    writeFile: js.Function2[/* file */ String, /* output */ String, Unit | js.Thenable[Unit]],
    cancelable: Cancelable
  ): js.Promise[Unit] = js.native
  def emit(
    sourceFile: Unit,
    writeFile: js.Function2[/* file */ String, /* output */ String, Unit | js.Thenable[Unit]],
    cancelable: CancellationToken
  ): js.Promise[Unit] = js.native
  def emit(
    sourceFile: Unit,
    writeFile: js.Function3[
      /* file */ String, 
      /* output */ String, 
      /* cancelToken */ js.UndefOr[CancelToken], 
      Unit | js.Thenable[Unit]
    ]
  ): js.Promise[Unit] = js.native
  def emit(
    sourceFile: Unit,
    writeFile: js.Function3[
      /* file */ String, 
      /* output */ String, 
      /* cancelToken */ js.UndefOr[CancelToken], 
      Unit | js.Thenable[Unit]
    ],
    cancelable: Cancelable
  ): js.Promise[Unit] = js.native
  def emit(sourceFile: Unit, writeFile: Unit, cancelable: Cancelable): js.Promise[Unit] = js.native
  def emit(sourceFile: Unit, writeFile: Unit, cancelable: CancellationToken): js.Promise[Unit] = js.native
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
  def emit(sourceFile: SourceFile, writeFile: Unit, cancelable: Cancelable): js.Promise[Unit] = js.native
  def emit(sourceFile: SourceFile, writeFile: Unit, cancelable: CancellationToken): js.Promise[Unit] = js.native
  
  var emitOnePossiblyAsync: js.Any = js.native
  
  var emitPossiblyAsync: js.Any = js.native
  
  def emitString(sourceFile: SourceFile): js.Promise[String] = js.native
  def emitString(sourceFile: SourceFile, cancelable: Cancelable): js.Promise[String] = js.native
  def emitString(sourceFile: SourceFile, cancelable: CancellationToken): js.Promise[String] = js.native
  
  var emitStringPossiblyAsync: js.Any = js.native
  
  def emitStringSync(sourceFile: SourceFile): String = js.native
  def emitStringSync(sourceFile: SourceFile, cancelable: Cancelable): String = js.native
  def emitStringSync(sourceFile: SourceFile, cancelable: CancellationToken): String = js.native
  
  def emitSync(): Unit = js.native
  def emitSync(sourceFile: Unit, writeFile: js.Function2[/* file */ String, /* output */ String, Unit]): Unit = js.native
  def emitSync(
    sourceFile: Unit,
    writeFile: js.Function2[/* file */ String, /* output */ String, Unit],
    cancelable: Cancelable
  ): Unit = js.native
  def emitSync(
    sourceFile: Unit,
    writeFile: js.Function2[/* file */ String, /* output */ String, Unit],
    cancelable: CancellationToken
  ): Unit = js.native
  def emitSync(
    sourceFile: Unit,
    writeFile: js.Function3[
      /* file */ String, 
      /* output */ String, 
      /* cancelToken */ js.UndefOr[CancelToken], 
      Unit
    ]
  ): Unit = js.native
  def emitSync(
    sourceFile: Unit,
    writeFile: js.Function3[
      /* file */ String, 
      /* output */ String, 
      /* cancelToken */ js.UndefOr[CancelToken], 
      Unit
    ],
    cancelable: Cancelable
  ): Unit = js.native
  def emitSync(sourceFile: Unit, writeFile: Unit, cancelable: Cancelable): Unit = js.native
  def emitSync(sourceFile: Unit, writeFile: Unit, cancelable: CancellationToken): Unit = js.native
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
  def emitSync(sourceFile: SourceFile, writeFile: Unit, cancelable: Cancelable): Unit = js.native
  def emitSync(sourceFile: SourceFile, writeFile: Unit, cancelable: CancellationToken): Unit = js.native
  
  /* protected */ def emitter: Emitter = js.native
  
  var endBind: js.Any = js.native
  
  var endCheck: js.Any = js.native
  
  var endEmitPossiblyAsync: js.Any = js.native
  
  var endParse: js.Any = js.native
  
  var endProcessFilePossiblyAsync: js.Any = js.native
  
  var endProcessRootFile: js.Any = js.native
  
  def getSourceFile(file: String): js.UndefOr[SourceFile] = js.native
  
  var getSourceFileNoResolve: js.Any = js.native
  
  val host: Host | SyncHost | AsyncHost = js.native
  
  var innerBinder: js.Any = js.native
  
  var innerChecker: js.Any = js.native
  
  var innerEmitter: js.Any = js.native
  
  var innerResolver: js.Any = js.native
  
  def isBound: Boolean = js.native
  
  def isParsed: Boolean = js.native
  
  var normalizeFile: js.Any = js.native
  
  var options: CompilerOptions = js.native
  
  def parse(): js.Promise[Unit] = js.native
  def parse(cancelable: Cancelable): js.Promise[Unit] = js.native
  def parse(cancelable: CancellationToken): js.Promise[Unit] = js.native
  
  var parsePossiblyAsync: js.Any = js.native
  
  var parsePromise: js.Any = js.native
  
  var parseState: js.Any = js.native
  
  def parseSync(): Unit = js.native
  def parseSync(cancelable: Cancelable): Unit = js.native
  def parseSync(cancelable: CancellationToken): Unit = js.native
  
  var processFilePossiblyAsync: js.Any = js.native
  
  var processImportsPossiblyAsync: js.Any = js.native
  
  var processRootFilePossiblyAsync: js.Any = js.native
  
  /* protected */ def readFile(file: String): js.UndefOr[js.Promise[js.UndefOr[String]] | String] = js.native
  /* protected */ def readFile(file: String, cancelToken: CancelToken): js.UndefOr[js.Promise[js.UndefOr[String]] | String] = js.native
  
  /* protected */ def readFileSync(file: String): js.UndefOr[js.Promise[js.UndefOr[String]] | String] = js.native
  
  var resolveFile: js.Any = js.native
  
  def resolver: Resolver = js.native
  
  def rootFiles: js.Array[SourceFile] = js.native
  
  var rootNames: js.Any = js.native
  
  var setSourceFileNoResolve: js.Any = js.native
  
  def sourceFiles: js.Array[SourceFile] = js.native
  
  /* protected */ def writeFile(file: String, content: String): Unit | js.Promise[Unit] = js.native
  /* protected */ def writeFile(file: String, content: String, cancelToken: CancelToken): Unit | js.Promise[Unit] = js.native
  
  var writeFileFallback: js.Any = js.native
  
  /* protected */ def writeFileSync(file: String, content: String): Unit = js.native
  
  var writeFileSyncFallback: js.Any = js.native
}
/* static members */
object Grammar {
  
  @JSImport("grammarkdown/dist/grammarkdown", "Grammar")
  @js.native
  val ^ : js.Any = js.native
  
  /** @deprecated since 2.1.0 - `prex.CancellationToken` may no longer be accepted in future releases. Please use a token that implements `@esfx/cancelable.Cancelable` */
  @scala.inline
  def convert(content: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("convert")(content.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def convert(content: String, options: Unit, hostFallback: Unit, cancelable: Cancelable): String = (^.asInstanceOf[js.Dynamic].applyDynamic("convert")(content.asInstanceOf[js.Any], options.asInstanceOf[js.Any], hostFallback.asInstanceOf[js.Any], cancelable.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def convert(content: String, options: Unit, hostFallback: Unit, cancelable: CancellationToken): String = (^.asInstanceOf[js.Dynamic].applyDynamic("convert")(content.asInstanceOf[js.Any], options.asInstanceOf[js.Any], hostFallback.asInstanceOf[js.Any], cancelable.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def convert(content: String, options: Unit, hostFallback: AsyncHost): String = (^.asInstanceOf[js.Dynamic].applyDynamic("convert")(content.asInstanceOf[js.Any], options.asInstanceOf[js.Any], hostFallback.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def convert(content: String, options: Unit, hostFallback: AsyncHost, cancelable: Cancelable): String = (^.asInstanceOf[js.Dynamic].applyDynamic("convert")(content.asInstanceOf[js.Any], options.asInstanceOf[js.Any], hostFallback.asInstanceOf[js.Any], cancelable.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def convert(content: String, options: Unit, hostFallback: AsyncHost, cancelable: CancellationToken): String = (^.asInstanceOf[js.Dynamic].applyDynamic("convert")(content.asInstanceOf[js.Any], options.asInstanceOf[js.Any], hostFallback.asInstanceOf[js.Any], cancelable.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def convert(content: String, options: Unit, hostFallback: Host): String = (^.asInstanceOf[js.Dynamic].applyDynamic("convert")(content.asInstanceOf[js.Any], options.asInstanceOf[js.Any], hostFallback.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def convert(content: String, options: Unit, hostFallback: Host, cancelable: Cancelable): String = (^.asInstanceOf[js.Dynamic].applyDynamic("convert")(content.asInstanceOf[js.Any], options.asInstanceOf[js.Any], hostFallback.asInstanceOf[js.Any], cancelable.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def convert(content: String, options: Unit, hostFallback: Host, cancelable: CancellationToken): String = (^.asInstanceOf[js.Dynamic].applyDynamic("convert")(content.asInstanceOf[js.Any], options.asInstanceOf[js.Any], hostFallback.asInstanceOf[js.Any], cancelable.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def convert(content: String, options: Unit, hostFallback: SyncHost): String = (^.asInstanceOf[js.Dynamic].applyDynamic("convert")(content.asInstanceOf[js.Any], options.asInstanceOf[js.Any], hostFallback.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def convert(content: String, options: Unit, hostFallback: SyncHost, cancelable: Cancelable): String = (^.asInstanceOf[js.Dynamic].applyDynamic("convert")(content.asInstanceOf[js.Any], options.asInstanceOf[js.Any], hostFallback.asInstanceOf[js.Any], cancelable.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def convert(content: String, options: Unit, hostFallback: SyncHost, cancelable: CancellationToken): String = (^.asInstanceOf[js.Dynamic].applyDynamic("convert")(content.asInstanceOf[js.Any], options.asInstanceOf[js.Any], hostFallback.asInstanceOf[js.Any], cancelable.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def convert(content: String, options: CompilerOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("convert")(content.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def convert(content: String, options: CompilerOptions, hostFallback: Unit, cancelable: Cancelable): String = (^.asInstanceOf[js.Dynamic].applyDynamic("convert")(content.asInstanceOf[js.Any], options.asInstanceOf[js.Any], hostFallback.asInstanceOf[js.Any], cancelable.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def convert(content: String, options: CompilerOptions, hostFallback: Unit, cancelable: CancellationToken): String = (^.asInstanceOf[js.Dynamic].applyDynamic("convert")(content.asInstanceOf[js.Any], options.asInstanceOf[js.Any], hostFallback.asInstanceOf[js.Any], cancelable.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def convert(content: String, options: CompilerOptions, hostFallback: AsyncHost): String = (^.asInstanceOf[js.Dynamic].applyDynamic("convert")(content.asInstanceOf[js.Any], options.asInstanceOf[js.Any], hostFallback.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def convert(content: String, options: CompilerOptions, hostFallback: AsyncHost, cancelable: Cancelable): String = (^.asInstanceOf[js.Dynamic].applyDynamic("convert")(content.asInstanceOf[js.Any], options.asInstanceOf[js.Any], hostFallback.asInstanceOf[js.Any], cancelable.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def convert(content: String, options: CompilerOptions, hostFallback: AsyncHost, cancelable: CancellationToken): String = (^.asInstanceOf[js.Dynamic].applyDynamic("convert")(content.asInstanceOf[js.Any], options.asInstanceOf[js.Any], hostFallback.asInstanceOf[js.Any], cancelable.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def convert(content: String, options: CompilerOptions, hostFallback: Host): String = (^.asInstanceOf[js.Dynamic].applyDynamic("convert")(content.asInstanceOf[js.Any], options.asInstanceOf[js.Any], hostFallback.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def convert(content: String, options: CompilerOptions, hostFallback: Host, cancelable: Cancelable): String = (^.asInstanceOf[js.Dynamic].applyDynamic("convert")(content.asInstanceOf[js.Any], options.asInstanceOf[js.Any], hostFallback.asInstanceOf[js.Any], cancelable.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def convert(content: String, options: CompilerOptions, hostFallback: Host, cancelable: CancellationToken): String = (^.asInstanceOf[js.Dynamic].applyDynamic("convert")(content.asInstanceOf[js.Any], options.asInstanceOf[js.Any], hostFallback.asInstanceOf[js.Any], cancelable.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def convert(content: String, options: CompilerOptions, hostFallback: SyncHost): String = (^.asInstanceOf[js.Dynamic].applyDynamic("convert")(content.asInstanceOf[js.Any], options.asInstanceOf[js.Any], hostFallback.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def convert(content: String, options: CompilerOptions, hostFallback: SyncHost, cancelable: Cancelable): String = (^.asInstanceOf[js.Dynamic].applyDynamic("convert")(content.asInstanceOf[js.Any], options.asInstanceOf[js.Any], hostFallback.asInstanceOf[js.Any], cancelable.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def convert(content: String, options: CompilerOptions, hostFallback: SyncHost, cancelable: CancellationToken): String = (^.asInstanceOf[js.Dynamic].applyDynamic("convert")(content.asInstanceOf[js.Any], options.asInstanceOf[js.Any], hostFallback.asInstanceOf[js.Any], cancelable.asInstanceOf[js.Any])).asInstanceOf[String]
}

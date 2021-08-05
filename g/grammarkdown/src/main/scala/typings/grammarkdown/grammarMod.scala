package typings.grammarkdown

import typings.esfxAsyncCanceltoken.mod.CancelToken
import typings.esfxCancelable.distMod.Cancelable
import typings.grammarkdown.anon.ReadonlyCompilerOptions
import typings.grammarkdown.binderMod.Binder
import typings.grammarkdown.binderMod.BindingTable
import typings.grammarkdown.checkerMod.Checker
import typings.grammarkdown.checkerMod.Resolver
import typings.grammarkdown.diagnosticsMod.DiagnosticMessages
import typings.grammarkdown.emitterMod.Emitter
import typings.grammarkdown.hostMod.CoreAsyncHost
import typings.grammarkdown.hostMod.CoreSyncHost
import typings.grammarkdown.nodeMod.Host
import typings.grammarkdown.nodesMod.SourceFile
import typings.grammarkdown.optionsMod.CompilerOptions
import typings.prex.mod.CancellationToken
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object grammarMod {
  
  @JSImport("grammarkdown/dist/grammar", "Grammar")
  @js.native
  class Grammar protected () extends StObject {
    /**
      * @param rootNames The names of the root files used by the grammar.
      * @param options The {@link CompilerOptions} used by the grammar.
      * @param host The [Host](xref:hosts) the grammar uses to interact with the file system.
      */
    def this(rootNames: Iterable[String]) = this()
    def this(rootNames: Iterable[String], options: CompilerOptions) = this()
    def this(rootNames: Iterable[String], options: Unit, host: CoreAsyncHost) = this()
    def this(rootNames: Iterable[String], options: Unit, host: CoreSyncHost) = this()
    def this(rootNames: Iterable[String], options: Unit, host: Host) = this()
    def this(rootNames: Iterable[String], options: CompilerOptions, host: CoreAsyncHost) = this()
    def this(rootNames: Iterable[String], options: CompilerOptions, host: CoreSyncHost) = this()
    def this(rootNames: Iterable[String], options: CompilerOptions, host: Host) = this()
    
    /* private */ var _beginParsePossiblyAsync: js.Any = js.native
    
    /* private */ var _bindPossiblyAsync: js.Any = js.native
    
    /* private */ var _bindings: js.Any = js.native
    
    /* private */ var _checkPossiblyAsync: js.Any = js.native
    
    /* private */ var _emitOnePossiblyAsync: js.Any = js.native
    
    /* private */ var _emitPossiblyAsync: js.Any = js.native
    
    /* private */ var _emitStringPossiblyAsync: js.Any = js.native
    
    /* private */ var _endBind: js.Any = js.native
    
    /* private */ var _endCheck: js.Any = js.native
    
    /* private */ var _endEmitPossiblyAsync: js.Any = js.native
    
    /* private */ var _endParse: js.Any = js.native
    
    /* private */ var _endProcessFilePossiblyAsync: js.Any = js.native
    
    /* private */ var _endProcessRootFile: js.Any = js.native
    
    /* private */ var _getSourceFileNoResolve: js.Any = js.native
    
    /* private */ var _innerBinder: js.Any = js.native
    
    /* private */ var _innerChecker: js.Any = js.native
    
    /* private */ var _innerEmitter: js.Any = js.native
    
    /* private */ var _innerResolver: js.Any = js.native
    
    /* private */ var _lineOffsetMap: js.Any = js.native
    
    /* private */ var _normalizeFile: js.Any = js.native
    
    /* private */ var _parsePossiblyAsync: js.Any = js.native
    
    /* private */ var _parsePromise: js.Any = js.native
    
    /* private */ var _parseState: js.Any = js.native
    
    /* private */ var _processFilePossiblyAsync: js.Any = js.native
    
    /* private */ var _processImportsPossiblyAsync: js.Any = js.native
    
    /* private */ var _processRootFilePossiblyAsync: js.Any = js.native
    
    /* private */ var _resolveFile: js.Any = js.native
    
    /* private */ var _rootNames: js.Any = js.native
    
    /* private */ var _setSourceFileNoResolve: js.Any = js.native
    
    /* private */ var _writeFileFallback: js.Any = js.native
    
    /* private */ var _writeFileSyncFallback: js.Any = js.native
    
    /**
      * Asynchronously binds each file in the grammar. Will also parse the grammar if it has not yet been parsed.
      * @param cancelable A cancelable object that can be used to abort the operation.
      * @returns A `Promise` that is settled when the operation has completed.
      */
    def bind(): js.Promise[Unit] = js.native
    def bind(cancelable: Cancelable): js.Promise[Unit] = js.native
    def bind(cancelable: CancellationToken): js.Promise[Unit] = js.native
    
    /**
      * Synchronously binds each file in the grammar. Will also parse the grammar if it has not yet been parsed.
      * @param cancelable A cancelable object that can be used to abort the operation.
      */
    def bindSync(): Unit = js.native
    def bindSync(cancelable: Cancelable): Unit = js.native
    def bindSync(cancelable: CancellationToken): Unit = js.native
    
    /**
      * Gets the {@link Binder} used to bind the grammar.
      */
    /* protected */ def binder: Binder = js.native
    
    /**
      * Asynchronously checks each file in the grammar. Will also parse and bind the grammar if it has not yet been parsed or bound.
      * @param cancelable A cancelable object that can be used to abort the operation.
      * @returns A `Promise` that is settled when the operation has completed.
      */
    def check(): js.Promise[Unit] = js.native
    def check(sourceFile: Unit, cancelable: Cancelable): js.Promise[Unit] = js.native
    def check(sourceFile: Unit, cancelable: CancellationToken): js.Promise[Unit] = js.native
    def check(sourceFile: SourceFile): js.Promise[Unit] = js.native
    def check(sourceFile: SourceFile, cancelable: Cancelable): js.Promise[Unit] = js.native
    def check(sourceFile: SourceFile, cancelable: CancellationToken): js.Promise[Unit] = js.native
    
    /**
      * Synchronously checks each file in the grammar. Will also parse and bind the grammar if it has not yet been parsed or bound.
      * @param cancelable A cancelable object that can be used to abort the operation.
      */
    def checkSync(): Unit = js.native
    def checkSync(sourceFile: Unit, cancelable: Cancelable): Unit = js.native
    def checkSync(sourceFile: Unit, cancelable: CancellationToken): Unit = js.native
    def checkSync(sourceFile: SourceFile): Unit = js.native
    def checkSync(sourceFile: SourceFile, cancelable: Cancelable): Unit = js.native
    def checkSync(sourceFile: SourceFile, cancelable: CancellationToken): Unit = js.native
    
    /**
      * Gets the {@link Checker} used to check the grammar.
      */
    /* protected */ def checker: Checker = js.native
    
    /**
      * When overridden in a derived class, creates a {@link Binder} to be used by this grammar.
      * @param options The options to pass on to the {@link Binder}.
      * @virtual
      */
    /* protected */ def createBinder(options: ReadonlyCompilerOptions): Binder = js.native
    
    /**
      * When overridden in a derived class, creates a {@link Checker} to be used by this grammar.
      * @param options The options to pass on to the {@link Checker}.
      * @virtual
      */
    /* protected */ def createChecker(options: ReadonlyCompilerOptions): Checker = js.native
    
    /**
      * When overridden in a derived class, creates an {@link Emitter} to be used by this grammar.
      * @param options The options to pass on to the {@link Emitter}.
      * @virtual
      */
    /* protected */ def createEmitter(options: CompilerOptions): Emitter = js.native
    
    /**
      * When overridden in a derived class, creates a {@link Resolver} to be used by this grammar.
      * @param bindings A {@link BindingTable} used by the resolver to resolve references to nodes.
      * @virtual
      */
    /* protected */ def createResolver(bindings: BindingTable): Resolver = js.native
    
    /**
      * The diagnostic messages produced by the grammar.
      */
    val diagnostics: DiagnosticMessages = js.native
    
    /**
      * Asynchronously emits each file in the grammar. Will also parse, bind, and check the grammar if it has not yet been parsed, bound, or checked.
      * @param sourceFile The {@link SourceFile} to emit. If not provided, this method will generate output for all root files.
      * @param writeFile An optional callback used to write the output. If not provided, this method will emit output via this grammar's {@link Grammar.host|host}.
      * @param cancelable A cancelable object that can be used to abort the operation.
      * @returns A `Promise` that is settled when the operation has completed.
      */
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
    
    /**
      * Asynchronously emits the provided file in the grammar as a string. Will also parse, bind, and check the grammar if it has not yet been parsed, bound, or checked.
      * @param sourceFile The {@link SourceFile} to emit.
      * @param cancelable A cancelable object that can be used to abort the operation.
      * @returns A `Promise` for the emit output that is settled when the operation has completed.
      */
    def emitString(sourceFile: SourceFile): js.Promise[String] = js.native
    def emitString(sourceFile: SourceFile, cancelable: Cancelable): js.Promise[String] = js.native
    def emitString(sourceFile: SourceFile, cancelable: CancellationToken): js.Promise[String] = js.native
    
    /**
      * Synchronously emits the provided file in the grammar as a string. Will also parse, bind, and check the grammar if it has not yet been parsed, bound, or checked.
      * @param sourceFile The {@link SourceFile} to emit.
      * @param cancelable A cancelable object that can be used to abort the operation.
      * @returns The emit output.
      */
    def emitStringSync(sourceFile: SourceFile): String = js.native
    def emitStringSync(sourceFile: SourceFile, cancelable: Cancelable): String = js.native
    def emitStringSync(sourceFile: SourceFile, cancelable: CancellationToken): String = js.native
    
    /**
      * Synchronously emits each file in the grammar. Will also parse, bind, and check the grammar if it has not yet been parsed, bound, or checked.
      * @param sourceFile The {@link SourceFile} to emit. If not provided, this method will generate output for all root files.
      * @param writeFile An optional callback used to write the output. If not provided, this method will emit output via this grammar's {@link Grammar.host|host}.
      * @param cancelable A cancelable object that can be used to abort the operation.
      */
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
    
    /**
      * Gets the {@link Emitter} used to emit the grammar.
      */
    /* protected */ def emitter: Emitter = js.native
    
    /**
      * Gets the {@link SourceFile} parsed for the provided file path.
      * @param file The path to the source file.
      * @returns The {@link SourceFile} for the provided path, if one was parsed; otherwise, `undefined`.
      */
    def getSourceFile(file: String): js.UndefOr[SourceFile] = js.native
    
    /**
      * The [Host](xref:hosts) the grammar uses to interact with the file system.
      */
    val host: Host | CoreSyncHost | CoreAsyncHost = js.native
    
    /**
      * Indicates whether the grammar has been bound.
      */
    def isBound: Boolean = js.native
    
    /**
      * Indicates whether the grammar has been parsed.
      */
    def isParsed: Boolean = js.native
    
    /**
      * The {@link CompilerOptions} used by the grammar.
      */
    val options: ReadonlyCompilerOptions = js.native
    
    /**
      * Asynchronously parses the root files provided to the grammar.
      * @param cancelable A cancelable object that can be used to abort the operation.
      * @returns A `Promise` that is settled when the operation has completed.
      */
    def parse(): js.Promise[Unit] = js.native
    def parse(cancelable: Cancelable): js.Promise[Unit] = js.native
    def parse(cancelable: CancellationToken): js.Promise[Unit] = js.native
    
    /**
      * Synchronously parses the root files provided to the grammar.
      * @param cancelable A cancelable object that can be used to abort the operation.
      */
    def parseSync(): Unit = js.native
    def parseSync(cancelable: Cancelable): Unit = js.native
    def parseSync(cancelable: CancellationToken): Unit = js.native
    
    /**
      * When overridden in a derived class, asynchronously reads the contents of the provided file.
      * @param file The file to read.
      * @param cancelToken A cancellation token that can be used by the caller to abort the operation.
      * @returns A `Promise` for either a `string` containing the content if the file could be read, or `undefined` if the file could not be read.
      * @virtual
      */
    /* protected */ def readFile(file: String): js.UndefOr[js.Promise[js.UndefOr[String]] | String] = js.native
    /* protected */ def readFile(file: String, cancelToken: CancelToken): js.UndefOr[js.Promise[js.UndefOr[String]] | String] = js.native
    
    /**
      * When overridden in a derived class, synchronously reads the contents of the provided file.
      * @param file The file to read.
      * @param cancelToken A cancellation token that can be used by the caller to abort the operation.
      * @returns A `string` containing the content if the file could be read; otherwise, `undefined`.
      * @virtual
      */
    /* protected */ def readFileSync(file: String): js.UndefOr[js.Promise[js.UndefOr[String]] | String] = js.native
    
    /**
      * Gets the resolver used to resolve references to bound nodes.
      * @throws `Error` - Grammar has not yet been bound.
      */
    def resolver: Resolver = js.native
    
    /**
      * Gets the root files parsed by the grammar.
      * @throws `Error` - Grammar has not yet been parsed.
      */
    def rootFiles: js.Array[SourceFile] = js.native
    
    /**
      * Gets the source files parsed by the grammar.
      * @throws `Error` - Grammar has not yet been parsed.
      */
    def sourceFiles: js.Array[SourceFile] = js.native
    
    /**
      * When overridden in a derived class, asynchronously writes a file to the host.
      * @param file The path to the file.
      * @param text The contents of the file.
      * @param cancelToken A cancellation token that can be used by the caller to abort the operation.
      * @returns A `Promise` that is settled when the operation completes.
      * @virtual
      */
    /* protected */ def writeFile(file: String, content: String): Unit | js.Promise[Unit] = js.native
    /* protected */ def writeFile(file: String, content: String, cancelToken: CancelToken): Unit | js.Promise[Unit] = js.native
    
    /**
      * When overridden in a derived class, synchronosly writes a file to the host.
      * @param file The path to the file.
      * @param text The contents of the file.
      * @param cancelToken A cancellation token that can be used by the caller to abort the operation.
      * @virtual
      */
    /* protected */ def writeFileSync(file: String, content: String): Unit = js.native
  }
  /* static members */
  object Grammar {
    
    @JSImport("grammarkdown/dist/grammar", "Grammar")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Converts a string containing Grammarkdown syntax into output based on the provided options.
      * @param content The Grammarkdown source text to convert.
      * @param options The {@link CompilerOptions} used by the grammar.
      * @param hostFallback An optional host to use as a fallback for file system operations.
      * @param cancelable A cancelable object that can be used to abort the operation.
      */
    /**
      * {@inheritDoc Grammar.(convert:1)}
      * @deprecated since 2.1.0 - `prex.CancellationToken` may no longer be accepted in future releases. Please use a token that implements `@esfx/cancelable.Cancelable`
      */
    inline def convert(content: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("convert")(content.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def convert(content: String, options: Unit, hostFallback: Unit, cancelable: Cancelable): String = (^.asInstanceOf[js.Dynamic].applyDynamic("convert")(content.asInstanceOf[js.Any], options.asInstanceOf[js.Any], hostFallback.asInstanceOf[js.Any], cancelable.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def convert(content: String, options: Unit, hostFallback: Unit, cancelable: CancellationToken): String = (^.asInstanceOf[js.Dynamic].applyDynamic("convert")(content.asInstanceOf[js.Any], options.asInstanceOf[js.Any], hostFallback.asInstanceOf[js.Any], cancelable.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def convert(content: String, options: Unit, hostFallback: CoreAsyncHost): String = (^.asInstanceOf[js.Dynamic].applyDynamic("convert")(content.asInstanceOf[js.Any], options.asInstanceOf[js.Any], hostFallback.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def convert(content: String, options: Unit, hostFallback: CoreAsyncHost, cancelable: Cancelable): String = (^.asInstanceOf[js.Dynamic].applyDynamic("convert")(content.asInstanceOf[js.Any], options.asInstanceOf[js.Any], hostFallback.asInstanceOf[js.Any], cancelable.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def convert(content: String, options: Unit, hostFallback: CoreAsyncHost, cancelable: CancellationToken): String = (^.asInstanceOf[js.Dynamic].applyDynamic("convert")(content.asInstanceOf[js.Any], options.asInstanceOf[js.Any], hostFallback.asInstanceOf[js.Any], cancelable.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def convert(content: String, options: Unit, hostFallback: CoreSyncHost): String = (^.asInstanceOf[js.Dynamic].applyDynamic("convert")(content.asInstanceOf[js.Any], options.asInstanceOf[js.Any], hostFallback.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def convert(content: String, options: Unit, hostFallback: CoreSyncHost, cancelable: Cancelable): String = (^.asInstanceOf[js.Dynamic].applyDynamic("convert")(content.asInstanceOf[js.Any], options.asInstanceOf[js.Any], hostFallback.asInstanceOf[js.Any], cancelable.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def convert(content: String, options: Unit, hostFallback: CoreSyncHost, cancelable: CancellationToken): String = (^.asInstanceOf[js.Dynamic].applyDynamic("convert")(content.asInstanceOf[js.Any], options.asInstanceOf[js.Any], hostFallback.asInstanceOf[js.Any], cancelable.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def convert(content: String, options: Unit, hostFallback: Host): String = (^.asInstanceOf[js.Dynamic].applyDynamic("convert")(content.asInstanceOf[js.Any], options.asInstanceOf[js.Any], hostFallback.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def convert(content: String, options: Unit, hostFallback: Host, cancelable: Cancelable): String = (^.asInstanceOf[js.Dynamic].applyDynamic("convert")(content.asInstanceOf[js.Any], options.asInstanceOf[js.Any], hostFallback.asInstanceOf[js.Any], cancelable.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def convert(content: String, options: Unit, hostFallback: Host, cancelable: CancellationToken): String = (^.asInstanceOf[js.Dynamic].applyDynamic("convert")(content.asInstanceOf[js.Any], options.asInstanceOf[js.Any], hostFallback.asInstanceOf[js.Any], cancelable.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def convert(content: String, options: CompilerOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("convert")(content.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def convert(content: String, options: CompilerOptions, hostFallback: Unit, cancelable: Cancelable): String = (^.asInstanceOf[js.Dynamic].applyDynamic("convert")(content.asInstanceOf[js.Any], options.asInstanceOf[js.Any], hostFallback.asInstanceOf[js.Any], cancelable.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def convert(content: String, options: CompilerOptions, hostFallback: Unit, cancelable: CancellationToken): String = (^.asInstanceOf[js.Dynamic].applyDynamic("convert")(content.asInstanceOf[js.Any], options.asInstanceOf[js.Any], hostFallback.asInstanceOf[js.Any], cancelable.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def convert(content: String, options: CompilerOptions, hostFallback: CoreAsyncHost): String = (^.asInstanceOf[js.Dynamic].applyDynamic("convert")(content.asInstanceOf[js.Any], options.asInstanceOf[js.Any], hostFallback.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def convert(content: String, options: CompilerOptions, hostFallback: CoreAsyncHost, cancelable: Cancelable): String = (^.asInstanceOf[js.Dynamic].applyDynamic("convert")(content.asInstanceOf[js.Any], options.asInstanceOf[js.Any], hostFallback.asInstanceOf[js.Any], cancelable.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def convert(
      content: String,
      options: CompilerOptions,
      hostFallback: CoreAsyncHost,
      cancelable: CancellationToken
    ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("convert")(content.asInstanceOf[js.Any], options.asInstanceOf[js.Any], hostFallback.asInstanceOf[js.Any], cancelable.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def convert(content: String, options: CompilerOptions, hostFallback: CoreSyncHost): String = (^.asInstanceOf[js.Dynamic].applyDynamic("convert")(content.asInstanceOf[js.Any], options.asInstanceOf[js.Any], hostFallback.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def convert(content: String, options: CompilerOptions, hostFallback: CoreSyncHost, cancelable: Cancelable): String = (^.asInstanceOf[js.Dynamic].applyDynamic("convert")(content.asInstanceOf[js.Any], options.asInstanceOf[js.Any], hostFallback.asInstanceOf[js.Any], cancelable.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def convert(
      content: String,
      options: CompilerOptions,
      hostFallback: CoreSyncHost,
      cancelable: CancellationToken
    ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("convert")(content.asInstanceOf[js.Any], options.asInstanceOf[js.Any], hostFallback.asInstanceOf[js.Any], cancelable.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def convert(content: String, options: CompilerOptions, hostFallback: Host): String = (^.asInstanceOf[js.Dynamic].applyDynamic("convert")(content.asInstanceOf[js.Any], options.asInstanceOf[js.Any], hostFallback.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def convert(content: String, options: CompilerOptions, hostFallback: Host, cancelable: Cancelable): String = (^.asInstanceOf[js.Dynamic].applyDynamic("convert")(content.asInstanceOf[js.Any], options.asInstanceOf[js.Any], hostFallback.asInstanceOf[js.Any], cancelable.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def convert(content: String, options: CompilerOptions, hostFallback: Host, cancelable: CancellationToken): String = (^.asInstanceOf[js.Dynamic].applyDynamic("convert")(content.asInstanceOf[js.Any], options.asInstanceOf[js.Any], hostFallback.asInstanceOf[js.Any], cancelable.asInstanceOf[js.Any])).asInstanceOf[String]
  }
}

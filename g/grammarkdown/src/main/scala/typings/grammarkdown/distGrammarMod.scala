package typings.grammarkdown

import typings.esfxAsyncCanceltoken.mod.CancelToken
import typings.esfxCancelable.mod.Cancelable
import typings.grammarkdown.anon.CompilerOptionsfilestring
import typings.grammarkdown.anon.ReadonlyCompilerOptions
import typings.grammarkdown.distBinderMod.Binder
import typings.grammarkdown.distBinderMod.BindingTable
import typings.grammarkdown.distCheckerMod.Checker
import typings.grammarkdown.distCheckerMod.Resolver
import typings.grammarkdown.distDiagnosticsMod.DiagnosticMessages
import typings.grammarkdown.distEmitterMod.Emitter
import typings.grammarkdown.distHostMod.CoreAsyncHost
import typings.grammarkdown.distNodesMod.SourceFile
import typings.grammarkdown.distOptionsMod.CompilerOptions
import typings.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distGrammarMod {
  
  @JSImport("grammarkdown/dist/grammar", "Grammar")
  @js.native
  open class Grammar protected () extends StObject {
    /**
      * @param rootNames The names of the root files used by the grammar.
      * @param options The {@link CompilerOptions} used by the grammar.
      * @param host The [Host](xref:hosts) the grammar uses to interact with the file system.
      */
    def this(rootNames: js.Iterable[String]) = this()
    def this(rootNames: js.Iterable[String], options: CompilerOptions) = this()
    def this(rootNames: js.Iterable[String], options: Unit, host: CoreAsyncHost) = this()
    def this(rootNames: js.Iterable[String], options: CompilerOptions, host: CoreAsyncHost) = this()
    
    /* private */ var _bindings: Any = js.native
    
    /* private */ var _emitOne: Any = js.native
    
    /* private */ var _getSourceFileNoResolve: Any = js.native
    
    /* private */ var _innerBinder: Any = js.native
    
    /* private */ var _innerChecker: Any = js.native
    
    /* private */ var _innerEmitter: Any = js.native
    
    /* private */ var _innerResolver: Any = js.native
    
    /* private */ var _lineOffsetMap: Any = js.native
    
    /* private */ var _normalizeFile: Any = js.native
    
    /* private */ var _parseShared: Any = js.native
    
    /* private */ var _parseState: Any = js.native
    
    /* private */ var _parseWorker: Any = js.native
    
    /* private */ var _processFile: Any = js.native
    
    /* private */ var _processImports: Any = js.native
    
    /* private */ var _processRootFile: Any = js.native
    
    /* private */ var _resolveFile: Any = js.native
    
    /* private */ var _rootNames: Any = js.native
    
    /* private */ var _setSourceFileNoResolve: Any = js.native
    
    /* private */ var _writeFileFallback: Any = js.native
    
    /**
      * Asynchronously binds each file in the grammar. Will also parse the grammar if it has not yet been parsed.
      * @param cancelable A cancelable object that can be used to abort the operation.
      * @returns A `Promise` that is settled when the operation has completed.
      */
    def bind(): js.Promise[Unit] = js.native
    def bind(cancelable: Cancelable): js.Promise[Unit] = js.native
    
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
    def check(sourceFile: SourceFile): js.Promise[Unit] = js.native
    def check(sourceFile: SourceFile, cancelable: Cancelable): js.Promise[Unit] = js.native
    
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
      writeFile: js.Function3[
          /* file */ String, 
          /* output */ String, 
          /* cancelToken */ js.UndefOr[CancelToken], 
          Unit | PromiseLike[Unit]
        ]
    ): js.Promise[Unit] = js.native
    def emit(
      sourceFile: Unit,
      writeFile: js.Function3[
          /* file */ String, 
          /* output */ String, 
          /* cancelToken */ js.UndefOr[CancelToken], 
          Unit | PromiseLike[Unit]
        ],
      cancelable: Cancelable
    ): js.Promise[Unit] = js.native
    def emit(sourceFile: Unit, writeFile: Unit, cancelable: Cancelable): js.Promise[Unit] = js.native
    def emit(sourceFile: SourceFile): js.Promise[Unit] = js.native
    def emit(
      sourceFile: SourceFile,
      writeFile: js.Function3[
          /* file */ String, 
          /* output */ String, 
          /* cancelToken */ js.UndefOr[CancelToken], 
          Unit | PromiseLike[Unit]
        ]
    ): js.Promise[Unit] = js.native
    def emit(
      sourceFile: SourceFile,
      writeFile: js.Function3[
          /* file */ String, 
          /* output */ String, 
          /* cancelToken */ js.UndefOr[CancelToken], 
          Unit | PromiseLike[Unit]
        ],
      cancelable: Cancelable
    ): js.Promise[Unit] = js.native
    def emit(sourceFile: SourceFile, writeFile: Unit, cancelable: Cancelable): js.Promise[Unit] = js.native
    
    /**
      * Asynchronously emits the provided file in the grammar as a string. Will also parse, bind, and check the grammar if it has not yet been parsed, bound, or checked.
      * @param sourceFile The {@link SourceFile} to emit.
      * @param cancelable A cancelable object that can be used to abort the operation.
      * @returns A `Promise` for the emit output that is settled when the operation has completed.
      */
    def emitString(sourceFile: SourceFile): js.Promise[String] = js.native
    def emitString(sourceFile: SourceFile, cancelable: Cancelable): js.Promise[String] = js.native
    
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
      * The {@link CoreAsyncHost} the grammar uses to interact with the file system.
      */
    val host: CoreAsyncHost = js.native
    
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
    /* protected */ def writeFile(file: String, content: String): js.Promise[Unit] = js.native
    /* protected */ def writeFile(file: String, content: String, cancelToken: CancelToken): js.Promise[Unit] = js.native
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
    inline def convert(content: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("convert")(content.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
    inline def convert(content: String, options: Unit, hostFallback: Unit, cancelable: Cancelable): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("convert")(content.asInstanceOf[js.Any], options.asInstanceOf[js.Any], hostFallback.asInstanceOf[js.Any], cancelable.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
    inline def convert(content: String, options: Unit, hostFallback: CoreAsyncHost): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("convert")(content.asInstanceOf[js.Any], options.asInstanceOf[js.Any], hostFallback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
    inline def convert(content: String, options: Unit, hostFallback: CoreAsyncHost, cancelable: Cancelable): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("convert")(content.asInstanceOf[js.Any], options.asInstanceOf[js.Any], hostFallback.asInstanceOf[js.Any], cancelable.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
    inline def convert(content: String, options: CompilerOptionsfilestring): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("convert")(content.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
    inline def convert(content: String, options: CompilerOptionsfilestring, hostFallback: Unit, cancelable: Cancelable): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("convert")(content.asInstanceOf[js.Any], options.asInstanceOf[js.Any], hostFallback.asInstanceOf[js.Any], cancelable.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
    inline def convert(content: String, options: CompilerOptionsfilestring, hostFallback: CoreAsyncHost): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("convert")(content.asInstanceOf[js.Any], options.asInstanceOf[js.Any], hostFallback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
    inline def convert(
      content: String,
      options: CompilerOptionsfilestring,
      hostFallback: CoreAsyncHost,
      cancelable: Cancelable
    ): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("convert")(content.asInstanceOf[js.Any], options.asInstanceOf[js.Any], hostFallback.asInstanceOf[js.Any], cancelable.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  }
}

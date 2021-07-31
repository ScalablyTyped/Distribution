package typings.grammarkdown

import typings.esfxAsyncCanceltoken.mod.CancelToken
import typings.esfxCancelable.distMod.Cancelable
import typings.grammarkdown.nodesMod.SourceFile
import typings.grammarkdown.parserMod.Parser
import typings.prex.mod.CancellationToken
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hostMod {
  
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
  object CoreAsyncHost {
    
    @JSImport("grammarkdown/dist/host", "CoreAsyncHost")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def forFile(content: String): StringAsyncHost = ^.asInstanceOf[js.Dynamic].applyDynamic("forFile")(content.asInstanceOf[js.Any]).asInstanceOf[StringAsyncHost]
    @scala.inline
    def forFile(content: String, file: String): StringAsyncHost = (^.asInstanceOf[js.Dynamic].applyDynamic("forFile")(content.asInstanceOf[js.Any], file.asInstanceOf[js.Any])).asInstanceOf[StringAsyncHost]
    @scala.inline
    def forFile(content: String, file: String, hostFallback: CoreAsyncHost): StringAsyncHost = (^.asInstanceOf[js.Dynamic].applyDynamic("forFile")(content.asInstanceOf[js.Any], file.asInstanceOf[js.Any], hostFallback.asInstanceOf[js.Any])).asInstanceOf[StringAsyncHost]
    @scala.inline
    def forFile(content: String, file: String, hostFallback: CoreSyncHost): StringAsyncHost = (^.asInstanceOf[js.Dynamic].applyDynamic("forFile")(content.asInstanceOf[js.Any], file.asInstanceOf[js.Any], hostFallback.asInstanceOf[js.Any])).asInstanceOf[StringAsyncHost]
    @scala.inline
    def forFile(content: String, file: Unit, hostFallback: CoreAsyncHost): StringAsyncHost = (^.asInstanceOf[js.Dynamic].applyDynamic("forFile")(content.asInstanceOf[js.Any], file.asInstanceOf[js.Any], hostFallback.asInstanceOf[js.Any])).asInstanceOf[StringAsyncHost]
    @scala.inline
    def forFile(content: String, file: Unit, hostFallback: CoreSyncHost): StringAsyncHost = (^.asInstanceOf[js.Dynamic].applyDynamic("forFile")(content.asInstanceOf[js.Any], file.asInstanceOf[js.Any], hostFallback.asInstanceOf[js.Any])).asInstanceOf[StringAsyncHost]
    /**
      * Creates a {@link StringAsyncHost} for the provided content.
      * @param content The content of the file.
      * @param file The file name for the content.
      * @param hostFallback An optional host to use as a fallback for operations not supported by this host.
      */
    @scala.inline
    def forFile(content: js.Thenable[String]): StringAsyncHost = ^.asInstanceOf[js.Dynamic].applyDynamic("forFile")(content.asInstanceOf[js.Any]).asInstanceOf[StringAsyncHost]
    @scala.inline
    def forFile(content: js.Thenable[String], file: String): StringAsyncHost = (^.asInstanceOf[js.Dynamic].applyDynamic("forFile")(content.asInstanceOf[js.Any], file.asInstanceOf[js.Any])).asInstanceOf[StringAsyncHost]
    @scala.inline
    def forFile(content: js.Thenable[String], file: String, hostFallback: CoreAsyncHost): StringAsyncHost = (^.asInstanceOf[js.Dynamic].applyDynamic("forFile")(content.asInstanceOf[js.Any], file.asInstanceOf[js.Any], hostFallback.asInstanceOf[js.Any])).asInstanceOf[StringAsyncHost]
    @scala.inline
    def forFile(content: js.Thenable[String], file: String, hostFallback: CoreSyncHost): StringAsyncHost = (^.asInstanceOf[js.Dynamic].applyDynamic("forFile")(content.asInstanceOf[js.Any], file.asInstanceOf[js.Any], hostFallback.asInstanceOf[js.Any])).asInstanceOf[StringAsyncHost]
    @scala.inline
    def forFile(content: js.Thenable[String], file: Unit, hostFallback: CoreAsyncHost): StringAsyncHost = (^.asInstanceOf[js.Dynamic].applyDynamic("forFile")(content.asInstanceOf[js.Any], file.asInstanceOf[js.Any], hostFallback.asInstanceOf[js.Any])).asInstanceOf[StringAsyncHost]
    @scala.inline
    def forFile(content: js.Thenable[String], file: Unit, hostFallback: CoreSyncHost): StringAsyncHost = (^.asInstanceOf[js.Dynamic].applyDynamic("forFile")(content.asInstanceOf[js.Any], file.asInstanceOf[js.Any], hostFallback.asInstanceOf[js.Any])).asInstanceOf[StringAsyncHost]
    
    /**
      * Creates a `CoreAsyncHost`.
      * @param options The options used to configure the host.
      * @param hostFallback An optional host to use as a fallback for operations not supported by this host.
      */
    @scala.inline
    def from(custom: CoreAsyncHostOptions): CoreAsyncHost = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(custom.asInstanceOf[js.Any]).asInstanceOf[CoreAsyncHost]
    @scala.inline
    def from(custom: CoreAsyncHostOptions, hostFallback: CoreAsyncHost): CoreAsyncHost = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(custom.asInstanceOf[js.Any], hostFallback.asInstanceOf[js.Any])).asInstanceOf[CoreAsyncHost]
    @scala.inline
    def from(custom: CoreAsyncHostOptions, hostFallback: CoreSyncHost): CoreAsyncHost = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(custom.asInstanceOf[js.Any], hostFallback.asInstanceOf[js.Any])).asInstanceOf[CoreAsyncHost]
  }
  
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
  object CoreSyncHost {
    
    @JSImport("grammarkdown/dist/host", "CoreSyncHost")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a {@link StringSyncHost} for the provided content.
      * @param content The content of the file.
      * @param file The file name for the content.
      * @param hostFallback An optional host to use as a fallback for operations not supported by this host.
      */
    @scala.inline
    def forFile(content: String): StringSyncHost = ^.asInstanceOf[js.Dynamic].applyDynamic("forFile")(content.asInstanceOf[js.Any]).asInstanceOf[StringSyncHost]
    @scala.inline
    def forFile(content: String, file: String): StringSyncHost = (^.asInstanceOf[js.Dynamic].applyDynamic("forFile")(content.asInstanceOf[js.Any], file.asInstanceOf[js.Any])).asInstanceOf[StringSyncHost]
    @scala.inline
    def forFile(content: String, file: String, hostFallback: CoreSyncHost): StringSyncHost = (^.asInstanceOf[js.Dynamic].applyDynamic("forFile")(content.asInstanceOf[js.Any], file.asInstanceOf[js.Any], hostFallback.asInstanceOf[js.Any])).asInstanceOf[StringSyncHost]
    @scala.inline
    def forFile(content: String, file: Unit, hostFallback: CoreSyncHost): StringSyncHost = (^.asInstanceOf[js.Dynamic].applyDynamic("forFile")(content.asInstanceOf[js.Any], file.asInstanceOf[js.Any], hostFallback.asInstanceOf[js.Any])).asInstanceOf[StringSyncHost]
    
    /**
      * Creates a `CoreSyncHost`.
      * @param options The options used to configure the host.
      * @param hostFallback An optional host to use as a fallback for operations not supported by this host.
      */
    @scala.inline
    def from(options: CoreSyncHostOptions): CoreSyncHost = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(options.asInstanceOf[js.Any]).asInstanceOf[CoreSyncHost]
    @scala.inline
    def from(options: CoreSyncHostOptions, hostFallback: CoreSyncHost): CoreSyncHost = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(options.asInstanceOf[js.Any], hostFallback.asInstanceOf[js.Any])).asInstanceOf[CoreSyncHost]
  }
  
  @JSImport("grammarkdown/dist/host", "HostBase")
  @js.native
  /**
    * @param options The options used to configure the host.
    */
  abstract class HostBase () extends StObject {
    def this(options: HostBaseOptions) = this()
    
    var _innerParser: js.Any = js.native
    
    var _knownGrammars: js.Any = js.native
    
    var _useBuiltinGrammars: js.Any = js.native
    
    /**
      * Creates a {@link Parser} for this host.
      * @virtual
      */
    /* protected */ def createParser(): Parser = js.native
    
    /**
      * Indicates whether comparisons for this host should be case insensitive.
      */
    val ignoreCase: Boolean = js.native
    
    /**
      * Normalize a file path's string representation for use as a key based on the case sensitivity of the host.
      * @param file The file path.
      */
    def normalizeFile(file: String): String = js.native
    
    /**
      * When overridden in a derived class, normalizes a file path's string representation for use as a key based on the case sensitivity of the host.
      * @param file The file path.
      * @virtual
      */
    /* protected */ def normalizeFileCore(file: String): String = js.native
    
    /**
      * Parse a source file.
      * @param file The path to the source file.
      * @param text The text of the source file.
      * @param cancelable An optional cancelable object that can be used to abort a long-running parse.
      */
    def parseSourceFile(file: String, text: String): SourceFile = js.native
    def parseSourceFile(file: String, text: String, cancelable: Cancelable): SourceFile = js.native
    def parseSourceFile(file: String, text: String, cancelable: CancellationToken): SourceFile = js.native
    
    /**
      * Gets the parser instance associated with this host.
      */
    /* protected */ def parser: Parser = js.native
    
    /**
      * Registers a known grammar for use with `@import` directives.
      * @param name The name for the grammar.
      * @param file The file path of the grammar.
      */
    def registerKnownGrammar(name: String, file: String): Unit = js.native
    
    /**
      * When overridden in a derived clas, registers a known grammar for use with `@import` directives.
      * @param name The name for the grammar.
      * @param file The file path of the grammar.
      * @virtual
      */
    /* protected */ def registerKnownGrammarCore(name: String, file: String): Unit = js.native
    
    /**
      * Resolve the full path of a file relative to the provided referer.
      * @param file The path to the requested file.
      * @param referer An optional path indicating the file from which the path should be resolved.
      */
    def resolveFile(file: String): String = js.native
    def resolveFile(file: String, referer: String): String = js.native
    
    /**
      * When overridden in a derived class, resolves the full path of a file relative to the provided referer.
      * @param file The path to the requested file.
      * @param referer An optional path indicating the file from which the path should be resolved.
      * @virtual
      */
    /* protected */ def resolveFileCore(file: String): String = js.native
    /* protected */ def resolveFileCore(file: String, referer: String): String = js.native
    
    /**
      * Returns the path for a known or built-in grammar based on its name (i.e., `"es2015"`, etc.)
      * @param name The name of the grammar.
      */
    def resolveKnownGrammar(name: String): js.UndefOr[String] = js.native
    
    /**
      * When overridden in a derived class, returns the path for a known or built-in grammar based on its name (i.e., `"es2015"`, etc.)
      * @param name The name of the grammar.
      * @virtual
      */
    /* protected */ def resolveKnownGrammarCore(name: String): js.UndefOr[String] = js.native
  }
  
  @JSImport("grammarkdown/dist/host", "StringAsyncHost")
  @js.native
  class StringAsyncHost protected () extends CoreAsyncHost {
    def this(file: String, content: String) = this()
    /**
      * @param file The file name for the content.
      * @param content The content of the file.
      * @param hostFallback An optional host to use as a fallback for operations not supported by this host.
      */
    def this(file: String, content: js.Thenable[String]) = this()
    def this(file: String, content: String, hostFallback: CoreAsyncHost) = this()
    def this(file: String, content: String, hostFallback: CoreSyncHost) = this()
    def this(file: String, content: js.Thenable[String], hostFallback: CoreAsyncHost) = this()
    def this(file: String, content: js.Thenable[String], hostFallback: CoreSyncHost) = this()
    
    /**
      * The content of the file.
      */
    val content: js.Thenable[String] | String = js.native
    
    /**
      * The file name for the content.
      */
    val file: String = js.native
  }
  
  @JSImport("grammarkdown/dist/host", "StringSyncHost")
  @js.native
  class StringSyncHost protected () extends CoreSyncHost {
    /**
      * @param file The file name for the content.
      * @param content The content of the file.
      * @param hostFallback An optional host to use as a fallback for operations not supported by this host.
      */
    def this(file: String, content: String) = this()
    def this(file: String, content: String, hostFallback: CoreSyncHost) = this()
    
    /**
      * The content of the file.
      */
    val content: String = js.native
    
    /**
      * The file name for the content.
      */
    val file: String = js.native
  }
  
  trait CoreAsyncHostOptions
    extends StObject
       with HostBaseOptions {
    
    /**
      * A callback used to control file normalization when generating keys for maps based on the case sensitivity of the host.
      */
    var normalizeFile: js.UndefOr[
        js.ThisFunction2[
          /* this */ Unit, 
          /* file */ String, 
          /* fallback */ js.Function1[/* file */ String, String], 
          String
        ]
      ] = js.undefined
    
    /**
      * A callback used to control asynchronous file reads.
      */
    var readFile: js.UndefOr[
        js.ThisFunction3[
          /* this */ Unit, 
          /* file */ String, 
          /* cancelToken */ js.UndefOr[CancelToken], 
          /* fallback */ js.Function2[
            /* file */ String, 
            /* cancelToken */ js.UndefOr[CancelToken], 
            js.Promise[js.UndefOr[String]]
          ], 
          js.UndefOr[js.Thenable[js.UndefOr[String]] | String]
        ]
      ] = js.undefined
    
    /**
      * A callback used to control file resolution.
      */
    var resolveFile: js.UndefOr[
        js.ThisFunction3[
          /* this */ Unit, 
          /* file */ String, 
          /* referer */ js.UndefOr[String], 
          /* fallback */ js.Function2[/* file */ String, /* referer */ js.UndefOr[String], String], 
          String
        ]
      ] = js.undefined
    
    /**
      * A callback used to control known grammar resolution.
      */
    var resolveKnownGrammar: js.UndefOr[
        js.ThisFunction2[
          /* this */ Unit, 
          /* name */ String, 
          /* fallback */ js.Function1[/* name */ String, js.UndefOr[String]], 
          js.UndefOr[String]
        ]
      ] = js.undefined
    
    /**
      * A callback used to control asynchronous file writes.
      */
    var writeFile: js.UndefOr[
        js.ThisFunction4[
          /* this */ Unit, 
          /* file */ String, 
          /* content */ String, 
          /* cancelToken */ js.UndefOr[CancelToken], 
          /* fallback */ js.Function3[
            /* file */ String, 
            /* content */ String, 
            /* cancelToken */ js.UndefOr[CancelToken], 
            js.Promise[Unit]
          ], 
          js.Thenable[Unit] | Unit
        ]
      ] = js.undefined
  }
  object CoreAsyncHostOptions {
    
    @scala.inline
    def apply(): CoreAsyncHostOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CoreAsyncHostOptions]
    }
    
    @scala.inline
    implicit class CoreAsyncHostOptionsMutableBuilder[Self <: CoreAsyncHostOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNormalizeFile(
        value: js.ThisFunction2[
              /* this */ Unit, 
              /* file */ String, 
              /* fallback */ js.Function1[/* file */ String, String], 
              String
            ]
      ): Self = StObject.set(x, "normalizeFile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNormalizeFileUndefined: Self = StObject.set(x, "normalizeFile", js.undefined)
      
      @scala.inline
      def setReadFile(
        value: js.ThisFunction3[
              /* this */ Unit, 
              /* file */ String, 
              /* cancelToken */ js.UndefOr[CancelToken], 
              /* fallback */ js.Function2[
                /* file */ String, 
                /* cancelToken */ js.UndefOr[CancelToken], 
                js.Promise[js.UndefOr[String]]
              ], 
              js.UndefOr[js.Thenable[js.UndefOr[String]] | String]
            ]
      ): Self = StObject.set(x, "readFile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadFileUndefined: Self = StObject.set(x, "readFile", js.undefined)
      
      @scala.inline
      def setResolveFile(
        value: js.ThisFunction3[
              /* this */ Unit, 
              /* file */ String, 
              /* referer */ js.UndefOr[String], 
              /* fallback */ js.Function2[/* file */ String, /* referer */ js.UndefOr[String], String], 
              String
            ]
      ): Self = StObject.set(x, "resolveFile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResolveFileUndefined: Self = StObject.set(x, "resolveFile", js.undefined)
      
      @scala.inline
      def setResolveKnownGrammar(
        value: js.ThisFunction2[
              /* this */ Unit, 
              /* name */ String, 
              /* fallback */ js.Function1[/* name */ String, js.UndefOr[String]], 
              js.UndefOr[String]
            ]
      ): Self = StObject.set(x, "resolveKnownGrammar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResolveKnownGrammarUndefined: Self = StObject.set(x, "resolveKnownGrammar", js.undefined)
      
      @scala.inline
      def setWriteFile(
        value: js.ThisFunction4[
              /* this */ Unit, 
              /* file */ String, 
              /* content */ String, 
              /* cancelToken */ js.UndefOr[CancelToken], 
              /* fallback */ js.Function3[
                /* file */ String, 
                /* content */ String, 
                /* cancelToken */ js.UndefOr[CancelToken], 
                js.Promise[Unit]
              ], 
              js.Thenable[Unit] | Unit
            ]
      ): Self = StObject.set(x, "writeFile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWriteFileUndefined: Self = StObject.set(x, "writeFile", js.undefined)
    }
  }
  
  trait CoreSyncHostOptions
    extends StObject
       with HostBaseOptions {
    
    /**
      * A callback used to control file normalization when generating keys for maps based on the case sensitivity of the host.
      */
    var normalizeFile: js.UndefOr[
        js.ThisFunction2[
          /* this */ Unit, 
          /* file */ String, 
          /* fallback */ js.Function1[/* file */ String, String], 
          String
        ]
      ] = js.undefined
    
    /**
      * A callback used to control synchronous file reads.
      */
    var readFileSync: js.UndefOr[
        js.ThisFunction3[
          /* this */ Unit, 
          /* file */ String, 
          /* cancelToken */ js.UndefOr[CancelToken], 
          /* fallback */ js.Function2[/* file */ String, /* cancelToken */ js.UndefOr[CancelToken], js.UndefOr[String]], 
          js.UndefOr[String]
        ]
      ] = js.undefined
    
    /**
      * A callback used to control file resolution.
      */
    var resolveFile: js.UndefOr[
        js.ThisFunction3[
          /* this */ Unit, 
          /* file */ String, 
          /* referer */ js.UndefOr[String], 
          /* fallback */ js.Function2[/* file */ String, /* referer */ js.UndefOr[String], String], 
          String
        ]
      ] = js.undefined
    
    /**
      * A callback used to control known grammar resolution.
      */
    var resolveKnownGrammar: js.UndefOr[
        js.ThisFunction2[
          /* this */ Unit, 
          /* name */ String, 
          /* fallback */ js.Function1[/* name */ String, js.UndefOr[String]], 
          js.UndefOr[String]
        ]
      ] = js.undefined
    
    /**
      * A callback used to control synchronous file writes.
      */
    var writeFileSync: js.UndefOr[
        js.ThisFunction4[
          /* this */ Unit, 
          /* file */ String, 
          /* content */ String, 
          /* cancelToken */ js.UndefOr[CancelToken], 
          /* fallback */ js.Function3[
            /* file */ String, 
            /* content */ String, 
            /* cancelToken */ js.UndefOr[CancelToken], 
            Unit
          ], 
          Unit
        ]
      ] = js.undefined
  }
  object CoreSyncHostOptions {
    
    @scala.inline
    def apply(): CoreSyncHostOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CoreSyncHostOptions]
    }
    
    @scala.inline
    implicit class CoreSyncHostOptionsMutableBuilder[Self <: CoreSyncHostOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNormalizeFile(
        value: js.ThisFunction2[
              /* this */ Unit, 
              /* file */ String, 
              /* fallback */ js.Function1[/* file */ String, String], 
              String
            ]
      ): Self = StObject.set(x, "normalizeFile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNormalizeFileUndefined: Self = StObject.set(x, "normalizeFile", js.undefined)
      
      @scala.inline
      def setReadFileSync(
        value: js.ThisFunction3[
              /* this */ Unit, 
              /* file */ String, 
              /* cancelToken */ js.UndefOr[CancelToken], 
              /* fallback */ js.Function2[/* file */ String, /* cancelToken */ js.UndefOr[CancelToken], js.UndefOr[String]], 
              js.UndefOr[String]
            ]
      ): Self = StObject.set(x, "readFileSync", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadFileSyncUndefined: Self = StObject.set(x, "readFileSync", js.undefined)
      
      @scala.inline
      def setResolveFile(
        value: js.ThisFunction3[
              /* this */ Unit, 
              /* file */ String, 
              /* referer */ js.UndefOr[String], 
              /* fallback */ js.Function2[/* file */ String, /* referer */ js.UndefOr[String], String], 
              String
            ]
      ): Self = StObject.set(x, "resolveFile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResolveFileUndefined: Self = StObject.set(x, "resolveFile", js.undefined)
      
      @scala.inline
      def setResolveKnownGrammar(
        value: js.ThisFunction2[
              /* this */ Unit, 
              /* name */ String, 
              /* fallback */ js.Function1[/* name */ String, js.UndefOr[String]], 
              js.UndefOr[String]
            ]
      ): Self = StObject.set(x, "resolveKnownGrammar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResolveKnownGrammarUndefined: Self = StObject.set(x, "resolveKnownGrammar", js.undefined)
      
      @scala.inline
      def setWriteFileSync(
        value: js.ThisFunction4[
              /* this */ Unit, 
              /* file */ String, 
              /* content */ String, 
              /* cancelToken */ js.UndefOr[CancelToken], 
              /* fallback */ js.Function3[
                /* file */ String, 
                /* content */ String, 
                /* cancelToken */ js.UndefOr[CancelToken], 
                Unit
              ], 
              Unit
            ]
      ): Self = StObject.set(x, "writeFileSync", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWriteFileSyncUndefined: Self = StObject.set(x, "writeFileSync", js.undefined)
    }
  }
  
  trait HostBaseOptions extends StObject {
    
    /**
      * Indicates whether the host is case-insensitive (`true`) or case-sensitive (`false`).
      */
    var ignoreCase: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A set of known grammars in the form `{ "name": "path" }`
      */
    var knownGrammars: js.UndefOr[Record[String, String]] = js.undefined
    
    /**
      * Indicates whether to include builtin grammars in the set of known grammars.
      */
    var useBuiltinGrammars: js.UndefOr[Boolean] = js.undefined
  }
  object HostBaseOptions {
    
    @scala.inline
    def apply(): HostBaseOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HostBaseOptions]
    }
    
    @scala.inline
    implicit class HostBaseOptionsMutableBuilder[Self <: HostBaseOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIgnoreCase(value: Boolean): Self = StObject.set(x, "ignoreCase", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreCaseUndefined: Self = StObject.set(x, "ignoreCase", js.undefined)
      
      @scala.inline
      def setKnownGrammars(value: Record[String, String]): Self = StObject.set(x, "knownGrammars", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKnownGrammarsUndefined: Self = StObject.set(x, "knownGrammars", js.undefined)
      
      @scala.inline
      def setUseBuiltinGrammars(value: Boolean): Self = StObject.set(x, "useBuiltinGrammars", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseBuiltinGrammarsUndefined: Self = StObject.set(x, "useBuiltinGrammars", js.undefined)
    }
  }
  
  type LegacyReadFileCallback = js.ThisFunction2[
    /* this */ Unit, 
    /* file */ String, 
    /* cancelToken */ js.UndefOr[CancellationToken], 
    js.Thenable[String] | String
  ]
  
  type LegacyReadFileSyncCallback = js.ThisFunction2[
    /* this */ Unit, 
    /* file */ String, 
    /* cancelToken */ js.UndefOr[CancellationToken], 
    js.UndefOr[String]
  ]
  
  type LegacyWriteFileCallback = js.ThisFunction3[
    /* this */ Unit, 
    /* file */ String, 
    /* content */ String, 
    /* cancelToken */ js.UndefOr[CancellationToken], 
    js.Thenable[Unit] | Unit
  ]
  
  type LegacyWriteFileSyncCallback = js.ThisFunction3[
    /* this */ Unit, 
    /* file */ String, 
    /* content */ String, 
    /* cancelToken */ js.UndefOr[CancellationToken], 
    Unit
  ]
  
  type ReadFileCallback = js.ThisFunction2[
    /* this */ Unit, 
    /* file */ String, 
    /* cancelToken */ js.UndefOr[CancelToken], 
    js.UndefOr[js.Thenable[js.UndefOr[String]] | String]
  ]
  
  type ReadFileSyncCallback = js.ThisFunction2[
    /* this */ Unit, 
    /* file */ String, 
    /* cancelToken */ js.UndefOr[CancelToken], 
    js.UndefOr[String]
  ]
  
  type WriteFileCallback = js.ThisFunction3[
    /* this */ Unit, 
    /* file */ String, 
    /* content */ String, 
    /* cancelToken */ js.UndefOr[CancelToken], 
    js.Thenable[Unit] | Unit
  ]
  
  type WriteFileSyncCallback = js.ThisFunction3[
    /* this */ Unit, 
    /* file */ String, 
    /* content */ String, 
    /* cancelToken */ js.UndefOr[CancelToken], 
    Unit
  ]
}

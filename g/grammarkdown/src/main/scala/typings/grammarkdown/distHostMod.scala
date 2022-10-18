package typings.grammarkdown

import typings.esfxAsyncCanceltoken.mod.CancelToken
import typings.esfxCancelable.mod.Cancelable
import typings.grammarkdown.distNodesMod.SourceFile
import typings.grammarkdown.distParserMod.Parser
import typings.std.PromiseLike
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distHostMod {
  
  @JSImport("grammarkdown/dist/host", "CoreAsyncHost")
  @js.native
  open class CoreAsyncHost protected () extends StObject {
    /**
      * @param options The options used to configure the host.
      * @param hostFallback An optional host to use as a fallback for operations not supported by this host.
      */
    def this(options: CoreAsyncHostOptions) = this()
    def this(options: CoreAsyncHostOptions, hostFallback: CoreAsyncHost) = this()
    
    /* private */ var _hostFallback: Any = js.native
    
    /* private */ var _ignoreCase: Any = js.native
    
    /* private */ var _innerParser: Any = js.native
    
    /* private */ var _knownGrammars: Any = js.native
    
    /* private */ var _normalizeFile: Any = js.native
    
    /* private */ var _normalizeFileCallback: Any = js.native
    
    /* private */ var _normalizeFileFallback: Any = js.native
    
    /* private */ var _readFile: Any = js.native
    
    /* private */ var _readFileCallback: Any = js.native
    
    /* private */ var _readFileFallback: Any = js.native
    
    /* private */ var _resolveFile: Any = js.native
    
    /* private */ var _resolveFileCallback: Any = js.native
    
    /* private */ var _resolveFileFallback: Any = js.native
    
    /* private */ var _resolveKnownGrammar: Any = js.native
    
    /* private */ var _resolveKnownGrammarCallback: Any = js.native
    
    /* private */ var _resolveKnownGrammarFallback: Any = js.native
    
    /* private */ var _useBuiltinGrammars: Any = js.native
    
    /* private */ var _writeFile: Any = js.native
    
    /* private */ var _writeFileCallback: Any = js.native
    
    /* private */ var _writeFileFallback: Any = js.native
    
    /**
      * Creates a {@link Parser} for this host.
      * @virtual
      */
    /* protected */ def createParser(): Parser = js.native
    
    /**
      * Reads and parses a source file from the host.
      * @param file The path to the file.
      * @param cancelable A cancelable object that can be used to abort the operation.
      * @returns A `Promise` for either the parsed {@link SourceFile} of the file if the file could be read, or `undefined` if it could not be read.
      */
    def getSourceFile(file: String): js.Promise[js.UndefOr[SourceFile]] = js.native
    def getSourceFile(file: String, cancelable: Cancelable): js.Promise[js.UndefOr[SourceFile]] = js.native
    
    /**
      * Indicates whether comparisons for this host should be case insensitive.
      */
    def ignoreCase: Boolean = js.native
    
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
    
    /**
      * Gets the parser instance associated with this host.
      */
    /* protected */ def parser: Parser = js.native
    
    /**
      * Reads a file from the host.
      * @param file The path to the file.
      * @param cancelable A cancelable object that can be used to abort the operation.
      * @returns A `Promise` for either a `string` containing the content if the file could be read, or `undefined` if the file could not be read.
      */
    def readFile(file: String): js.Promise[js.UndefOr[String]] = js.native
    def readFile(file: String, cancelable: Cancelable): js.Promise[js.UndefOr[String]] = js.native
    
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
      * Resolve the full path of a file relative to the provided referrer.
      * @param file The path to the requested file.
      * @param referrer An optional path indicating the file from which the path should be resolved.
      */
    def resolveFile(file: String): String = js.native
    def resolveFile(file: String, referrer: String): String = js.native
    
    /**
      * When overridden in a derived class, resolves the full path of a file relative to the provided referrer.
      * @param file The path to the requested file.
      * @param referrer An optional path indicating the file from which the path should be resolved.
      * @virtual
      */
    /* protected */ def resolveFileCore(file: String): String = js.native
    /* protected */ def resolveFileCore(file: String, referrer: String): String = js.native
    
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
    
    /**
      * Writes a file to the host.
      * @param file The path to the file.
      * @param text The contents of the file.
      * @param cancelable A cancelable object that can be used to abort the operation.
      * @returns A `Promise` that is settled when the operation completes.
      */
    def writeFile(file: String, text: String): js.Promise[Unit] = js.native
    def writeFile(file: String, text: String, cancelable: Cancelable): js.Promise[Unit] = js.native
    
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
    
    inline def forFile(content: String): StringAsyncHost = ^.asInstanceOf[js.Dynamic].applyDynamic("forFile")(content.asInstanceOf[js.Any]).asInstanceOf[StringAsyncHost]
    inline def forFile(content: String, file: String): StringAsyncHost = (^.asInstanceOf[js.Dynamic].applyDynamic("forFile")(content.asInstanceOf[js.Any], file.asInstanceOf[js.Any])).asInstanceOf[StringAsyncHost]
    inline def forFile(content: String, file: String, hostFallback: CoreAsyncHost): StringAsyncHost = (^.asInstanceOf[js.Dynamic].applyDynamic("forFile")(content.asInstanceOf[js.Any], file.asInstanceOf[js.Any], hostFallback.asInstanceOf[js.Any])).asInstanceOf[StringAsyncHost]
    inline def forFile(content: String, file: Unit, hostFallback: CoreAsyncHost): StringAsyncHost = (^.asInstanceOf[js.Dynamic].applyDynamic("forFile")(content.asInstanceOf[js.Any], file.asInstanceOf[js.Any], hostFallback.asInstanceOf[js.Any])).asInstanceOf[StringAsyncHost]
    /**
      * Creates a {@link StringAsyncHost} for the provided content.
      * @param content The content of the file.
      * @param file The file name for the content.
      * @param hostFallback An optional host to use as a fallback for operations not supported by this host.
      */
    inline def forFile(content: PromiseLike[String]): StringAsyncHost = ^.asInstanceOf[js.Dynamic].applyDynamic("forFile")(content.asInstanceOf[js.Any]).asInstanceOf[StringAsyncHost]
    inline def forFile(content: PromiseLike[String], file: String): StringAsyncHost = (^.asInstanceOf[js.Dynamic].applyDynamic("forFile")(content.asInstanceOf[js.Any], file.asInstanceOf[js.Any])).asInstanceOf[StringAsyncHost]
    inline def forFile(content: PromiseLike[String], file: String, hostFallback: CoreAsyncHost): StringAsyncHost = (^.asInstanceOf[js.Dynamic].applyDynamic("forFile")(content.asInstanceOf[js.Any], file.asInstanceOf[js.Any], hostFallback.asInstanceOf[js.Any])).asInstanceOf[StringAsyncHost]
    inline def forFile(content: PromiseLike[String], file: Unit, hostFallback: CoreAsyncHost): StringAsyncHost = (^.asInstanceOf[js.Dynamic].applyDynamic("forFile")(content.asInstanceOf[js.Any], file.asInstanceOf[js.Any], hostFallback.asInstanceOf[js.Any])).asInstanceOf[StringAsyncHost]
    
    /**
      * Creates a `CoreAsyncHost`.
      * @param options The options used to configure the host.
      * @param hostFallback An optional host to use as a fallback for operations not supported by this host.
      */
    inline def from(custom: CoreAsyncHostOptions): CoreAsyncHost = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(custom.asInstanceOf[js.Any]).asInstanceOf[CoreAsyncHost]
    inline def from(custom: CoreAsyncHostOptions, hostFallback: CoreAsyncHost): CoreAsyncHost = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(custom.asInstanceOf[js.Any], hostFallback.asInstanceOf[js.Any])).asInstanceOf[CoreAsyncHost]
  }
  
  @JSImport("grammarkdown/dist/host", "StringAsyncHost")
  @js.native
  open class StringAsyncHost protected () extends CoreAsyncHost {
    def this(file: String, content: String) = this()
    /**
      * @param file The file name for the content.
      * @param content The content of the file.
      * @param hostFallback An optional host to use as a fallback for operations not supported by this host.
      */
    def this(file: String, content: PromiseLike[String]) = this()
    def this(file: String, content: String, hostFallback: CoreAsyncHost) = this()
    def this(file: String, content: PromiseLike[String], hostFallback: CoreAsyncHost) = this()
    
    /**
      * The content of the file.
      */
    val content: PromiseLike[String] | String = js.native
    
    /**
      * The file name for the content.
      */
    val file: String = js.native
  }
  
  trait CoreAsyncHostOptions extends StObject {
    
    /**
      * Indicates whether the host is case-insensitive (`true`) or case-sensitive (`false`).
      */
    var ignoreCase: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A set of known grammars in the form `{ "name": "path" }`
      */
    var knownGrammars: js.UndefOr[Record[String, String]] = js.undefined
    
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
          js.UndefOr[PromiseLike[js.UndefOr[String]] | String]
        ]
      ] = js.undefined
    
    /**
      * A callback used to control file resolution.
      */
    var resolveFile: js.UndefOr[
        js.ThisFunction3[
          /* this */ Unit, 
          /* file */ String, 
          /* referrer */ js.UndefOr[String], 
          /* fallback */ js.Function2[/* file */ String, /* referrer */ js.UndefOr[String], String], 
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
      * Indicates whether to include builtin grammars in the set of known grammars.
      */
    var useBuiltinGrammars: js.UndefOr[Boolean] = js.undefined
    
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
          PromiseLike[Unit] | Unit
        ]
      ] = js.undefined
  }
  object CoreAsyncHostOptions {
    
    inline def apply(): CoreAsyncHostOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CoreAsyncHostOptions]
    }
    
    extension [Self <: CoreAsyncHostOptions](x: Self) {
      
      inline def setIgnoreCase(value: Boolean): Self = StObject.set(x, "ignoreCase", value.asInstanceOf[js.Any])
      
      inline def setIgnoreCaseUndefined: Self = StObject.set(x, "ignoreCase", js.undefined)
      
      inline def setKnownGrammars(value: Record[String, String]): Self = StObject.set(x, "knownGrammars", value.asInstanceOf[js.Any])
      
      inline def setKnownGrammarsUndefined: Self = StObject.set(x, "knownGrammars", js.undefined)
      
      inline def setNormalizeFile(
        value: js.ThisFunction2[
              /* this */ Unit, 
              /* file */ String, 
              /* fallback */ js.Function1[/* file */ String, String], 
              String
            ]
      ): Self = StObject.set(x, "normalizeFile", value.asInstanceOf[js.Any])
      
      inline def setNormalizeFileUndefined: Self = StObject.set(x, "normalizeFile", js.undefined)
      
      inline def setReadFile(
        value: js.ThisFunction3[
              /* this */ Unit, 
              /* file */ String, 
              /* cancelToken */ js.UndefOr[CancelToken], 
              /* fallback */ js.Function2[
                /* file */ String, 
                /* cancelToken */ js.UndefOr[CancelToken], 
                js.Promise[js.UndefOr[String]]
              ], 
              js.UndefOr[PromiseLike[js.UndefOr[String]] | String]
            ]
      ): Self = StObject.set(x, "readFile", value.asInstanceOf[js.Any])
      
      inline def setReadFileUndefined: Self = StObject.set(x, "readFile", js.undefined)
      
      inline def setResolveFile(
        value: js.ThisFunction3[
              /* this */ Unit, 
              /* file */ String, 
              /* referrer */ js.UndefOr[String], 
              /* fallback */ js.Function2[/* file */ String, /* referrer */ js.UndefOr[String], String], 
              String
            ]
      ): Self = StObject.set(x, "resolveFile", value.asInstanceOf[js.Any])
      
      inline def setResolveFileUndefined: Self = StObject.set(x, "resolveFile", js.undefined)
      
      inline def setResolveKnownGrammar(
        value: js.ThisFunction2[
              /* this */ Unit, 
              /* name */ String, 
              /* fallback */ js.Function1[/* name */ String, js.UndefOr[String]], 
              js.UndefOr[String]
            ]
      ): Self = StObject.set(x, "resolveKnownGrammar", value.asInstanceOf[js.Any])
      
      inline def setResolveKnownGrammarUndefined: Self = StObject.set(x, "resolveKnownGrammar", js.undefined)
      
      inline def setUseBuiltinGrammars(value: Boolean): Self = StObject.set(x, "useBuiltinGrammars", value.asInstanceOf[js.Any])
      
      inline def setUseBuiltinGrammarsUndefined: Self = StObject.set(x, "useBuiltinGrammars", js.undefined)
      
      inline def setWriteFile(
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
              PromiseLike[Unit] | Unit
            ]
      ): Self = StObject.set(x, "writeFile", value.asInstanceOf[js.Any])
      
      inline def setWriteFileUndefined: Self = StObject.set(x, "writeFile", js.undefined)
    }
  }
  
  type ReadFileCallback = js.ThisFunction2[
    /* this */ Unit, 
    /* file */ String, 
    /* cancelToken */ js.UndefOr[CancelToken], 
    js.UndefOr[PromiseLike[js.UndefOr[String]] | String]
  ]
  
  type WriteFileCallback = js.ThisFunction3[
    /* this */ Unit, 
    /* file */ String, 
    /* content */ String, 
    /* cancelToken */ js.UndefOr[CancelToken], 
    PromiseLike[Unit] | Unit
  ]
}

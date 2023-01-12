package typings.jestSnapshot

import typings.expect.anon.readonlyprintExpectedvalu
import typings.expect.mod.MatcherContext
import typings.expect.mod.MatcherFunctionWithContext
import typings.jestExpectUtils.mod.EqualsFunction
import typings.jestHasteMap.mod.IHasteFS
import typings.jestSnapshot.anon.FilesRemoved
import typings.jestTypes.mod.ProjectConfig
import typings.jestTypes.mod.SnapshotUpdateState
import typings.prettyFormat.mod.Plugin2
import typings.prettyFormat.mod.Plugins_
import typings.std.Partial
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("jest-snapshot", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("jest-snapshot", "EXTENSION")
  @js.native
  val EXTENSION: /* "snap" */ String = js.native
  
  @JSImport("jest-snapshot", "SnapshotState")
  @js.native
  open class SnapshotState protected () extends StObject {
    def this(snapshotPath: String, options: SnapshotStateOptions) = this()
    
    /* private */ var _addSnapshot: Any = js.native
    
    /* private */ var _counters: Any = js.native
    
    /* private */ var _dirty: Any = js.native
    
    /* private */ var _index: Any = js.native
    
    /* private */ val _initialData: Any = js.native
    
    /* private */ var _inlineSnapshots: Any = js.native
    
    /* private */ val _prettierPath: Any = js.native
    
    /* private */ val _rootDir: Any = js.native
    
    /* private */ var _snapshotData: Any = js.native
    
    /* private */ val _snapshotPath: Any = js.native
    
    /* private */ val _uncheckedKeys: Any = js.native
    
    /* private */ val _updateSnapshot: Any = js.native
    
    var added: Double = js.native
    
    def clear(): Unit = js.native
    
    var expand: Boolean = js.native
    
    def fail(testName: String, _received: Any): String = js.native
    def fail(testName: String, _received: Any, key: String): String = js.native
    
    def getUncheckedCount(): Double = js.native
    
    def getUncheckedKeys(): js.Array[String] = js.native
    
    def markSnapshotsAsCheckedForTest(testName: String): Unit = js.native
    
    def `match`(param0: SnapshotMatchOptions): SnapshotReturnOptions = js.native
    
    var matched: Double = js.native
    
    def removeUncheckedKeys(): Unit = js.native
    
    def save(): SaveStatus = js.native
    
    val snapshotFormat: SnapshotFormat = js.native
    
    var unmatched: Double = js.native
    
    var updated: Double = js.native
  }
  
  inline def addSerializer(plugin: Plugin2): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addSerializer")(plugin.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def buildSnapshotResolver(config: ProjectConfig): js.Promise[SnapshotResolver] = ^.asInstanceOf[js.Dynamic].applyDynamic("buildSnapshotResolver")(config.asInstanceOf[js.Any]).asInstanceOf[js.Promise[SnapshotResolver]]
  inline def buildSnapshotResolver(config: ProjectConfig, localRequire: js.Promise[LocalRequire]): js.Promise[SnapshotResolver] = (^.asInstanceOf[js.Dynamic].applyDynamic("buildSnapshotResolver")(config.asInstanceOf[js.Any], localRequire.asInstanceOf[js.Any])).asInstanceOf[js.Promise[SnapshotResolver]]
  inline def buildSnapshotResolver(config: ProjectConfig, localRequire: LocalRequire): js.Promise[SnapshotResolver] = (^.asInstanceOf[js.Dynamic].applyDynamic("buildSnapshotResolver")(config.asInstanceOf[js.Any], localRequire.asInstanceOf[js.Any])).asInstanceOf[js.Promise[SnapshotResolver]]
  
  inline def cleanup(hasteFS: IHasteFS, update: SnapshotUpdateState, snapshotResolver: SnapshotResolver): FilesRemoved = (^.asInstanceOf[js.Dynamic].applyDynamic("cleanup")(hasteFS.asInstanceOf[js.Any], update.asInstanceOf[js.Any], snapshotResolver.asInstanceOf[js.Any])).asInstanceOf[FilesRemoved]
  inline def cleanup(
    hasteFS: IHasteFS,
    update: SnapshotUpdateState,
    snapshotResolver: SnapshotResolver,
    testPathIgnorePatterns: js.Array[String]
  ): FilesRemoved = (^.asInstanceOf[js.Dynamic].applyDynamic("cleanup")(hasteFS.asInstanceOf[js.Any], update.asInstanceOf[js.Any], snapshotResolver.asInstanceOf[js.Any], testPathIgnorePatterns.asInstanceOf[js.Any])).asInstanceOf[FilesRemoved]
  
  inline def getSerializers(): Plugins_ = ^.asInstanceOf[js.Dynamic].applyDynamic("getSerializers")().asInstanceOf[Plugins_]
  
  inline def isSnapshotPath(path: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSnapshotPath")(path.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @JSImport("jest-snapshot", "toMatchInlineSnapshot")
  @js.native
  val toMatchInlineSnapshot: MatcherFunctionWithContext[
    Context, 
    js.Tuple2[
      /* propertiesOrSnapshot */ js.UndefOr[js.Object | String], 
      /* inlineSnapshot */ js.UndefOr[String]
    ]
  ] = js.native
  
  @JSImport("jest-snapshot", "toMatchSnapshot")
  @js.native
  val toMatchSnapshot: MatcherFunctionWithContext[
    Context, 
    js.Tuple2[
      /* propertiesOrHint */ js.UndefOr[js.Object | String], 
      /* hint */ js.UndefOr[String]
    ]
  ] = js.native
  
  @JSImport("jest-snapshot", "toThrowErrorMatchingInlineSnapshot")
  @js.native
  val toThrowErrorMatchingInlineSnapshot: MatcherFunctionWithContext[
    Context, 
    js.Tuple2[/* inlineSnapshot */ js.UndefOr[String], /* fromPromise */ js.UndefOr[Boolean]]
  ] = js.native
  
  @JSImport("jest-snapshot", "toThrowErrorMatchingSnapshot")
  @js.native
  val toThrowErrorMatchingSnapshot: MatcherFunctionWithContext[
    Context, 
    js.Tuple2[/* hint */ js.UndefOr[String], /* fromPromise */ js.UndefOr[Boolean]]
  ] = js.native
  
  trait Context
    extends StObject
       with MatcherContext {
    
    var snapshotState: SnapshotState
  }
  object Context {
    
    inline def apply(
      assertionCalls: Double,
      dontThrow: () => Unit,
      equals_ : EqualsFunction,
      isExpectingAssertions: Boolean,
      snapshotState: SnapshotState,
      suppressedErrors: js.Array[js.Error],
      utils: readonlyprintExpectedvalu
    ): Context = {
      val __obj = js.Dynamic.literal(assertionCalls = assertionCalls.asInstanceOf[js.Any], dontThrow = js.Any.fromFunction0(dontThrow), isExpectingAssertions = isExpectingAssertions.asInstanceOf[js.Any], snapshotState = snapshotState.asInstanceOf[js.Any], suppressedErrors = suppressedErrors.asInstanceOf[js.Any], utils = utils.asInstanceOf[js.Any])
      __obj.updateDynamic("equals")(equals_.asInstanceOf[js.Any])
      __obj.asInstanceOf[Context]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Context] (val x: Self) extends AnyVal {
      
      inline def setSnapshotState(value: SnapshotState): Self = StObject.set(x, "snapshotState", value.asInstanceOf[js.Any])
    }
  }
  
  type LocalRequire = js.Function1[/* module */ String, Any]
  
  trait SaveStatus extends StObject {
    
    var deleted: Boolean
    
    var saved: Boolean
  }
  object SaveStatus {
    
    inline def apply(deleted: Boolean, saved: Boolean): SaveStatus = {
      val __obj = js.Dynamic.literal(deleted = deleted.asInstanceOf[js.Any], saved = saved.asInstanceOf[js.Any])
      __obj.asInstanceOf[SaveStatus]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SaveStatus] (val x: Self) extends AnyVal {
      
      inline def setDeleted(value: Boolean): Self = StObject.set(x, "deleted", value.asInstanceOf[js.Any])
      
      inline def setSaved(value: Boolean): Self = StObject.set(x, "saved", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Omit<pretty-format.pretty-format.PrettyFormatOptions, 'compareKeys'> */
  trait SnapshotFormat extends StObject {
    
    var plugins: js.UndefOr[Plugins_] = js.undefined
  }
  object SnapshotFormat {
    
    inline def apply(): SnapshotFormat = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SnapshotFormat]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SnapshotFormat] (val x: Self) extends AnyVal {
      
      inline def setPlugins(value: Plugins_): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      inline def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
      
      inline def setPluginsVarargs(value: Plugin2*): Self = StObject.set(x, "plugins", js.Array(value*))
    }
  }
  
  trait SnapshotMatchOptions extends StObject {
    
    val error: js.UndefOr[js.Error] = js.undefined
    
    val inlineSnapshot: js.UndefOr[String] = js.undefined
    
    val isInline: Boolean
    
    val key: js.UndefOr[String] = js.undefined
    
    val received: Any
    
    val testName: String
  }
  object SnapshotMatchOptions {
    
    inline def apply(isInline: Boolean, received: Any, testName: String): SnapshotMatchOptions = {
      val __obj = js.Dynamic.literal(isInline = isInline.asInstanceOf[js.Any], received = received.asInstanceOf[js.Any], testName = testName.asInstanceOf[js.Any])
      __obj.asInstanceOf[SnapshotMatchOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SnapshotMatchOptions] (val x: Self) extends AnyVal {
      
      inline def setError(value: js.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setInlineSnapshot(value: String): Self = StObject.set(x, "inlineSnapshot", value.asInstanceOf[js.Any])
      
      inline def setInlineSnapshotUndefined: Self = StObject.set(x, "inlineSnapshot", js.undefined)
      
      inline def setIsInline(value: Boolean): Self = StObject.set(x, "isInline", value.asInstanceOf[js.Any])
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setReceived(value: Any): Self = StObject.set(x, "received", value.asInstanceOf[js.Any])
      
      inline def setTestName(value: String): Self = StObject.set(x, "testName", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SnapshotMatchers[R /* <: Unit | js.Promise[Unit] */, T] extends StObject {
    
    /**
      * This ensures that a value matches the most recent snapshot with property matchers.
      * Instead of writing the snapshot value to a .snap file, it will be written into the source code automatically.
      * Check out [the Snapshot Testing guide](https://jestjs.io/docs/snapshot-testing) for more information.
      */
    def toMatchInlineSnapshot(): R = js.native
    def toMatchInlineSnapshot(snapshot: String): R = js.native
    /**
      * This ensures that a value matches the most recent snapshot with property matchers.
      * Instead of writing the snapshot value to a .snap file, it will be written into the source code automatically.
      * Check out [the Snapshot Testing guide](https://jestjs.io/docs/snapshot-testing) for more information.
      */
    def toMatchInlineSnapshot[U /* <: Record[/* keyof T */ String, Any] */](propertyMatchers: Partial[U]): R = js.native
    def toMatchInlineSnapshot[U /* <: Record[/* keyof T */ String, Any] */](propertyMatchers: Partial[U], snapshot: String): R = js.native
    
    /**
      * This ensures that a value matches the most recent snapshot with property matchers.
      * Check out [the Snapshot Testing guide](https://jestjs.io/docs/snapshot-testing) for more information.
      */
    def toMatchSnapshot(): R = js.native
    def toMatchSnapshot(hint: String): R = js.native
    /**
      * This ensures that a value matches the most recent snapshot.
      * Check out [the Snapshot Testing guide](https://jestjs.io/docs/snapshot-testing) for more information.
      */
    def toMatchSnapshot[U /* <: Record[/* keyof T */ String, Any] */](propertyMatchers: Partial[U]): R = js.native
    def toMatchSnapshot[U /* <: Record[/* keyof T */ String, Any] */](propertyMatchers: Partial[U], hint: String): R = js.native
    
    /**
      * Used to test that a function throws a error matching the most recent snapshot when it is called.
      * Instead of writing the snapshot value to a .snap file, it will be written into the source code automatically.
      */
    def toThrowErrorMatchingInlineSnapshot(): R = js.native
    def toThrowErrorMatchingInlineSnapshot(snapshot: String): R = js.native
    
    /**
      * Used to test that a function throws a error matching the most recent snapshot when it is called.
      */
    def toThrowErrorMatchingSnapshot(): R = js.native
    def toThrowErrorMatchingSnapshot(hint: String): R = js.native
  }
  
  @js.native
  trait SnapshotResolver extends StObject {
    
    /** Resolves from `testPath` to snapshot path. */
    def resolveSnapshotPath(testPath: String): String = js.native
    def resolveSnapshotPath(testPath: String, snapshotExtension: String): String = js.native
    
    /** Resolves from `snapshotPath` to test path. */
    def resolveTestPath(snapshotPath: String): String = js.native
    def resolveTestPath(snapshotPath: String, snapshotExtension: String): String = js.native
    
    /** Example test path, used for preflight consistency check of the implementation above. */
    var testPathForConsistencyCheck: String = js.native
  }
  
  trait SnapshotReturnOptions extends StObject {
    
    val actual: String
    
    val count: Double
    
    val expected: js.UndefOr[String] = js.undefined
    
    val key: String
    
    val pass: Boolean
  }
  object SnapshotReturnOptions {
    
    inline def apply(actual: String, count: Double, key: String, pass: Boolean): SnapshotReturnOptions = {
      val __obj = js.Dynamic.literal(actual = actual.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], pass = pass.asInstanceOf[js.Any])
      __obj.asInstanceOf[SnapshotReturnOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SnapshotReturnOptions] (val x: Self) extends AnyVal {
      
      inline def setActual(value: String): Self = StObject.set(x, "actual", value.asInstanceOf[js.Any])
      
      inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      inline def setExpected(value: String): Self = StObject.set(x, "expected", value.asInstanceOf[js.Any])
      
      inline def setExpectedUndefined: Self = StObject.set(x, "expected", js.undefined)
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setPass(value: Boolean): Self = StObject.set(x, "pass", value.asInstanceOf[js.Any])
    }
  }
  
  trait SnapshotStateOptions extends StObject {
    
    val expand: js.UndefOr[Boolean] = js.undefined
    
    val prettierPath: js.UndefOr[String | Null] = js.undefined
    
    val rootDir: String
    
    val snapshotFormat: SnapshotFormat
    
    val updateSnapshot: SnapshotUpdateState
  }
  object SnapshotStateOptions {
    
    inline def apply(rootDir: String, snapshotFormat: SnapshotFormat, updateSnapshot: SnapshotUpdateState): SnapshotStateOptions = {
      val __obj = js.Dynamic.literal(rootDir = rootDir.asInstanceOf[js.Any], snapshotFormat = snapshotFormat.asInstanceOf[js.Any], updateSnapshot = updateSnapshot.asInstanceOf[js.Any])
      __obj.asInstanceOf[SnapshotStateOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SnapshotStateOptions] (val x: Self) extends AnyVal {
      
      inline def setExpand(value: Boolean): Self = StObject.set(x, "expand", value.asInstanceOf[js.Any])
      
      inline def setExpandUndefined: Self = StObject.set(x, "expand", js.undefined)
      
      inline def setPrettierPath(value: String): Self = StObject.set(x, "prettierPath", value.asInstanceOf[js.Any])
      
      inline def setPrettierPathNull: Self = StObject.set(x, "prettierPath", null)
      
      inline def setPrettierPathUndefined: Self = StObject.set(x, "prettierPath", js.undefined)
      
      inline def setRootDir(value: String): Self = StObject.set(x, "rootDir", value.asInstanceOf[js.Any])
      
      inline def setSnapshotFormat(value: SnapshotFormat): Self = StObject.set(x, "snapshotFormat", value.asInstanceOf[js.Any])
      
      inline def setUpdateSnapshot(value: SnapshotUpdateState): Self = StObject.set(x, "updateSnapshot", value.asInstanceOf[js.Any])
    }
  }
}

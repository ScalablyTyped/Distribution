package typings.jestRunner

import typings.jestRunner.jestRunnerBooleans.`true`
import typings.jestRunner.jestRunnerStrings.`test-case-result`
import typings.jestRunner.jestRunnerStrings.`test-file-failure`
import typings.jestRunner.jestRunnerStrings.`test-file-start`
import typings.jestRunner.jestRunnerStrings.`test-file-success`
import typings.jestTestResult.mod.AssertionResult
import typings.jestTestResult.mod.SerializableError
import typings.jestTestResult.mod.Test
import typings.jestTestResult.mod.TestResult
import typings.jestTypes.mod.GlobalConfig
import typings.jestWatcher.anon.IsWatchMode
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("jest-runner", JSImport.Default)
  @js.native
  open class default () extends TestRunner
  
  @JSImport("jest-runner", "CallbackTestRunner")
  @js.native
  abstract class CallbackTestRunner ()
    extends StObject
       with BaseTestRunner
       with CallbackTestRunnerInterface
       with JestTestRunner {
    
    /* protected */ /* CompleteClass */
    override val _context: TestRunnerContext = js.native
    
    /* protected */ /* CompleteClass */
    override val _globalConfig: GlobalConfig = js.native
    
    /* InferMemberOverrides */
    override val isSerial: js.UndefOr[Boolean] = js.native
    
    /* CompleteClass */
    override def runTests(
      tests: js.Array[Test],
      watcher: typings.jestWatcher.mod.TestWatcher,
      onStart: OnTestStart,
      onResult: OnTestSuccess,
      onFailure: OnTestFailure,
      options: TestRunnerOptions
    ): js.Promise[Unit] = js.native
    
    /* InferMemberOverrides */
    override val supportsEventEmitters: js.UndefOr[Boolean] & Boolean = js.native
  }
  
  @JSImport("jest-runner", "EmittingTestRunner")
  @js.native
  abstract class EmittingTestRunner ()
    extends StObject
       with BaseTestRunner
       with EmittingTestRunnerInterface
       with JestTestRunner {
    
    /* protected */ /* CompleteClass */
    override val _context: TestRunnerContext = js.native
    
    /* protected */ /* CompleteClass */
    override val _globalConfig: GlobalConfig = js.native
    
    /* InferMemberOverrides */
    override val isSerial: js.UndefOr[Boolean] = js.native
    
    /* InferMemberOverrides */
    override val supportsEventEmitters: `true` & Boolean = js.native
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Emittery<{  change :State}> * / any */ @JSImport("jest-runner", "TestWatcher")
  @js.native
  open class TestWatcher protected ()
    extends typings.jestWatcher.mod.TestWatcher {
    def this(hasIsWatchMode: IsWatchMode) = this()
  }
  
  trait BaseTestRunner extends StObject {
    
    /* protected */ val _context: TestRunnerContext
    
    /* protected */ val _globalConfig: GlobalConfig
    
    val isSerial: js.UndefOr[Boolean] = js.undefined
    
    val supportsEventEmitters: Boolean
  }
  object BaseTestRunner {
    
    inline def apply(_context: TestRunnerContext, _globalConfig: GlobalConfig, supportsEventEmitters: Boolean): BaseTestRunner = {
      val __obj = js.Dynamic.literal(_context = _context.asInstanceOf[js.Any], _globalConfig = _globalConfig.asInstanceOf[js.Any], supportsEventEmitters = supportsEventEmitters.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaseTestRunner]
    }
    
    extension [Self <: BaseTestRunner](x: Self) {
      
      inline def setIsSerial(value: Boolean): Self = StObject.set(x, "isSerial", value.asInstanceOf[js.Any])
      
      inline def setIsSerialUndefined: Self = StObject.set(x, "isSerial", js.undefined)
      
      inline def setSupportsEventEmitters(value: Boolean): Self = StObject.set(x, "supportsEventEmitters", value.asInstanceOf[js.Any])
      
      inline def set_context(value: TestRunnerContext): Self = StObject.set(x, "_context", value.asInstanceOf[js.Any])
      
      inline def set_globalConfig(value: GlobalConfig): Self = StObject.set(x, "_globalConfig", value.asInstanceOf[js.Any])
    }
  }
  
  trait CallbackTestRunnerInterface extends StObject {
    
    val isSerial: js.UndefOr[Boolean] = js.undefined
    
    def runTests(
      tests: js.Array[Test],
      watcher: typings.jestWatcher.mod.TestWatcher,
      onStart: OnTestStart,
      onResult: OnTestSuccess,
      onFailure: OnTestFailure,
      options: TestRunnerOptions
    ): js.Promise[Unit]
    
    val supportsEventEmitters: js.UndefOr[Boolean] = js.undefined
  }
  object CallbackTestRunnerInterface {
    
    inline def apply(
      runTests: (js.Array[Test], typings.jestWatcher.mod.TestWatcher, OnTestStart, OnTestSuccess, OnTestFailure, TestRunnerOptions) => js.Promise[Unit]
    ): CallbackTestRunnerInterface = {
      val __obj = js.Dynamic.literal(runTests = js.Any.fromFunction6(runTests))
      __obj.asInstanceOf[CallbackTestRunnerInterface]
    }
    
    extension [Self <: CallbackTestRunnerInterface](x: Self) {
      
      inline def setIsSerial(value: Boolean): Self = StObject.set(x, "isSerial", value.asInstanceOf[js.Any])
      
      inline def setIsSerialUndefined: Self = StObject.set(x, "isSerial", js.undefined)
      
      inline def setRunTests(
        value: (js.Array[Test], typings.jestWatcher.mod.TestWatcher, OnTestStart, OnTestSuccess, OnTestFailure, TestRunnerOptions) => js.Promise[Unit]
      ): Self = StObject.set(x, "runTests", js.Any.fromFunction6(value))
      
      inline def setSupportsEventEmitters(value: Boolean): Self = StObject.set(x, "supportsEventEmitters", value.asInstanceOf[js.Any])
      
      inline def setSupportsEventEmittersUndefined: Self = StObject.set(x, "supportsEventEmitters", js.undefined)
    }
  }
  
  @js.native
  trait EmittingTestRunnerInterface extends StObject {
    
    val isSerial: js.UndefOr[Boolean] = js.native
    
    @JSName("on")
    def on_testcaseresult(
      eventName: `test-case-result`,
      listener: js.Function1[/* eventData */ js.Tuple2[String, AssertionResult], Unit | js.Promise[Unit]]
    ): UnsubscribeFn = js.native
    @JSName("on")
    def on_testfilefailure(
      eventName: `test-file-failure`,
      listener: js.Function1[/* eventData */ js.Tuple2[Test, SerializableError], Unit | js.Promise[Unit]]
    ): UnsubscribeFn = js.native
    @JSName("on")
    def on_testfilestart(
      eventName: `test-file-start`,
      listener: js.Function1[/* eventData */ js.Array[Test], Unit | js.Promise[Unit]]
    ): UnsubscribeFn = js.native
    @JSName("on")
    def on_testfilesuccess(
      eventName: `test-file-success`,
      listener: js.Function1[/* eventData */ js.Tuple2[Test, TestResult], Unit | js.Promise[Unit]]
    ): UnsubscribeFn = js.native
    
    def runTests(tests: js.Array[Test], watcher: typings.jestWatcher.mod.TestWatcher, options: TestRunnerOptions): js.Promise[Unit] = js.native
    
    val supportsEventEmitters: `true` = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.jestRunner.mod.CallbackTestRunner
    - typings.jestRunner.mod.EmittingTestRunner
  */
  trait JestTestRunner extends StObject
  
  type OnTestFailure = js.Function2[/* test */ Test, /* serializableError */ SerializableError, js.Promise[Unit]]
  
  type OnTestStart = js.Function1[/* test */ Test, js.Promise[Unit]]
  
  type OnTestSuccess = js.Function2[/* test */ Test, /* testResult */ TestResult, js.Promise[Unit]]
  
  @js.native
  trait TestRunner extends EmittingTestRunner {
    
    /* private */ var `private`: Any = js.native
  }
  
  trait TestRunnerContext extends StObject {
    
    var changedFiles: js.UndefOr[Set[String]] = js.undefined
    
    var sourcesRelatedToTestsInChangedFiles: js.UndefOr[Set[String]] = js.undefined
  }
  object TestRunnerContext {
    
    inline def apply(): TestRunnerContext = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TestRunnerContext]
    }
    
    extension [Self <: TestRunnerContext](x: Self) {
      
      inline def setChangedFiles(value: Set[String]): Self = StObject.set(x, "changedFiles", value.asInstanceOf[js.Any])
      
      inline def setChangedFilesUndefined: Self = StObject.set(x, "changedFiles", js.undefined)
      
      inline def setSourcesRelatedToTestsInChangedFiles(value: Set[String]): Self = StObject.set(x, "sourcesRelatedToTestsInChangedFiles", value.asInstanceOf[js.Any])
      
      inline def setSourcesRelatedToTestsInChangedFilesUndefined: Self = StObject.set(x, "sourcesRelatedToTestsInChangedFiles", js.undefined)
    }
  }
  
  trait TestRunnerOptions extends StObject {
    
    var serial: Boolean
  }
  object TestRunnerOptions {
    
    inline def apply(serial: Boolean): TestRunnerOptions = {
      val __obj = js.Dynamic.literal(serial = serial.asInstanceOf[js.Any])
      __obj.asInstanceOf[TestRunnerOptions]
    }
    
    extension [Self <: TestRunnerOptions](x: Self) {
      
      inline def setSerial(value: Boolean): Self = StObject.set(x, "serial", value.asInstanceOf[js.Any])
    }
  }
  
  type UnsubscribeFn = js.Function0[Unit]
}

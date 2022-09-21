package typings.lab

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("lab", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("lab", "assertions")
  @js.native
  val assertions: Any = js.native
  
  inline def script(): Lab & ExperimentAlt & TestAlt = ^.asInstanceOf[js.Dynamic].applyDynamic("script")().asInstanceOf[Lab & ExperimentAlt & TestAlt]
  inline def script(options: ScriptOptions): Lab & ExperimentAlt & TestAlt = ^.asInstanceOf[js.Dynamic].applyDynamic("script")(options.asInstanceOf[js.Any]).asInstanceOf[Lab & ExperimentAlt & TestAlt]
  
  type AsyncCallback = js.Function1[/* done */ DoneFunction, Unit]
  
  trait AsyncOptions extends StObject {
    
    /** Set a specific timeout in milliseconds (disabled) */
    var timeout: js.UndefOr[Double] = js.undefined
  }
  object AsyncOptions {
    
    inline def apply(): AsyncOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AsyncOptions]
    }
    
    extension [Self <: AsyncOptions](x: Self) {
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  type AsyncPromise = js.Function0[js.Promise[Any]]
  
  type CleanupFunction = js.Function1[/* func */ js.Function1[/* next */ js.Function, Unit], Unit]
  
  type DoneFunction = js.Function1[/* err */ js.UndefOr[js.Error], Unit]
  
  trait DoneNote extends StObject {
    
    /** Attach a note to the test case */
    def note(text: String): Unit
  }
  object DoneNote {
    
    inline def apply(note: String => Unit): DoneNote = {
      val __obj = js.Dynamic.literal(note = js.Any.fromFunction1(note))
      __obj.asInstanceOf[DoneNote]
    }
    
    extension [Self <: DoneNote](x: Self) {
      
      inline def setNote(value: String => Unit): Self = StObject.set(x, "note", js.Any.fromFunction1(value))
    }
  }
  
  type EmptyCallback = js.Function0[Unit]
  
  trait ExperimentAlt extends StObject {
    
    var describe: SkipOnlyExperiment
    
    var experiment: SkipOnlyExperiment
    
    var suite: SkipOnlyExperiment
  }
  object ExperimentAlt {
    
    inline def apply(describe: SkipOnlyExperiment, experiment: SkipOnlyExperiment, suite: SkipOnlyExperiment): ExperimentAlt = {
      val __obj = js.Dynamic.literal(describe = describe.asInstanceOf[js.Any], experiment = experiment.asInstanceOf[js.Any], suite = suite.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExperimentAlt]
    }
    
    extension [Self <: ExperimentAlt](x: Self) {
      
      inline def setDescribe(value: SkipOnlyExperiment): Self = StObject.set(x, "describe", value.asInstanceOf[js.Any])
      
      inline def setExperiment(value: SkipOnlyExperiment): Self = StObject.set(x, "experiment", value.asInstanceOf[js.Any])
      
      inline def setSuite(value: SkipOnlyExperiment): Self = StObject.set(x, "suite", value.asInstanceOf[js.Any])
    }
  }
  
  type ExperimentArgs = js.Function2[/* desc */ String, /* cb */ EmptyCallback, js.Object]
  
  trait ExperimentOptions extends StObject {
    
    /** Execute only this test/experiment? (false) */
    var only: js.UndefOr[Boolean] = js.undefined
    
    /** Execute tests in parallel? (false) */
    var parallel: js.UndefOr[Boolean] = js.undefined
    
    /** Skip execution? (false) */
    var skip: js.UndefOr[Boolean] = js.undefined
    
    /** Set a specific timeout in milliseconds (2000) */
    var timeout: js.UndefOr[Double] = js.undefined
  }
  object ExperimentOptions {
    
    inline def apply(): ExperimentOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExperimentOptions]
    }
    
    extension [Self <: ExperimentOptions](x: Self) {
      
      inline def setOnly(value: Boolean): Self = StObject.set(x, "only", value.asInstanceOf[js.Any])
      
      inline def setOnlyUndefined: Self = StObject.set(x, "only", js.undefined)
      
      inline def setParallel(value: Boolean): Self = StObject.set(x, "parallel", value.asInstanceOf[js.Any])
      
      inline def setParallelUndefined: Self = StObject.set(x, "parallel", js.undefined)
      
      inline def setSkip(value: Boolean): Self = StObject.set(x, "skip", value.asInstanceOf[js.Any])
      
      inline def setSkipUndefined: Self = StObject.set(x, "skip", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  type ExperimentWithOptionsArgs = js.Function3[/* desc */ String, /* options */ ExperimentOptions, /* cb */ EmptyCallback, js.Object]
  
  @js.native
  trait Lab extends StObject {
    
    /** Perform async actions after the test suite */
    def after(cb: AsyncCallback): Unit = js.native
    /** Perform async actions after the test suite with options */
    def after(options: AsyncOptions, cb: AsyncCallback): Unit = js.native
    /** Perform async actions after the test suite with options, using a promise */
    def after(options: AsyncOptions, promise: AsyncPromise): Unit = js.native
    /** Perform async actions after the test suite using a promise */
    def after(promise: AsyncPromise): Unit = js.native
    
    /** Perform async actions after each test */
    def afterEach(cb: AsyncCallback): Unit = js.native
    /** Perform async actions after each test with options */
    def afterEach(options: AsyncOptions, cb: AsyncCallback): Unit = js.native
    /** Perform async actions after each test with options, using a promise */
    def afterEach(options: AsyncOptions, promise: AsyncPromise): Unit = js.native
    /** Perform async actions after each test using a promise */
    def afterEach(promise: AsyncPromise): Unit = js.native
    
    /** Perform async actions before the test suite */
    def before(cb: AsyncCallback): Unit = js.native
    /** Perform async actions before the test suite with options */
    def before(options: AsyncOptions, cb: AsyncCallback): Unit = js.native
    /** Perform async actions before the test suite with otions, using a promise */
    def before(options: AsyncOptions, promise: AsyncPromise): Unit = js.native
    /** Perform async actions before the test suite using a promise */
    def before(promise: AsyncPromise): Unit = js.native
    
    /** Perform async actions before each test */
    def beforeEach(cb: AsyncCallback): Unit = js.native
    /** Perform async actions before each test with options */
    def beforeEach(options: AsyncOptions, cb: AsyncCallback): Unit = js.native
    /** Perform async actions before each test with options, using a promise */
    def beforeEach(options: AsyncOptions, promise: AsyncPromise): Unit = js.native
    /** Perform async actions before each test using a promise */
    def beforeEach(promise: AsyncPromise): Unit = js.native
    
    /** Create a test suite */
    def describe(desc: String, cb: EmptyCallback): Unit = js.native
    /** Create a test suite with options */
    def describe(desc: String, options: ExperimentOptions, cb: EmptyCallback): Unit = js.native
    
    /** Organise tests into an experiment */
    def experiment(desc: String, cb: EmptyCallback): Unit = js.native
    /** Organise tests into an experiment with options */
    def experiment(desc: String, options: ExperimentOptions, cb: EmptyCallback): Unit = js.native
    
    /** The test spec */
    def it(desc: String, cb: TestCallback): Unit = js.native
    /** The test spec with options */
    def it(desc: String, options: TestOptions, cb: TestCallback): Unit = js.native
    /** The test spec using a promise with options */
    def it(desc: String, options: TestOptions, promise: TestPromise): Unit = js.native
    /** The test spec using a promise */
    def it(desc: String, promise: TestPromise): Unit = js.native
    
    /** Create a test suite */
    def suite(desc: String, cb: EmptyCallback): Unit = js.native
    /** Create a test suite with options */
    def suite(desc: String, options: ExperimentOptions, cb: EmptyCallback): Unit = js.native
    
    /** The test spec */
    def test(desc: String, cb: TestCallback): Unit = js.native
    /** The test spec with options */
    def test(desc: String, options: TestOptions, cb: TestCallback): Unit = js.native
    /** The test spec using a promise with options */
    def test(desc: String, options: TestOptions, promise: TestPromise): Unit = js.native
    /** The test spec using a promise */
    def test(desc: String, promise: TestPromise): Unit = js.native
  }
  
  trait ScriptOptions extends StObject {
    
    /** Pass Lab CLI options */
    var cli: js.UndefOr[Any] = js.undefined
    
    /** Enable auto-execution of the script? (true) */
    var schedule: js.UndefOr[Boolean] = js.undefined
  }
  object ScriptOptions {
    
    inline def apply(): ScriptOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ScriptOptions]
    }
    
    extension [Self <: ScriptOptions](x: Self) {
      
      inline def setCli(value: Any): Self = StObject.set(x, "cli", value.asInstanceOf[js.Any])
      
      inline def setCliUndefined: Self = StObject.set(x, "cli", js.undefined)
      
      inline def setSchedule(value: Boolean): Self = StObject.set(x, "schedule", value.asInstanceOf[js.Any])
      
      inline def setScheduleUndefined: Self = StObject.set(x, "schedule", js.undefined)
    }
  }
  
  trait SkipOnlyExperiment extends StObject {
    
    /** Only execute this test suite */
    def only(desc: String, cb: EmptyCallback): js.Object
    /** Only execute this test suite */
    def only(desc: String, options: ExperimentOptions, cb: EmptyCallback): js.Object
    /** Only execute this test suite */
    @JSName("only")
    var only_Original: ExperimentArgs & ExperimentWithOptionsArgs
    
    /** Skip this test suite */
    def skip(desc: String, cb: EmptyCallback): js.Object
    /** Skip this test suite */
    def skip(desc: String, options: ExperimentOptions, cb: EmptyCallback): js.Object
    /** Skip this test suite */
    @JSName("skip")
    var skip_Original: ExperimentArgs & ExperimentWithOptionsArgs
  }
  object SkipOnlyExperiment {
    
    inline def apply(only: ExperimentArgs & ExperimentWithOptionsArgs, skip: ExperimentArgs & ExperimentWithOptionsArgs): SkipOnlyExperiment = {
      val __obj = js.Dynamic.literal(only = only.asInstanceOf[js.Any], skip = skip.asInstanceOf[js.Any])
      __obj.asInstanceOf[SkipOnlyExperiment]
    }
    
    extension [Self <: SkipOnlyExperiment](x: Self) {
      
      inline def setOnly(value: ExperimentArgs & ExperimentWithOptionsArgs): Self = StObject.set(x, "only", value.asInstanceOf[js.Any])
      
      inline def setSkip(value: ExperimentArgs & ExperimentWithOptionsArgs): Self = StObject.set(x, "skip", value.asInstanceOf[js.Any])
    }
  }
  
  trait SkipOnlyTest extends StObject {
    
    /** Only execute this test */
    def only(desc: String, cb: TestCallback): js.Object
    /** Only execute this test */
    def only(desc: String, options: TestOptions, cb: TestCallback): js.Object
    /** Only execute this test */
    @JSName("only")
    var only_Original: TestArgs & TestWithOptionsArgs
    
    /** Skip this test */
    def skip(desc: String, cb: TestCallback): js.Object
    /** Skip this test */
    def skip(desc: String, options: TestOptions, cb: TestCallback): js.Object
    /** Skip this test */
    @JSName("skip")
    var skip_Original: TestArgs & TestWithOptionsArgs
  }
  object SkipOnlyTest {
    
    inline def apply(only: TestArgs & TestWithOptionsArgs, skip: TestArgs & TestWithOptionsArgs): SkipOnlyTest = {
      val __obj = js.Dynamic.literal(only = only.asInstanceOf[js.Any], skip = skip.asInstanceOf[js.Any])
      __obj.asInstanceOf[SkipOnlyTest]
    }
    
    extension [Self <: SkipOnlyTest](x: Self) {
      
      inline def setOnly(value: TestArgs & TestWithOptionsArgs): Self = StObject.set(x, "only", value.asInstanceOf[js.Any])
      
      inline def setSkip(value: TestArgs & TestWithOptionsArgs): Self = StObject.set(x, "skip", value.asInstanceOf[js.Any])
    }
  }
  
  trait TestAlt extends StObject {
    
    var it: SkipOnlyTest
    
    var test: SkipOnlyTest
  }
  object TestAlt {
    
    inline def apply(it: SkipOnlyTest, test: SkipOnlyTest): TestAlt = {
      val __obj = js.Dynamic.literal(it = it.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
      __obj.asInstanceOf[TestAlt]
    }
    
    extension [Self <: TestAlt](x: Self) {
      
      inline def setIt(value: SkipOnlyTest): Self = StObject.set(x, "it", value.asInstanceOf[js.Any])
      
      inline def setTest(value: SkipOnlyTest): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
    }
  }
  
  type TestArgs = js.Function2[/* desc */ String, /* cb */ TestCallback, js.Object]
  
  type TestCallback = js.Function2[
    /* done */ DoneFunction & DoneNote, 
    /* onCleanup */ js.UndefOr[CleanupFunction], 
    Unit
  ]
  
  trait TestOptions
    extends StObject
       with ExperimentOptions {
    
    /** The expected number of assertions to execute */
    var plan: js.UndefOr[Double] = js.undefined
  }
  object TestOptions {
    
    inline def apply(): TestOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TestOptions]
    }
    
    extension [Self <: TestOptions](x: Self) {
      
      inline def setPlan(value: Double): Self = StObject.set(x, "plan", value.asInstanceOf[js.Any])
      
      inline def setPlanUndefined: Self = StObject.set(x, "plan", js.undefined)
    }
  }
  
  type TestPromise = js.Function0[js.Promise[Any]]
  
  type TestWithOptionsArgs = js.Function3[/* desc */ String, /* options */ TestOptions, /* cb */ TestCallback, js.Object]
}

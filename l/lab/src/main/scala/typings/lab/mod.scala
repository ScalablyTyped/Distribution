package typings.lab

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("lab", "assertions")
  @js.native
  val assertions: js.Any = js.native
  
  @JSImport("lab", "script")
  @js.native
  def script(): Lab with ExperimentAlt with TestAlt = js.native
  @JSImport("lab", "script")
  @js.native
  def script(options: ScriptOptions): Lab with ExperimentAlt with TestAlt = js.native
  
  type AsyncCallback = js.Function1[/* done */ DoneFunction, Unit]
  
  @js.native
  trait AsyncOptions extends StObject {
    
    /** Set a specific timeout in milliseconds (disabled) */
    var timeout: js.UndefOr[Double] = js.native
  }
  object AsyncOptions {
    
    @scala.inline
    def apply(): AsyncOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AsyncOptions]
    }
    
    @scala.inline
    implicit class AsyncOptionsMutableBuilder[Self <: AsyncOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  type AsyncPromise = js.Function0[js.Promise[js.Any]]
  
  type CleanupFunction = js.Function1[/* func */ js.Function1[/* next */ js.Function, Unit], Unit]
  
  type DoneFunction = js.Function1[/* err */ js.UndefOr[Error], Unit]
  
  @js.native
  trait DoneNote extends StObject {
    
    /** Attach a note to the test case */
    def note(text: String): Unit = js.native
  }
  object DoneNote {
    
    @scala.inline
    def apply(note: String => Unit): DoneNote = {
      val __obj = js.Dynamic.literal(note = js.Any.fromFunction1(note))
      __obj.asInstanceOf[DoneNote]
    }
    
    @scala.inline
    implicit class DoneNoteMutableBuilder[Self <: DoneNote] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNote(value: String => Unit): Self = StObject.set(x, "note", js.Any.fromFunction1(value))
    }
  }
  
  type EmptyCallback = js.Function0[Unit]
  
  @js.native
  trait ExperimentAlt extends StObject {
    
    var describe: SkipOnlyExperiment = js.native
    
    var experiment: SkipOnlyExperiment = js.native
    
    var suite: SkipOnlyExperiment = js.native
  }
  object ExperimentAlt {
    
    @scala.inline
    def apply(describe: SkipOnlyExperiment, experiment: SkipOnlyExperiment, suite: SkipOnlyExperiment): ExperimentAlt = {
      val __obj = js.Dynamic.literal(describe = describe.asInstanceOf[js.Any], experiment = experiment.asInstanceOf[js.Any], suite = suite.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExperimentAlt]
    }
    
    @scala.inline
    implicit class ExperimentAltMutableBuilder[Self <: ExperimentAlt] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDescribe(value: SkipOnlyExperiment): Self = StObject.set(x, "describe", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExperiment(value: SkipOnlyExperiment): Self = StObject.set(x, "experiment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuite(value: SkipOnlyExperiment): Self = StObject.set(x, "suite", value.asInstanceOf[js.Any])
    }
  }
  
  type ExperimentArgs = js.Function2[/* desc */ String, /* cb */ EmptyCallback, js.Object]
  
  @js.native
  trait ExperimentOptions extends StObject {
    
    /** Execute only this test/experiment? (false) */
    var only: js.UndefOr[Boolean] = js.native
    
    /** Execute tests in parallel? (false) */
    var parallel: js.UndefOr[Boolean] = js.native
    
    /** Skip execution? (false) */
    var skip: js.UndefOr[Boolean] = js.native
    
    /** Set a specific timeout in milliseconds (2000) */
    var timeout: js.UndefOr[Double] = js.native
  }
  object ExperimentOptions {
    
    @scala.inline
    def apply(): ExperimentOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExperimentOptions]
    }
    
    @scala.inline
    implicit class ExperimentOptionsMutableBuilder[Self <: ExperimentOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnly(value: Boolean): Self = StObject.set(x, "only", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnlyUndefined: Self = StObject.set(x, "only", js.undefined)
      
      @scala.inline
      def setParallel(value: Boolean): Self = StObject.set(x, "parallel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParallelUndefined: Self = StObject.set(x, "parallel", js.undefined)
      
      @scala.inline
      def setSkip(value: Boolean): Self = StObject.set(x, "skip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipUndefined: Self = StObject.set(x, "skip", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
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
  
  @js.native
  trait ScriptOptions extends StObject {
    
    /** Pass Lab CLI options */
    var cli: js.UndefOr[js.Any] = js.native
    
    /** Enable auto-execution of the script? (true) */
    var schedule: js.UndefOr[Boolean] = js.native
  }
  object ScriptOptions {
    
    @scala.inline
    def apply(): ScriptOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ScriptOptions]
    }
    
    @scala.inline
    implicit class ScriptOptionsMutableBuilder[Self <: ScriptOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCli(value: js.Any): Self = StObject.set(x, "cli", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCliUndefined: Self = StObject.set(x, "cli", js.undefined)
      
      @scala.inline
      def setSchedule(value: Boolean): Self = StObject.set(x, "schedule", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScheduleUndefined: Self = StObject.set(x, "schedule", js.undefined)
    }
  }
  
  @js.native
  trait SkipOnlyExperiment extends StObject {
    
    /** Only execute this test suite */
    def only(desc: String, cb: EmptyCallback): js.Object = js.native
    /** Only execute this test suite */
    def only(desc: String, options: ExperimentOptions, cb: EmptyCallback): js.Object = js.native
    /** Only execute this test suite */
    @JSName("only")
    var only_Original: ExperimentArgs with ExperimentWithOptionsArgs = js.native
    
    /** Skip this test suite */
    def skip(desc: String, cb: EmptyCallback): js.Object = js.native
    /** Skip this test suite */
    def skip(desc: String, options: ExperimentOptions, cb: EmptyCallback): js.Object = js.native
    /** Skip this test suite */
    @JSName("skip")
    var skip_Original: ExperimentArgs with ExperimentWithOptionsArgs = js.native
  }
  
  @js.native
  trait SkipOnlyTest extends StObject {
    
    /** Only execute this test */
    def only(desc: String, cb: TestCallback): js.Object = js.native
    /** Only execute this test */
    def only(desc: String, options: TestOptions, cb: TestCallback): js.Object = js.native
    /** Only execute this test */
    @JSName("only")
    var only_Original: TestArgs with TestWithOptionsArgs = js.native
    
    /** Skip this test */
    def skip(desc: String, cb: TestCallback): js.Object = js.native
    /** Skip this test */
    def skip(desc: String, options: TestOptions, cb: TestCallback): js.Object = js.native
    /** Skip this test */
    @JSName("skip")
    var skip_Original: TestArgs with TestWithOptionsArgs = js.native
  }
  
  @js.native
  trait TestAlt extends StObject {
    
    var it: SkipOnlyTest = js.native
    
    var test: SkipOnlyTest = js.native
  }
  object TestAlt {
    
    @scala.inline
    def apply(it: SkipOnlyTest, test: SkipOnlyTest): TestAlt = {
      val __obj = js.Dynamic.literal(it = it.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
      __obj.asInstanceOf[TestAlt]
    }
    
    @scala.inline
    implicit class TestAltMutableBuilder[Self <: TestAlt] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIt(value: SkipOnlyTest): Self = StObject.set(x, "it", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTest(value: SkipOnlyTest): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
    }
  }
  
  type TestArgs = js.Function2[/* desc */ String, /* cb */ TestCallback, js.Object]
  
  type TestCallback = js.Function2[
    /* done */ DoneFunction with DoneNote, 
    /* onCleanup */ js.UndefOr[CleanupFunction], 
    Unit
  ]
  
  @js.native
  trait TestOptions extends ExperimentOptions {
    
    /** The expected number of assertions to execute */
    var plan: js.UndefOr[Double] = js.native
  }
  object TestOptions {
    
    @scala.inline
    def apply(): TestOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TestOptions]
    }
    
    @scala.inline
    implicit class TestOptionsMutableBuilder[Self <: TestOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPlan(value: Double): Self = StObject.set(x, "plan", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlanUndefined: Self = StObject.set(x, "plan", js.undefined)
    }
  }
  
  type TestPromise = js.Function0[js.Promise[js.Any]]
  
  type TestWithOptionsArgs = js.Function3[/* desc */ String, /* options */ TestOptions, /* cb */ TestCallback, js.Object]
}

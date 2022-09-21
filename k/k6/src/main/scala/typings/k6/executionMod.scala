package typings.k6

import typings.k6.optionsMod.Options
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object executionMod {
  
  /*
    * The execution module provides information about the current test execution state.
    * https://k6.io/docs/javascript-api/k6-execution/
    */
  object default {
    
    /**
      * Information about the current load generator instance.
      */
    object instance {
      
      @JSImport("k6/execution", "default.instance")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * The time passed from the start of the current test run in milliseconds.
        */
      @JSImport("k6/execution", "default.instance.currentTestRunDuration")
      @js.native
      def currentTestRunDuration: Double = js.native
      inline def currentTestRunDuration_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("currentTestRunDuration")(x.asInstanceOf[js.Any])
      
      /**
        * The number of completed iterations in the current instance.
        */
      @JSImport("k6/execution", "default.instance.iterationsCompleted")
      @js.native
      def iterationsCompleted: Double = js.native
      inline def iterationsCompleted_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("iterationsCompleted")(x.asInstanceOf[js.Any])
      
      /**
        * The number of prematurely interrupted iterations in the current instance.
        */
      @JSImport("k6/execution", "default.instance.iterationsInterrupted")
      @js.native
      def iterationsInterrupted: Double = js.native
      inline def iterationsInterrupted_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("iterationsInterrupted")(x.asInstanceOf[js.Any])
      
      /**
        * The number of active VUs.
        */
      @JSImport("k6/execution", "default.instance.vusActive")
      @js.native
      def vusActive: Double = js.native
      inline def vusActive_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("vusActive")(x.asInstanceOf[js.Any])
      
      /**
        * The number of currently initialized VUs.
        */
      @JSImport("k6/execution", "default.instance.vusInitialized")
      @js.native
      def vusInitialized: Double = js.native
      inline def vusInitialized_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("vusInitialized")(x.asInstanceOf[js.Any])
    }
    
    /**
      * Information about the current scenario.
      */
    object scenario {
      
      @JSImport("k6/execution", "default.scenario")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * The name of the running Executor type.
        */
      @JSImport("k6/execution", "default.scenario.executor")
      @js.native
      def executor: String = js.native
      inline def executor_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("executor")(x.asInstanceOf[js.Any])
      
      /**
        * The unique and zero-based sequential number of the current iteration in the scenario, across the current instance.
        */
      @JSImport("k6/execution", "default.scenario.iterationInInstance")
      @js.native
      def iterationInInstance: Double = js.native
      inline def iterationInInstance_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("iterationInInstance")(x.asInstanceOf[js.Any])
      
      /**
        * The unique and zero-based sequential number of the current iteration in the scenario.
        */
      @JSImport("k6/execution", "default.scenario.iterationInTest")
      @js.native
      def iterationInTest: Double = js.native
      inline def iterationInTest_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("iterationInTest")(x.asInstanceOf[js.Any])
      
      /**
        * The assigned name of the running scenario.
        */
      @JSImport("k6/execution", "default.scenario.name")
      @js.native
      def name: String = js.native
      inline def name_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("name")(x.asInstanceOf[js.Any])
      
      /**
        * Percentage in a 0 to 1 interval of the scenario progress.
        */
      @JSImport("k6/execution", "default.scenario.progress")
      @js.native
      def progress: Double = js.native
      inline def progress_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("progress")(x.asInstanceOf[js.Any])
      
      /**
        * The Unix timestamp in milliseconds when the scenario started.
        */
      @JSImport("k6/execution", "default.scenario.startTime")
      @js.native
      def startTime: Double = js.native
      inline def startTime_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("startTime")(x.asInstanceOf[js.Any])
    }
    
    /**
      * Control the test execution.
      */
    object test {
      
      @JSImport("k6/execution", "default.test")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Aborts the test run with the exit code 108.
        * https://k6.io/docs/javascript-api/k6-execution/#test
        * @param input - Aborted message.
        * @example
        * import exec from "k6/execution";
        * exec.test.abort();
        * exec.test.abort('this is the reason');
        */
      inline def abort(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("abort")().asInstanceOf[Unit]
      inline def abort(input: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("abort")(input.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      @JSImport("k6/execution", "default.test.options")
      @js.native
      def options: Options = js.native
      inline def options_=(x: Options): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("options")(x.asInstanceOf[js.Any])
    }
    
    /**
      * Information about the current virtual user.
      */
    object vu {
      
      @JSImport("k6/execution", "default.vu")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * The identifier of the VU across the instance.
        */
      @JSImport("k6/execution", "default.vu.idInInstance")
      @js.native
      def idInInstance: Double = js.native
      inline def idInInstance_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("idInInstance")(x.asInstanceOf[js.Any])
      
      /**
        * 	The globally unique (across the whole test run) identifier of the VU.
        */
      @JSImport("k6/execution", "default.vu.idInTest")
      @js.native
      def idInTest: Double = js.native
      inline def idInTest_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("idInTest")(x.asInstanceOf[js.Any])
      
      /**
        * The identifier of the iteration in the current instance.
        */
      @JSImport("k6/execution", "default.vu.iterationInInstance")
      @js.native
      def iterationInInstance: Double = js.native
      inline def iterationInInstance_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("iterationInInstance")(x.asInstanceOf[js.Any])
      
      /**
        * The identifier of the iteration in the current scenario.
        */
      @JSImport("k6/execution", "default.vu.iterationInScenario")
      @js.native
      def iterationInScenario: Double = js.native
      inline def iterationInScenario_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("iterationInScenario")(x.asInstanceOf[js.Any])
      
      /**
        * 	Hash to set or get VU tags.
        */
      @JSImport("k6/execution", "default.vu.tags")
      @js.native
      def tags: Record[String, Double | String | Boolean] = js.native
      inline def tags_=(x: Record[String, Double | String | Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tags")(x.asInstanceOf[js.Any])
    }
  }
}

package typings.karmaParallel

import typings.karmaParallel.karmaParallelStrings.`description-length`
import typings.karmaParallel.karmaParallelStrings.`round-robin`
import typings.karmaParallel.karmaParallelStrings.custom
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object mod {
  
  @js.native
  trait ConfigOptions extends StObject {
    
    /**
      * Options for this plugin
      * see {@link https://github.com/joeljeske/karma-parallel#options}
      */
    var parallelOptions: js.UndefOr[ParallelOptions] = js.native
  }
  object ConfigOptions {
    
    @scala.inline
    def apply(): ConfigOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfigOptions]
    }
    
    @scala.inline
    implicit class ConfigOptionsMutableBuilder[Self <: ConfigOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setParallelOptions(value: ParallelOptions): Self = StObject.set(x, "parallelOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParallelOptionsUndefined: Self = StObject.set(x, "parallelOptions", js.undefined)
    }
  }
  
  @js.native
  trait ParallelOptions extends StObject {
    
    /**
      * regex or function used to determine if a reporter needs to only received aggregated events from the browser shards.
      * It is used to ensure coverage reporting is accurate amongst all the shards of a browser
      *  It is also useful for some programmatic reporters such as junit reporters that need to operate on a single set of test outputs and not once for each shard.
      * Set to null to disable aggregated reporting
      */
    var aggregatedReporterTest: js.UndefOr[(js.Function1[/* reporter */ js.Object, Boolean]) | RegExp | Null] = js.native
    
    /**
      * Custom function that will determine if a describe block should run in the current executor.
      * It is a function that is serialized and re-constructed on each executor.
      * The function will be called for every top level describe block and should return true if the describe block should run for a the current executor
      */
    var customShardStrategy: js.UndefOr[js.Function1[/* options */ ShardStrategOptions, Boolean]] = js.native
    
    /**
      * The number of browser instances to use to test.
      * If you test on multiple types of browsers, this spin up the number of executors for each browser type
      * @default cpu_cores-1
      */
    var executors: js.UndefOr[Double] = js.native
    
    /**
      * This plugin works by overriding the test suite describe() function.
      * When it encounters a describe, it must decide if it will skip the tests inside of it, or not
      * @default 'round-robin'
      */
    var shardStrategy: js.UndefOr[`round-robin` | `description-length` | custom] = js.native
  }
  object ParallelOptions {
    
    @scala.inline
    def apply(): ParallelOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ParallelOptions]
    }
    
    @scala.inline
    implicit class ParallelOptionsMutableBuilder[Self <: ParallelOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAggregatedReporterTest(value: (js.Function1[/* reporter */ js.Object, Boolean]) | RegExp): Self = StObject.set(x, "aggregatedReporterTest", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAggregatedReporterTestFunction1(value: /* reporter */ js.Object => Boolean): Self = StObject.set(x, "aggregatedReporterTest", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAggregatedReporterTestNull: Self = StObject.set(x, "aggregatedReporterTest", null)
      
      @scala.inline
      def setAggregatedReporterTestUndefined: Self = StObject.set(x, "aggregatedReporterTest", js.undefined)
      
      @scala.inline
      def setCustomShardStrategy(value: /* options */ ShardStrategOptions => Boolean): Self = StObject.set(x, "customShardStrategy", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCustomShardStrategyUndefined: Self = StObject.set(x, "customShardStrategy", js.undefined)
      
      @scala.inline
      def setExecutors(value: Double): Self = StObject.set(x, "executors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExecutorsUndefined: Self = StObject.set(x, "executors", js.undefined)
      
      @scala.inline
      def setShardStrategy(value: `round-robin` | `description-length` | custom): Self = StObject.set(x, "shardStrategy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShardStrategyUndefined: Self = StObject.set(x, "shardStrategy", js.undefined)
    }
  }
  
  @js.native
  trait ShardStrategOptions extends StObject {
    
    /**
      * the string passed to the describe block (useful for gaining context of the current description)
      */
    val description: String = js.native
    
    /**
      * the total number of executors
      */
    val executors: Double = js.native
    
    /**
      * the 0-based index of the current executor
      */
    val shardIndex: Double = js.native
  }
  object ShardStrategOptions {
    
    @scala.inline
    def apply(description: String, executors: Double, shardIndex: Double): ShardStrategOptions = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], executors = executors.asInstanceOf[js.Any], shardIndex = shardIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[ShardStrategOptions]
    }
    
    @scala.inline
    implicit class ShardStrategOptionsMutableBuilder[Self <: ShardStrategOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExecutors(value: Double): Self = StObject.set(x, "executors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShardIndex(value: Double): Self = StObject.set(x, "shardIndex", value.asInstanceOf[js.Any])
    }
  }
}

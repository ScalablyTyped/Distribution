package typings.karmaParallel

import typings.karmaParallel.karmaParallelStrings.`description-length`
import typings.karmaParallel.karmaParallelStrings.`round-robin`
import typings.karmaParallel.karmaParallelStrings.custom
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object mod {
  
  trait ConfigOptions extends StObject {
    
    /**
      * Options for this plugin
      * see {@link https://github.com/joeljeske/karma-parallel#options}
      */
    var parallelOptions: js.UndefOr[ParallelOptions] = js.undefined
  }
  object ConfigOptions {
    
    inline def apply(): ConfigOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfigOptions]
    }
    
    extension [Self <: ConfigOptions](x: Self) {
      
      inline def setParallelOptions(value: ParallelOptions): Self = StObject.set(x, "parallelOptions", value.asInstanceOf[js.Any])
      
      inline def setParallelOptionsUndefined: Self = StObject.set(x, "parallelOptions", js.undefined)
    }
  }
  
  trait ParallelOptions extends StObject {
    
    /**
      * regex or function used to determine if a reporter needs to only received aggregated events from the browser shards.
      * It is used to ensure coverage reporting is accurate amongst all the shards of a browser
      *  It is also useful for some programmatic reporters such as junit reporters that need to operate on a single set of test outputs and not once for each shard.
      * Set to null to disable aggregated reporting
      */
    var aggregatedReporterTest: js.UndefOr[(js.Function1[/* reporter */ js.Object, Boolean]) | js.RegExp | Null] = js.undefined
    
    /**
      * Custom function that will determine if a describe block should run in the current executor.
      * It is a function that is serialized and re-constructed on each executor.
      * The function will be called for every top level describe block and should return true if the describe block should run for a the current executor
      */
    var customShardStrategy: js.UndefOr[js.Function1[/* options */ ShardStrategOptions, Boolean]] = js.undefined
    
    /**
      * The number of browser instances to use to test.
      * If you test on multiple types of browsers, this spin up the number of executors for each browser type
      * @default cpu_cores-1
      */
    var executors: js.UndefOr[Double] = js.undefined
    
    /**
      * This plugin works by overriding the test suite describe() function.
      * When it encounters a describe, it must decide if it will skip the tests inside of it, or not
      * @default 'round-robin'
      */
    var shardStrategy: js.UndefOr[`round-robin` | `description-length` | custom] = js.undefined
  }
  object ParallelOptions {
    
    inline def apply(): ParallelOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ParallelOptions]
    }
    
    extension [Self <: ParallelOptions](x: Self) {
      
      inline def setAggregatedReporterTest(value: (js.Function1[/* reporter */ js.Object, Boolean]) | js.RegExp): Self = StObject.set(x, "aggregatedReporterTest", value.asInstanceOf[js.Any])
      
      inline def setAggregatedReporterTestFunction1(value: /* reporter */ js.Object => Boolean): Self = StObject.set(x, "aggregatedReporterTest", js.Any.fromFunction1(value))
      
      inline def setAggregatedReporterTestNull: Self = StObject.set(x, "aggregatedReporterTest", null)
      
      inline def setAggregatedReporterTestUndefined: Self = StObject.set(x, "aggregatedReporterTest", js.undefined)
      
      inline def setCustomShardStrategy(value: /* options */ ShardStrategOptions => Boolean): Self = StObject.set(x, "customShardStrategy", js.Any.fromFunction1(value))
      
      inline def setCustomShardStrategyUndefined: Self = StObject.set(x, "customShardStrategy", js.undefined)
      
      inline def setExecutors(value: Double): Self = StObject.set(x, "executors", value.asInstanceOf[js.Any])
      
      inline def setExecutorsUndefined: Self = StObject.set(x, "executors", js.undefined)
      
      inline def setShardStrategy(value: `round-robin` | `description-length` | custom): Self = StObject.set(x, "shardStrategy", value.asInstanceOf[js.Any])
      
      inline def setShardStrategyUndefined: Self = StObject.set(x, "shardStrategy", js.undefined)
    }
  }
  
  trait ShardStrategOptions extends StObject {
    
    /**
      * the string passed to the describe block (useful for gaining context of the current description)
      */
    val description: String
    
    /**
      * the total number of executors
      */
    val executors: Double
    
    /**
      * the 0-based index of the current executor
      */
    val shardIndex: Double
  }
  object ShardStrategOptions {
    
    inline def apply(description: String, executors: Double, shardIndex: Double): ShardStrategOptions = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], executors = executors.asInstanceOf[js.Any], shardIndex = shardIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[ShardStrategOptions]
    }
    
    extension [Self <: ShardStrategOptions](x: Self) {
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setExecutors(value: Double): Self = StObject.set(x, "executors", value.asInstanceOf[js.Any])
      
      inline def setShardIndex(value: Double): Self = StObject.set(x, "shardIndex", value.asInstanceOf[js.Any])
    }
  }
}

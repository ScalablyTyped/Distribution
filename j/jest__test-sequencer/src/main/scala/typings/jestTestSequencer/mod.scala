package typings.jestTestSequencer

import org.scalablytyped.runtime.StringDictionary
import typings.jestTestResult.mod.AggregatedResult
import typings.jestTestResult.mod.Test
import typings.jestTestResult.mod.TestContext
import typings.jestTestSequencer.jestTestSequencerInts.`0`
import typings.jestTestSequencer.jestTestSequencerInts.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * The TestSequencer will ultimately decide which tests should run first.
    * It is responsible for storing and reading from a local cache
    * map that stores context information for a given test, such as how long it
    * took to run during the last run and if it has failed or not.
    * Such information is used on:
    * TestSequencer.sort(tests: Array<Test>)
    * to sort the order of the provided tests.
    *
    * After the results are collected,
    * TestSequencer.cacheResults(tests: Array<Test>, results: AggregatedResult)
    * is called to store/update this information on the cache map.
    */
  @JSImport("@jest/test-sequencer", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with TestSequencer {
    
    /* private */ /* CompleteClass */
    override val _cache: Any = js.native
    
    /* CompleteClass */
    override def _getCache(test: Test): Cache2 = js.native
    
    /* CompleteClass */
    override def _getCachePath(testContext: TestContext): String = js.native
    
    /* private */ /* CompleteClass */
    var _shardPosition: Any = js.native
    
    /* CompleteClass */
    override def allFailedTests(tests: js.Array[Test]): js.Array[Test] | js.Promise[js.Array[Test]] = js.native
    
    /* CompleteClass */
    override def cacheResults(tests: js.Array[Test], results: AggregatedResult): Unit = js.native
    
    /* private */ /* CompleteClass */
    var hasFailed: Any = js.native
    
    /**
      * Select tests for shard requested via --shard=shardIndex/shardCount
      * Sharding is applied before sorting
      *
      * @param tests All tests
      * @param options shardIndex and shardIndex to select
      *
      * @example
      * ```typescript
      * class CustomSequencer extends Sequencer {
      *  shard(tests, { shardIndex, shardCount }) {
      *    const shardSize = Math.ceil(tests.length / options.shardCount);
      *    const shardStart = shardSize * (options.shardIndex - 1);
      *    const shardEnd = shardSize * options.shardIndex;
      *    return [...tests]
      *     .sort((a, b) => (a.path > b.path ? 1 : -1))
      *     .slice(shardStart, shardEnd);
      *  }
      * }
      * ```
      */
    /* CompleteClass */
    override def shard(tests: js.Array[Test], options: ShardOptions): js.Array[Test] | js.Promise[js.Array[Test]] = js.native
    
    /**
      * Sort test to determine order of execution
      * Sorting is applied after sharding
      * @param tests
      *
      * ```typescript
      * class CustomSequencer extends Sequencer {
      *   sort(tests) {
      *     const copyTests = Array.from(tests);
      *     return [...tests].sort((a, b) => (a.path > b.path ? 1 : -1));
      *   }
      * }
      * ```
      */
    /* CompleteClass */
    override def sort(tests: js.Array[Test]): js.Array[Test] | js.Promise[js.Array[Test]] = js.native
    
    /* private */ /* CompleteClass */
    var time: Any = js.native
  }
  
  type Cache2 = StringDictionary[js.UndefOr[js.Tuple2[`0` | `1`, Double]]]
  
  trait ShardOptions extends StObject {
    
    var shardCount: Double
    
    var shardIndex: Double
  }
  object ShardOptions {
    
    inline def apply(shardCount: Double, shardIndex: Double): ShardOptions = {
      val __obj = js.Dynamic.literal(shardCount = shardCount.asInstanceOf[js.Any], shardIndex = shardIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[ShardOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ShardOptions] (val x: Self) extends AnyVal {
      
      inline def setShardCount(value: Double): Self = StObject.set(x, "shardCount", value.asInstanceOf[js.Any])
      
      inline def setShardIndex(value: Double): Self = StObject.set(x, "shardIndex", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * The TestSequencer will ultimately decide which tests should run first.
    * It is responsible for storing and reading from a local cache
    * map that stores context information for a given test, such as how long it
    * took to run during the last run and if it has failed or not.
    * Such information is used on:
    * TestSequencer.sort(tests: Array<Test>)
    * to sort the order of the provided tests.
    *
    * After the results are collected,
    * TestSequencer.cacheResults(tests: Array<Test>, results: AggregatedResult)
    * is called to store/update this information on the cache map.
    */
  trait TestSequencer extends StObject {
    
    /* private */ val _cache: Any
    
    def _getCache(test: Test): Cache2
    
    def _getCachePath(testContext: TestContext): String
    
    /* private */ var _shardPosition: Any
    
    def allFailedTests(tests: js.Array[Test]): js.Array[Test] | js.Promise[js.Array[Test]]
    
    def cacheResults(tests: js.Array[Test], results: AggregatedResult): Unit
    
    /* private */ var hasFailed: Any
    
    /**
      * Select tests for shard requested via --shard=shardIndex/shardCount
      * Sharding is applied before sorting
      *
      * @param tests All tests
      * @param options shardIndex and shardIndex to select
      *
      * @example
      * ```typescript
      * class CustomSequencer extends Sequencer {
      *  shard(tests, { shardIndex, shardCount }) {
      *    const shardSize = Math.ceil(tests.length / options.shardCount);
      *    const shardStart = shardSize * (options.shardIndex - 1);
      *    const shardEnd = shardSize * options.shardIndex;
      *    return [...tests]
      *     .sort((a, b) => (a.path > b.path ? 1 : -1))
      *     .slice(shardStart, shardEnd);
      *  }
      * }
      * ```
      */
    def shard(tests: js.Array[Test], options: ShardOptions): js.Array[Test] | js.Promise[js.Array[Test]]
    
    /**
      * Sort test to determine order of execution
      * Sorting is applied after sharding
      * @param tests
      *
      * ```typescript
      * class CustomSequencer extends Sequencer {
      *   sort(tests) {
      *     const copyTests = Array.from(tests);
      *     return [...tests].sort((a, b) => (a.path > b.path ? 1 : -1));
      *   }
      * }
      * ```
      */
    def sort(tests: js.Array[Test]): js.Array[Test] | js.Promise[js.Array[Test]]
    
    /* private */ var time: Any
  }
  object TestSequencer {
    
    inline def apply(
      _cache: Any,
      _getCache: Test => Cache2,
      _getCachePath: TestContext => String,
      _shardPosition: Any,
      allFailedTests: js.Array[Test] => js.Array[Test] | js.Promise[js.Array[Test]],
      cacheResults: (js.Array[Test], AggregatedResult) => Unit,
      hasFailed: Any,
      shard: (js.Array[Test], ShardOptions) => js.Array[Test] | js.Promise[js.Array[Test]],
      sort: js.Array[Test] => js.Array[Test] | js.Promise[js.Array[Test]],
      time: Any
    ): TestSequencer = {
      val __obj = js.Dynamic.literal(_cache = _cache.asInstanceOf[js.Any], _getCache = js.Any.fromFunction1(_getCache), _getCachePath = js.Any.fromFunction1(_getCachePath), _shardPosition = _shardPosition.asInstanceOf[js.Any], allFailedTests = js.Any.fromFunction1(allFailedTests), cacheResults = js.Any.fromFunction2(cacheResults), hasFailed = hasFailed.asInstanceOf[js.Any], shard = js.Any.fromFunction2(shard), sort = js.Any.fromFunction1(sort), time = time.asInstanceOf[js.Any])
      __obj.asInstanceOf[TestSequencer]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TestSequencer] (val x: Self) extends AnyVal {
      
      inline def setAllFailedTests(value: js.Array[Test] => js.Array[Test] | js.Promise[js.Array[Test]]): Self = StObject.set(x, "allFailedTests", js.Any.fromFunction1(value))
      
      inline def setCacheResults(value: (js.Array[Test], AggregatedResult) => Unit): Self = StObject.set(x, "cacheResults", js.Any.fromFunction2(value))
      
      inline def setHasFailed(value: Any): Self = StObject.set(x, "hasFailed", value.asInstanceOf[js.Any])
      
      inline def setShard(value: (js.Array[Test], ShardOptions) => js.Array[Test] | js.Promise[js.Array[Test]]): Self = StObject.set(x, "shard", js.Any.fromFunction2(value))
      
      inline def setSort(value: js.Array[Test] => js.Array[Test] | js.Promise[js.Array[Test]]): Self = StObject.set(x, "sort", js.Any.fromFunction1(value))
      
      inline def setTime(value: Any): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
      
      inline def set_cache(value: Any): Self = StObject.set(x, "_cache", value.asInstanceOf[js.Any])
      
      inline def set_getCache(value: Test => Cache2): Self = StObject.set(x, "_getCache", js.Any.fromFunction1(value))
      
      inline def set_getCachePath(value: TestContext => String): Self = StObject.set(x, "_getCachePath", js.Any.fromFunction1(value))
      
      inline def set_shardPosition(value: Any): Self = StObject.set(x, "_shardPosition", value.asInstanceOf[js.Any])
    }
  }
}

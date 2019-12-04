package typings.atJestTestDashSequencer.atJestTestDashSequencerMod

import typings.atJestTestDashResult.buildTypesMod.AggregatedResult
import typings.jestDashRuntime.jestDashRuntimeMod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jest/test-sequencer", JSImport.Default)
@js.native
class default () extends TestSequencer {
  /* CompleteClass */
  override var _cache: js.Any = js.native
  /* CompleteClass */
  override def _getCache(
    test: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Test */ js.Any
  ): Cache = js.native
  /* CompleteClass */
  override def _getCachePath(context: Context): String = js.native
  /* CompleteClass */
  override def cacheResults(
    tests: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Test */ _
    ],
    results: AggregatedResult
  ): Unit = js.native
  /**
    * Sorting tests is very important because it has a great impact on the
    * user-perceived responsiveness and speed of the test run.
    *
    * If such information is on cache, tests are sorted based on:
    * -> Has it failed during the last run ?
    * Since it's important to provide the most expected feedback as quickly
    * as possible.
    * -> How long it took to run ?
    * Because running long tests first is an effort to minimize worker idle
    * time at the end of a long test run.
    * And if that information is not available they are sorted based on file size
    * since big test files usually take longer to complete.
    *
    * Note that a possible improvement would be to analyse other information
    * from the file other than its size.
    *
    */
  /* CompleteClass */
  override def sort(
    tests: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Test */ _
    ]
  ): js.Array[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Test */ _
  ] = js.native
}


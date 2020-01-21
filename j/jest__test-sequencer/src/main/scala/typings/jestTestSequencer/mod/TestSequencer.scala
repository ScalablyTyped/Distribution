package typings.jestTestSequencer.mod

import typings.jestRuntime.mod.Context
import typings.jestTestResult.typesMod.AggregatedResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestSequencer extends js.Object {
  var _cache: js.Any
  def _getCache(
    test: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Test */ js.Any
  ): Cache
  def _getCachePath(context: Context): String
  def cacheResults(
    tests: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Test */ _
    ],
    results: AggregatedResult
  ): Unit
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
  def sort(
    tests: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Test */ _
    ]
  ): js.Array[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Test */ _
  ]
}

object TestSequencer {
  @scala.inline
  def apply(
    _cache: js.Any,
    _getCache: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Test */ js.Any => Cache,
    _getCachePath: Context => String,
    cacheResults: (js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Test */ _
    ], AggregatedResult) => Unit,
    sort: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Test */ _
    ] => js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Test */ _
    ]
  ): TestSequencer = {
    val __obj = js.Dynamic.literal(_cache = _cache.asInstanceOf[js.Any], _getCache = js.Any.fromFunction1(_getCache), _getCachePath = js.Any.fromFunction1(_getCachePath), cacheResults = js.Any.fromFunction2(cacheResults), sort = js.Any.fromFunction1(sort))
  
    __obj.asInstanceOf[TestSequencer]
  }
}


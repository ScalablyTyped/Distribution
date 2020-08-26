package typings.jasmine.jasmine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomAsyncMatcher extends js.Object {
  var negativeCompare: (js.UndefOr[
    js.Function3[
      /* actual */ js.Any, 
      /* expected */ js.Any, 
      /* repeated */ js.Any, 
      js.Promise[CustomMatcherResult]
    ]
  ]) with (js.UndefOr[
    js.Function2[/* actual */ js.Any, /* repeated */ js.Any, js.Promise[CustomMatcherResult]]
  ]) = js.native
  def compare(actual: js.Any, expected: js.Any*): js.Promise[CustomMatcherResult] = js.native
  def compare[T](actual: T, expected: T, args: js.Any*): js.Promise[CustomMatcherResult] = js.native
}


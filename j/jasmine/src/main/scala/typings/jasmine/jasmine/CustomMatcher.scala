package typings.jasmine.jasmine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomMatcher extends js.Object {
  
  def compare(actual: js.Any, expected: js.Any*): CustomMatcherResult = js.native
  def compare[T](actual: T, expected: T, args: js.Any*): CustomMatcherResult = js.native
  
  var negativeCompare: (js.UndefOr[
    js.Function3[/* actual */ js.Any, /* expected */ js.Any, /* repeated */ js.Any, CustomMatcherResult]
  ]) with (js.UndefOr[js.Function2[/* actual */ js.Any, /* repeated */ js.Any, CustomMatcherResult]]) = js.native
}

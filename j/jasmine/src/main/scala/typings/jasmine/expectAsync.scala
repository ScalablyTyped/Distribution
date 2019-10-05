package typings.jasmine

import typings.jasmine.jasmine.AsyncMatchers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("expectAsync")
@js.native
object expectAsync extends js.Object {
  /**
    * Create an asynchronous expectation for a spec. Note that the matchers
    * that are provided by an asynchronous expectation all return promises
    * which must be either returned from the spec or waited for using `await`
    * in order for Jasmine to associate them with the correct spec.
    * @checkReturnValue see https://tsetse.info/check-return-value
    * @param actual - Actual computed value to test expectations against.
    */
  def apply[T, U](actual: js.Thenable[T]): AsyncMatchers[T, U] = js.native
}


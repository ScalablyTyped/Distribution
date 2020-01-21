package typings.jsspecJsspec.JSSpec

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Subject extends js.Object {
  /**
    * Set `subject` which can be accessed inside of an Example.
    *
    * If `fnOrValue` is a function, it will be executed to evaluate the initial state of
    * `subject` when it is first accessed in an example (or supporting hook).
    */
  def apply(fnOrValue: js.Any): Unit = js.native
  /**
    * Set a variable which can be accessed inside of an Example.
    * `subject` will refer to the same variable.
    *
    * If `fnOrValue` is a function, it will be executed to evaluate the initial state of
    * `varName` or `subject` when it is first accessed in an example (or supporting hook).
    */
  def apply(varName: String, fnOrValue: js.Any): Unit = js.native
}


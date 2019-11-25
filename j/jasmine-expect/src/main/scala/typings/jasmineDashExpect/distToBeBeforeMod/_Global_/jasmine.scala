package typings.jasmineDashExpect.distToBeBeforeMod._Global_

import typings.jasmineDashExpect.distToBeBeforeMod.ToBeBefore
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("jasmine")
@js.native
object jasmine extends js.Object {
  @js.native
  trait Matchers[T] extends js.Object {
    @JSName("toBeBefore")
    var toBeBefore_Original: ToBeBefore = js.native
    def toBeBefore(otherDate: Date): Boolean = js.native
    def toBeBefore(otherDate: Date, expectationFailOutput: js.Any): Boolean = js.native
  }
  
}


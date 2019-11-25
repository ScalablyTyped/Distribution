package typings.jasmineDashExpect.distToBeArrayOfStringsMod._Global_

import typings.jasmineDashExpect.distToBeArrayOfStringsMod.ToBeArrayOfStrings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("jasmine")
@js.native
object jasmine extends js.Object {
  @js.native
  trait Matchers[T] extends js.Object {
    @JSName("toBeArrayOfStrings")
    var toBeArrayOfStrings_Original: ToBeArrayOfStrings = js.native
    def toBeArrayOfStrings(): Boolean = js.native
    def toBeArrayOfStrings(expectationFailOutput: js.Any): Boolean = js.native
  }
  
}


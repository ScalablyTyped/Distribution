package typings.jasmineDashExpect.distToBeArrayOfNumbersMod._Global_

import typings.jasmineDashExpect.distToBeArrayOfNumbersMod.ToBeArrayOfNumbers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("jasmine")
@js.native
object jasmine extends js.Object {
  @js.native
  trait Matchers[T] extends js.Object {
    @JSName("toBeArrayOfNumbers")
    var toBeArrayOfNumbers_Original: ToBeArrayOfNumbers = js.native
    def toBeArrayOfNumbers(): Boolean = js.native
    def toBeArrayOfNumbers(expectationFailOutput: js.Any): Boolean = js.native
  }
  
}


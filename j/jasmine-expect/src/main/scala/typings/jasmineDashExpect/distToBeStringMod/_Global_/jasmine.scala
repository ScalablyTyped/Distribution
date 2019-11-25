package typings.jasmineDashExpect.distToBeStringMod._Global_

import typings.jasmineDashExpect.distToBeStringMod.ToBeString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("jasmine")
@js.native
object jasmine extends js.Object {
  @js.native
  trait Matchers[T] extends js.Object {
    @JSName("toBeString")
    var toBeString_Original: ToBeString = js.native
    def toBeString(): Boolean = js.native
    def toBeString(expectationFailOutput: js.Any): Boolean = js.native
  }
  
}


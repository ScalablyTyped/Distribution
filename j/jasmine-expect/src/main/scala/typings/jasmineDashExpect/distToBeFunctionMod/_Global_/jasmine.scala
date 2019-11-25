package typings.jasmineDashExpect.distToBeFunctionMod._Global_

import typings.jasmineDashExpect.distToBeFunctionMod.ToBeFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("jasmine")
@js.native
object jasmine extends js.Object {
  @js.native
  trait Matchers[T] extends js.Object {
    @JSName("toBeFunction")
    var toBeFunction_Original: ToBeFunction = js.native
    def toBeFunction(): Boolean = js.native
    def toBeFunction(expectationFailOutput: js.Any): Boolean = js.native
  }
  
}


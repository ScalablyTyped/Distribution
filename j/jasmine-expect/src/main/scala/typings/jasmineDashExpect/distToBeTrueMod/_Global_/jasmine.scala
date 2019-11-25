package typings.jasmineDashExpect.distToBeTrueMod._Global_

import typings.jasmineDashExpect.distToBeTrueMod.ToBeTrue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("jasmine")
@js.native
object jasmine extends js.Object {
  @js.native
  trait Matchers[T] extends js.Object {
    @JSName("toBeTrue")
    var toBeTrue_Original: ToBeTrue = js.native
    def toBeTrue(): Boolean = js.native
    def toBeTrue(expectationFailOutput: js.Any): Boolean = js.native
  }
  
}


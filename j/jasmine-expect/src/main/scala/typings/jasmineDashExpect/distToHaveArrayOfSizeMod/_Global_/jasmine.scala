package typings.jasmineDashExpect.distToHaveArrayOfSizeMod._Global_

import typings.jasmineDashExpect.distToHaveArrayOfSizeMod.ToHaveArrayOfSize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("jasmine")
@js.native
object jasmine extends js.Object {
  @js.native
  trait Matchers[T] extends js.Object {
    @JSName("toHaveArrayOfSize")
    var toHaveArrayOfSize_Original: ToHaveArrayOfSize = js.native
    def toHaveArrayOfSize(key: String): Boolean = js.native
    def toHaveArrayOfSize(key: String, size: Double): Boolean = js.native
    def toHaveArrayOfSize(key: String, size: Double, expectationFailOutput: js.Any): Boolean = js.native
  }
  
}


package typings.jasmineDashExpect.distToHaveStringSameLengthAsMod._Global_

import typings.jasmineDashExpect.distToHaveStringSameLengthAsMod.ToHaveStringSameLengthAs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("jasmine")
@js.native
object jasmine extends js.Object {
  @js.native
  trait Matchers[T] extends js.Object {
    @JSName("toHaveStringSameLengthAs")
    var toHaveStringSameLengthAs_Original: ToHaveStringSameLengthAs = js.native
    def toHaveStringSameLengthAs(key: String, other: String): Boolean = js.native
    def toHaveStringSameLengthAs(key: String, other: String, expectationFailOutput: js.Any): Boolean = js.native
  }
  
}


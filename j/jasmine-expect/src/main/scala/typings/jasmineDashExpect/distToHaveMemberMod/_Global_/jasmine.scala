package typings.jasmineDashExpect.distToHaveMemberMod._Global_

import typings.jasmineDashExpect.distToHaveMemberMod.ToHaveMember
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("jasmine")
@js.native
object jasmine extends js.Object {
  @js.native
  trait Matchers[T] extends js.Object {
    @JSName("toHaveMember")
    var toHaveMember_Original: ToHaveMember = js.native
    def toHaveMember(key: String): Boolean = js.native
    def toHaveMember(key: String, expectationFailOutput: js.Any): Boolean = js.native
  }
  
}


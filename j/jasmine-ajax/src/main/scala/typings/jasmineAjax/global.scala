package typings.jasmineAjax

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  @js.native
  class MockAjax protected ()
    extends typings.jasmineAjax.MockAjax {
    def this(globals: js.Any) = this()
  }
  
  @js.native
  object jasmine extends js.Object {
    val Ajax: typings.jasmineAjax.MockAjax = js.native
  }
  
}


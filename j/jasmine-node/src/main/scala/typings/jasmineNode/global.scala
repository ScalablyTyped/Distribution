package typings.jasmineNode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
  def it(
    expectation: String,
    assertion: js.Function1[/* done */ js.Function1[/* err */ js.UndefOr[js.Any], Unit], Unit]
  ): Unit = js.native
  def it(
    expectation: String,
    assertion: js.Function1[/* done */ js.Function1[/* err */ js.UndefOr[js.Any], Unit], Unit],
    timeout: Double
  ): Unit = js.native
}

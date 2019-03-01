package typings
package knockoutLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DeferUpdates extends js.Object {
  var deferUpdates: scala.Boolean
  var useOnlyNativeEvents: scala.Boolean
}

object Anon_DeferUpdates {
  @scala.inline
  def apply(deferUpdates: scala.Boolean, useOnlyNativeEvents: scala.Boolean): Anon_DeferUpdates = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("deferUpdates")(deferUpdates)
    __obj.updateDynamic("useOnlyNativeEvents")(useOnlyNativeEvents)
    __obj.asInstanceOf[Anon_DeferUpdates]
  }
}


package typings.knockout.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeferUpdates extends js.Object {
  var deferUpdates: Boolean
  var useOnlyNativeEvents: Boolean
}

object DeferUpdates {
  @scala.inline
  def apply(deferUpdates: Boolean, useOnlyNativeEvents: Boolean): DeferUpdates = {
    val __obj = js.Dynamic.literal(deferUpdates = deferUpdates.asInstanceOf[js.Any], useOnlyNativeEvents = useOnlyNativeEvents.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeferUpdates]
  }
}


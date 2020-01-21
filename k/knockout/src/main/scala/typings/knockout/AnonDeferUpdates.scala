package typings.knockout

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDeferUpdates extends js.Object {
  var deferUpdates: Boolean
  var useOnlyNativeEvents: Boolean
}

object AnonDeferUpdates {
  @scala.inline
  def apply(deferUpdates: Boolean, useOnlyNativeEvents: Boolean): AnonDeferUpdates = {
    val __obj = js.Dynamic.literal(deferUpdates = deferUpdates.asInstanceOf[js.Any], useOnlyNativeEvents = useOnlyNativeEvents.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDeferUpdates]
  }
}


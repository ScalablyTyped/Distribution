package typings.knockout

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DeferUpdates extends js.Object {
  var deferUpdates: Boolean
  var useOnlyNativeEvents: Boolean
}

object Anon_DeferUpdates {
  @scala.inline
  def apply(deferUpdates: Boolean, useOnlyNativeEvents: Boolean): Anon_DeferUpdates = {
    val __obj = js.Dynamic.literal(deferUpdates = deferUpdates.asInstanceOf[js.Any], useOnlyNativeEvents = useOnlyNativeEvents.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_DeferUpdates]
  }
}


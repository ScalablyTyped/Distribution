package typings.jspdf

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGetContext extends js.Object {
  var style: js.Any
  def getContext(): js.Any
}

object AnonGetContext {
  @scala.inline
  def apply(getContext: () => js.Any, style: js.Any): AnonGetContext = {
    val __obj = js.Dynamic.literal(getContext = js.Any.fromFunction0(getContext), style = style.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonGetContext]
  }
}


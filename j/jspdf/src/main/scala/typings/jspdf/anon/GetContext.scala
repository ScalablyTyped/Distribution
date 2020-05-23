package typings.jspdf.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetContext extends js.Object {
  var style: js.Any
  def getContext(): js.Any
}

object GetContext {
  @scala.inline
  def apply(getContext: () => js.Any, style: js.Any): GetContext = {
    val __obj = js.Dynamic.literal(getContext = js.Any.fromFunction0(getContext), style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetContext]
  }
}


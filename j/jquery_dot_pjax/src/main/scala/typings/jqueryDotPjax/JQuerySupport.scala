package typings.jqueryDotPjax

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQuerySupport extends js.Object {
  /**
    * A boolean value indicates if pjax is supported by the browser.
    */
  var pjax: Boolean
}

object JQuerySupport {
  @scala.inline
  def apply(pjax: Boolean): JQuerySupport = {
    val __obj = js.Dynamic.literal(pjax = pjax)
  
    __obj.asInstanceOf[JQuerySupport]
  }
}


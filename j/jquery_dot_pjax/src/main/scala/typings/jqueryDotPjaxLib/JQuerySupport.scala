package typings
package jqueryDotPjaxLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQuerySupport extends js.Object {
  /**
    * A boolean value indicates if pjax is supported by the browser.
    */
  var pjax: scala.Boolean
}

object JQuerySupport {
  @scala.inline
  def apply(pjax: scala.Boolean): JQuerySupport = {
    val __obj = js.Dynamic.literal(pjax = pjax)
  
    __obj.asInstanceOf[JQuerySupport]
  }
}


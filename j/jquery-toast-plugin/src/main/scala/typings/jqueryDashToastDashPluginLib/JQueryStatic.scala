package typings
package jqueryDashToastDashPluginLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQueryStatic extends js.Object {
  def toast(options: toastOptions): scala.Unit
}

object JQueryStatic {
  @scala.inline
  def apply(toast: toastOptions => scala.Unit): JQueryStatic = {
    val __obj = js.Dynamic.literal(toast = js.Any.fromFunction1(toast))
  
    __obj.asInstanceOf[JQueryStatic]
  }
}


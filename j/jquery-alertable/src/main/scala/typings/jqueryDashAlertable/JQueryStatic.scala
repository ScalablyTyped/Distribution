package typings.jqueryDashAlertable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQueryStatic extends js.Object {
  var alertable: Alertable
}

object JQueryStatic {
  @scala.inline
  def apply(alertable: Alertable): JQueryStatic = {
    val __obj = js.Dynamic.literal(alertable = alertable.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[JQueryStatic]
  }
}


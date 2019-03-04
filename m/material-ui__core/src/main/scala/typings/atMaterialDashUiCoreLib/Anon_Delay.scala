package typings
package atMaterialDashUiCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Delay extends js.Object {
  var delay: scala.Double | java.lang.String
  var duration: scala.Double | java.lang.String
  var easing: java.lang.String
}

object Anon_Delay {
  @scala.inline
  def apply(
    delay: scala.Double | java.lang.String,
    duration: scala.Double | java.lang.String,
    easing: java.lang.String
  ): Anon_Delay = {
    val __obj = js.Dynamic.literal(delay = delay.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], easing = easing)
  
    __obj.asInstanceOf[Anon_Delay]
  }
}


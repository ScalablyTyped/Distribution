package typings.kamailioDashKemi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofpresence_xml extends js.Object {
  def pres_check_activities(pres_uri: String, activity: String): Double
  def pres_check_basic(pres_uri: String, status: String): Double
}

object Typeofpresence_xml {
  @scala.inline
  def apply(pres_check_activities: (String, String) => Double, pres_check_basic: (String, String) => Double): Typeofpresence_xml = {
    val __obj = js.Dynamic.literal(pres_check_activities = js.Any.fromFunction2(pres_check_activities), pres_check_basic = js.Any.fromFunction2(pres_check_basic))
  
    __obj.asInstanceOf[Typeofpresence_xml]
  }
}


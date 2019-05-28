package typings
package kamailioDashKemiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofpresence_xml extends js.Object {
  def pres_check_activities(pres_uri: java.lang.String, activity: java.lang.String): scala.Double
  def pres_check_basic(pres_uri: java.lang.String, status: java.lang.String): scala.Double
}

object Typeofpresence_xml {
  @scala.inline
  def apply(
    pres_check_activities: (java.lang.String, java.lang.String) => scala.Double,
    pres_check_basic: (java.lang.String, java.lang.String) => scala.Double
  ): Typeofpresence_xml = {
    val __obj = js.Dynamic.literal(pres_check_activities = js.Any.fromFunction2(pres_check_activities), pres_check_basic = js.Any.fromFunction2(pres_check_basic))
  
    __obj.asInstanceOf[Typeofpresence_xml]
  }
}


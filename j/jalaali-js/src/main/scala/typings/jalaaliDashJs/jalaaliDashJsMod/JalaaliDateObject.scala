package typings.jalaaliDashJs.jalaaliDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JalaaliDateObject extends js.Object {
  /** Jalaali day */
  var jd: Double
  /** Jalaali month */
  var jm: Double
  /** Jalaali year */
  var jy: Double
}

object JalaaliDateObject {
  @scala.inline
  def apply(jd: Double, jm: Double, jy: Double): JalaaliDateObject = {
    val __obj = js.Dynamic.literal(jd = jd.asInstanceOf[js.Any], jm = jm.asInstanceOf[js.Any], jy = jy.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[JalaaliDateObject]
  }
}


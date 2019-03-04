package typings
package jalaaliDashJsLib.jalaaliDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JalaaliDateObject extends js.Object {
  /** Jalaali day */
  var jd: scala.Double
  /** Jalaali month */
  var jm: scala.Double
  /** Jalaali year */
  var jy: scala.Double
}

object JalaaliDateObject {
  @scala.inline
  def apply(jd: scala.Double, jm: scala.Double, jy: scala.Double): JalaaliDateObject = {
    val __obj = js.Dynamic.literal(jd = jd, jm = jm, jy = jy)
  
    __obj.asInstanceOf[JalaaliDateObject]
  }
}


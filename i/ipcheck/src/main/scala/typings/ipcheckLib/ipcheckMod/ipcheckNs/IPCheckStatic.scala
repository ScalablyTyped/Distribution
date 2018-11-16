package typings
package ipcheckLib.ipcheckMod.ipcheckNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPCheckStatic extends IPCheckConstructor {
  def `match`(ip: IPCheck, cidr: IPCheck): scala.Boolean = js.native
  def `match`(ip: IPCheck, cidr: java.lang.String): scala.Boolean = js.native
  def `match`(ip: java.lang.String, cidr: IPCheck): scala.Boolean = js.native
  def `match`(ip: java.lang.String, cidr: java.lang.String): scala.Boolean = js.native
}


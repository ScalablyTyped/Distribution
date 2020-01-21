package typings.ipcheck.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPCheckStatic extends IPCheckConstructor {
  def `match`(ip: String, cidr: String): Boolean = js.native
  def `match`(ip: String, cidr: IPCheck): Boolean = js.native
  def `match`(ip: IPCheck, cidr: String): Boolean = js.native
  def `match`(ip: IPCheck, cidr: IPCheck): Boolean = js.native
}


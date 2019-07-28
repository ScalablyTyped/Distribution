package typings.log4js.log4jsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Level extends js.Object {
  var colour: String = js.native
  var level: Double = js.native
  var levelStr: String = js.native
  def isEqualTo(otherLevel: Level): Boolean = js.native
  def isEqualTo(other: String): Boolean = js.native
  def isGreaterThanOrEqualTo(otherLevel: Level): Boolean = js.native
  def isGreaterThanOrEqualTo(other: String): Boolean = js.native
  def isLessThanOrEqualTo(otherLevel: Level): Boolean = js.native
  def isLessThanOrEqualTo(other: String): Boolean = js.native
}


package typings
package log4jsLib.log4jsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Level extends js.Object {
  var colour: java.lang.String = js.native
  var level: scala.Double = js.native
  var levelStr: java.lang.String = js.native
  def isEqualTo(otherLevel: Level): scala.Boolean = js.native
  def isEqualTo(other: java.lang.String): scala.Boolean = js.native
  def isGreaterThanOrEqualTo(otherLevel: Level): scala.Boolean = js.native
  def isGreaterThanOrEqualTo(other: java.lang.String): scala.Boolean = js.native
  def isLessThanOrEqualTo(otherLevel: Level): scala.Boolean = js.native
  def isLessThanOrEqualTo(other: java.lang.String): scala.Boolean = js.native
}


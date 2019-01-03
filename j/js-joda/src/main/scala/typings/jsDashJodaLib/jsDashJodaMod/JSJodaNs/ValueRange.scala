package typings
package jsDashJodaLib.jsDashJodaMod.JSJodaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValueRange extends js.Object {
  def checkValidIntValue(value: scala.Double, field: TemporalField): scala.Double
  def checkValidValue(value: scala.Double, field: TemporalField): js.Any
  def equals(other: js.Any): scala.Boolean
  def isFixed(): scala.Boolean
  def isIntValue(): scala.Boolean
  def isValidIntValue(value: scala.Double): scala.Boolean
  def isValidValue(value: js.Any): scala.Boolean
  def largestMinimum(): scala.Double
  def maximum(): scala.Double
  def minimum(): scala.Double
  def smallestMaximum(): scala.Double
}


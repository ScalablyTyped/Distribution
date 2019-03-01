package typings
package jestDashCliLib.jestDashCliMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssertionResult extends js.Object {
  var ancestorTitles: js.Array[java.lang.String]
  var duration: js.UndefOr[scala.Double] = js.undefined
  var failureMessages: js.Array[java.lang.String]
  var fullName: java.lang.String
  var location: js.UndefOr[Callsite] = js.undefined
  var numPassingAsserts: scala.Double
  var status: Status
  var title: java.lang.String
}

object AssertionResult {
  @scala.inline
  def apply(
    ancestorTitles: js.Array[java.lang.String],
    failureMessages: js.Array[java.lang.String],
    fullName: java.lang.String,
    numPassingAsserts: scala.Double,
    status: Status,
    title: java.lang.String,
    duration: scala.Int | scala.Double = null,
    location: Callsite = null
  ): AssertionResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ancestorTitles")(ancestorTitles)
    __obj.updateDynamic("failureMessages")(failureMessages)
    __obj.updateDynamic("fullName")(fullName)
    __obj.updateDynamic("numPassingAsserts")(numPassingAsserts)
    __obj.updateDynamic("status")(status)
    __obj.updateDynamic("title")(title)
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location)
    __obj.asInstanceOf[AssertionResult]
  }
}


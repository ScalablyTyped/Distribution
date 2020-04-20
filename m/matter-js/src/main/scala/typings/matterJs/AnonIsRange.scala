package typings.matterJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIsRange extends js.Object {
  var isRange: Boolean
  var number: Double
  var operator: String
  var parts: js.Array[Double]
  var prerelease: String
  var range: String
  var version: String
}

object AnonIsRange {
  @scala.inline
  def apply(
    isRange: Boolean,
    number: Double,
    operator: String,
    parts: js.Array[Double],
    prerelease: String,
    range: String,
    version: String
  ): AnonIsRange = {
    val __obj = js.Dynamic.literal(isRange = isRange.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], parts = parts.asInstanceOf[js.Any], prerelease = prerelease.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIsRange]
  }
}


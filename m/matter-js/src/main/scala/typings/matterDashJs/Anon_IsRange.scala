package typings.matterDashJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IsRange extends js.Object {
  var isRange: Boolean
  var number: Double
  var operator: String
  var parts: js.Array[Double]
  var prerelease: String
  var range: String
  var version: String
}

object Anon_IsRange {
  @scala.inline
  def apply(
    isRange: Boolean,
    number: Double,
    operator: String,
    parts: js.Array[Double],
    prerelease: String,
    range: String,
    version: String
  ): Anon_IsRange = {
    val __obj = js.Dynamic.literal(isRange = isRange, number = number, operator = operator, parts = parts, prerelease = prerelease, range = range, version = version)
  
    __obj.asInstanceOf[Anon_IsRange]
  }
}


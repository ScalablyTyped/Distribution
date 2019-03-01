package typings
package matterDashJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IsRange extends js.Object {
  var isRange: scala.Boolean
  var number: scala.Double
  var operator: java.lang.String
  var parts: js.Array[scala.Double]
  var prerelease: java.lang.String
  var range: java.lang.String
  var version: java.lang.String
}

object Anon_IsRange {
  @scala.inline
  def apply(
    isRange: scala.Boolean,
    number: scala.Double,
    operator: java.lang.String,
    parts: js.Array[scala.Double],
    prerelease: java.lang.String,
    range: java.lang.String,
    version: java.lang.String
  ): Anon_IsRange = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("isRange")(isRange)
    __obj.updateDynamic("number")(number)
    __obj.updateDynamic("operator")(operator)
    __obj.updateDynamic("parts")(parts)
    __obj.updateDynamic("prerelease")(prerelease)
    __obj.updateDynamic("range")(range)
    __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[Anon_IsRange]
  }
}


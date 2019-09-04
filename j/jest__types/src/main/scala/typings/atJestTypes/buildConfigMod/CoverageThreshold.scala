package typings.atJestTypes.buildConfigMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CoverageThreshold extends /* path */ StringDictionary[StringDictionary[Double]] {
  var global: StringDictionary[Double]
}

object CoverageThreshold {
  @scala.inline
  def apply(
    global: StringDictionary[Double],
    StringDictionary: /* path */ StringDictionary[StringDictionary[Double]] = null
  ): CoverageThreshold = {
    val __obj = js.Dynamic.literal(global = global)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[CoverageThreshold]
  }
}


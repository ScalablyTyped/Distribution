package typings
package karmaDashCoverageLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Reporters extends js.Object {
  var reporters: js.UndefOr[js.Array[karmaDashCoverageLib.karmaMod.KarmaCoverageReporter]] = js.undefined
}

object Anon_Reporters {
  @scala.inline
  def apply(reporters: js.Array[karmaDashCoverageLib.karmaMod.KarmaCoverageReporter] = null): Anon_Reporters = {
    val __obj = js.Dynamic.literal()
    if (reporters != null) __obj.updateDynamic("reporters")(reporters)
    __obj.asInstanceOf[Anon_Reporters]
  }
}


package typings
package jasmineDashNodeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Consolidate extends js.Object {
  var consolidate: scala.Boolean
  var report: scala.Boolean
  var savePath: java.lang.String
  var useDotNotation: scala.Boolean
}

object Anon_Consolidate {
  @scala.inline
  def apply(
    consolidate: scala.Boolean,
    report: scala.Boolean,
    savePath: java.lang.String,
    useDotNotation: scala.Boolean
  ): Anon_Consolidate = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("consolidate")(consolidate)
    __obj.updateDynamic("report")(report)
    __obj.updateDynamic("savePath")(savePath)
    __obj.updateDynamic("useDotNotation")(useDotNotation)
    __obj.asInstanceOf[Anon_Consolidate]
  }
}


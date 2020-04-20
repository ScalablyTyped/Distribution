package typings.jasmineNode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonConsolidate extends js.Object {
  var consolidate: Boolean
  var report: Boolean
  var savePath: String
  var useDotNotation: Boolean
}

object AnonConsolidate {
  @scala.inline
  def apply(consolidate: Boolean, report: Boolean, savePath: String, useDotNotation: Boolean): AnonConsolidate = {
    val __obj = js.Dynamic.literal(consolidate = consolidate.asInstanceOf[js.Any], report = report.asInstanceOf[js.Any], savePath = savePath.asInstanceOf[js.Any], useDotNotation = useDotNotation.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonConsolidate]
  }
}


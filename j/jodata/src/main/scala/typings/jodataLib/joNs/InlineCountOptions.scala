package typings
package jodataLib.joNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InlineCountOptions extends js.Object {
  def allPages(): jodataLib.jo
  def none(): jodataLib.jo
}

object InlineCountOptions {
  @scala.inline
  def apply(allPages: js.Function0[jodataLib.jo], none: js.Function0[jodataLib.jo]): InlineCountOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("allPages")(allPages)
    __obj.updateDynamic("none")(none)
    __obj.asInstanceOf[InlineCountOptions]
  }
}


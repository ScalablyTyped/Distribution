package typings.kendoUi.kendo.data

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PivotDiscoverRequestDataOptions extends js.Object {
  var command: String
  var restrictions: PivotDiscoverRequestRestrictionOptions
}

object PivotDiscoverRequestDataOptions {
  @scala.inline
  def apply(command: String, restrictions: PivotDiscoverRequestRestrictionOptions): PivotDiscoverRequestDataOptions = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], restrictions = restrictions.asInstanceOf[js.Any])
    __obj.asInstanceOf[PivotDiscoverRequestDataOptions]
  }
}


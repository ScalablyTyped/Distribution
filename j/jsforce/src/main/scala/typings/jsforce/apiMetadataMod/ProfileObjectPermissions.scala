package typings.jsforce.apiMetadataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProfileObjectPermissions extends js.Object {
  var allowCreate: js.UndefOr[Boolean] = js.undefined
  var allowDelete: js.UndefOr[Boolean] = js.undefined
  var allowEdit: js.UndefOr[Boolean] = js.undefined
  var allowRead: js.UndefOr[Boolean] = js.undefined
  var modifyAllRecords: js.UndefOr[Boolean] = js.undefined
  var `object`: String
  var viewAllRecords: js.UndefOr[Boolean] = js.undefined
}

object ProfileObjectPermissions {
  @scala.inline
  def apply(
    `object`: String,
    allowCreate: js.UndefOr[Boolean] = js.undefined,
    allowDelete: js.UndefOr[Boolean] = js.undefined,
    allowEdit: js.UndefOr[Boolean] = js.undefined,
    allowRead: js.UndefOr[Boolean] = js.undefined,
    modifyAllRecords: js.UndefOr[Boolean] = js.undefined,
    viewAllRecords: js.UndefOr[Boolean] = js.undefined
  ): ProfileObjectPermissions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    if (!js.isUndefined(allowCreate)) __obj.updateDynamic("allowCreate")(allowCreate.asInstanceOf[js.Any])
    if (!js.isUndefined(allowDelete)) __obj.updateDynamic("allowDelete")(allowDelete.asInstanceOf[js.Any])
    if (!js.isUndefined(allowEdit)) __obj.updateDynamic("allowEdit")(allowEdit.asInstanceOf[js.Any])
    if (!js.isUndefined(allowRead)) __obj.updateDynamic("allowRead")(allowRead.asInstanceOf[js.Any])
    if (!js.isUndefined(modifyAllRecords)) __obj.updateDynamic("modifyAllRecords")(modifyAllRecords.asInstanceOf[js.Any])
    if (!js.isUndefined(viewAllRecords)) __obj.updateDynamic("viewAllRecords")(viewAllRecords.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProfileObjectPermissions]
  }
}


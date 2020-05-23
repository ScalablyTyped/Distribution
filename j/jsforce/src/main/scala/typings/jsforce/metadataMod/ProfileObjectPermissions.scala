package typings.jsforce.metadataMod

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
    if (!js.isUndefined(allowCreate)) __obj.updateDynamic("allowCreate")(allowCreate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(allowDelete)) __obj.updateDynamic("allowDelete")(allowDelete.get.asInstanceOf[js.Any])
    if (!js.isUndefined(allowEdit)) __obj.updateDynamic("allowEdit")(allowEdit.get.asInstanceOf[js.Any])
    if (!js.isUndefined(allowRead)) __obj.updateDynamic("allowRead")(allowRead.get.asInstanceOf[js.Any])
    if (!js.isUndefined(modifyAllRecords)) __obj.updateDynamic("modifyAllRecords")(modifyAllRecords.get.asInstanceOf[js.Any])
    if (!js.isUndefined(viewAllRecords)) __obj.updateDynamic("viewAllRecords")(viewAllRecords.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProfileObjectPermissions]
  }
}


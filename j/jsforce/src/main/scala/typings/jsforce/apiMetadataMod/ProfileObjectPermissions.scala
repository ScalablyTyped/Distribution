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
    __obj.updateDynamic("object")(`object`)
    if (!js.isUndefined(allowCreate)) __obj.updateDynamic("allowCreate")(allowCreate)
    if (!js.isUndefined(allowDelete)) __obj.updateDynamic("allowDelete")(allowDelete)
    if (!js.isUndefined(allowEdit)) __obj.updateDynamic("allowEdit")(allowEdit)
    if (!js.isUndefined(allowRead)) __obj.updateDynamic("allowRead")(allowRead)
    if (!js.isUndefined(modifyAllRecords)) __obj.updateDynamic("modifyAllRecords")(modifyAllRecords)
    if (!js.isUndefined(viewAllRecords)) __obj.updateDynamic("viewAllRecords")(viewAllRecords)
    __obj.asInstanceOf[ProfileObjectPermissions]
  }
}


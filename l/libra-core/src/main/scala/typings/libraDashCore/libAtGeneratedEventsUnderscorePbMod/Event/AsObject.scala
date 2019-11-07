package typings.libraDashCore.libAtGeneratedEventsUnderscorePbMod.Event

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsObject extends js.Object {
  var accessPath: js.UndefOr[
    typings.libraDashCore.libAtGeneratedAccessUnderscorePathUnderscorePbMod.AccessPath.AsObject
  ] = js.undefined
  var eventData: Uint8Array | String
  var sequenceNumber: String
}

object AsObject {
  @scala.inline
  def apply(
    eventData: Uint8Array | String,
    sequenceNumber: String,
    accessPath: typings.libraDashCore.libAtGeneratedAccessUnderscorePathUnderscorePbMod.AccessPath.AsObject = null
  ): AsObject = {
    val __obj = js.Dynamic.literal(eventData = eventData.asInstanceOf[js.Any], sequenceNumber = sequenceNumber)
    if (accessPath != null) __obj.updateDynamic("accessPath")(accessPath)
    __obj.asInstanceOf[AsObject]
  }
}


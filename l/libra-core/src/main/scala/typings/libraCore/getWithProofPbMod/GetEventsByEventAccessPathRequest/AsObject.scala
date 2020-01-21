package typings.libraCore.getWithProofPbMod.GetEventsByEventAccessPathRequest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsObject extends js.Object {
  var accessPath: js.UndefOr[typings.libraCore.accessPathPbMod.AccessPath.AsObject] = js.undefined
  var ascending: Boolean
  var limit: String
  var startEventSeqNum: String
}

object AsObject {
  @scala.inline
  def apply(
    ascending: Boolean,
    limit: String,
    startEventSeqNum: String,
    accessPath: typings.libraCore.accessPathPbMod.AccessPath.AsObject = null
  ): AsObject = {
    val __obj = js.Dynamic.literal(ascending = ascending.asInstanceOf[js.Any], limit = limit.asInstanceOf[js.Any], startEventSeqNum = startEventSeqNum.asInstanceOf[js.Any])
    if (accessPath != null) __obj.updateDynamic("accessPath")(accessPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsObject]
  }
}


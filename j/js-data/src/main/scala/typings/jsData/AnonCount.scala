package typings.jsData

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCount extends js.Object {
  var count: AnonDefaults
  var destroy: AnonDefaults
  var destroyAll: AnonDefaults
  var find: AnonTypes
  var findAll: AnonTypes
  var sum: AnonDefaults
  var update: AnonAdapterArgs
  var updateAll: AnonAdapterArgs
  var updateMany: AnonBeforeAssign
}

object AnonCount {
  @scala.inline
  def apply(
    count: AnonDefaults,
    destroy: AnonDefaults,
    destroyAll: AnonDefaults,
    find: AnonTypes,
    findAll: AnonTypes,
    sum: AnonDefaults,
    update: AnonAdapterArgs,
    updateAll: AnonAdapterArgs,
    updateMany: AnonBeforeAssign
  ): AnonCount = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], destroy = destroy.asInstanceOf[js.Any], destroyAll = destroyAll.asInstanceOf[js.Any], find = find.asInstanceOf[js.Any], findAll = findAll.asInstanceOf[js.Any], sum = sum.asInstanceOf[js.Any], update = update.asInstanceOf[js.Any], updateAll = updateAll.asInstanceOf[js.Any], updateMany = updateMany.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCount]
  }
}


package typings.jsData.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Count extends js.Object {
  var count: Defaults
  var destroy: Defaults
  var destroyAll: Defaults
  var find: Types
  var findAll: Types
  var sum: Defaults
  var update: AdapterArgs
  var updateAll: AdapterArgs
  var updateMany: BeforeAssign
}

object Count {
  @scala.inline
  def apply(
    count: Defaults,
    destroy: Defaults,
    destroyAll: Defaults,
    find: Types,
    findAll: Types,
    sum: Defaults,
    update: AdapterArgs,
    updateAll: AdapterArgs,
    updateMany: BeforeAssign
  ): Count = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], destroy = destroy.asInstanceOf[js.Any], destroyAll = destroyAll.asInstanceOf[js.Any], find = find.asInstanceOf[js.Any], findAll = findAll.asInstanceOf[js.Any], sum = sum.asInstanceOf[js.Any], update = update.asInstanceOf[js.Any], updateAll = updateAll.asInstanceOf[js.Any], updateMany = updateMany.asInstanceOf[js.Any])
    __obj.asInstanceOf[Count]
  }
}


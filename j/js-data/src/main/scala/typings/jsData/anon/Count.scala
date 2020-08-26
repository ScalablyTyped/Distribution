package typings.jsData.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Count extends js.Object {
  var count: Defaults = js.native
  var destroy: Defaults = js.native
  var destroyAll: Defaults = js.native
  var find: Types = js.native
  var findAll: Types = js.native
  var sum: Defaults = js.native
  var update: AdapterArgs = js.native
  var updateAll: AdapterArgs = js.native
  var updateMany: BeforeAssign = js.native
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
  @scala.inline
  implicit class CountOps[Self <: Count] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCount(value: Defaults): Self = this.set("count", value.asInstanceOf[js.Any])
    @scala.inline
    def setDestroy(value: Defaults): Self = this.set("destroy", value.asInstanceOf[js.Any])
    @scala.inline
    def setDestroyAll(value: Defaults): Self = this.set("destroyAll", value.asInstanceOf[js.Any])
    @scala.inline
    def setFind(value: Types): Self = this.set("find", value.asInstanceOf[js.Any])
    @scala.inline
    def setFindAll(value: Types): Self = this.set("findAll", value.asInstanceOf[js.Any])
    @scala.inline
    def setSum(value: Defaults): Self = this.set("sum", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdate(value: AdapterArgs): Self = this.set("update", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdateAll(value: AdapterArgs): Self = this.set("updateAll", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdateMany(value: BeforeAssign): Self = this.set("updateMany", value.asInstanceOf[js.Any])
  }
  
}


package typings.knockoutKogrid.kg

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Row[EntityType] extends js.Object {
  var entity: EntityType = js.native
  var selected: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<boolean> */ js.Any = js.native
}

object Row {
  @scala.inline
  def apply[EntityType](
    entity: EntityType,
    selected: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<boolean> */ js.Any
  ): Row[EntityType] = {
    val __obj = js.Dynamic.literal(entity = entity.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any])
    __obj.asInstanceOf[Row[EntityType]]
  }
  @scala.inline
  implicit class RowOps[Self <: Row[_], EntityType] (val x: Self with Row[EntityType]) extends AnyVal {
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
    def setEntity(value: EntityType): Self = this.set("entity", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelected(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<boolean> */ js.Any
    ): Self = this.set("selected", value.asInstanceOf[js.Any])
  }
  
}


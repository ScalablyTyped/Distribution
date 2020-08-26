package typings.linq4js.Linq4JS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GeneratedEntity extends js.Object {
  var Id: Double = js.native
  var _GeneratedId_ : Double = js.native
}

object GeneratedEntity {
  @scala.inline
  def apply(Id: Double, _GeneratedId_ : Double): GeneratedEntity = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], _GeneratedId_ = _GeneratedId_.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeneratedEntity]
  }
  @scala.inline
  implicit class GeneratedEntityOps[Self <: GeneratedEntity] (val x: Self) extends AnyVal {
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
    def setId(value: Double): Self = this.set("Id", value.asInstanceOf[js.Any])
    @scala.inline
    def set_GeneratedId_(value: Double): Self = this.set("_GeneratedId_", value.asInstanceOf[js.Any])
  }
  
}


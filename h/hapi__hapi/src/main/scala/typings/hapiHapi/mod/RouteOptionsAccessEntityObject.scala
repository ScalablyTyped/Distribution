package typings.hapiHapi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RouteOptionsAccessEntityObject extends _RouteOptionsAccessObject {
  var entity: AccessEntity = js.native
}

object RouteOptionsAccessEntityObject {
  @scala.inline
  def apply(entity: AccessEntity): RouteOptionsAccessEntityObject = {
    val __obj = js.Dynamic.literal(entity = entity.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteOptionsAccessEntityObject]
  }
  @scala.inline
  implicit class RouteOptionsAccessEntityObjectOps[Self <: RouteOptionsAccessEntityObject] (val x: Self) extends AnyVal {
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
    def setEntity(value: AccessEntity): Self = this.set("entity", value.asInstanceOf[js.Any])
  }
  
}


package typings.loopback.anon

import typings.loopback.mod.Model
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccessType extends js.Object {
  var accessType: String = js.native
  var id: js.Any = js.native
  var model: String | Model = js.native
  var principals: js.Array[_] = js.native
  var property: String = js.native
}

object AccessType {
  @scala.inline
  def apply(accessType: String, id: js.Any, model: String | Model, principals: js.Array[_], property: String): AccessType = {
    val __obj = js.Dynamic.literal(accessType = accessType.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any], principals = principals.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccessType]
  }
  @scala.inline
  implicit class AccessTypeOps[Self <: AccessType] (val x: Self) extends AnyVal {
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
    def setAccessType(value: String): Self = this.set("accessType", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: js.Any): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setModel(value: String | Model): Self = this.set("model", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrincipalsVarargs(value: js.Any*): Self = this.set("principals", js.Array(value :_*))
    @scala.inline
    def setPrincipals(value: js.Array[_]): Self = this.set("principals", value.asInstanceOf[js.Any])
    @scala.inline
    def setProperty(value: String): Self = this.set("property", value.asInstanceOf[js.Any])
  }
  
}


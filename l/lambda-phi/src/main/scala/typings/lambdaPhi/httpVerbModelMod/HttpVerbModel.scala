package typings.lambdaPhi.httpVerbModelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HttpVerbModel extends js.Object {
  var _methodName: js.Any = js.native
  var _name: js.Any = js.native
  var methodName: String = js.native
  var name: String = js.native
}

object HttpVerbModel {
  @scala.inline
  def apply(_methodName: js.Any, _name: js.Any, methodName: String, name: String): HttpVerbModel = {
    val __obj = js.Dynamic.literal(_methodName = _methodName.asInstanceOf[js.Any], _name = _name.asInstanceOf[js.Any], methodName = methodName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpVerbModel]
  }
  @scala.inline
  implicit class HttpVerbModelOps[Self <: HttpVerbModel] (val x: Self) extends AnyVal {
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
    def set_methodName(value: js.Any): Self = this.set("_methodName", value.asInstanceOf[js.Any])
    @scala.inline
    def set_name(value: js.Any): Self = this.set("_name", value.asInstanceOf[js.Any])
    @scala.inline
    def setMethodName(value: String): Self = this.set("methodName", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}


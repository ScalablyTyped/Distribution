package typings.htmlWebpackTagsPlugin.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExternalObject extends js.Object {
  var packageName: String = js.native
  var variableName: String = js.native
}

object ExternalObject {
  @scala.inline
  def apply(packageName: String, variableName: String): ExternalObject = {
    val __obj = js.Dynamic.literal(packageName = packageName.asInstanceOf[js.Any], variableName = variableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExternalObject]
  }
  @scala.inline
  implicit class ExternalObjectOps[Self <: ExternalObject] (val x: Self) extends AnyVal {
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
    def setPackageName(value: String): Self = this.set("packageName", value.asInstanceOf[js.Any])
    @scala.inline
    def setVariableName(value: String): Self = this.set("variableName", value.asInstanceOf[js.Any])
  }
  
}


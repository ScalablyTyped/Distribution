package typings.knockoutPaging.KnockoutComponentTypes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ViewModelSharedInstance extends js.Object {
  var instance: js.Any = js.native
}

object ViewModelSharedInstance {
  @scala.inline
  def apply(instance: js.Any): ViewModelSharedInstance = {
    val __obj = js.Dynamic.literal(instance = instance.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewModelSharedInstance]
  }
  @scala.inline
  implicit class ViewModelSharedInstanceOps[Self <: ViewModelSharedInstance] (val x: Self) extends AnyVal {
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
    def setInstance(value: js.Any): Self = this.set("instance", value.asInstanceOf[js.Any])
  }
  
}


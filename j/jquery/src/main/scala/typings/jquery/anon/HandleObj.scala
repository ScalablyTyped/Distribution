package typings.jquery.anon

import typings.jquery.JQuery.HandleObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HandleObj[TTarget, TData] extends js.Object {
  var handleObj: HandleObject[TTarget, TData] = js.native
}

object HandleObj {
  @scala.inline
  def apply[TTarget, TData](handleObj: HandleObject[TTarget, TData]): HandleObj[TTarget, TData] = {
    val __obj = js.Dynamic.literal(handleObj = handleObj.asInstanceOf[js.Any])
    __obj.asInstanceOf[HandleObj[TTarget, TData]]
  }
  @scala.inline
  implicit class HandleObjOps[Self <: HandleObj[_, _], TTarget, TData] (val x: Self with (HandleObj[TTarget, TData])) extends AnyVal {
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
    def setHandleObj(value: HandleObject[TTarget, TData]): Self = this.set("handleObj", value.asInstanceOf[js.Any])
  }
  
}


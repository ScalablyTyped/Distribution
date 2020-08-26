package typings.hexo.mod.Router

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Data extends js.Object {
  var data: String | Buffer | Callback = js.native
  var modified: Boolean = js.native
}

object Data {
  @scala.inline
  def apply(data: String | Buffer | Callback, modified: Boolean): Data = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], modified = modified.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data]
  }
  @scala.inline
  implicit class DataOps[Self <: Data] (val x: Self) extends AnyVal {
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
    def setDataFunction2(value: (/* err */ js.Any, /* result */ String) => Unit): Self = this.set("data", js.Any.fromFunction2(value))
    @scala.inline
    def setDataFunction0(value: () => js.Promise[String]): Self = this.set("data", js.Any.fromFunction0(value))
    @scala.inline
    def setData(value: String | Buffer | Callback): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setModified(value: Boolean): Self = this.set("modified", value.asInstanceOf[js.Any])
  }
  
}


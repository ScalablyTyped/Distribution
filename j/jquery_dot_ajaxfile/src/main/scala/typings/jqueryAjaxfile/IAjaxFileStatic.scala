package typings.jqueryAjaxfile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAjaxFileStatic extends js.Object {
  var DataType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DataType */ js.Any = js.native
  def send[T](option: IOption): IAjaxFilePromise[T] = js.native
}

object IAjaxFileStatic {
  @scala.inline
  def apply(
    DataType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DataType */ js.Any,
    send: IOption => IAjaxFilePromise[js.Any]
  ): IAjaxFileStatic = {
    val __obj = js.Dynamic.literal(DataType = DataType.asInstanceOf[js.Any], send = js.Any.fromFunction1(send))
    __obj.asInstanceOf[IAjaxFileStatic]
  }
  @scala.inline
  implicit class IAjaxFileStaticOps[Self <: IAjaxFileStatic] (val x: Self) extends AnyVal {
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
    def setDataType(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DataType */ js.Any): Self = this.set("DataType", value.asInstanceOf[js.Any])
    @scala.inline
    def setSend(value: IOption => IAjaxFilePromise[js.Any]): Self = this.set("send", js.Any.fromFunction1(value))
  }
  
}


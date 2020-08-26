package typings.iobroker.anon

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestEnum extends js.Object {
  var requestEnum: String = js.native
  var result: Record[String, _] = js.native
}

object RequestEnum {
  @scala.inline
  def apply(requestEnum: String, result: Record[String, _]): RequestEnum = {
    val __obj = js.Dynamic.literal(requestEnum = requestEnum.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestEnum]
  }
  @scala.inline
  implicit class RequestEnumOps[Self <: RequestEnum] (val x: Self) extends AnyVal {
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
    def setRequestEnum(value: String): Self = this.set("requestEnum", value.asInstanceOf[js.Any])
    @scala.inline
    def setResult(value: Record[String, _]): Self = this.set("result", value.asInstanceOf[js.Any])
  }
  
}


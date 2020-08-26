package typings.jpm.FFAddonSDK

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @see [nsIException]{@link https://developer.mozilla.org/en-US/docs/Mozilla/Tech/XPCOM/Reference/Interface/nsIException}
  */
@js.native
trait NSIException extends js.Object {
  var columnNumber: Double = js.native
  var data: js.Any = js.native
  var filename: String = js.native
  var inner: js.UndefOr[NSIException] = js.native
  var lineNumber: Double = js.native
  var location: js.UndefOr[js.Any] = js.native
  var message: String = js.native
  var name: String = js.native
  var result: js.Any = js.native
}

object NSIException {
  @scala.inline
  def apply(
    columnNumber: Double,
    data: js.Any,
    filename: String,
    lineNumber: Double,
    message: String,
    name: String,
    result: js.Any
  ): NSIException = {
    val __obj = js.Dynamic.literal(columnNumber = columnNumber.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], lineNumber = lineNumber.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[NSIException]
  }
  @scala.inline
  implicit class NSIExceptionOps[Self <: NSIException] (val x: Self) extends AnyVal {
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
    def setColumnNumber(value: Double): Self = this.set("columnNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setFilename(value: String): Self = this.set("filename", value.asInstanceOf[js.Any])
    @scala.inline
    def setLineNumber(value: Double): Self = this.set("lineNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setResult(value: js.Any): Self = this.set("result", value.asInstanceOf[js.Any])
    @scala.inline
    def setInner(value: NSIException): Self = this.set("inner", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInner: Self = this.set("inner", js.undefined)
    @scala.inline
    def setLocation(value: js.Any): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
  }
  
}


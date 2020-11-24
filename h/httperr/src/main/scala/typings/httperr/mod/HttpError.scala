package typings.httperr.mod

import typings.std.Error
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An instance of the HttpError class. */
@js.native
trait HttpError extends Error {
  
  var code: String = js.native
  
  /** The HTTP response status code for the HTTP error. */
  var statusCode: Double = js.native
  
  /** A human-readable title for the HTTP error. */
  var title: String = js.native
  
  def toObject(skip: (String | RegExp)*): js.Any = js.native
}
object HttpError {
  
  @scala.inline
  def apply(
    code: String,
    message: String,
    name: String,
    statusCode: Double,
    title: String,
    toObject: /* repeated */ String | RegExp => js.Any
  ): HttpError = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], toObject = js.Any.fromFunction1(toObject))
    __obj.asInstanceOf[HttpError]
  }
  
  @scala.inline
  implicit class HttpErrorOps[Self <: HttpError] (val x: Self) extends AnyVal {
    
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
    def setCode(value: String): Self = this.set("code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusCode(value: Double): Self = this.set("statusCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToObject(value: /* repeated */ String | RegExp => js.Any): Self = this.set("toObject", js.Any.fromFunction1(value))
  }
}

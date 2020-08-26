package typings.hapiAuthJwt2.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ErrorContext extends js.Object {
  /**
    * attributes passed into the Boom method call
    */
  var attributes: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * Boom method to call (eg. unauthorized)
    */
  var errorType: String = js.native
  /**
    * message passed into the Boom method call
    */
  var message: js.UndefOr[String] = js.native
  /**
    * schema passed into the Boom method call
    */
  var schema: String = js.native
}

object ErrorContext {
  @scala.inline
  def apply(errorType: String, schema: String): ErrorContext = {
    val __obj = js.Dynamic.literal(errorType = errorType.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorContext]
  }
  @scala.inline
  implicit class ErrorContextOps[Self <: ErrorContext] (val x: Self) extends AnyVal {
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
    def setErrorType(value: String): Self = this.set("errorType", value.asInstanceOf[js.Any])
    @scala.inline
    def setSchema(value: String): Self = this.set("schema", value.asInstanceOf[js.Any])
    @scala.inline
    def setAttributes(value: StringDictionary[String]): Self = this.set("attributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttributes: Self = this.set("attributes", js.undefined)
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
  }
  
}


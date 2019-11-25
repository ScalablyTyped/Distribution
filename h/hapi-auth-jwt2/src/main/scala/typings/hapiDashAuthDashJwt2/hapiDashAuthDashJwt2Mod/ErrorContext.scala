package typings.hapiDashAuthDashJwt2.hapiDashAuthDashJwt2Mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorContext extends js.Object {
  /**
    * attributes passed into the Boom method call
    */
  var attributes: js.UndefOr[StringDictionary[String]] = js.undefined
  /**
    * Boom method to call (eg. unauthorized)
    */
  var errorType: String
  /**
    * message passed into the Boom method call
    */
  var message: js.UndefOr[String] = js.undefined
  /**
    * schema passed into the Boom method call
    */
  var schema: String
}

object ErrorContext {
  @scala.inline
  def apply(
    errorType: String,
    schema: String,
    attributes: StringDictionary[String] = null,
    message: String = null
  ): ErrorContext = {
    val __obj = js.Dynamic.literal(errorType = errorType.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any])
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorContext]
  }
}


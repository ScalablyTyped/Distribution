package typings.jqueryValidationUnobtrusive.MicrosoftJQueryUnobtrusiveValidation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Adapter extends js.Object {
  var adapt: js.Function
  var name: String
  var params: js.Array[String]
}

object Adapter {
  @scala.inline
  def apply(adapt: js.Function, name: String, params: js.Array[String]): Adapter = {
    val __obj = js.Dynamic.literal(adapt = adapt.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Adapter]
  }
}


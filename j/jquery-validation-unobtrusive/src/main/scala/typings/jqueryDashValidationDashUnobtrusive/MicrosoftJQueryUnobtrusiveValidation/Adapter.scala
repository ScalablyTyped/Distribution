package typings.jqueryDashValidationDashUnobtrusive.MicrosoftJQueryUnobtrusiveValidation

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
    val __obj = js.Dynamic.literal(adapt = adapt, name = name, params = params)
  
    __obj.asInstanceOf[Adapter]
  }
}


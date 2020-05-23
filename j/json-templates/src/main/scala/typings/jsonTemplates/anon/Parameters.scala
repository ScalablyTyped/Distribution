package typings.jsonTemplates.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Parameters extends js.Object {
  var parameters: js.Array[DefaultValue]
}

object Parameters {
  @scala.inline
  def apply(parameters: js.Array[DefaultValue]): Parameters = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters]
  }
}


package typings.jqueryAjaxfile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Elements in the array returned by serializeArray()
  */
trait JQuerySerializeArrayElement extends js.Object {
  var name: String
  var value: String
}

object JQuerySerializeArrayElement {
  @scala.inline
  def apply(name: String, value: String): JQuerySerializeArrayElement = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[JQuerySerializeArrayElement]
  }
}


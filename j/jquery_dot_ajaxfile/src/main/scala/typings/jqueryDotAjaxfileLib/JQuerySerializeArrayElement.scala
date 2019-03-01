package typings
package jqueryDotAjaxfileLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Elements in the array returned by serializeArray()
  */
trait JQuerySerializeArrayElement extends js.Object {
  var name: java.lang.String
  var value: java.lang.String
}

object JQuerySerializeArrayElement {
  @scala.inline
  def apply(name: java.lang.String, value: java.lang.String): JQuerySerializeArrayElement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[JQuerySerializeArrayElement]
  }
}


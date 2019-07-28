package typings.ldapjs.ldapjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttributeJson extends js.Object {
  var `type`: String
  var vals: js.Array[String]
}

object AttributeJson {
  @scala.inline
  def apply(`type`: String, vals: js.Array[String]): AttributeJson = {
    val __obj = js.Dynamic.literal(vals = vals)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[AttributeJson]
  }
}


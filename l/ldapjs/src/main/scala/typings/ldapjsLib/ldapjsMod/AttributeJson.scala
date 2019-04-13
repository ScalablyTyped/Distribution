package typings
package ldapjsLib.ldapjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttributeJson extends js.Object {
  var `type`: java.lang.String
  var vals: js.Array[java.lang.String]
}

object AttributeJson {
  @scala.inline
  def apply(`type`: java.lang.String, vals: js.Array[java.lang.String]): AttributeJson = {
    val __obj = js.Dynamic.literal(vals = vals)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[AttributeJson]
  }
}


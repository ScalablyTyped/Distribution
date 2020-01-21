package typings.ldapjs

import typings.ldapjs.mod.AttributeJson
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAttributes extends js.Object {
  var attributes: js.Array[AttributeJson]
  var objectName: String
}

object AnonAttributes {
  @scala.inline
  def apply(attributes: js.Array[AttributeJson], objectName: String): AnonAttributes = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], objectName = objectName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAttributes]
  }
}


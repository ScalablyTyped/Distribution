package typings.ldapjs

import typings.ldapjs.ldapjsMod.AttributeJson
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Attributes extends js.Object {
  var attributes: js.Array[AttributeJson]
  var objectName: String
}

object Anon_Attributes {
  @scala.inline
  def apply(attributes: js.Array[AttributeJson], objectName: String): Anon_Attributes = {
    val __obj = js.Dynamic.literal(attributes = attributes, objectName = objectName)
  
    __obj.asInstanceOf[Anon_Attributes]
  }
}


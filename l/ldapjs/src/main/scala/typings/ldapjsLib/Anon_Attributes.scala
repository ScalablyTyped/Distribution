package typings
package ldapjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Attributes extends js.Object {
  var attributes: js.Array[ldapjsLib.ldapjsMod.AttributeJson]
  var objectName: java.lang.String
}

object Anon_Attributes {
  @scala.inline
  def apply(attributes: js.Array[ldapjsLib.ldapjsMod.AttributeJson], objectName: java.lang.String): Anon_Attributes = {
    val __obj = js.Dynamic.literal(attributes = attributes, objectName = objectName)
  
    __obj.asInstanceOf[Anon_Attributes]
  }
}


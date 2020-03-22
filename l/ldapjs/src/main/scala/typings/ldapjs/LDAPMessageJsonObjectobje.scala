package typings.ldapjs

import org.scalablytyped.runtime.StringDictionary
import typings.ldapjs.mod.AttributeJson
import typings.ldapjs.mod.Control
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined ldapjs.ldapjs.LDAPMessageJsonObject & {  objectName  :string,   attributes  :std.Array<ldapjs.ldapjs.AttributeJson>} */
trait LDAPMessageJsonObjectobje
  extends /* k */ StringDictionary[js.Any] {
  var attributes: js.Array[AttributeJson]
  var controls: js.Array[Control]
  var messageID: Double
  var objectName: String
  var protocolOp: js.UndefOr[String] = js.undefined
}

object LDAPMessageJsonObjectobje {
  @scala.inline
  def apply(
    attributes: js.Array[AttributeJson],
    controls: js.Array[Control],
    messageID: Double,
    objectName: String,
    StringDictionary: /* k */ StringDictionary[js.Any] = null,
    protocolOp: String = null
  ): LDAPMessageJsonObjectobje = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], controls = controls.asInstanceOf[js.Any], messageID = messageID.asInstanceOf[js.Any], objectName = objectName.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (protocolOp != null) __obj.updateDynamic("protocolOp")(protocolOp.asInstanceOf[js.Any])
    __obj.asInstanceOf[LDAPMessageJsonObjectobje]
  }
}


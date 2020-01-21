package typings.ldapjs.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LDAPMessageJsonObject
  extends /* k */ StringDictionary[js.Any] {
  var controls: js.Array[Control]
  var messageID: Double
  var protocolOp: js.UndefOr[String] = js.undefined
}

object LDAPMessageJsonObject {
  @scala.inline
  def apply(
    controls: js.Array[Control],
    messageID: Double,
    StringDictionary: /* k */ StringDictionary[js.Any] = null,
    protocolOp: String = null
  ): LDAPMessageJsonObject = {
    val __obj = js.Dynamic.literal(controls = controls.asInstanceOf[js.Any], messageID = messageID.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (protocolOp != null) __obj.updateDynamic("protocolOp")(protocolOp.asInstanceOf[js.Any])
    __obj.asInstanceOf[LDAPMessageJsonObject]
  }
}


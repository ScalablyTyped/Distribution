package typings
package ldapjsLib.ldapjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LDAPMessageJsonObject
  extends /* k */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var controls: js.Array[Control]
  var messageID: scala.Double
  var protocolOp: js.UndefOr[java.lang.String]
}

object LDAPMessageJsonObject {
  @scala.inline
  def apply(
    controls: js.Array[Control],
    messageID: scala.Double,
    StringDictionary: /* k */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    protocolOp: java.lang.String = null
  ): LDAPMessageJsonObject = {
    val __obj = js.Dynamic.literal(controls = controls, messageID = messageID)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (protocolOp != null) __obj.updateDynamic("protocolOp")(protocolOp)
    __obj.asInstanceOf[LDAPMessageJsonObject]
  }
}


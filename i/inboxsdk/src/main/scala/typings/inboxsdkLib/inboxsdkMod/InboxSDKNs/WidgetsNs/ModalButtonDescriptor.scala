package typings
package inboxsdkLib.inboxsdkMod.InboxSDKNs.WidgetsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModalButtonDescriptor extends js.Object {
  var color: js.UndefOr[java.lang.String] = js.undefined
  var orderHint: js.UndefOr[scala.Double] = js.undefined
  var text: java.lang.String
  var title: java.lang.String
  var `type`: js.UndefOr[
    inboxsdkLib.inboxsdkLibStrings.PRIMARY_ACTION | inboxsdkLib.inboxsdkLibStrings.SECONDARY_ACTION
  ] = js.undefined
  def onClick(): scala.Unit
}

object ModalButtonDescriptor {
  @scala.inline
  def apply(
    onClick: js.Function0[scala.Unit],
    text: java.lang.String,
    title: java.lang.String,
    color: java.lang.String = null,
    orderHint: scala.Int | scala.Double = null,
    `type`: inboxsdkLib.inboxsdkLibStrings.PRIMARY_ACTION | inboxsdkLib.inboxsdkLibStrings.SECONDARY_ACTION = null
  ): ModalButtonDescriptor = {
    val __obj = js.Dynamic.literal(onClick = onClick, text = text, title = title)
    if (color != null) __obj.updateDynamic("color")(color)
    if (orderHint != null) __obj.updateDynamic("orderHint")(orderHint.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModalButtonDescriptor]
  }
}


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


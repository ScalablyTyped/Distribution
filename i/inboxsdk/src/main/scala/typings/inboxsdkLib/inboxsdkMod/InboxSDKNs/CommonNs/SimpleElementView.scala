package typings
package inboxsdkLib.inboxsdkMod.InboxSDKNs.CommonNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait SimpleElementView extends js.Object {
  var destroyed: scala.Boolean
  var el: stdLib.HTMLElement
  def destroy(): scala.Unit
  @JSName("on")
  def on_destroy(name: inboxsdkLib.inboxsdkLibStrings.destroy, cb: js.Function0[scala.Unit]): scala.Unit
}


package typings
package atIonicCoreLib.distTypesComponentsMod.ComponentsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IonHeader extends js.Object {
  /**
    * The mode determines which platform styles to use.
    */
  var mode: js.UndefOr[
    atIonicCoreLib.atIonicCoreLibStrings.ios | atIonicCoreLib.atIonicCoreLibStrings.md
  ] = js.undefined
  /**
    * If `true`, the header will be translucent. Only applies to `ios` mode. Note: In order to scroll content behind the header, the `fullscreen` attribute needs to be set on the content.
    */
  var translucent: scala.Boolean
}

object IonHeader {
  @scala.inline
  def apply(
    translucent: scala.Boolean,
    mode: atIonicCoreLib.atIonicCoreLibStrings.ios | atIonicCoreLib.atIonicCoreLibStrings.md = null
  ): IonHeader = {
    val __obj = js.Dynamic.literal(translucent = translucent)
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[IonHeader]
  }
}


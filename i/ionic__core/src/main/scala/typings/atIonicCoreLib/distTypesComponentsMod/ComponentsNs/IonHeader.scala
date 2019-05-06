package typings
package atIonicCoreLib.distTypesComponentsMod.ComponentsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IonHeader extends js.Object {
  /**
    * The mode determines which platform styles to use.
    */
  var mode: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Mode */ js.Any
  /**
    * If `true`, the header will be translucent. Note: In order to scroll content behind the header, the `fullscreen` attribute needs to be set on the content.
    */
  var translucent: scala.Boolean
}

object IonHeader {
  @scala.inline
  def apply(
    mode: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Mode */ js.Any,
    translucent: scala.Boolean
  ): IonHeader = {
    val __obj = js.Dynamic.literal(mode = mode, translucent = translucent)
  
    __obj.asInstanceOf[IonHeader]
  }
}


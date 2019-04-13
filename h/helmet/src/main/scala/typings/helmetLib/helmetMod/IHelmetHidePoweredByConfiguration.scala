package typings
package helmetLib.helmetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHelmetHidePoweredByConfiguration extends js.Object {
  var setTo: js.UndefOr[java.lang.String] = js.undefined
}

object IHelmetHidePoweredByConfiguration {
  @scala.inline
  def apply(setTo: java.lang.String = null): IHelmetHidePoweredByConfiguration = {
    val __obj = js.Dynamic.literal()
    if (setTo != null) __obj.updateDynamic("setTo")(setTo)
    __obj.asInstanceOf[IHelmetHidePoweredByConfiguration]
  }
}


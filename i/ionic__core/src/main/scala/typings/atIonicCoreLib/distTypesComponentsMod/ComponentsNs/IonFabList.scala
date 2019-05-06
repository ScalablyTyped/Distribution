package typings
package atIonicCoreLib.distTypesComponentsMod.ComponentsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IonFabList extends js.Object {
  /**
    * If `true`, the fab list will be show all fab buttons in the list.
    */
  var activated: scala.Boolean
  /**
    * The side the fab list will show on relative to the main fab button.
    */
  var side: atIonicCoreLib.atIonicCoreLibStrings.start | atIonicCoreLib.atIonicCoreLibStrings.end | atIonicCoreLib.atIonicCoreLibStrings.top | atIonicCoreLib.atIonicCoreLibStrings.bottom
}

object IonFabList {
  @scala.inline
  def apply(
    activated: scala.Boolean,
    side: atIonicCoreLib.atIonicCoreLibStrings.start | atIonicCoreLib.atIonicCoreLibStrings.end | atIonicCoreLib.atIonicCoreLibStrings.top | atIonicCoreLib.atIonicCoreLibStrings.bottom
  ): IonFabList = {
    val __obj = js.Dynamic.literal(activated = activated, side = side.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IonFabList]
  }
}


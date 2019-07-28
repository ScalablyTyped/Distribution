package typings.atIonicCore.distTypesComponentsMod.ComponentsNs

import typings.atIonicCore.atIonicCoreStrings.bottom
import typings.atIonicCore.atIonicCoreStrings.end
import typings.atIonicCore.atIonicCoreStrings.start
import typings.atIonicCore.atIonicCoreStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IonFabList extends js.Object {
  /**
    * If `true`, the fab list will show all fab buttons in the list.
    */
  var activated: Boolean
  /**
    * The side the fab list will show on relative to the main fab button.
    */
  var side: start | end | top | bottom
}

object IonFabList {
  @scala.inline
  def apply(activated: Boolean, side: start | end | top | bottom): IonFabList = {
    val __obj = js.Dynamic.literal(activated = activated, side = side.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IonFabList]
  }
}


package typings
package atLoadableComponentLib.atLoadableComponentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultImportedComponent[P] extends js.Object {
  var default: reactLib.reactMod.ReactNs.ComponentType[P]
}

object DefaultImportedComponent {
  @scala.inline
  def apply[P](default: reactLib.reactMod.ReactNs.ComponentType[P]): DefaultImportedComponent[P] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultImportedComponent[P]]
  }
}


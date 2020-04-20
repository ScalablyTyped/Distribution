package typings.loadableComponent.mod

import typings.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultImportedComponent[P] extends js.Object {
  var default: ComponentType[P]
}

object DefaultImportedComponent {
  @scala.inline
  def apply[P](default: ComponentType[P]): DefaultImportedComponent[P] = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultImportedComponent[P]]
  }
}


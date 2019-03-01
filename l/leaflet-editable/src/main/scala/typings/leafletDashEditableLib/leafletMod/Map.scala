package typings
package leafletDashEditableLib.leafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Map extends js.Object {
  /**
    * Options to pass to L.Editable when instanciating.
    */
  var editOptions: EditOptions
  /**
    * L.Editable plugin instance.
    */
  var editTools: Editable
  /**
    * Whether to create a L.Editable instance at map init or not.
    */
  var editable: scala.Boolean
}

object Map {
  @scala.inline
  def apply(editOptions: EditOptions, editTools: Editable, editable: scala.Boolean): Map = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("editOptions")(editOptions)
    __obj.updateDynamic("editTools")(editTools)
    __obj.updateDynamic("editable")(editable)
    __obj.asInstanceOf[Map]
  }
}


package typings.leafletEditable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Map_ extends js.Object {
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
  var editable: Boolean
}

object Map_ {
  @scala.inline
  def apply(editOptions: EditOptions, editTools: Editable, editable: Boolean): Map_ = {
    val __obj = js.Dynamic.literal(editOptions = editOptions.asInstanceOf[js.Any], editTools = editTools.asInstanceOf[js.Any], editable = editable.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Map_]
  }
}


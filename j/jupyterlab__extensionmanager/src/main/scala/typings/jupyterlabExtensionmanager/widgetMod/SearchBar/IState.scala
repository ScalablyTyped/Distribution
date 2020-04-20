package typings.jupyterlabExtensionmanager.widgetMod.SearchBar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * React state for search bar component.
  */
trait IState extends js.Object {
  /**
    * The value of the search bar input field.
    */
  var value: String
}

object IState {
  @scala.inline
  def apply(value: String): IState = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IState]
  }
}


package typings.jupyterlabExtensionmanager.widgetMod.SearchBar

import typings.jupyterlabSettingregistry.tokensMod.ISettingRegistry.ISettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * React properties for search bar component.
  */
trait IProperties extends js.Object {
  var disabled: Boolean
  /**
    * The placeholder string to use in the search bar input field when empty.
    */
  var placeholder: String
  var settings: ISettings
}

object IProperties {
  @scala.inline
  def apply(disabled: Boolean, placeholder: String, settings: ISettings): IProperties = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], placeholder = placeholder.asInstanceOf[js.Any], settings = settings.asInstanceOf[js.Any])
    __obj.asInstanceOf[IProperties]
  }
}


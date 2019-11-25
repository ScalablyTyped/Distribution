package typings.atJupyterlabApputils.libDialogMod.Dialog

import typings.atJupyterlabApputils.atJupyterlabApputilsStrings.default
import typings.atJupyterlabApputils.atJupyterlabApputilsStrings.warn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options used to make a button item.
  */
trait IButton extends js.Object {
  /**
    * The dialog action to perform when the button is clicked.
    */
  var accept: Boolean
  /**
    * The caption for the button.
    */
  var caption: String
  /**
    * The extra class name for the button.
    */
  var className: String
  /**
    * The button display type.
    */
  var displayType: default | warn
  /**
    * The icon class for the button.
    */
  var iconClass: String
  /**
    * The icon label for the button.
    */
  var iconLabel: String
  /**
    * The label for the button.
    */
  var label: String
}

object IButton {
  @scala.inline
  def apply(
    accept: Boolean,
    caption: String,
    className: String,
    displayType: default | warn,
    iconClass: String,
    iconLabel: String,
    label: String
  ): IButton = {
    val __obj = js.Dynamic.literal(accept = accept.asInstanceOf[js.Any], caption = caption.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], displayType = displayType.asInstanceOf[js.Any], iconClass = iconClass.asInstanceOf[js.Any], iconLabel = iconLabel.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IButton]
  }
}


package typings.jupyterlabCompleter.widgetMod.Completer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A completer menu item.
  */
trait IItem extends js.Object {
  /**
    * The raw text of a visible completer item.
    */
  var raw: String
  /**
    * The highlighted, marked up text of a visible completer item.
    */
  var text: String
}

object IItem {
  @scala.inline
  def apply(raw: String, text: String): IItem = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IItem]
  }
}


package typings.jsonEditor.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Ace extends js.Object {
  var ace: Theme
  var epiceditor: BasePath
  var sceditor: EmoticonsEnabled
  var selectize: Enable
}

object Ace {
  @scala.inline
  def apply(ace: Theme, epiceditor: BasePath, sceditor: EmoticonsEnabled, selectize: Enable): Ace = {
    val __obj = js.Dynamic.literal(ace = ace.asInstanceOf[js.Any], epiceditor = epiceditor.asInstanceOf[js.Any], sceditor = sceditor.asInstanceOf[js.Any], selectize = selectize.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ace]
  }
}


package typings.jsonDashEditor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Ace extends js.Object {
  var ace: Anon_Theme
  var epiceditor: Anon_BasePath
  var sceditor: Anon_EmoticonsEnabled
  var selectize: Anon_Enable
}

object Anon_Ace {
  @scala.inline
  def apply(
    ace: Anon_Theme,
    epiceditor: Anon_BasePath,
    sceditor: Anon_EmoticonsEnabled,
    selectize: Anon_Enable
  ): Anon_Ace = {
    val __obj = js.Dynamic.literal(ace = ace, epiceditor = epiceditor, sceditor = sceditor, selectize = selectize)
  
    __obj.asInstanceOf[Anon_Ace]
  }
}


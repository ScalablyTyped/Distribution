package typings.jsonEditor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAce extends js.Object {
  var ace: AnonTheme
  var epiceditor: AnonBasePath
  var sceditor: AnonEmoticonsEnabled
  var selectize: AnonEnable
}

object AnonAce {
  @scala.inline
  def apply(ace: AnonTheme, epiceditor: AnonBasePath, sceditor: AnonEmoticonsEnabled, selectize: AnonEnable): AnonAce = {
    val __obj = js.Dynamic.literal(ace = ace.asInstanceOf[js.Any], epiceditor = epiceditor.asInstanceOf[js.Any], sceditor = sceditor.asInstanceOf[js.Any], selectize = selectize.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAce]
  }
}


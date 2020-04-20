package typings.lobibox

import typings.lobibox.LobiboxModule.MessageBoxesDefault
import typings.lobibox.LobiboxModule.MessageBoxesOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDEFAULTS extends js.Object {
  var DEFAULTS: MessageBoxesDefault
  var OPTIONS: MessageBoxesOptions
}

object AnonDEFAULTS {
  @scala.inline
  def apply(DEFAULTS: MessageBoxesDefault, OPTIONS: MessageBoxesOptions): AnonDEFAULTS = {
    val __obj = js.Dynamic.literal(DEFAULTS = DEFAULTS.asInstanceOf[js.Any], OPTIONS = OPTIONS.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDEFAULTS]
  }
}


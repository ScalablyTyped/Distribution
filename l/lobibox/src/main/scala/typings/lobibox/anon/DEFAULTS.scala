package typings.lobibox.anon

import typings.lobibox.LobiboxModule.MessageBoxesDefault
import typings.lobibox.LobiboxModule.MessageBoxesOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DEFAULTS extends js.Object {
  var DEFAULTS: MessageBoxesDefault
  var OPTIONS: MessageBoxesOptions
}

object DEFAULTS {
  @scala.inline
  def apply(DEFAULTS: MessageBoxesDefault, OPTIONS: MessageBoxesOptions): DEFAULTS = {
    val __obj = js.Dynamic.literal(DEFAULTS = DEFAULTS.asInstanceOf[js.Any], OPTIONS = OPTIONS.asInstanceOf[js.Any])
    __obj.asInstanceOf[DEFAULTS]
  }
}


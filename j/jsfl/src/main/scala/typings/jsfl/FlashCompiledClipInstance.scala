package typings.jsfl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlashCompiledClipInstance extends js.Object {
  var accName: String
  var actionScript: String
  var description: String
  var forceSimple: Boolean
  var shortcut: String
  var silent: Boolean
  var tabIndex: Double
}

object FlashCompiledClipInstance {
  @scala.inline
  def apply(
    accName: String,
    actionScript: String,
    description: String,
    forceSimple: Boolean,
    shortcut: String,
    silent: Boolean,
    tabIndex: Double
  ): FlashCompiledClipInstance = {
    val __obj = js.Dynamic.literal(accName = accName.asInstanceOf[js.Any], actionScript = actionScript.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], forceSimple = forceSimple.asInstanceOf[js.Any], shortcut = shortcut.asInstanceOf[js.Any], silent = silent.asInstanceOf[js.Any], tabIndex = tabIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlashCompiledClipInstance]
  }
}


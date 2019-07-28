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
    val __obj = js.Dynamic.literal(accName = accName, actionScript = actionScript, description = description, forceSimple = forceSimple, shortcut = shortcut, silent = silent, tabIndex = tabIndex)
  
    __obj.asInstanceOf[FlashCompiledClipInstance]
  }
}


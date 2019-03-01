package typings
package jsflLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlashCompiledClipInstance extends js.Object {
  var accName: java.lang.String
  var actionScript: java.lang.String
  var description: java.lang.String
  var forceSimple: scala.Boolean
  var shortcut: java.lang.String
  var silent: scala.Boolean
  var tabIndex: scala.Double
}

object FlashCompiledClipInstance {
  @scala.inline
  def apply(
    accName: java.lang.String,
    actionScript: java.lang.String,
    description: java.lang.String,
    forceSimple: scala.Boolean,
    shortcut: java.lang.String,
    silent: scala.Boolean,
    tabIndex: scala.Double
  ): FlashCompiledClipInstance = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("accName")(accName)
    __obj.updateDynamic("actionScript")(actionScript)
    __obj.updateDynamic("description")(description)
    __obj.updateDynamic("forceSimple")(forceSimple)
    __obj.updateDynamic("shortcut")(shortcut)
    __obj.updateDynamic("silent")(silent)
    __obj.updateDynamic("tabIndex")(tabIndex)
    __obj.asInstanceOf[FlashCompiledClipInstance]
  }
}


package typings
package jpmLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ScriptBoolean extends js.Object {
  var script: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_ScriptBoolean {
  @scala.inline
  def apply(script: js.UndefOr[scala.Boolean] = js.undefined): Anon_ScriptBoolean = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(script)) __obj.updateDynamic("script")(script)
    __obj.asInstanceOf[Anon_ScriptBoolean]
  }
}


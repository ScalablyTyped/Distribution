package typings
package grommetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Suggestion extends js.Object {
  var suggestion: js.Any
  var target: stdLib.HTMLElement | scala.Null
}

object Anon_Suggestion {
  @scala.inline
  def apply(suggestion: js.Any, target: stdLib.HTMLElement = null): Anon_Suggestion = {
    val __obj = js.Dynamic.literal(suggestion = suggestion)
    if (target != null) __obj.updateDynamic("target")(target)
    __obj.asInstanceOf[Anon_Suggestion]
  }
}


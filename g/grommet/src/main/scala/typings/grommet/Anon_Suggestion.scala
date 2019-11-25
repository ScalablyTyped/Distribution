package typings.grommet

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Suggestion extends js.Object {
  var suggestion: js.Any
  var target: HTMLElement | Null
}

object Anon_Suggestion {
  @scala.inline
  def apply(suggestion: js.Any, target: HTMLElement = null): Anon_Suggestion = {
    val __obj = js.Dynamic.literal(suggestion = suggestion.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Suggestion]
  }
}


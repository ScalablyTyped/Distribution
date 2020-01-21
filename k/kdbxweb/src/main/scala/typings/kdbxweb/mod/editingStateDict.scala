package typings.kdbxweb.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait editingStateDict extends /* uuid */ StringDictionary[editingState] {
  var meta: editingState
}

object editingStateDict {
  @scala.inline
  def apply(meta: editingState, StringDictionary: /* uuid */ StringDictionary[editingState] = null): editingStateDict = {
    val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[editingStateDict]
  }
}


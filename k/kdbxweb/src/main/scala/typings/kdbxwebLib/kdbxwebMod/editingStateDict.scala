package typings
package kdbxwebLib.kdbxwebMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait editingStateDict
  extends /* uuid */ org.scalablytyped.runtime.StringDictionary[editingState] {
  var meta: editingState
}

object editingStateDict {
  @scala.inline
  def apply(
    meta: editingState,
    StringDictionary: /* uuid */ org.scalablytyped.runtime.StringDictionary[editingState] = null
  ): editingStateDict = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("meta")(meta)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[editingStateDict]
  }
}


package typings
package lokijsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetDataOptions extends js.Object {
  var forceCloneMethod: lokijsLib.lokijsLibStrings.`parse-stringify` | lokijsLib.lokijsLibStrings.`jquery-extend-deep` | lokijsLib.lokijsLibStrings.shallow | lokijsLib.lokijsLibStrings.`shallow-assign` | lokijsLib.lokijsLibStrings.`shallow-recurse-objects` | scala.Null
  var forceClones: scala.Boolean
  var removeMeta: scala.Boolean
}

object GetDataOptions {
  @scala.inline
  def apply(
    forceClones: scala.Boolean,
    removeMeta: scala.Boolean,
    forceCloneMethod: lokijsLib.lokijsLibStrings.`parse-stringify` | lokijsLib.lokijsLibStrings.`jquery-extend-deep` | lokijsLib.lokijsLibStrings.shallow | lokijsLib.lokijsLibStrings.`shallow-assign` | lokijsLib.lokijsLibStrings.`shallow-recurse-objects` = null
  ): GetDataOptions = {
    val __obj = js.Dynamic.literal(forceClones = forceClones, removeMeta = removeMeta)
    if (forceCloneMethod != null) __obj.updateDynamic("forceCloneMethod")(forceCloneMethod.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDataOptions]
  }
}


package typings
package mapDashObjLib.mapDashObjMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeepOptions extends Options {
  @JSName("deep")
  var deep_DeepOptions: mapDashObjLib.mapDashObjLibNumbers.`true`
}

object DeepOptions {
  @scala.inline
  def apply(
    deep: mapDashObjLib.mapDashObjLibNumbers.`true`,
    target: org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): DeepOptions = {
    val __obj = js.Dynamic.literal(deep = deep)
    if (target != null) __obj.updateDynamic("target")(target)
    __obj.asInstanceOf[DeepOptions]
  }
}


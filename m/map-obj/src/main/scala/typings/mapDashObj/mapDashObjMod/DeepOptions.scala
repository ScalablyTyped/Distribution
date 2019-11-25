package typings.mapDashObj.mapDashObjMod

import org.scalablytyped.runtime.StringDictionary
import typings.mapDashObj.mapDashObjNumbers.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeepOptions extends Options {
  @JSName("deep")
  var deep_DeepOptions: `true`
}

object DeepOptions {
  @scala.inline
  def apply(deep: `true`, target: StringDictionary[js.Any] = null): DeepOptions = {
    val __obj = js.Dynamic.literal(deep = deep.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeepOptions]
  }
}


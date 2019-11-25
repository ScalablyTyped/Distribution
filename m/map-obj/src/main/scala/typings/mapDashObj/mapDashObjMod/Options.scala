package typings.mapDashObj.mapDashObjMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
  		Recurse nested objects and objects in arrays.
  		@default false
  		*/
  var deep: js.UndefOr[Boolean] = js.undefined
  /**
  		Target object to map properties on to.
  		@default {}
  		*/
  var target: js.UndefOr[StringDictionary[js.Any]] = js.undefined
}

object Options {
  @scala.inline
  def apply(deep: js.UndefOr[Boolean] = js.undefined, target: StringDictionary[js.Any] = null): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(deep)) __obj.updateDynamic("deep")(deep.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}


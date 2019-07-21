package typings
package mapDashObjLib.mapDashObjMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
  		Recurse nested objects and objects in arrays.
  		@default false
  		*/
  var deep: js.UndefOr[scala.Boolean] = js.undefined
  /**
  		Target object to map properties on to.
  		@default {}
  		*/
  var target: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    deep: js.UndefOr[scala.Boolean] = js.undefined,
    target: org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(deep)) __obj.updateDynamic("deep")(deep)
    if (target != null) __obj.updateDynamic("target")(target)
    __obj.asInstanceOf[Options]
  }
}


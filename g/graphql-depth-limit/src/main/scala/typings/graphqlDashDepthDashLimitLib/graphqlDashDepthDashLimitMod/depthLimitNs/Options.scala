package typings
package graphqlDashDepthDashLimitLib.graphqlDashDepthDashLimitMod.depthLimitNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var ignore: js.Array[
    java.lang.String | stdLib.RegExp | (js.Function1[/* queryDepths */ js.Array[_], scala.Boolean])
  ]
}

object Options {
  @scala.inline
  def apply(
    ignore: js.Array[
      java.lang.String | stdLib.RegExp | (js.Function1[/* queryDepths */ js.Array[_], scala.Boolean])
    ]
  ): Options = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ignore")(ignore)
    __obj.asInstanceOf[Options]
  }
}


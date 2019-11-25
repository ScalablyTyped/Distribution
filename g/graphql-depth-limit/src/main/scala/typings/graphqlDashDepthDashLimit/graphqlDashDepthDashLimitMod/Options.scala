package typings.graphqlDashDepthDashLimit.graphqlDashDepthDashLimitMod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var ignore: js.Array[String | RegExp | (js.Function1[/* queryDepths */ js.Array[_], Boolean])]
}

object Options {
  @scala.inline
  def apply(ignore: js.Array[String | RegExp | (js.Function1[/* queryDepths */ js.Array[_], Boolean])]): Options = {
    val __obj = js.Dynamic.literal(ignore = ignore.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Options]
  }
}


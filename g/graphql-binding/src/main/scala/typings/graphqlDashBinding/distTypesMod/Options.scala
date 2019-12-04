package typings.graphqlDashBinding.distTypesMod

import typings.graphqlDashTools.distInterfacesMod.Transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var context: js.UndefOr[Context] = js.undefined
  var transforms: js.UndefOr[js.Array[Transform]] = js.undefined
}

object Options {
  @scala.inline
  def apply(context: Context = null, transforms: js.Array[Transform] = null): Options = {
    val __obj = js.Dynamic.literal()
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (transforms != null) __obj.updateDynamic("transforms")(transforms.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}


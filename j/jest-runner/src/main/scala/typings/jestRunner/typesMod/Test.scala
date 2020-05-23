package typings.jestRunner.typesMod

import typings.jestTypes.configMod.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Test extends js.Object {
  var context: Context
  var duration: js.UndefOr[Double] = js.undefined
  var path: Path
}

object Test {
  @scala.inline
  def apply(context: Context, path: Path, duration: js.UndefOr[Double] = js.undefined): Test = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    if (!js.isUndefined(duration)) __obj.updateDynamic("duration")(duration.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Test]
  }
}


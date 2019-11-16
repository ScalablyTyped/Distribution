package typings.jestDashRunner.buildTypesMod

import typings.atJestTypes.buildConfigMod.Path
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
  def apply(context: Context, path: Path, duration: Int | Double = null): Test = {
    val __obj = js.Dynamic.literal(context = context, path = path)
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    __obj.asInstanceOf[Test]
  }
}


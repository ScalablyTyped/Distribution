package typings.jestReporters

import typings.jestReporters.typesMod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonContext extends js.Object {
  var context: Context
  var matches: AnonAllTests
}

object AnonContext {
  @scala.inline
  def apply(context: Context, matches: AnonAllTests): AnonContext = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], matches = matches.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonContext]
  }
}


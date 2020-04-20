package typings.jestCore

import typings.jestRuntime.mod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMatches extends js.Object {
  var context: Context
  var matches: AnonStats
}

object AnonMatches {
  @scala.inline
  def apply(context: Context, matches: AnonStats): AnonMatches = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], matches = matches.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMatches]
  }
}


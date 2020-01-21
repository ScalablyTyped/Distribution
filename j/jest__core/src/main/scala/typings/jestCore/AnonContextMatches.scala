package typings.jestCore

import typings.jestRuntime.mod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonContextMatches extends js.Object {
  var context: Context
  var matches: AnonAllTestsStats
}

object AnonContextMatches {
  @scala.inline
  def apply(context: Context, matches: AnonAllTestsStats): AnonContextMatches = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], matches = matches.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonContextMatches]
  }
}


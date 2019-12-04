package typings.atJestCore

import typings.jestDashRuntime.jestDashRuntimeMod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ContextMatches extends js.Object {
  var context: Context
  var matches: Anon_AllTestsStats
}

object Anon_ContextMatches {
  @scala.inline
  def apply(context: Context, matches: Anon_AllTestsStats): Anon_ContextMatches = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], matches = matches.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ContextMatches]
  }
}


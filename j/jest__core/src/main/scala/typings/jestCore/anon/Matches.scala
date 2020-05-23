package typings.jestCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Matches extends js.Object {
  var context: typings.jestRuntime.mod.Context
  var matches: Stats
}

object Matches {
  @scala.inline
  def apply(context: typings.jestRuntime.mod.Context, matches: Stats): Matches = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], matches = matches.asInstanceOf[js.Any])
    __obj.asInstanceOf[Matches]
  }
}


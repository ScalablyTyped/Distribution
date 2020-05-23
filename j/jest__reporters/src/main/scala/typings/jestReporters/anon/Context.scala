package typings.jestReporters.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Context extends js.Object {
  var context: typings.jestReporters.typesMod.Context
  var matches: AllTests
}

object Context {
  @scala.inline
  def apply(context: typings.jestReporters.typesMod.Context, matches: AllTests): Context = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], matches = matches.asInstanceOf[js.Any])
    __obj.asInstanceOf[Context]
  }
}


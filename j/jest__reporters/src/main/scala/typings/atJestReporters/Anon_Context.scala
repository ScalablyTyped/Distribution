package typings.atJestReporters

import typings.atJestReporters.buildTypesMod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Context extends js.Object {
  var context: Context
  var matches: Anon_AllTests
}

object Anon_Context {
  @scala.inline
  def apply(context: Context, matches: Anon_AllTests): Anon_Context = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], matches = matches.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Context]
  }
}


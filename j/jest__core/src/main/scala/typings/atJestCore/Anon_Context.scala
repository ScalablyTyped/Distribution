package typings.atJestCore

import typings.atJestCore.buildSearchSourceMod.default
import typings.jestDashRuntime.jestDashRuntimeMod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Context extends js.Object {
  var context: Context
  var searchSource: default
}

object Anon_Context {
  @scala.inline
  def apply(context: Context, searchSource: default): Anon_Context = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], searchSource = searchSource.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Context]
  }
}


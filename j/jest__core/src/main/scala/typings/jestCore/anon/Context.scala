package typings.jestCore.anon

import typings.jestCore.searchSourceMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Context extends js.Object {
  var context: typings.jestRuntime.mod.Context
  var searchSource: default
}

object Context {
  @scala.inline
  def apply(context: typings.jestRuntime.mod.Context, searchSource: default): Context = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], searchSource = searchSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[Context]
  }
}


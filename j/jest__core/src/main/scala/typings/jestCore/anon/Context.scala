package typings.jestCore.anon

import typings.jestCore.searchSourceMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Context extends js.Object {
  var context: typings.jestRuntime.mod.Context = js.native
  var searchSource: default = js.native
}

object Context {
  @scala.inline
  def apply(context: typings.jestRuntime.mod.Context, searchSource: default): Context = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], searchSource = searchSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[Context]
  }
  @scala.inline
  implicit class ContextOps[Self <: Context] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setContext(value: typings.jestRuntime.mod.Context): Self = this.set("context", value.asInstanceOf[js.Any])
    @scala.inline
    def setSearchSource(value: default): Self = this.set("searchSource", value.asInstanceOf[js.Any])
  }
  
}


package typings.graphqlApiKoa.anon

import typings.graphqlApiKoa.mod.ExecuteOptions
import typings.koa.mod.ParameterizedContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Override[StateT, CustomT] extends js.Object {
  var `override`: js.UndefOr[js.Function1[/* ctx */ ParameterizedContext[StateT, CustomT], ExecuteOptions]] = js.native
}

object Override {
  @scala.inline
  def apply[StateT, CustomT](): Override[StateT, CustomT] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Override[StateT, CustomT]]
  }
  @scala.inline
  implicit class OverrideOps[Self <: Override[_, _], StateT, CustomT] (val x: Self with (Override[StateT, CustomT])) extends AnyVal {
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
    def setOverride(value: /* ctx */ ParameterizedContext[StateT, CustomT] => ExecuteOptions): Self = this.set("override", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOverride: Self = this.set("override", js.undefined)
  }
  
}


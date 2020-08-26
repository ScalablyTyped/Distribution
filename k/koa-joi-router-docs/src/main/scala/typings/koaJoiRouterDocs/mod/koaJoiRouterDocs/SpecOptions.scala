package typings.koaJoiRouterDocs.mod.koaJoiRouterDocs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpecOptions extends js.Object {
  var defaultResponses: js.UndefOr[js.Object] = js.native
  var warnFunc: js.UndefOr[js.Function0[Unit]] = js.native
}

object SpecOptions {
  @scala.inline
  def apply(): SpecOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpecOptions]
  }
  @scala.inline
  implicit class SpecOptionsOps[Self <: SpecOptions] (val x: Self) extends AnyVal {
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
    def setDefaultResponses(value: js.Object): Self = this.set("defaultResponses", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultResponses: Self = this.set("defaultResponses", js.undefined)
    @scala.inline
    def setWarnFunc(value: () => Unit): Self = this.set("warnFunc", js.Any.fromFunction0(value))
    @scala.inline
    def deleteWarnFunc: Self = this.set("warnFunc", js.undefined)
  }
  
}


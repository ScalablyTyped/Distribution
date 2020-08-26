package typings.lobibox.LobiboxModule

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PromptMethods extends js.Object {
  var getValue: js.UndefOr[js.Function0[String]] = js.native
  var setValue: js.UndefOr[js.Function1[/* val */ js.UndefOr[String], this.type]] = js.native
}

object PromptMethods {
  @scala.inline
  def apply(): PromptMethods = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PromptMethods]
  }
  @scala.inline
  implicit class PromptMethodsOps[Self <: PromptMethods] (val x: Self) extends AnyVal {
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
    def setGetValue(value: () => String): Self = this.set("getValue", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetValue: Self = this.set("getValue", js.undefined)
    @scala.inline
    def setSetValue(value: /* val */ js.UndefOr[String] => PromptMethods): Self = this.set("setValue", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetValue: Self = this.set("setValue", js.undefined)
  }
  
}


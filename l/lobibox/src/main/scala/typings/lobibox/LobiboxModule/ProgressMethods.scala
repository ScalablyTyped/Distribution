package typings.lobibox.LobiboxModule

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProgressMethods extends js.Object {
  var getProgress: js.UndefOr[js.Function0[Double]] = js.native
  var setProgress: js.UndefOr[js.Function1[/* progress */ Double, this.type]] = js.native
}

object ProgressMethods {
  @scala.inline
  def apply(): ProgressMethods = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProgressMethods]
  }
  @scala.inline
  implicit class ProgressMethodsOps[Self <: ProgressMethods] (val x: Self) extends AnyVal {
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
    def setGetProgress(value: () => Double): Self = this.set("getProgress", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetProgress: Self = this.set("getProgress", js.undefined)
    @scala.inline
    def setSetProgress(value: /* progress */ Double => ProgressMethods): Self = this.set("setProgress", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetProgress: Self = this.set("setProgress", js.undefined)
  }
  
}


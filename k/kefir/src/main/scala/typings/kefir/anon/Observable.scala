package typings.kefir.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Observable extends js.Object {
  var Observable: Ap = js.native
}

object Observable {
  @scala.inline
  def apply(Observable: Ap): Observable = {
    val __obj = js.Dynamic.literal(Observable = Observable.asInstanceOf[js.Any])
    __obj.asInstanceOf[Observable]
  }
  @scala.inline
  implicit class ObservableOps[Self <: Observable] (val x: Self) extends AnyVal {
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
    def setObservable(value: Ap): Self = this.set("Observable", value.asInstanceOf[js.Any])
  }
  
}


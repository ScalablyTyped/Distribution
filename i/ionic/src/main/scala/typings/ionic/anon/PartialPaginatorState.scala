package typings.ionic.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<ionic.ionic/definitions.PaginatorState> */
@js.native
trait PartialPaginatorState extends js.Object {
  var done: js.UndefOr[Boolean] = js.native
  var loaded: js.UndefOr[Double] = js.native
}

object PartialPaginatorState {
  @scala.inline
  def apply(): PartialPaginatorState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPaginatorState]
  }
  @scala.inline
  implicit class PartialPaginatorStateOps[Self <: PartialPaginatorState] (val x: Self) extends AnyVal {
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
    def setDone(value: Boolean): Self = this.set("done", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDone: Self = this.set("done", js.undefined)
    @scala.inline
    def setLoaded(value: Double): Self = this.set("loaded", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoaded: Self = this.set("loaded", js.undefined)
  }
  
}


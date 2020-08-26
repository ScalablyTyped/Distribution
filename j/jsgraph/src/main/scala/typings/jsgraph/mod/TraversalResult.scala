package typings.jsgraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TraversalResult extends js.Object {
  var error: js.UndefOr[js.Any] = js.native
  var result: js.UndefOr[TraversalContext] = js.native
}

object TraversalResult {
  @scala.inline
  def apply(): TraversalResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TraversalResult]
  }
  @scala.inline
  implicit class TraversalResultOps[Self <: TraversalResult] (val x: Self) extends AnyVal {
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
    def setError(value: js.Any): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    @scala.inline
    def setResult(value: TraversalContext): Self = this.set("result", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResult: Self = this.set("result", js.undefined)
  }
  
}


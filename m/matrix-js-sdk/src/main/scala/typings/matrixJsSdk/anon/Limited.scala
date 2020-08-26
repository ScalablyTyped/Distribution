package typings.matrixJsSdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Limited extends js.Object {
  var limited: js.UndefOr[Boolean] = js.native
  var results: js.Array[Displayname] = js.native
}

object Limited {
  @scala.inline
  def apply(results: js.Array[Displayname]): Limited = {
    val __obj = js.Dynamic.literal(results = results.asInstanceOf[js.Any])
    __obj.asInstanceOf[Limited]
  }
  @scala.inline
  implicit class LimitedOps[Self <: Limited] (val x: Self) extends AnyVal {
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
    def setResultsVarargs(value: Displayname*): Self = this.set("results", js.Array(value :_*))
    @scala.inline
    def setResults(value: js.Array[Displayname]): Self = this.set("results", value.asInstanceOf[js.Any])
    @scala.inline
    def setLimited(value: Boolean): Self = this.set("limited", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLimited: Self = this.set("limited", js.undefined)
  }
  
}


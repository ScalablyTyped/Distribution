package typings.loggly.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchOptionsWithQ
  extends SharedSearchOptions
     with SearchOptions {
  var q: String = js.native
}

object SearchOptionsWithQ {
  @scala.inline
  def apply(q: String): SearchOptionsWithQ = {
    val __obj = js.Dynamic.literal(q = q.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchOptionsWithQ]
  }
  @scala.inline
  implicit class SearchOptionsWithQOps[Self <: SearchOptionsWithQ] (val x: Self) extends AnyVal {
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
    def setQ(value: String): Self = this.set("q", value.asInstanceOf[js.Any])
  }
  
}


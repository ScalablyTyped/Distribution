package typings.loggly.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Search extends js.Object {
  def run(callback: js.Function2[/* err */ js.Any, /* results */ SearchResults, Unit]): this.type = js.native
}

object Search {
  @scala.inline
  def apply(run: js.Function2[/* err */ js.Any, /* results */ SearchResults, Unit] => Search): Search = {
    val __obj = js.Dynamic.literal(run = js.Any.fromFunction1(run))
    __obj.asInstanceOf[Search]
  }
  @scala.inline
  implicit class SearchOps[Self <: Search] (val x: Self) extends AnyVal {
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
    def setRun(value: js.Function2[/* err */ js.Any, /* results */ SearchResults, Unit] => Search): Self = this.set("run", js.Any.fromFunction1(value))
  }
  
}


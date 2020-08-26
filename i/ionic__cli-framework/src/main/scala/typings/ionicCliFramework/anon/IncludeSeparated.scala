package typings.ionicCliFramework.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IncludeSeparated extends js.Object {
  var includeSeparated: js.UndefOr[Boolean] = js.native
}

object IncludeSeparated {
  @scala.inline
  def apply(): IncludeSeparated = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IncludeSeparated]
  }
  @scala.inline
  implicit class IncludeSeparatedOps[Self <: IncludeSeparated] (val x: Self) extends AnyVal {
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
    def setIncludeSeparated(value: Boolean): Self = this.set("includeSeparated", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeSeparated: Self = this.set("includeSeparated", js.undefined)
  }
  
}


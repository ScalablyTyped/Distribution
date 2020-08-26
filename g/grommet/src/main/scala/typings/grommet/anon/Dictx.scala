package typings.grommet.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dictx
  extends /* x */ StringDictionary[js.UndefOr[BorderSize]] {
  var large: js.UndefOr[BorderSize] = js.native
  var medium: js.UndefOr[BorderSize] = js.native
  var small: js.UndefOr[BorderSize] = js.native
}

object Dictx {
  @scala.inline
  def apply(): Dictx = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Dictx]
  }
  @scala.inline
  implicit class DictxOps[Self <: Dictx] (val x: Self) extends AnyVal {
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
    def setLarge(value: BorderSize): Self = this.set("large", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLarge: Self = this.set("large", js.undefined)
    @scala.inline
    def setMedium(value: BorderSize): Self = this.set("medium", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMedium: Self = this.set("medium", js.undefined)
    @scala.inline
    def setSmall(value: BorderSize): Self = this.set("small", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSmall: Self = this.set("small", js.undefined)
  }
  
}


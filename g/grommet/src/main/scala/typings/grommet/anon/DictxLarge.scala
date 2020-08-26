package typings.grommet.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DictxLarge
  extends /* x */ StringDictionary[js.UndefOr[String]] {
  var large: js.UndefOr[String] = js.native
  var medium: js.UndefOr[String] = js.native
  var small: js.UndefOr[String] = js.native
  var xlarge: js.UndefOr[String] = js.native
  var xsmall: js.UndefOr[String] = js.native
}

object DictxLarge {
  @scala.inline
  def apply(): DictxLarge = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DictxLarge]
  }
  @scala.inline
  implicit class DictxLargeOps[Self <: DictxLarge] (val x: Self) extends AnyVal {
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
    def setLarge(value: String): Self = this.set("large", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLarge: Self = this.set("large", js.undefined)
    @scala.inline
    def setMedium(value: String): Self = this.set("medium", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMedium: Self = this.set("medium", js.undefined)
    @scala.inline
    def setSmall(value: String): Self = this.set("small", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSmall: Self = this.set("small", js.undefined)
    @scala.inline
    def setXlarge(value: String): Self = this.set("xlarge", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXlarge: Self = this.set("xlarge", js.undefined)
    @scala.inline
    def setXsmall(value: String): Self = this.set("xsmall", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXsmall: Self = this.set("xsmall", js.undefined)
  }
  
}


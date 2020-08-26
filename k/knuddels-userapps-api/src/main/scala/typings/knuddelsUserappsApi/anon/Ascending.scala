package typings.knuddelsUserappsApi.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Ascending extends js.Object {
  var ascending: js.UndefOr[Boolean] = js.native
  var labelMapping: js.UndefOr[StringDictionary[String]] = js.native
  var sortIndex: js.UndefOr[Double] = js.native
}

object Ascending {
  @scala.inline
  def apply(): Ascending = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Ascending]
  }
  @scala.inline
  implicit class AscendingOps[Self <: Ascending] (val x: Self) extends AnyVal {
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
    def setAscending(value: Boolean): Self = this.set("ascending", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAscending: Self = this.set("ascending", js.undefined)
    @scala.inline
    def setLabelMapping(value: StringDictionary[String]): Self = this.set("labelMapping", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelMapping: Self = this.set("labelMapping", js.undefined)
    @scala.inline
    def setSortIndex(value: Double): Self = this.set("sortIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSortIndex: Self = this.set("sortIndex", js.undefined)
  }
  
}


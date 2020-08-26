package typings.kikBrowser

import typings.kikBrowser.anon.Username
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KikPickUsersOptions extends js.Object {
  var filterSelf: js.UndefOr[Boolean] = js.native
  var filtered: js.UndefOr[js.Array[String]] = js.native
  var maxResults: js.UndefOr[Double] = js.native
  var minResults: js.UndefOr[Double] = js.native
  var preselected: js.UndefOr[js.Array[Username]] = js.native
}

object KikPickUsersOptions {
  @scala.inline
  def apply(): KikPickUsersOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KikPickUsersOptions]
  }
  @scala.inline
  implicit class KikPickUsersOptionsOps[Self <: KikPickUsersOptions] (val x: Self) extends AnyVal {
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
    def setFilterSelf(value: Boolean): Self = this.set("filterSelf", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilterSelf: Self = this.set("filterSelf", js.undefined)
    @scala.inline
    def setFilteredVarargs(value: String*): Self = this.set("filtered", js.Array(value :_*))
    @scala.inline
    def setFiltered(value: js.Array[String]): Self = this.set("filtered", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFiltered: Self = this.set("filtered", js.undefined)
    @scala.inline
    def setMaxResults(value: Double): Self = this.set("maxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("maxResults", js.undefined)
    @scala.inline
    def setMinResults(value: Double): Self = this.set("minResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinResults: Self = this.set("minResults", js.undefined)
    @scala.inline
    def setPreselectedVarargs(value: Username*): Self = this.set("preselected", js.Array(value :_*))
    @scala.inline
    def setPreselected(value: js.Array[Username]): Self = this.set("preselected", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreselected: Self = this.set("preselected", js.undefined)
  }
  
}


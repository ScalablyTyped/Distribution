package typings.handsontable.mod.Handsontable.search

import typings.handsontable.mod.Handsontable
import typings.handsontable.mod.Handsontable.CellProperties
import typings.handsontable.mod.Handsontable.CellValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Settings extends js.Object {
  var callback: js.UndefOr[SearchCallback] = js.native
  var queryMethod: js.UndefOr[SearchQueryMethod] = js.native
  var searchResultClass: js.UndefOr[String] = js.native
}

object Settings {
  @scala.inline
  def apply(): Settings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Settings]
  }
  @scala.inline
  implicit class SettingsOps[Self <: Settings] (val x: Self) extends AnyVal {
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
    def setCallback(
      value: (/* instance */ Handsontable, /* row */ Double, /* column */ Double, /* value */ CellValue, /* result */ Boolean) => Unit
    ): Self = this.set("callback", js.Any.fromFunction5(value))
    @scala.inline
    def deleteCallback: Self = this.set("callback", js.undefined)
    @scala.inline
    def setQueryMethod(
      value: (/* queryStr */ String, /* value */ CellValue, /* cellProperties */ CellProperties) => Boolean
    ): Self = this.set("queryMethod", js.Any.fromFunction3(value))
    @scala.inline
    def deleteQueryMethod: Self = this.set("queryMethod", js.undefined)
    @scala.inline
    def setSearchResultClass(value: String): Self = this.set("searchResultClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSearchResultClass: Self = this.set("searchResultClass", js.undefined)
  }
  
}


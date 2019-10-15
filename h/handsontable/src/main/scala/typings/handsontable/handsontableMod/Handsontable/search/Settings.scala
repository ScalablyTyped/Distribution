package typings.handsontable.handsontableMod.Handsontable.search

import typings.handsontable.handsontableMod.Handsontable
import typings.handsontable.handsontableMod.Handsontable.CellProperties
import typings.handsontable.handsontableMod.Handsontable.CellValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Settings extends js.Object {
  var callback: js.UndefOr[SearchCallback] = js.undefined
  var queryMethod: js.UndefOr[SearchQueryMethod] = js.undefined
  var searchResultClass: js.UndefOr[String] = js.undefined
}

object Settings {
  @scala.inline
  def apply(
    callback: (/* instance */ Handsontable, /* row */ Double, /* column */ Double, /* value */ CellValue, /* result */ Boolean) => Unit = null,
    queryMethod: (/* queryStr */ String, /* value */ CellValue, /* cellProperties */ CellProperties) => Boolean = null,
    searchResultClass: String = null
  ): Settings = {
    val __obj = js.Dynamic.literal()
    if (callback != null) __obj.updateDynamic("callback")(js.Any.fromFunction5(callback))
    if (queryMethod != null) __obj.updateDynamic("queryMethod")(js.Any.fromFunction3(queryMethod))
    if (searchResultClass != null) __obj.updateDynamic("searchResultClass")(searchResultClass)
    __obj.asInstanceOf[Settings]
  }
}


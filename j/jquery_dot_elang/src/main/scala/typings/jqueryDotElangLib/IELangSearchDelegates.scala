package typings
package jqueryDotElangLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IELangSearchDelegates extends js.Object {
  var langDirectionClickHandler: js.Function
  var langDirectionHandler: js.Function
  var searchClickHandler: js.Function
  var searchHandler: js.Function
  var selectCallback: js.Function
  var selectHandler: js.Function
}

object IELangSearchDelegates {
  @scala.inline
  def apply(
    langDirectionClickHandler: js.Function,
    langDirectionHandler: js.Function,
    searchClickHandler: js.Function,
    searchHandler: js.Function,
    selectCallback: js.Function,
    selectHandler: js.Function
  ): IELangSearchDelegates = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("langDirectionClickHandler")(langDirectionClickHandler)
    __obj.updateDynamic("langDirectionHandler")(langDirectionHandler)
    __obj.updateDynamic("searchClickHandler")(searchClickHandler)
    __obj.updateDynamic("searchHandler")(searchHandler)
    __obj.updateDynamic("selectCallback")(selectCallback)
    __obj.updateDynamic("selectHandler")(selectHandler)
    __obj.asInstanceOf[IELangSearchDelegates]
  }
}


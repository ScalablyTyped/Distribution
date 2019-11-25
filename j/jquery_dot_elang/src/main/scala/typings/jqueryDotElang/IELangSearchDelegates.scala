package typings.jqueryDotElang

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
    val __obj = js.Dynamic.literal(langDirectionClickHandler = langDirectionClickHandler.asInstanceOf[js.Any], langDirectionHandler = langDirectionHandler.asInstanceOf[js.Any], searchClickHandler = searchClickHandler.asInstanceOf[js.Any], searchHandler = searchHandler.asInstanceOf[js.Any], selectCallback = selectCallback.asInstanceOf[js.Any], selectHandler = selectHandler.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IELangSearchDelegates]
  }
}


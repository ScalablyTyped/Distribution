package typings.jqueryElang

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IELangSearchDelegates extends js.Object {
  var langDirectionClickHandler: js.Function = js.native
  var langDirectionHandler: js.Function = js.native
  var searchClickHandler: js.Function = js.native
  var searchHandler: js.Function = js.native
  var selectCallback: js.Function = js.native
  var selectHandler: js.Function = js.native
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
  @scala.inline
  implicit class IELangSearchDelegatesOps[Self <: IELangSearchDelegates] (val x: Self) extends AnyVal {
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
    def setLangDirectionClickHandler(value: js.Function): Self = this.set("langDirectionClickHandler", value.asInstanceOf[js.Any])
    @scala.inline
    def setLangDirectionHandler(value: js.Function): Self = this.set("langDirectionHandler", value.asInstanceOf[js.Any])
    @scala.inline
    def setSearchClickHandler(value: js.Function): Self = this.set("searchClickHandler", value.asInstanceOf[js.Any])
    @scala.inline
    def setSearchHandler(value: js.Function): Self = this.set("searchHandler", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectCallback(value: js.Function): Self = this.set("selectCallback", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectHandler(value: js.Function): Self = this.set("selectHandler", value.asInstanceOf[js.Any])
  }
  
}


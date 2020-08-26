package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgGridAppendRowsOnDemandLocale
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  /**
    * Specifies caption text for the "load more data" button.
    *
    */
  var loadMoreDataButtonText: js.UndefOr[String] = js.native
}

object IgGridAppendRowsOnDemandLocale {
  @scala.inline
  def apply(): IgGridAppendRowsOnDemandLocale = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgGridAppendRowsOnDemandLocale]
  }
  @scala.inline
  implicit class IgGridAppendRowsOnDemandLocaleOps[Self <: IgGridAppendRowsOnDemandLocale] (val x: Self) extends AnyVal {
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
    def setLoadMoreDataButtonText(value: String): Self = this.set("loadMoreDataButtonText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoadMoreDataButtonText: Self = this.set("loadMoreDataButtonText", js.undefined)
  }
  
}


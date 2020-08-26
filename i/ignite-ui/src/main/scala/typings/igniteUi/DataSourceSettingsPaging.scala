package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataSourceSettingsPaging
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  /**
    * Whether when a new page of data is requested we should append the new data to the existing data
    *
    */
  var appendPage: js.UndefOr[Boolean] = js.native
  /**
    * Paging is not enabled by default
    *
    */
  var enabled: js.UndefOr[Boolean] = js.native
  /**
    * Current page index
    *
    */
  var pageIndex: js.UndefOr[Double] = js.native
  /**
    * Denotes the name of the encoded URL parameter that will state what is the currently requested page index
    *
    */
  var pageIndexUrlKey: js.UndefOr[String] = js.native
  /**
    * Number of records on each page
    *
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * Denotes the name of the encoded URL parameter that will state what is the currently requested page size
    *
    */
  var pageSizeUrlKey: js.UndefOr[String] = js.native
  /**
    * Type for the paging operation
    *
    *
    * Valid values:
    * "local" Data is paged client-side.
    * "remote" A remote request is done and URL params encoded
    */
  var `type`: js.UndefOr[String] = js.native
}

object DataSourceSettingsPaging {
  @scala.inline
  def apply(): DataSourceSettingsPaging = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSourceSettingsPaging]
  }
  @scala.inline
  implicit class DataSourceSettingsPagingOps[Self <: DataSourceSettingsPaging] (val x: Self) extends AnyVal {
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
    def setAppendPage(value: Boolean): Self = this.set("appendPage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppendPage: Self = this.set("appendPage", js.undefined)
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    @scala.inline
    def setPageIndex(value: Double): Self = this.set("pageIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageIndex: Self = this.set("pageIndex", js.undefined)
    @scala.inline
    def setPageIndexUrlKey(value: String): Self = this.set("pageIndexUrlKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageIndexUrlKey: Self = this.set("pageIndexUrlKey", js.undefined)
    @scala.inline
    def setPageSize(value: Double): Self = this.set("pageSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageSize: Self = this.set("pageSize", js.undefined)
    @scala.inline
    def setPageSizeUrlKey(value: String): Self = this.set("pageSizeUrlKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageSizeUrlKey: Self = this.set("pageSizeUrlKey", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}


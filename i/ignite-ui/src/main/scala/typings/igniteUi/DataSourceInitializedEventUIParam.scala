package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataSourceInitializedEventUIParam extends js.Object {
  /**
    * Gets a reference to the data source.
    */
  var dataSource: js.UndefOr[js.Any] = js.native
  /**
    * See if an error has occured during initialization.
    */
  var error: js.UndefOr[String] = js.native
  /**
    * Gets a reference to the root of the data source metatadata root item.
    */
  var metadataTreeRoot: js.UndefOr[js.Any] = js.native
  /**
    * Gets a reference to the data selector.
    */
  var owner: js.UndefOr[js.Any] = js.native
}

object DataSourceInitializedEventUIParam {
  @scala.inline
  def apply(): DataSourceInitializedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSourceInitializedEventUIParam]
  }
  @scala.inline
  implicit class DataSourceInitializedEventUIParamOps[Self <: DataSourceInitializedEventUIParam] (val x: Self) extends AnyVal {
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
    def setDataSource(value: js.Any): Self = this.set("dataSource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataSource: Self = this.set("dataSource", js.undefined)
    @scala.inline
    def setError(value: String): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    @scala.inline
    def setMetadataTreeRoot(value: js.Any): Self = this.set("metadataTreeRoot", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetadataTreeRoot: Self = this.set("metadataTreeRoot", js.undefined)
    @scala.inline
    def setOwner(value: js.Any): Self = this.set("owner", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOwner: Self = this.set("owner", js.undefined)
  }
  
}


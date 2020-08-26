package typings.googleapis.fitnessV1Mod.fitnessV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaListDataSourcesResponse extends js.Object {
  /**
    * A previously created data source.
    */
  var dataSource: js.UndefOr[js.Array[SchemaDataSource]] = js.native
}

object SchemaListDataSourcesResponse {
  @scala.inline
  def apply(): SchemaListDataSourcesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListDataSourcesResponse]
  }
  @scala.inline
  implicit class SchemaListDataSourcesResponseOps[Self <: SchemaListDataSourcesResponse] (val x: Self) extends AnyVal {
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
    def setDataSourceVarargs(value: SchemaDataSource*): Self = this.set("dataSource", js.Array(value :_*))
    @scala.inline
    def setDataSource(value: js.Array[SchemaDataSource]): Self = this.set("dataSource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataSource: Self = this.set("dataSource", js.undefined)
  }
  
}


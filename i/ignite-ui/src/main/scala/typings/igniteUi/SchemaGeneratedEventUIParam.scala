package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaGeneratedEventUIParam extends js.Object {
  /**
    * Gets reference to data source.
    */
  var dataSource: js.UndefOr[js.Any] = js.native
  /**
    * Gets a reference to the grid.
    */
  var owner: js.UndefOr[js.Any] = js.native
  /**
    * Gets a reference to data source schema.
    */
  var schema: js.UndefOr[js.Any] = js.native
}

object SchemaGeneratedEventUIParam {
  @scala.inline
  def apply(): SchemaGeneratedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGeneratedEventUIParam]
  }
  @scala.inline
  implicit class SchemaGeneratedEventUIParamOps[Self <: SchemaGeneratedEventUIParam] (val x: Self) extends AnyVal {
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
    def setOwner(value: js.Any): Self = this.set("owner", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOwner: Self = this.set("owner", js.undefined)
    @scala.inline
    def setSchema(value: js.Any): Self = this.set("schema", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSchema: Self = this.set("schema", js.undefined)
  }
  
}


package typings.googleapis.youtubeAnalyticsV2Mod.youtubeAnalyticsV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The description of a column of the result table.
  */
@js.native
trait SchemaResultTableColumnHeader extends js.Object {
  /**
    * The type of the column (`DIMENSION` or `METRIC`).
    */
  var columnType: js.UndefOr[String] = js.native
  /**
    * The type of the data in the column (`STRING`, `INTEGER`, `FLOAT`, etc.).
    */
  var dataType: js.UndefOr[String] = js.native
  /**
    * The name of the dimension or metric.
    */
  var name: js.UndefOr[String] = js.native
}

object SchemaResultTableColumnHeader {
  @scala.inline
  def apply(): SchemaResultTableColumnHeader = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResultTableColumnHeader]
  }
  @scala.inline
  implicit class SchemaResultTableColumnHeaderOps[Self <: SchemaResultTableColumnHeader] (val x: Self) extends AnyVal {
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
    def setColumnType(value: String): Self = this.set("columnType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumnType: Self = this.set("columnType", js.undefined)
    @scala.inline
    def setDataType(value: String): Self = this.set("dataType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataType: Self = this.set("dataType", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
  
}


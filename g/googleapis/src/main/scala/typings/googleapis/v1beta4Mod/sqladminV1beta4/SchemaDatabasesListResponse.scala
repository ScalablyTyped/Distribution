package typings.googleapis.v1beta4Mod.sqladminV1beta4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Database list response.
  */
@js.native
trait SchemaDatabasesListResponse extends js.Object {
  /**
    * List of database resources in the instance.
    */
  var items: js.UndefOr[js.Array[SchemaDatabase]] = js.native
  /**
    * This is always sql#databasesList.
    */
  var kind: js.UndefOr[String] = js.native
}

object SchemaDatabasesListResponse {
  @scala.inline
  def apply(): SchemaDatabasesListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDatabasesListResponse]
  }
  @scala.inline
  implicit class SchemaDatabasesListResponseOps[Self <: SchemaDatabasesListResponse] (val x: Self) extends AnyVal {
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
    def setItemsVarargs(value: SchemaDatabase*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[SchemaDatabase]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
  }
  
}


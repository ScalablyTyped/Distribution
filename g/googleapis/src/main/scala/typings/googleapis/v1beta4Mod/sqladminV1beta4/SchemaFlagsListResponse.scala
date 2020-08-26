package typings.googleapis.v1beta4Mod.sqladminV1beta4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Flags list response.
  */
@js.native
trait SchemaFlagsListResponse extends js.Object {
  /**
    * List of flags.
    */
  var items: js.UndefOr[js.Array[SchemaFlag]] = js.native
  /**
    * This is always sql#flagsList.
    */
  var kind: js.UndefOr[String] = js.native
}

object SchemaFlagsListResponse {
  @scala.inline
  def apply(): SchemaFlagsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFlagsListResponse]
  }
  @scala.inline
  implicit class SchemaFlagsListResponseOps[Self <: SchemaFlagsListResponse] (val x: Self) extends AnyVal {
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
    def setItemsVarargs(value: SchemaFlag*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[SchemaFlag]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
  }
  
}


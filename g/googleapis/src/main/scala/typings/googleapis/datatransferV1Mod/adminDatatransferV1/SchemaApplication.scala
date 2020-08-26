package typings.googleapis.datatransferV1Mod.adminDatatransferV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The JSON template for an Application resource.
  */
@js.native
trait SchemaApplication extends js.Object {
  /**
    * Etag of the resource.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * The application&#39;s ID.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Identifies the resource as a DataTransfer Application Resource.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The application&#39;s name.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The list of all possible transfer parameters for this application. These
    * parameters can be used to select the data of the user in this application
    * to be transfered.
    */
  var transferParams: js.UndefOr[js.Array[SchemaApplicationTransferParam]] = js.native
}

object SchemaApplication {
  @scala.inline
  def apply(): SchemaApplication = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaApplication]
  }
  @scala.inline
  implicit class SchemaApplicationOps[Self <: SchemaApplication] (val x: Self) extends AnyVal {
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
    def setEtag(value: String): Self = this.set("etag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEtag: Self = this.set("etag", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setTransferParamsVarargs(value: SchemaApplicationTransferParam*): Self = this.set("transferParams", js.Array(value :_*))
    @scala.inline
    def setTransferParams(value: js.Array[SchemaApplicationTransferParam]): Self = this.set("transferParams", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransferParams: Self = this.set("transferParams", js.undefined)
  }
  
}


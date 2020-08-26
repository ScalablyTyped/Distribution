package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The response message for EntityTypes.ListEntityTypes.
  */
@js.native
trait SchemaGoogleCloudDialogflowV2beta1ListEntityTypesResponse extends js.Object {
  /**
    * The list of agent entity types. There will be a maximum number of items
    * returned based on the page_size field in the request.
    */
  var entityTypes: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowV2beta1EntityType]] = js.native
  /**
    * Token to retrieve the next page of results, or empty if there are no more
    * results in the list.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaGoogleCloudDialogflowV2beta1ListEntityTypesResponse {
  @scala.inline
  def apply(): SchemaGoogleCloudDialogflowV2beta1ListEntityTypesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2beta1ListEntityTypesResponse]
  }
  @scala.inline
  implicit class SchemaGoogleCloudDialogflowV2beta1ListEntityTypesResponseOps[Self <: SchemaGoogleCloudDialogflowV2beta1ListEntityTypesResponse] (val x: Self) extends AnyVal {
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
    def setEntityTypesVarargs(value: SchemaGoogleCloudDialogflowV2beta1EntityType*): Self = this.set("entityTypes", js.Array(value :_*))
    @scala.inline
    def setEntityTypes(value: js.Array[SchemaGoogleCloudDialogflowV2beta1EntityType]): Self = this.set("entityTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEntityTypes: Self = this.set("entityTypes", js.undefined)
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
  
}


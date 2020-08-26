package typings.googleapis.v2betaMod.deploymentmanagerV2beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A response that returns all Composite Types supported by Deployment Manager
  */
@js.native
trait SchemaCompositeTypesListResponse extends js.Object {
  /**
    * Output only. A list of resource composite types supported by Deployment
    * Manager.
    */
  var compositeTypes: js.UndefOr[js.Array[SchemaCompositeType]] = js.native
  /**
    * A token used to continue a truncated list request.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaCompositeTypesListResponse {
  @scala.inline
  def apply(): SchemaCompositeTypesListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCompositeTypesListResponse]
  }
  @scala.inline
  implicit class SchemaCompositeTypesListResponseOps[Self <: SchemaCompositeTypesListResponse] (val x: Self) extends AnyVal {
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
    def setCompositeTypesVarargs(value: SchemaCompositeType*): Self = this.set("compositeTypes", js.Array(value :_*))
    @scala.inline
    def setCompositeTypes(value: js.Array[SchemaCompositeType]): Self = this.set("compositeTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompositeTypes: Self = this.set("compositeTypes", js.undefined)
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
  
}


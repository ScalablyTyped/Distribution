package typings.googleapis.deploymentmanagerAlphaMod.deploymentmanagerAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaTypeProvidersListTypesResponse extends js.Object {
  /**
    * A token used to continue a truncated list request.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * Output only. A list of resource type info.
    */
  var types: js.UndefOr[js.Array[SchemaTypeInfo]] = js.native
}

object SchemaTypeProvidersListTypesResponse {
  @scala.inline
  def apply(): SchemaTypeProvidersListTypesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTypeProvidersListTypesResponse]
  }
  @scala.inline
  implicit class SchemaTypeProvidersListTypesResponseOps[Self <: SchemaTypeProvidersListTypesResponse] (val x: Self) extends AnyVal {
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
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
    @scala.inline
    def setTypesVarargs(value: SchemaTypeInfo*): Self = this.set("types", js.Array(value :_*))
    @scala.inline
    def setTypes(value: js.Array[SchemaTypeInfo]): Self = this.set("types", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTypes: Self = this.set("types", js.undefined)
  }
  
}


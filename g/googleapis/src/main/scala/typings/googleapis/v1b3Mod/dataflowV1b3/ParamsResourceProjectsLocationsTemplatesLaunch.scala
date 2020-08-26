package typings.googleapis.v1b3Mod.dataflowV1b3

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceProjectsLocationsTemplatesLaunch extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Path to dynamic template spec file on GCS. The file must be a Json
    * serialized DynamicTemplateFieSpec object.
    */
  @JSName("dynamicTemplate.gcsPath")
  var dynamicTemplateDotgcsPath: js.UndefOr[String] = js.native
  /**
    * Cloud Storage path for staging dependencies. Must be a valid Cloud
    * Storage URL, beginning with `gs://`.
    */
  @JSName("dynamicTemplate.stagingLocation")
  var dynamicTemplateDotstagingLocation: js.UndefOr[String] = js.native
  /**
    * A Cloud Storage path to the template from which to create the job. Must
    * be valid Cloud Storage URL, beginning with 'gs://'.
    */
  var gcsPath: js.UndefOr[String] = js.native
  /**
    * The [regional endpoint]
    * (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints) to
    * which to direct the request.
    */
  var location: js.UndefOr[String] = js.native
  /**
    * Required. The ID of the Cloud Platform project that the job belongs to.
    */
  var projectId: js.UndefOr[String] = js.native
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaLaunchTemplateParameters] = js.native
  /**
    * If true, the request is validated but not actually executed. Defaults to
    * false.
    */
  var validateOnly: js.UndefOr[Boolean] = js.native
}

object ParamsResourceProjectsLocationsTemplatesLaunch {
  @scala.inline
  def apply(): ParamsResourceProjectsLocationsTemplatesLaunch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsTemplatesLaunch]
  }
  @scala.inline
  implicit class ParamsResourceProjectsLocationsTemplatesLaunchOps[Self <: ParamsResourceProjectsLocationsTemplatesLaunch] (val x: Self) extends AnyVal {
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
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = this.set("auth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuth: Self = this.set("auth", js.undefined)
    @scala.inline
    def setDynamicTemplateDotgcsPath(value: String): Self = this.set("dynamicTemplate.gcsPath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDynamicTemplateDotgcsPath: Self = this.set("dynamicTemplate.gcsPath", js.undefined)
    @scala.inline
    def setDynamicTemplateDotstagingLocation(value: String): Self = this.set("dynamicTemplate.stagingLocation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDynamicTemplateDotstagingLocation: Self = this.set("dynamicTemplate.stagingLocation", js.undefined)
    @scala.inline
    def setGcsPath(value: String): Self = this.set("gcsPath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGcsPath: Self = this.set("gcsPath", js.undefined)
    @scala.inline
    def setLocation(value: String): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    @scala.inline
    def setProjectId(value: String): Self = this.set("projectId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProjectId: Self = this.set("projectId", js.undefined)
    @scala.inline
    def setRequestBody(value: SchemaLaunchTemplateParameters): Self = this.set("requestBody", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestBody: Self = this.set("requestBody", js.undefined)
    @scala.inline
    def setValidateOnly(value: Boolean): Self = this.set("validateOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValidateOnly: Self = this.set("validateOnly", js.undefined)
  }
  
}


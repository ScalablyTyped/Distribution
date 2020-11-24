package typings.maximMazurokGapiClientCloudasset.gapi.client.cloudasset

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Resource extends js.Object {
  
  /** The content of the resource, in which some sensitive fields are removed and may not be present. */
  var data: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: any}
    */ typings.maximMazurokGapiClientCloudasset.maximMazurokGapiClientCloudassetStrings.Resource with TopLevel[js.Any]
  ] = js.native
  
  /**
    * The URL of the discovery document containing the resource's JSON schema. Example: `https://www.googleapis.com/discovery/v1/apis/compute/v1/rest` This value is unspecified for
    * resources that do not have an API based on a discovery document, such as Cloud Bigtable.
    */
  var discoveryDocumentUri: js.UndefOr[String] = js.native
  
  /**
    * The JSON schema name listed in the discovery document. Example: `Project` This value is unspecified for resources that do not have an API based on a discovery document, such as
    * Cloud Bigtable.
    */
  var discoveryName: js.UndefOr[String] = js.native
  
  /** The location of the resource in Google Cloud, such as its zone and region. For more information, see https://cloud.google.com/about/locations/. */
  var location: js.UndefOr[String] = js.native
  
  /**
    * The full name of the immediate parent of this resource. See [Resource Names](https://cloud.google.com/apis/design/resource_names#full_resource_name) for more information. For Google
    * Cloud assets, this value is the parent resource defined in the [Cloud IAM policy hierarchy](https://cloud.google.com/iam/docs/overview#policy_hierarchy). Example:
    * `//cloudresourcemanager.googleapis.com/projects/my_project_123` For third-party assets, this field may be set differently.
    */
  var parent: js.UndefOr[String] = js.native
  
  /**
    * The REST URL for accessing the resource. An HTTP `GET` request using this URL returns the resource itself. Example:
    * `https://cloudresourcemanager.googleapis.com/v1/projects/my-project-123` This value is unspecified for resources without a REST API.
    */
  var resourceUrl: js.UndefOr[String] = js.native
  
  /** The API version. Example: `v1` */
  var version: js.UndefOr[String] = js.native
}
object Resource {
  
  @scala.inline
  def apply(): Resource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Resource]
  }
  
  @scala.inline
  implicit class ResourceOps[Self <: Resource] (val x: Self) extends AnyVal {
    
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
    def setData(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: any}
      */ typings.maximMazurokGapiClientCloudasset.maximMazurokGapiClientCloudassetStrings.Resource with TopLevel[js.Any]
    ): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setDiscoveryDocumentUri(value: String): Self = this.set("discoveryDocumentUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDiscoveryDocumentUri: Self = this.set("discoveryDocumentUri", js.undefined)
    
    @scala.inline
    def setDiscoveryName(value: String): Self = this.set("discoveryName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDiscoveryName: Self = this.set("discoveryName", js.undefined)
    
    @scala.inline
    def setLocation(value: String): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    
    @scala.inline
    def setParent(value: String): Self = this.set("parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParent: Self = this.set("parent", js.undefined)
    
    @scala.inline
    def setResourceUrl(value: String): Self = this.set("resourceUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceUrl: Self = this.set("resourceUrl", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
}

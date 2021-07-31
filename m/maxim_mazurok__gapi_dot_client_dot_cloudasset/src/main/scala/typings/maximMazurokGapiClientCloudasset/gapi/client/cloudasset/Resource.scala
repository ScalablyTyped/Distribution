package typings.maximMazurokGapiClientCloudasset.gapi.client.cloudasset

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Resource extends StObject {
  
  /** The content of the resource, in which some sensitive fields are removed and may not be present. */
  var data: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: any}
    */ typings.maximMazurokGapiClientCloudasset.maximMazurokGapiClientCloudassetStrings.Resource & TopLevel[js.Any]
  ] = js.undefined
  
  /**
    * The URL of the discovery document containing the resource's JSON schema. Example: `https://www.googleapis.com/discovery/v1/apis/compute/v1/rest` This value is unspecified for
    * resources that do not have an API based on a discovery document, such as Cloud Bigtable.
    */
  var discoveryDocumentUri: js.UndefOr[String] = js.undefined
  
  /**
    * The JSON schema name listed in the discovery document. Example: `Project` This value is unspecified for resources that do not have an API based on a discovery document, such as
    * Cloud Bigtable.
    */
  var discoveryName: js.UndefOr[String] = js.undefined
  
  /** The location of the resource in Google Cloud, such as its zone and region. For more information, see https://cloud.google.com/about/locations/. */
  var location: js.UndefOr[String] = js.undefined
  
  /**
    * The full name of the immediate parent of this resource. See [Resource Names](https://cloud.google.com/apis/design/resource_names#full_resource_name) for more information. For Google
    * Cloud assets, this value is the parent resource defined in the [Cloud IAM policy hierarchy](https://cloud.google.com/iam/docs/overview#policy_hierarchy). Example:
    * `//cloudresourcemanager.googleapis.com/projects/my_project_123` For third-party assets, this field may be set differently.
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * The REST URL for accessing the resource. An HTTP `GET` request using this URL returns the resource itself. Example:
    * `https://cloudresourcemanager.googleapis.com/v1/projects/my-project-123` This value is unspecified for resources without a REST API.
    */
  var resourceUrl: js.UndefOr[String] = js.undefined
  
  /** The API version. Example: `v1` */
  var version: js.UndefOr[String] = js.undefined
}
object Resource {
  
  @scala.inline
  def apply(): Resource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Resource]
  }
  
  @scala.inline
  implicit class ResourceMutableBuilder[Self <: Resource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: any}
      */ typings.maximMazurokGapiClientCloudasset.maximMazurokGapiClientCloudassetStrings.Resource & TopLevel[js.Any]
    ): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setDiscoveryDocumentUri(value: String): Self = StObject.set(x, "discoveryDocumentUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiscoveryDocumentUriUndefined: Self = StObject.set(x, "discoveryDocumentUri", js.undefined)
    
    @scala.inline
    def setDiscoveryName(value: String): Self = StObject.set(x, "discoveryName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiscoveryNameUndefined: Self = StObject.set(x, "discoveryName", js.undefined)
    
    @scala.inline
    def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    @scala.inline
    def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    @scala.inline
    def setResourceUrl(value: String): Self = StObject.set(x, "resourceUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceUrlUndefined: Self = StObject.set(x, "resourceUrl", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}

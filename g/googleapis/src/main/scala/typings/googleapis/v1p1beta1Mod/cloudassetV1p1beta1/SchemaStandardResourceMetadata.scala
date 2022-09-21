package typings.googleapis.v1p1beta1Mod.cloudassetV1p1beta1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaStandardResourceMetadata extends StObject {
  
  /**
    * Additional searchable attributes of this resource. Informational only. The exact set of attributes is subject to change. For example: project id, DNS name etc.
    */
  var additionalAttributes: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * The type of this resource. For example: "compute.googleapis.com/Disk".
    */
  var assetType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * One or more paragraphs of text description of this resource. Maximum length could be up to 1M bytes.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The display name of this resource.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Labels associated with this resource. See [Labelling and grouping GCP resources](https://cloud.google.com/blog/products/gcp/labelling-and-grouping-your-google-cloud-platform-resources) for more information.
    */
  var labels: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * Location can be "global", regional like "us-east1", or zonal like "us-west1-b".
    */
  var location: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The full resource name. For example: `//compute.googleapis.com/projects/my_project_123/zones/zone1/instances/instance1`. See [Resource Names](https://cloud.google.com/apis/design/resource_names#full_resource_name) for more information.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Network tags associated with this resource. Like labels, network tags are a type of annotations used to group GCP resources. See [Labelling GCP resources](lhttps://cloud.google.com/blog/products/gcp/labelling-and-grouping-your-google-cloud-platform-resources) for more information.
    */
  var networkTags: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * The project that this resource belongs to, in the form of `projects/{project_number\}`.
    */
  var project: js.UndefOr[String | Null] = js.undefined
}
object SchemaStandardResourceMetadata {
  
  inline def apply(): SchemaStandardResourceMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStandardResourceMetadata]
  }
  
  extension [Self <: SchemaStandardResourceMetadata](x: Self) {
    
    inline def setAdditionalAttributes(value: js.Array[String]): Self = StObject.set(x, "additionalAttributes", value.asInstanceOf[js.Any])
    
    inline def setAdditionalAttributesNull: Self = StObject.set(x, "additionalAttributes", null)
    
    inline def setAdditionalAttributesUndefined: Self = StObject.set(x, "additionalAttributes", js.undefined)
    
    inline def setAdditionalAttributesVarargs(value: String*): Self = StObject.set(x, "additionalAttributes", js.Array(value*))
    
    inline def setAssetType(value: String): Self = StObject.set(x, "assetType", value.asInstanceOf[js.Any])
    
    inline def setAssetTypeNull: Self = StObject.set(x, "assetType", null)
    
    inline def setAssetTypeUndefined: Self = StObject.set(x, "assetType", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsNull: Self = StObject.set(x, "labels", null)
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationNull: Self = StObject.set(x, "location", null)
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNetworkTags(value: js.Array[String]): Self = StObject.set(x, "networkTags", value.asInstanceOf[js.Any])
    
    inline def setNetworkTagsNull: Self = StObject.set(x, "networkTags", null)
    
    inline def setNetworkTagsUndefined: Self = StObject.set(x, "networkTags", js.undefined)
    
    inline def setNetworkTagsVarargs(value: String*): Self = StObject.set(x, "networkTags", js.Array(value*))
    
    inline def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    inline def setProjectNull: Self = StObject.set(x, "project", null)
    
    inline def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
  }
}

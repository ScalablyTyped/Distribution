package typings.googleapis.iapV1Mod.iapV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaResource extends StObject {
  
  /**
    * The service defined labels of the resource on which the conditions will be evaluated. The semantics - including the key names - are vague to IAM. If the effective condition has a reference to a `resource.labels[foo]` construct, IAM consults with this map to retrieve the values associated with `foo` key for Conditions evaluation. If the provided key is not found in the labels map, the condition would evaluate to false. This field is in limited use. If your intended use case is not expected to express resource.labels attribute in IAM Conditions, leave this field empty. Before planning on using this attribute please: * Read go/iam-conditions-labels-comm and ensure your service can meet the data availability and management requirements. * Talk to iam-conditions-eng@ about your use case.
    */
  var labels: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * Name of the resource on which conditions will be evaluated. Must use the Relative Resource Name of the resource, which is the URI path of the resource without the leading "/". Examples are "projects/_/buckets/[BUCKET-ID]" for storage buckets or "projects/[PROJECT-ID]/global/firewalls/[FIREWALL-ID]" for a firewall. This field is required for evaluating conditions with rules on resource names. For a `list` permission check, the resource.name value must be set to the parent resource. If the parent resource is a project, this field should be left unset.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The name of the service this resource belongs to. It is configured using the official_service_name of the Service as defined in service configurations under //configs/cloud/resourcetypes. For example, the official_service_name of cloud resource manager service is set as 'cloudresourcemanager.googleapis.com' according to //configs/cloud/resourcetypes/google/cloud/resourcemanager/prod.yaml
    */
  var service: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The public resource type name of the resource on which conditions will be evaluated. It is configured using the official_name of the ResourceType as defined in service configurations under //configs/cloud/resourcetypes. For example, the official_name for GCP projects is set as 'cloudresourcemanager.googleapis.com/Project' according to //configs/cloud/resourcetypes/google/cloud/resourcemanager/prod.yaml For details see go/iam-conditions-integration-guide.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
}
object SchemaResource {
  
  inline def apply(): SchemaResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResource]
  }
  
  extension [Self <: SchemaResource](x: Self) {
    
    inline def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsNull: Self = StObject.set(x, "labels", null)
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setService(value: String): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    
    inline def setServiceNull: Self = StObject.set(x, "service", null)
    
    inline def setServiceUndefined: Self = StObject.set(x, "service", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}

package typings.googleapis.serviceusageV1beta1Mod.serviceusageV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An object that describes the schema of a MonitoredResource object using a
  * type name and a set of labels.  For example, the monitored resource
  * descriptor for Google Compute Engine VM instances has a type of
  * `&quot;gce_instance&quot;` and specifies the use of the labels
  * `&quot;instance_id&quot;` and `&quot;zone&quot;` to identify particular VM
  * instances.  Different APIs can support different monitored resource types.
  * APIs generally provide a `list` method that returns the monitored resource
  * descriptors used by the API.
  */
trait SchemaMonitoredResourceDescriptor extends StObject {
  
  /**
    * Optional. A detailed description of the monitored resource type that
    * might be used in documentation.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. A concise name for the monitored resource type that might be
    * displayed in user interfaces. It should be a Title Cased Noun Phrase,
    * without any article or other determiners. For example, `&quot;Google
    * Cloud SQL Database&quot;`.
    */
  var displayName: js.UndefOr[String] = js.undefined
  
  /**
    * Required. A set of labels used to describe instances of this monitored
    * resource type. For example, an individual Google Cloud SQL database is
    * identified by values for the labels `&quot;database_id&quot;` and
    * `&quot;zone&quot;`.
    */
  var labels: js.UndefOr[js.Array[SchemaLabelDescriptor]] = js.undefined
  
  /**
    * Optional. The resource name of the monitored resource descriptor:
    * `&quot;projects/{project_id}/monitoredResourceDescriptors/{type}&quot;`
    * where {type} is the value of the `type` field in this object and
    * {project_id} is a project ID that provides API-specific context for
    * accessing the type.  APIs that do not use project information can use the
    * resource name format `&quot;monitoredResourceDescriptors/{type}&quot;`.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The monitored resource type. For example, the type
    * `&quot;cloudsql_database&quot;` represents databases in Google Cloud SQL.
    * The maximum length of this value is 256 characters.
    */
  var `type`: js.UndefOr[String] = js.undefined
}
object SchemaMonitoredResourceDescriptor {
  
  inline def apply(): SchemaMonitoredResourceDescriptor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMonitoredResourceDescriptor]
  }
  
  extension [Self <: SchemaMonitoredResourceDescriptor](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setLabels(value: js.Array[SchemaLabelDescriptor]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setLabelsVarargs(value: SchemaLabelDescriptor*): Self = StObject.set(x, "labels", js.Array(value :_*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}

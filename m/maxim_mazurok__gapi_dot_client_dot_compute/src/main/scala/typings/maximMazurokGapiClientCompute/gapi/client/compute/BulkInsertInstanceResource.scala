package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BulkInsertInstanceResource extends StObject {
  
  /** The maximum number of instances to create. */
  var count: js.UndefOr[String] = js.undefined
  
  /** The instance properties defining the VM instances to be created. Required if sourceInstanceTemplate is not provided. */
  var instanceProperties: js.UndefOr[InstanceProperties] = js.undefined
  
  /** Policy for chosing target zone. */
  var locationPolicy: js.UndefOr[LocationPolicy] = js.undefined
  
  /**
    * The minimum number of instances to create. If no min_count is specified then count is used as the default value. If min_count instances cannot be created, then no instances will be
    * created and instances already created will be deleted.
    */
  var minCount: js.UndefOr[String] = js.undefined
  
  /**
    * The string pattern used for the names of the VMs. Either name_pattern or per_instance_properties must be set. The pattern should contain one continuous sequence of placeholder hash
    * characters (#) with each character corresponding to one digit of the generated instance name. Example: name_pattern of inst-#### will generate instance names such as inst-0001,
    * inst-0002, ... . If there already exist instance(s) whose names match the name pattern in the same project and zone, then the generated instance numbers will start after the biggest
    * existing number. For example, if there exists an instance with name inst-0050, then instance names generated using the pattern inst-#### will be inst-0051, inst-0052, etc. The name
    * pattern placeholder # ...# can contain up to 18 characters.
    */
  var namePattern: js.UndefOr[String] = js.undefined
  
  /** Per-instance properties to be set on individual instances. Keys of this map specify requested instance names. Can be empty if name_pattern is used. */
  var perInstanceProperties: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: @maxim_mazurok/gapi.client.compute.gapi.client.compute.BulkInsertInstanceResourcePerInstanceProperties} */ js.Any
  ] = js.undefined
  
  /**
    * Specifies the instance template from which to create instances. You may combine sourceInstanceTemplate with instanceProperties to override specific values from an existing instance
    * template. Bulk API follows the semantics of JSON Merge Patch described by RFC 7396. It can be a full or partial URL. For example, the following are all valid URLs to an instance
    * template: - https://www.googleapis.com/compute/v1/projects/project /global/instanceTemplates/instanceTemplate - projects/project/global/instanceTemplates/instanceTemplate -
    * global/instanceTemplates/instanceTemplate This field is optional.
    */
  var sourceInstanceTemplate: js.UndefOr[String] = js.undefined
}
object BulkInsertInstanceResource {
  
  inline def apply(): BulkInsertInstanceResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BulkInsertInstanceResource]
  }
  
  extension [Self <: BulkInsertInstanceResource](x: Self) {
    
    inline def setCount(value: String): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    inline def setInstanceProperties(value: InstanceProperties): Self = StObject.set(x, "instanceProperties", value.asInstanceOf[js.Any])
    
    inline def setInstancePropertiesUndefined: Self = StObject.set(x, "instanceProperties", js.undefined)
    
    inline def setLocationPolicy(value: LocationPolicy): Self = StObject.set(x, "locationPolicy", value.asInstanceOf[js.Any])
    
    inline def setLocationPolicyUndefined: Self = StObject.set(x, "locationPolicy", js.undefined)
    
    inline def setMinCount(value: String): Self = StObject.set(x, "minCount", value.asInstanceOf[js.Any])
    
    inline def setMinCountUndefined: Self = StObject.set(x, "minCount", js.undefined)
    
    inline def setNamePattern(value: String): Self = StObject.set(x, "namePattern", value.asInstanceOf[js.Any])
    
    inline def setNamePatternUndefined: Self = StObject.set(x, "namePattern", js.undefined)
    
    inline def setPerInstanceProperties(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: @maxim_mazurok/gapi.client.compute.gapi.client.compute.BulkInsertInstanceResourcePerInstanceProperties} */ js.Any
    ): Self = StObject.set(x, "perInstanceProperties", value.asInstanceOf[js.Any])
    
    inline def setPerInstancePropertiesUndefined: Self = StObject.set(x, "perInstanceProperties", js.undefined)
    
    inline def setSourceInstanceTemplate(value: String): Self = StObject.set(x, "sourceInstanceTemplate", value.asInstanceOf[js.Any])
    
    inline def setSourceInstanceTemplateUndefined: Self = StObject.set(x, "sourceInstanceTemplate", js.undefined)
  }
}

package typings.googleapis.recommenderV1Mod.recommenderV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRecommenderV1Operation extends StObject {
  
  /**
    * Type of this operation. Contains one of 'add', 'remove', 'replace', 'move', 'copy', 'test' and custom operations. This field is case-insensitive and always populated.
    */
  var action: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Path to the target field being operated on. If the operation is at the resource level, then path should be "/". This field is always populated.
    */
  var path: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Set of filters to apply if `path` refers to array elements or nested array elements in order to narrow down to a single unique element that is being tested/modified. This is intended to be an exact match per filter. To perform advanced matching, use path_value_matchers. * Example: ``` { "/versions/x/name" : "it-123" "/versions/x/targetSize/percent": 20 \} ``` * Example: ``` { "/bindings/x/role": "roles/owner" "/bindings/x/condition" : null \} ``` * Example: ``` { "/bindings/x/role": "roles/owner" "/bindings/x/members/x" : ["x@example.com", "y@example.com"] \} ``` When both path_filters and path_value_matchers are set, an implicit AND must be performed.
    */
  var pathFilters: js.UndefOr[StringDictionary[Any] | Null] = js.undefined
  
  /**
    * Similar to path_filters, this contains set of filters to apply if `path` field refers to array elements. This is meant to support value matching beyond exact match. To perform exact match, use path_filters. When both path_filters and path_value_matchers are set, an implicit AND must be performed.
    */
  var pathValueMatchers: js.UndefOr[StringDictionary[SchemaGoogleCloudRecommenderV1ValueMatcher] | Null] = js.undefined
  
  /**
    * Contains the fully qualified resource name. This field is always populated. ex: //cloudresourcemanager.googleapis.com/projects/foo.
    */
  var resource: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Type of GCP resource being modified/tested. This field is always populated. Example: cloudresourcemanager.googleapis.com/Project, compute.googleapis.com/Instance
    */
  var resourceType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Can be set with action 'copy' or 'move' to indicate the source field within resource or source_resource, ignored if provided for other operation types.
    */
  var sourcePath: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Can be set with action 'copy' to copy resource configuration across different resources of the same type. Example: A resource clone can be done via action = 'copy', path = "/", from = "/", source_resource = and resource_name = . This field is empty for all other values of `action`.
    */
  var sourceResource: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Value for the `path` field. Will be set for actions:'add'/'replace'. Maybe set for action: 'test'. Either this or `value_matcher` will be set for 'test' operation. An exact match must be performed.
    */
  var value: js.UndefOr[Any | Null] = js.undefined
  
  /**
    * Can be set for action 'test' for advanced matching for the value of 'path' field. Either this or `value` will be set for 'test' operation.
    */
  var valueMatcher: js.UndefOr[SchemaGoogleCloudRecommenderV1ValueMatcher] = js.undefined
}
object SchemaGoogleCloudRecommenderV1Operation {
  
  inline def apply(): SchemaGoogleCloudRecommenderV1Operation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRecommenderV1Operation]
  }
  
  extension [Self <: SchemaGoogleCloudRecommenderV1Operation](x: Self) {
    
    inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionNull: Self = StObject.set(x, "action", null)
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathFilters(value: StringDictionary[Any]): Self = StObject.set(x, "pathFilters", value.asInstanceOf[js.Any])
    
    inline def setPathFiltersNull: Self = StObject.set(x, "pathFilters", null)
    
    inline def setPathFiltersUndefined: Self = StObject.set(x, "pathFilters", js.undefined)
    
    inline def setPathNull: Self = StObject.set(x, "path", null)
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setPathValueMatchers(value: StringDictionary[SchemaGoogleCloudRecommenderV1ValueMatcher]): Self = StObject.set(x, "pathValueMatchers", value.asInstanceOf[js.Any])
    
    inline def setPathValueMatchersNull: Self = StObject.set(x, "pathValueMatchers", null)
    
    inline def setPathValueMatchersUndefined: Self = StObject.set(x, "pathValueMatchers", js.undefined)
    
    inline def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    inline def setResourceNull: Self = StObject.set(x, "resource", null)
    
    inline def setResourceType(value: String): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setResourceTypeNull: Self = StObject.set(x, "resourceType", null)
    
    inline def setResourceTypeUndefined: Self = StObject.set(x, "resourceType", js.undefined)
    
    inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
    
    inline def setSourcePath(value: String): Self = StObject.set(x, "sourcePath", value.asInstanceOf[js.Any])
    
    inline def setSourcePathNull: Self = StObject.set(x, "sourcePath", null)
    
    inline def setSourcePathUndefined: Self = StObject.set(x, "sourcePath", js.undefined)
    
    inline def setSourceResource(value: String): Self = StObject.set(x, "sourceResource", value.asInstanceOf[js.Any])
    
    inline def setSourceResourceNull: Self = StObject.set(x, "sourceResource", null)
    
    inline def setSourceResourceUndefined: Self = StObject.set(x, "sourceResource", js.undefined)
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueMatcher(value: SchemaGoogleCloudRecommenderV1ValueMatcher): Self = StObject.set(x, "valueMatcher", value.asInstanceOf[js.Any])
    
    inline def setValueMatcherUndefined: Self = StObject.set(x, "valueMatcher", js.undefined)
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}

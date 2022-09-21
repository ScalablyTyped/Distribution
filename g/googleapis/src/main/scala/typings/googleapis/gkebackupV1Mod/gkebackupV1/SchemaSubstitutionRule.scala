package typings.googleapis.gkebackupV1Mod.gkebackupV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSubstitutionRule extends StObject {
  
  /**
    * This is the new value to set for any fields that pass the filtering and selection criteria. To remove a value from a Kubernetes resource, either leave this field unspecified, or set it to the empty string ("").
    */
  var newValue: js.UndefOr[String | Null] = js.undefined
  
  /**
    * (Filtering parameter) This is a [regular expression] (https://en.wikipedia.org/wiki/Regular_expression) that is compared against the fields matched by the target_json_path expression (and must also have passed the previous filters). Substitution will not be performed against fields whose value does not match this expression. If this field is NOT specified, then ALL fields matched by the target_json_path expression will undergo substitution. Note that an empty (e.g., "", rather than unspecified) value for for this field will only match empty fields.
    */
  var originalValuePattern: js.UndefOr[String | Null] = js.undefined
  
  /**
    * (Filtering parameter) Any resource subject to substitution must belong to one of the listed "types". If this field is not provided, no type filtering will be performed (all resources of all types matching previous filtering parameters will be candidates for substitution).
    */
  var targetGroupKinds: js.UndefOr[js.Array[SchemaGroupKind]] = js.undefined
  
  /**
    * Required. This is a [JSONPath] (https://kubernetes.io/docs/reference/kubectl/jsonpath/) expression that matches specific fields of candidate resources and it operates as both a filtering parameter (resources that are not matched with this expression will not be candidates for substitution) as well as a field identifier (identifies exactly which fields out of the candidate resources will be modified).
    */
  var targetJsonPath: js.UndefOr[String | Null] = js.undefined
  
  /**
    * (Filtering parameter) Any resource subject to substitution must be contained within one of the listed Kubernetes Namespace in the Backup. If this field is not provided, no namespace filtering will be performed (all resources in all Namespaces, including all cluster-scoped resources, will be candidates for substitution). To mix cluster-scoped and namespaced resources in the same rule, use an empty string ("") as one of the target namespaces.
    */
  var targetNamespaces: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaSubstitutionRule {
  
  inline def apply(): SchemaSubstitutionRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSubstitutionRule]
  }
  
  extension [Self <: SchemaSubstitutionRule](x: Self) {
    
    inline def setNewValue(value: String): Self = StObject.set(x, "newValue", value.asInstanceOf[js.Any])
    
    inline def setNewValueNull: Self = StObject.set(x, "newValue", null)
    
    inline def setNewValueUndefined: Self = StObject.set(x, "newValue", js.undefined)
    
    inline def setOriginalValuePattern(value: String): Self = StObject.set(x, "originalValuePattern", value.asInstanceOf[js.Any])
    
    inline def setOriginalValuePatternNull: Self = StObject.set(x, "originalValuePattern", null)
    
    inline def setOriginalValuePatternUndefined: Self = StObject.set(x, "originalValuePattern", js.undefined)
    
    inline def setTargetGroupKinds(value: js.Array[SchemaGroupKind]): Self = StObject.set(x, "targetGroupKinds", value.asInstanceOf[js.Any])
    
    inline def setTargetGroupKindsUndefined: Self = StObject.set(x, "targetGroupKinds", js.undefined)
    
    inline def setTargetGroupKindsVarargs(value: SchemaGroupKind*): Self = StObject.set(x, "targetGroupKinds", js.Array(value*))
    
    inline def setTargetJsonPath(value: String): Self = StObject.set(x, "targetJsonPath", value.asInstanceOf[js.Any])
    
    inline def setTargetJsonPathNull: Self = StObject.set(x, "targetJsonPath", null)
    
    inline def setTargetJsonPathUndefined: Self = StObject.set(x, "targetJsonPath", js.undefined)
    
    inline def setTargetNamespaces(value: js.Array[String]): Self = StObject.set(x, "targetNamespaces", value.asInstanceOf[js.Any])
    
    inline def setTargetNamespacesNull: Self = StObject.set(x, "targetNamespaces", null)
    
    inline def setTargetNamespacesUndefined: Self = StObject.set(x, "targetNamespaces", js.undefined)
    
    inline def setTargetNamespacesVarargs(value: String*): Self = StObject.set(x, "targetNamespaces", js.Array(value*))
  }
}

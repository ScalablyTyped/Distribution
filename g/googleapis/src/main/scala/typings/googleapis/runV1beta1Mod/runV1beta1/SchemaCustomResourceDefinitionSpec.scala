package typings.googleapis.runV1beta1Mod.runV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCustomResourceDefinitionSpec extends StObject {
  
  /**
    * AdditionalPrinterColumns are additional columns shown e.g. in kubectl next to the name. Defaults to a created-at column. +optional
    */
  var additionalPrinterColumns: js.UndefOr[js.Array[SchemaCustomResourceColumnDefinition]] = js.undefined
  
  /**
    * Group is the group this resource belongs in
    */
  var group: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Names are the names used to describe this custom resource
    */
  var names: js.UndefOr[SchemaCustomResourceDefinitionNames] = js.undefined
  
  /**
    * Scope indicates whether this resource is cluster or namespace scoped. Default is namespaced
    */
  var scope: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Subresources describes the subresources for CustomResources +optional
    */
  var subresources: js.UndefOr[SchemaCustomResourceSubresources] = js.undefined
  
  /**
    * Validation describes the validation methods for CustomResources +optional
    */
  var validation: js.UndefOr[SchemaCustomResourceValidation] = js.undefined
  
  /**
    * Version is the version this resource belongs in Should be always first item in Versions field if provided. Optional, but at least one of Version or Versions must be set. Deprecated: Please use `Versions`. +optional
    */
  var version: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Versions is the list of all supported versions for this resource. If Version field is provided, this field is optional. Validation: All versions must use the same validation schema for now. i.e., top level Validation field is applied to all of these versions. Order: The version name will be used to compute the order. If the version string is "kube-like", it will sort above non "kube-like" version strings, which are ordered lexicographically. "Kube-like" versions start with a "v", then are followed by a number (the major version), then optionally the string "alpha" or "beta" and another number (the minor version). These are sorted first by GA \> beta \> alpha (where GA is a version with no suffix such as beta or alpha), and then by comparing major version, then minor version. An example sorted list of versions: v10, v2, v1, v11beta2, v10beta3, v3beta1, v12alpha1, v11alpha2, foo1, foo10. +optional
    */
  var versions: js.UndefOr[js.Array[SchemaCustomResourceDefinitionVersion]] = js.undefined
}
object SchemaCustomResourceDefinitionSpec {
  
  inline def apply(): SchemaCustomResourceDefinitionSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCustomResourceDefinitionSpec]
  }
  
  extension [Self <: SchemaCustomResourceDefinitionSpec](x: Self) {
    
    inline def setAdditionalPrinterColumns(value: js.Array[SchemaCustomResourceColumnDefinition]): Self = StObject.set(x, "additionalPrinterColumns", value.asInstanceOf[js.Any])
    
    inline def setAdditionalPrinterColumnsUndefined: Self = StObject.set(x, "additionalPrinterColumns", js.undefined)
    
    inline def setAdditionalPrinterColumnsVarargs(value: SchemaCustomResourceColumnDefinition*): Self = StObject.set(x, "additionalPrinterColumns", js.Array(value*))
    
    inline def setGroup(value: String): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    inline def setGroupNull: Self = StObject.set(x, "group", null)
    
    inline def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
    
    inline def setNames(value: SchemaCustomResourceDefinitionNames): Self = StObject.set(x, "names", value.asInstanceOf[js.Any])
    
    inline def setNamesUndefined: Self = StObject.set(x, "names", js.undefined)
    
    inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setScopeNull: Self = StObject.set(x, "scope", null)
    
    inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    
    inline def setSubresources(value: SchemaCustomResourceSubresources): Self = StObject.set(x, "subresources", value.asInstanceOf[js.Any])
    
    inline def setSubresourcesUndefined: Self = StObject.set(x, "subresources", js.undefined)
    
    inline def setValidation(value: SchemaCustomResourceValidation): Self = StObject.set(x, "validation", value.asInstanceOf[js.Any])
    
    inline def setValidationUndefined: Self = StObject.set(x, "validation", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionNull: Self = StObject.set(x, "version", null)
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    
    inline def setVersions(value: js.Array[SchemaCustomResourceDefinitionVersion]): Self = StObject.set(x, "versions", value.asInstanceOf[js.Any])
    
    inline def setVersionsUndefined: Self = StObject.set(x, "versions", js.undefined)
    
    inline def setVersionsVarargs(value: SchemaCustomResourceDefinitionVersion*): Self = StObject.set(x, "versions", js.Array(value*))
  }
}

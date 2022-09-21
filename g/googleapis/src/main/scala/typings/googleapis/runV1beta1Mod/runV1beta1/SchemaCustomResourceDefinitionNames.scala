package typings.googleapis.runV1beta1Mod.runV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCustomResourceDefinitionNames extends StObject {
  
  /**
    * Categories is a list of grouped resources custom resources belong to (e.g. 'all') +optional
    */
  var categories: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Kind is the serialized kind of the resource. It is normally CamelCase and singular.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * ListKind is the serialized kind of the list for this resource. Defaults to List. +optional
    */
  var listKind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Plural is the plural name of the resource to serve. It must match the name of the CustomResourceDefinition-registration too: plural.group and it must be all lowercase.
    */
  var plural: js.UndefOr[String | Null] = js.undefined
  
  /**
    * ShortNames are short names for the resource. It must be all lowercase. +optional
    */
  var shortNames: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Singular is the singular name of the resource. It must be all lowercase Defaults to lowercased +optional
    */
  var singular: js.UndefOr[String | Null] = js.undefined
}
object SchemaCustomResourceDefinitionNames {
  
  inline def apply(): SchemaCustomResourceDefinitionNames = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCustomResourceDefinitionNames]
  }
  
  extension [Self <: SchemaCustomResourceDefinitionNames](x: Self) {
    
    inline def setCategories(value: js.Array[String]): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
    
    inline def setCategoriesNull: Self = StObject.set(x, "categories", null)
    
    inline def setCategoriesUndefined: Self = StObject.set(x, "categories", js.undefined)
    
    inline def setCategoriesVarargs(value: String*): Self = StObject.set(x, "categories", js.Array(value*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setListKind(value: String): Self = StObject.set(x, "listKind", value.asInstanceOf[js.Any])
    
    inline def setListKindNull: Self = StObject.set(x, "listKind", null)
    
    inline def setListKindUndefined: Self = StObject.set(x, "listKind", js.undefined)
    
    inline def setPlural(value: String): Self = StObject.set(x, "plural", value.asInstanceOf[js.Any])
    
    inline def setPluralNull: Self = StObject.set(x, "plural", null)
    
    inline def setPluralUndefined: Self = StObject.set(x, "plural", js.undefined)
    
    inline def setShortNames(value: js.Array[String]): Self = StObject.set(x, "shortNames", value.asInstanceOf[js.Any])
    
    inline def setShortNamesNull: Self = StObject.set(x, "shortNames", null)
    
    inline def setShortNamesUndefined: Self = StObject.set(x, "shortNames", js.undefined)
    
    inline def setShortNamesVarargs(value: String*): Self = StObject.set(x, "shortNames", js.Array(value*))
    
    inline def setSingular(value: String): Self = StObject.set(x, "singular", value.asInstanceOf[js.Any])
    
    inline def setSingularNull: Self = StObject.set(x, "singular", null)
    
    inline def setSingularUndefined: Self = StObject.set(x, "singular", js.undefined)
  }
}

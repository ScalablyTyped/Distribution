package typings.googleapis.deploymentmanagerAlphaMod.deploymentmanagerAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * CollectionOverride allows resource handling overrides for specific
  * resources within a BaseType
  */
trait SchemaCollectionOverride extends StObject {
  
  /**
    * The collection that identifies this resource within its service.
    */
  var collection: js.UndefOr[String] = js.undefined
  
  /**
    * Custom verb method mappings to support unordered list API mappings.
    */
  var methodMap: js.UndefOr[SchemaMethodMap] = js.undefined
  
  /**
    * The options to apply to this resource-level override
    */
  var options: js.UndefOr[SchemaOptions] = js.undefined
}
object SchemaCollectionOverride {
  
  inline def apply(): SchemaCollectionOverride = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCollectionOverride]
  }
  
  extension [Self <: SchemaCollectionOverride](x: Self) {
    
    inline def setCollection(value: String): Self = StObject.set(x, "collection", value.asInstanceOf[js.Any])
    
    inline def setCollectionUndefined: Self = StObject.set(x, "collection", js.undefined)
    
    inline def setMethodMap(value: SchemaMethodMap): Self = StObject.set(x, "methodMap", value.asInstanceOf[js.Any])
    
    inline def setMethodMapUndefined: Self = StObject.set(x, "methodMap", js.undefined)
    
    inline def setOptions(value: SchemaOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
  }
}

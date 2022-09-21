package typings.googleapis.deploymentmanagerV2betaMod.deploymentmanagerV2beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCollectionOverride extends StObject {
  
  /**
    * The collection that identifies this resource within its service.
    */
  var collection: js.UndefOr[String | Null] = js.undefined
  
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
    
    inline def setCollectionNull: Self = StObject.set(x, "collection", null)
    
    inline def setCollectionUndefined: Self = StObject.set(x, "collection", js.undefined)
    
    inline def setOptions(value: SchemaOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
  }
}

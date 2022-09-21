package typings.googleapis.runV1alpha1Mod.runV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaConfigMapKeySelector extends StObject {
  
  /**
    * The key to select.
    */
  var key: js.UndefOr[String | Null] = js.undefined
  
  /**
    * This field should not be used directly as it is meant to be inlined directly into the message. Use the "name" field instead.
    */
  var localObjectReference: js.UndefOr[SchemaLocalObjectReference] = js.undefined
  
  /**
    * The ConfigMap to select from.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * (Optional) Specify whether the ConfigMap or its key must be defined
    */
  var optional: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaConfigMapKeySelector {
  
  inline def apply(): SchemaConfigMapKeySelector = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaConfigMapKeySelector]
  }
  
  extension [Self <: SchemaConfigMapKeySelector](x: Self) {
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyNull: Self = StObject.set(x, "key", null)
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setLocalObjectReference(value: SchemaLocalObjectReference): Self = StObject.set(x, "localObjectReference", value.asInstanceOf[js.Any])
    
    inline def setLocalObjectReferenceUndefined: Self = StObject.set(x, "localObjectReference", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOptional(value: Boolean): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
    
    inline def setOptionalNull: Self = StObject.set(x, "optional", null)
    
    inline def setOptionalUndefined: Self = StObject.set(x, "optional", js.undefined)
  }
}

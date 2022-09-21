package typings.googleapis.deploymentmanagerAlphaMod.deploymentmanagerAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaMethodMap extends StObject {
  
  /**
    * The action identifier for the create method to be used for this collection
    */
  var create: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The action identifier for the delete method to be used for this collection
    */
  var delete: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The action identifier for the get method to be used for this collection
    */
  var get: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The action identifier for the setIamPolicy method to be used for this collection
    */
  var setIamPolicy: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The action identifier for the update method to be used for this collection
    */
  var update: js.UndefOr[String | Null] = js.undefined
}
object SchemaMethodMap {
  
  inline def apply(): SchemaMethodMap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMethodMap]
  }
  
  extension [Self <: SchemaMethodMap](x: Self) {
    
    inline def setCreate(value: String): Self = StObject.set(x, "create", value.asInstanceOf[js.Any])
    
    inline def setCreateNull: Self = StObject.set(x, "create", null)
    
    inline def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
    
    inline def setDelete(value: String): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setDeleteNull: Self = StObject.set(x, "delete", null)
    
    inline def setDeleteUndefined: Self = StObject.set(x, "delete", js.undefined)
    
    inline def setGet(value: String): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setGetNull: Self = StObject.set(x, "get", null)
    
    inline def setGetUndefined: Self = StObject.set(x, "get", js.undefined)
    
    inline def setSetIamPolicy(value: String): Self = StObject.set(x, "setIamPolicy", value.asInstanceOf[js.Any])
    
    inline def setSetIamPolicyNull: Self = StObject.set(x, "setIamPolicy", null)
    
    inline def setSetIamPolicyUndefined: Self = StObject.set(x, "setIamPolicy", js.undefined)
    
    inline def setUpdate(value: String): Self = StObject.set(x, "update", value.asInstanceOf[js.Any])
    
    inline def setUpdateNull: Self = StObject.set(x, "update", null)
    
    inline def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
  }
}

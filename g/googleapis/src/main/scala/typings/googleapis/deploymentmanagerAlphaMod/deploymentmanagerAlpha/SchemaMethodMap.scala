package typings.googleapis.deploymentmanagerAlphaMod.deploymentmanagerAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Deployment Manager will call these methods during the events of
  * creation/deletion/update/get/setIamPolicy
  */
@js.native
trait SchemaMethodMap extends StObject {
  
  /**
    * The action identifier for the create method to be used for this
    * collection
    */
  var create: js.UndefOr[String] = js.native
  
  /**
    * The action identifier for the delete method to be used for this
    * collection
    */
  var delete: js.UndefOr[String] = js.native
  
  /**
    * The action identifier for the get method to be used for this collection
    */
  var get: js.UndefOr[String] = js.native
  
  /**
    * The action identifier for the setIamPolicy method to be used for this
    * collection
    */
  var setIamPolicy: js.UndefOr[String] = js.native
  
  /**
    * The action identifier for the update method to be used for this
    * collection
    */
  var update: js.UndefOr[String] = js.native
}
object SchemaMethodMap {
  
  @scala.inline
  def apply(): SchemaMethodMap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMethodMap]
  }
  
  @scala.inline
  implicit class SchemaMethodMapMutableBuilder[Self <: SchemaMethodMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreate(value: String): Self = StObject.set(x, "create", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
    
    @scala.inline
    def setDelete(value: String): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteUndefined: Self = StObject.set(x, "delete", js.undefined)
    
    @scala.inline
    def setGet(value: String): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetUndefined: Self = StObject.set(x, "get", js.undefined)
    
    @scala.inline
    def setSetIamPolicy(value: String): Self = StObject.set(x, "setIamPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetIamPolicyUndefined: Self = StObject.set(x, "setIamPolicy", js.undefined)
    
    @scala.inline
    def setUpdate(value: String): Self = StObject.set(x, "update", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
  }
}

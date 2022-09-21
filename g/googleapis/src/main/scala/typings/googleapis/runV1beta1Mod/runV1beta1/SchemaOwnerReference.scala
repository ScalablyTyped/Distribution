package typings.googleapis.runV1beta1Mod.runV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaOwnerReference extends StObject {
  
  /**
    * API version of the referent.
    */
  var apiVersion: js.UndefOr[String | Null] = js.undefined
  
  /**
    * If true, AND if the owner has the "foregroundDeletion" finalizer, then the owner cannot be deleted from the key-value store until this reference is removed. Defaults to false. To set this field, a user needs "delete" permission of the owner, otherwise 422 (Unprocessable Entity) will be returned. +optional
    */
  var blockOwnerDeletion: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * If true, this reference points to the managing controller. +optional
    */
  var controller: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Kind of the referent. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Name of the referent. More info: http://kubernetes.io/docs/user-guide/identifiers#names
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * UID of the referent. More info: http://kubernetes.io/docs/user-guide/identifiers#uids
    */
  var uid: js.UndefOr[String | Null] = js.undefined
}
object SchemaOwnerReference {
  
  inline def apply(): SchemaOwnerReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOwnerReference]
  }
  
  extension [Self <: SchemaOwnerReference](x: Self) {
    
    inline def setApiVersion(value: String): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
    
    inline def setApiVersionNull: Self = StObject.set(x, "apiVersion", null)
    
    inline def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
    
    inline def setBlockOwnerDeletion(value: Boolean): Self = StObject.set(x, "blockOwnerDeletion", value.asInstanceOf[js.Any])
    
    inline def setBlockOwnerDeletionNull: Self = StObject.set(x, "blockOwnerDeletion", null)
    
    inline def setBlockOwnerDeletionUndefined: Self = StObject.set(x, "blockOwnerDeletion", js.undefined)
    
    inline def setController(value: Boolean): Self = StObject.set(x, "controller", value.asInstanceOf[js.Any])
    
    inline def setControllerNull: Self = StObject.set(x, "controller", null)
    
    inline def setControllerUndefined: Self = StObject.set(x, "controller", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setUid(value: String): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
    
    inline def setUidNull: Self = StObject.set(x, "uid", null)
    
    inline def setUidUndefined: Self = StObject.set(x, "uid", js.undefined)
  }
}

package typings.googleapis.gkehubV1alphaMod.gkehubV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaConfigManagementGroupVersionKind extends StObject {
  
  /**
    * Kubernetes Group
    */
  var group: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Kubernetes Kind
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Kubernetes Version
    */
  var version: js.UndefOr[String | Null] = js.undefined
}
object SchemaConfigManagementGroupVersionKind {
  
  inline def apply(): SchemaConfigManagementGroupVersionKind = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaConfigManagementGroupVersionKind]
  }
  
  extension [Self <: SchemaConfigManagementGroupVersionKind](x: Self) {
    
    inline def setGroup(value: String): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    inline def setGroupNull: Self = StObject.set(x, "group", null)
    
    inline def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionNull: Self = StObject.set(x, "version", null)
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}

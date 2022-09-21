package typings.googleapis.gkehubV1alpha2Mod.gkehubV1alpha2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTypeMeta extends StObject {
  
  /**
    * APIVersion of the resource (e.g. v1).
    */
  var apiVersion: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Kind of the resource (e.g. Deployment).
    */
  var kind: js.UndefOr[String | Null] = js.undefined
}
object SchemaTypeMeta {
  
  inline def apply(): SchemaTypeMeta = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTypeMeta]
  }
  
  extension [Self <: SchemaTypeMeta](x: Self) {
    
    inline def setApiVersion(value: String): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
    
    inline def setApiVersionNull: Self = StObject.set(x, "apiVersion", null)
    
    inline def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}

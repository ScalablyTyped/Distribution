package typings.googleapis.gkebackupV1Mod.gkebackupV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaNamespacedName extends StObject {
  
  /**
    * The name of the Kubernetes resource.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The Namespace of the Kubernetes resource.
    */
  var namespace: js.UndefOr[String | Null] = js.undefined
}
object SchemaNamespacedName {
  
  inline def apply(): SchemaNamespacedName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNamespacedName]
  }
  
  extension [Self <: SchemaNamespacedName](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
    
    inline def setNamespaceNull: Self = StObject.set(x, "namespace", null)
    
    inline def setNamespaceUndefined: Self = StObject.set(x, "namespace", js.undefined)
  }
}

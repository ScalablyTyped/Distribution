package typings.googleapis.gkebackupV1Mod.gkebackupV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaNamespaces extends StObject {
  
  /**
    * A list of Kubernetes Namespaces
    */
  var namespaces: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaNamespaces {
  
  inline def apply(): SchemaNamespaces = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNamespaces]
  }
  
  extension [Self <: SchemaNamespaces](x: Self) {
    
    inline def setNamespaces(value: js.Array[String]): Self = StObject.set(x, "namespaces", value.asInstanceOf[js.Any])
    
    inline def setNamespacesNull: Self = StObject.set(x, "namespaces", null)
    
    inline def setNamespacesUndefined: Self = StObject.set(x, "namespaces", js.undefined)
    
    inline def setNamespacesVarargs(value: String*): Self = StObject.set(x, "namespaces", js.Array(value*))
  }
}

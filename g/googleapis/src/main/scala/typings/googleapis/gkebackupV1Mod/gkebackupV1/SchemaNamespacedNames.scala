package typings.googleapis.gkebackupV1Mod.gkebackupV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaNamespacedNames extends StObject {
  
  /**
    * A list of namespaced Kubernetes resources.
    */
  var namespacedNames: js.UndefOr[js.Array[SchemaNamespacedName]] = js.undefined
}
object SchemaNamespacedNames {
  
  inline def apply(): SchemaNamespacedNames = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNamespacedNames]
  }
  
  extension [Self <: SchemaNamespacedNames](x: Self) {
    
    inline def setNamespacedNames(value: js.Array[SchemaNamespacedName]): Self = StObject.set(x, "namespacedNames", value.asInstanceOf[js.Any])
    
    inline def setNamespacedNamesUndefined: Self = StObject.set(x, "namespacedNames", js.undefined)
    
    inline def setNamespacedNamesVarargs(value: SchemaNamespacedName*): Self = StObject.set(x, "namespacedNames", js.Array(value*))
  }
}

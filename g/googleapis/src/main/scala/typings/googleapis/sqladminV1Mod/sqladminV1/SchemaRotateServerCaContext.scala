package typings.googleapis.sqladminV1Mod.sqladminV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRotateServerCaContext extends StObject {
  
  /**
    * This is always `sql#rotateServerCaContext`.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The fingerprint of the next version to be rotated to. If left unspecified, will be rotated to the most recently added server CA version.
    */
  var nextVersion: js.UndefOr[String | Null] = js.undefined
}
object SchemaRotateServerCaContext {
  
  inline def apply(): SchemaRotateServerCaContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRotateServerCaContext]
  }
  
  extension [Self <: SchemaRotateServerCaContext](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setNextVersion(value: String): Self = StObject.set(x, "nextVersion", value.asInstanceOf[js.Any])
    
    inline def setNextVersionNull: Self = StObject.set(x, "nextVersion", null)
    
    inline def setNextVersionUndefined: Self = StObject.set(x, "nextVersion", js.undefined)
  }
}

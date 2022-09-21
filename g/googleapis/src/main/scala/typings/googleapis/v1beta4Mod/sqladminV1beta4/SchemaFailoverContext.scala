package typings.googleapis.v1beta4Mod.sqladminV1beta4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaFailoverContext extends StObject {
  
  /**
    * This is always `sql#failoverContext`.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The current settings version of this instance. Request will be rejected if this version doesn't match the current settings version.
    */
  var settingsVersion: js.UndefOr[String | Null] = js.undefined
}
object SchemaFailoverContext {
  
  inline def apply(): SchemaFailoverContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFailoverContext]
  }
  
  extension [Self <: SchemaFailoverContext](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setSettingsVersion(value: String): Self = StObject.set(x, "settingsVersion", value.asInstanceOf[js.Any])
    
    inline def setSettingsVersionNull: Self = StObject.set(x, "settingsVersion", null)
    
    inline def setSettingsVersionUndefined: Self = StObject.set(x, "settingsVersion", js.undefined)
  }
}

package typings.googleapis.v1beta4Mod.sqladminV1beta4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Database instance failover context.
  */
trait SchemaFailoverContext extends StObject {
  
  /**
    * This is always sql#failoverContext.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * The current settings version of this instance. Request will be rejected
    * if this version doesn&#39;t match the current settings version.
    */
  var settingsVersion: js.UndefOr[String] = js.undefined
}
object SchemaFailoverContext {
  
  inline def apply(): SchemaFailoverContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFailoverContext]
  }
  
  extension [Self <: SchemaFailoverContext](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setSettingsVersion(value: String): Self = StObject.set(x, "settingsVersion", value.asInstanceOf[js.Any])
    
    inline def setSettingsVersionUndefined: Self = StObject.set(x, "settingsVersion", js.undefined)
  }
}

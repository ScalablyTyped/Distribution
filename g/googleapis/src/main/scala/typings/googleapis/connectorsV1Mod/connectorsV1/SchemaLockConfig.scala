package typings.googleapis.connectorsV1Mod.connectorsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaLockConfig extends StObject {
  
  /**
    * Indicates whether or not the connection is locked.
    */
  var locked: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Describes why a connection is locked.
    */
  var reason: js.UndefOr[String | Null] = js.undefined
}
object SchemaLockConfig {
  
  inline def apply(): SchemaLockConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLockConfig]
  }
  
  extension [Self <: SchemaLockConfig](x: Self) {
    
    inline def setLocked(value: Boolean): Self = StObject.set(x, "locked", value.asInstanceOf[js.Any])
    
    inline def setLockedNull: Self = StObject.set(x, "locked", null)
    
    inline def setLockedUndefined: Self = StObject.set(x, "locked", js.undefined)
    
    inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonNull: Self = StObject.set(x, "reason", null)
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
  }
}

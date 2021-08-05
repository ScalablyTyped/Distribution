package typings.googleapis.v32Mod.dfareportingV32

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Event tag override information.
  */
trait SchemaEventTagOverride extends StObject {
  
  /**
    * Whether this override is enabled.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * ID of this event tag override. This is a read-only, auto-generated field.
    */
  var id: js.UndefOr[String] = js.undefined
}
object SchemaEventTagOverride {
  
  inline def apply(): SchemaEventTagOverride = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEventTagOverride]
  }
  
  extension [Self <: SchemaEventTagOverride](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
  }
}

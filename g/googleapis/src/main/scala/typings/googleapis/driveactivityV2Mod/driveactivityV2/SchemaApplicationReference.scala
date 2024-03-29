package typings.googleapis.driveactivityV2Mod.driveactivityV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaApplicationReference extends StObject {
  
  /**
    * The reference type corresponding to this event.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
}
object SchemaApplicationReference {
  
  inline def apply(): SchemaApplicationReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaApplicationReference]
  }
  
  extension [Self <: SchemaApplicationReference](x: Self) {
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}

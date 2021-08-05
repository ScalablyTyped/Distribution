package typings.googleapis.driveactivityV2Mod.driveactivityV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Event triggered by system operations instead of end users.
  */
trait SchemaSystemEvent extends StObject {
  
  /**
    * The type of the system event that may triggered activity.
    */
  var `type`: js.UndefOr[String] = js.undefined
}
object SchemaSystemEvent {
  
  inline def apply(): SchemaSystemEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSystemEvent]
  }
  
  extension [Self <: SchemaSystemEvent](x: Self) {
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}

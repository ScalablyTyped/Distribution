package typings.googleapis.driveactivityV2Mod.driveactivityV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A change in the object&#39;s data leak prevention status.
  */
trait SchemaDataLeakPreventionChange extends StObject {
  
  /**
    * The type of Data Leak Prevention (DLP) change.
    */
  var `type`: js.UndefOr[String] = js.undefined
}
object SchemaDataLeakPreventionChange {
  
  inline def apply(): SchemaDataLeakPreventionChange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDataLeakPreventionChange]
  }
  
  extension [Self <: SchemaDataLeakPreventionChange](x: Self) {
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}

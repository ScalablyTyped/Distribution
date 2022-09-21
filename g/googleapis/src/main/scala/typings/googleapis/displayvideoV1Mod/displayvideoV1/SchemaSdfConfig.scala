package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSdfConfig extends StObject {
  
  /**
    * An administrator email address to which the SDF processing status reports will be sent.
    */
  var adminEmail: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The version of SDF being used.
    */
  var version: js.UndefOr[String | Null] = js.undefined
}
object SchemaSdfConfig {
  
  inline def apply(): SchemaSdfConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSdfConfig]
  }
  
  extension [Self <: SchemaSdfConfig](x: Self) {
    
    inline def setAdminEmail(value: String): Self = StObject.set(x, "adminEmail", value.asInstanceOf[js.Any])
    
    inline def setAdminEmailNull: Self = StObject.set(x, "adminEmail", null)
    
    inline def setAdminEmailUndefined: Self = StObject.set(x, "adminEmail", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionNull: Self = StObject.set(x, "version", null)
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}

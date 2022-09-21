package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPartnerDataAccessConfig extends StObject {
  
  /**
    * Structured Data Files (SDF) settings for the partner. The SDF configuration for the partner.
    */
  var sdfConfig: js.UndefOr[SchemaSdfConfig] = js.undefined
}
object SchemaPartnerDataAccessConfig {
  
  inline def apply(): SchemaPartnerDataAccessConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPartnerDataAccessConfig]
  }
  
  extension [Self <: SchemaPartnerDataAccessConfig](x: Self) {
    
    inline def setSdfConfig(value: SchemaSdfConfig): Self = StObject.set(x, "sdfConfig", value.asInstanceOf[js.Any])
    
    inline def setSdfConfigUndefined: Self = StObject.set(x, "sdfConfig", js.undefined)
  }
}

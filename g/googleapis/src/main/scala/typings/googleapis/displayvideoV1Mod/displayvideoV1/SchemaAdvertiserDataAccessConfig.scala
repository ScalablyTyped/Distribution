package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAdvertiserDataAccessConfig extends StObject {
  
  /**
    * Structured Data Files (SDF) settings for the advertiser. If not specified, the SDF settings of the parent partner are used.
    */
  var sdfConfig: js.UndefOr[SchemaAdvertiserSdfConfig] = js.undefined
}
object SchemaAdvertiserDataAccessConfig {
  
  inline def apply(): SchemaAdvertiserDataAccessConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAdvertiserDataAccessConfig]
  }
  
  extension [Self <: SchemaAdvertiserDataAccessConfig](x: Self) {
    
    inline def setSdfConfig(value: SchemaAdvertiserSdfConfig): Self = StObject.set(x, "sdfConfig", value.asInstanceOf[js.Any])
    
    inline def setSdfConfigUndefined: Self = StObject.set(x, "sdfConfig", js.undefined)
  }
}

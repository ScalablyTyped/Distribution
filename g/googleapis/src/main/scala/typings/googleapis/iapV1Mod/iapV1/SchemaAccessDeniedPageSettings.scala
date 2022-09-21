package typings.googleapis.iapV1Mod.iapV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAccessDeniedPageSettings extends StObject {
  
  /**
    * The URI to be redirected to when access is denied.
    */
  var accessDeniedPageUri: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Whether to generate a troubleshooting URL on access denied events to this application.
    */
  var generateTroubleshootingUri: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Whether to generate remediation token on access denied events to this application.
    */
  var remediationTokenGenerationEnabled: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaAccessDeniedPageSettings {
  
  inline def apply(): SchemaAccessDeniedPageSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAccessDeniedPageSettings]
  }
  
  extension [Self <: SchemaAccessDeniedPageSettings](x: Self) {
    
    inline def setAccessDeniedPageUri(value: String): Self = StObject.set(x, "accessDeniedPageUri", value.asInstanceOf[js.Any])
    
    inline def setAccessDeniedPageUriNull: Self = StObject.set(x, "accessDeniedPageUri", null)
    
    inline def setAccessDeniedPageUriUndefined: Self = StObject.set(x, "accessDeniedPageUri", js.undefined)
    
    inline def setGenerateTroubleshootingUri(value: Boolean): Self = StObject.set(x, "generateTroubleshootingUri", value.asInstanceOf[js.Any])
    
    inline def setGenerateTroubleshootingUriNull: Self = StObject.set(x, "generateTroubleshootingUri", null)
    
    inline def setGenerateTroubleshootingUriUndefined: Self = StObject.set(x, "generateTroubleshootingUri", js.undefined)
    
    inline def setRemediationTokenGenerationEnabled(value: Boolean): Self = StObject.set(x, "remediationTokenGenerationEnabled", value.asInstanceOf[js.Any])
    
    inline def setRemediationTokenGenerationEnabledNull: Self = StObject.set(x, "remediationTokenGenerationEnabled", null)
    
    inline def setRemediationTokenGenerationEnabledUndefined: Self = StObject.set(x, "remediationTokenGenerationEnabled", js.undefined)
  }
}

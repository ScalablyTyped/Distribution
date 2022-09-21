package typings.googleapis.runV1Mod.runV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDomainMappingSpec extends StObject {
  
  /**
    * The mode of the certificate.
    */
  var certificateMode: js.UndefOr[String | Null] = js.undefined
  
  /**
    * If set, the mapping will override any mapping set before this spec was set. It is recommended that the user leaves this empty to receive an error warning about a potential conflict and only set it once the respective UI has given such a warning.
    */
  var forceOverride: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The name of the Knative Route that this DomainMapping applies to. The route must exist.
    */
  var routeName: js.UndefOr[String | Null] = js.undefined
}
object SchemaDomainMappingSpec {
  
  inline def apply(): SchemaDomainMappingSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDomainMappingSpec]
  }
  
  extension [Self <: SchemaDomainMappingSpec](x: Self) {
    
    inline def setCertificateMode(value: String): Self = StObject.set(x, "certificateMode", value.asInstanceOf[js.Any])
    
    inline def setCertificateModeNull: Self = StObject.set(x, "certificateMode", null)
    
    inline def setCertificateModeUndefined: Self = StObject.set(x, "certificateMode", js.undefined)
    
    inline def setForceOverride(value: Boolean): Self = StObject.set(x, "forceOverride", value.asInstanceOf[js.Any])
    
    inline def setForceOverrideNull: Self = StObject.set(x, "forceOverride", null)
    
    inline def setForceOverrideUndefined: Self = StObject.set(x, "forceOverride", js.undefined)
    
    inline def setRouteName(value: String): Self = StObject.set(x, "routeName", value.asInstanceOf[js.Any])
    
    inline def setRouteNameNull: Self = StObject.set(x, "routeName", null)
    
    inline def setRouteNameUndefined: Self = StObject.set(x, "routeName", js.undefined)
  }
}

package typings.googleapis.gkehubV1alphaMod.gkehubV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaFeatureSpec extends StObject {
  
  /**
    * Specifies default membership spec. Users can override the default in the member_configs for each member.
    */
  var defaultConfig: js.UndefOr[SchemaMembershipSpec] = js.undefined
  
  /**
    * Immutable. Specifies CA configuration.
    */
  var provisionGoogleCa: js.UndefOr[String | Null] = js.undefined
}
object SchemaFeatureSpec {
  
  inline def apply(): SchemaFeatureSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFeatureSpec]
  }
  
  extension [Self <: SchemaFeatureSpec](x: Self) {
    
    inline def setDefaultConfig(value: SchemaMembershipSpec): Self = StObject.set(x, "defaultConfig", value.asInstanceOf[js.Any])
    
    inline def setDefaultConfigUndefined: Self = StObject.set(x, "defaultConfig", js.undefined)
    
    inline def setProvisionGoogleCa(value: String): Self = StObject.set(x, "provisionGoogleCa", value.asInstanceOf[js.Any])
    
    inline def setProvisionGoogleCaNull: Self = StObject.set(x, "provisionGoogleCa", null)
    
    inline def setProvisionGoogleCaUndefined: Self = StObject.set(x, "provisionGoogleCa", js.undefined)
  }
}

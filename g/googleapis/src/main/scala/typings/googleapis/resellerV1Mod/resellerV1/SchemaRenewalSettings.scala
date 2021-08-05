package typings.googleapis.resellerV1Mod.resellerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * JSON template for a subscription renewal settings.
  */
trait SchemaRenewalSettings extends StObject {
  
  /**
    * Identifies the resource as a subscription renewal setting. Value:
    * subscriptions#renewalSettings
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * Renewal settings for the annual commitment plan. For more detailed
    * information, see renewal options in the administrator help center. When
    * renewing a subscription, the renewalType is a required property.
    */
  var renewalType: js.UndefOr[String] = js.undefined
}
object SchemaRenewalSettings {
  
  inline def apply(): SchemaRenewalSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRenewalSettings]
  }
  
  extension [Self <: SchemaRenewalSettings](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setRenewalType(value: String): Self = StObject.set(x, "renewalType", value.asInstanceOf[js.Any])
    
    inline def setRenewalTypeUndefined: Self = StObject.set(x, "renewalType", js.undefined)
  }
}

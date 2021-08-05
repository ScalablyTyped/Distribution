package typings.googleapis.v1Dot4Mod.adsenseV14

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAlert extends StObject {
  
  /**
    * Unique identifier of this alert. This should be considered an opaque
    * identifier; it is not safe to rely on it being in any particular format.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * Whether this alert can be dismissed.
    */
  var isDismissible: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Kind of resource this is, in this case adsense#alert.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * The localized alert message.
    */
  var message: js.UndefOr[String] = js.undefined
  
  /**
    * Severity of this alert. Possible values: INFO, WARNING, SEVERE.
    */
  var severity: js.UndefOr[String] = js.undefined
  
  /**
    * Type of this alert. Possible values: SELF_HOLD, MIGRATED_TO_BILLING3,
    * ADDRESS_PIN_VERIFICATION, PHONE_PIN_VERIFICATION, CORPORATE_ENTITY,
    * GRAYLISTED_PUBLISHER, API_HOLD.
    */
  var `type`: js.UndefOr[String] = js.undefined
}
object SchemaAlert {
  
  inline def apply(): SchemaAlert = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAlert]
  }
  
  extension [Self <: SchemaAlert](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setIsDismissible(value: Boolean): Self = StObject.set(x, "isDismissible", value.asInstanceOf[js.Any])
    
    inline def setIsDismissibleUndefined: Self = StObject.set(x, "isDismissible", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setSeverity(value: String): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
    
    inline def setSeverityUndefined: Self = StObject.set(x, "severity", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}

package typings.googleapis.v2Mod.adsenseV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAlert extends StObject {
  
  /**
    * Output only. The localized alert message. This may contain HTML markup, such as phrase elements or links.
    */
  var message: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Resource name of the alert. Format: accounts/{account\}/alerts/{alert\}
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Severity of this alert.
    */
  var severity: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Type of alert. This identifies the broad type of this alert, and provides a stable machine-readable identifier that will not be translated. For example, "payment-hold".
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
}
object SchemaAlert {
  
  inline def apply(): SchemaAlert = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAlert]
  }
  
  extension [Self <: SchemaAlert](x: Self) {
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageNull: Self = StObject.set(x, "message", null)
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSeverity(value: String): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
    
    inline def setSeverityNull: Self = StObject.set(x, "severity", null)
    
    inline def setSeverityUndefined: Self = StObject.set(x, "severity", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}

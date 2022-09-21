package typings.googleapis.gkehubV1betaMod.gkehubV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaConfigManagementBinauthzState extends StObject {
  
  /**
    * The version of binauthz that is installed.
    */
  var version: js.UndefOr[SchemaConfigManagementBinauthzVersion] = js.undefined
  
  /**
    * The state of the binauthz webhook.
    */
  var webhook: js.UndefOr[String | Null] = js.undefined
}
object SchemaConfigManagementBinauthzState {
  
  inline def apply(): SchemaConfigManagementBinauthzState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaConfigManagementBinauthzState]
  }
  
  extension [Self <: SchemaConfigManagementBinauthzState](x: Self) {
    
    inline def setVersion(value: SchemaConfigManagementBinauthzVersion): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    
    inline def setWebhook(value: String): Self = StObject.set(x, "webhook", value.asInstanceOf[js.Any])
    
    inline def setWebhookNull: Self = StObject.set(x, "webhook", null)
    
    inline def setWebhookUndefined: Self = StObject.set(x, "webhook", js.undefined)
  }
}

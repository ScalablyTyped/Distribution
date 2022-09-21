package typings.googleapis.gkehubV1betaMod.gkehubV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaConfigManagementBinauthzVersion extends StObject {
  
  /**
    * The version of the binauthz webhook.
    */
  var webhookVersion: js.UndefOr[String | Null] = js.undefined
}
object SchemaConfigManagementBinauthzVersion {
  
  inline def apply(): SchemaConfigManagementBinauthzVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaConfigManagementBinauthzVersion]
  }
  
  extension [Self <: SchemaConfigManagementBinauthzVersion](x: Self) {
    
    inline def setWebhookVersion(value: String): Self = StObject.set(x, "webhookVersion", value.asInstanceOf[js.Any])
    
    inline def setWebhookVersionNull: Self = StObject.set(x, "webhookVersion", null)
    
    inline def setWebhookVersionUndefined: Self = StObject.set(x, "webhookVersion", js.undefined)
  }
}

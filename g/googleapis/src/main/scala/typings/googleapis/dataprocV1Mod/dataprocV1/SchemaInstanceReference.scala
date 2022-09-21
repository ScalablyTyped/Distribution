package typings.googleapis.dataprocV1Mod.dataprocV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaInstanceReference extends StObject {
  
  /**
    * The unique identifier of the Compute Engine instance.
    */
  var instanceId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The user-friendly name of the Compute Engine instance.
    */
  var instanceName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The public ECIES key used for sharing data with this instance.
    */
  var publicEciesKey: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The public RSA key used for sharing data with this instance.
    */
  var publicKey: js.UndefOr[String | Null] = js.undefined
}
object SchemaInstanceReference {
  
  inline def apply(): SchemaInstanceReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInstanceReference]
  }
  
  extension [Self <: SchemaInstanceReference](x: Self) {
    
    inline def setInstanceId(value: String): Self = StObject.set(x, "instanceId", value.asInstanceOf[js.Any])
    
    inline def setInstanceIdNull: Self = StObject.set(x, "instanceId", null)
    
    inline def setInstanceIdUndefined: Self = StObject.set(x, "instanceId", js.undefined)
    
    inline def setInstanceName(value: String): Self = StObject.set(x, "instanceName", value.asInstanceOf[js.Any])
    
    inline def setInstanceNameNull: Self = StObject.set(x, "instanceName", null)
    
    inline def setInstanceNameUndefined: Self = StObject.set(x, "instanceName", js.undefined)
    
    inline def setPublicEciesKey(value: String): Self = StObject.set(x, "publicEciesKey", value.asInstanceOf[js.Any])
    
    inline def setPublicEciesKeyNull: Self = StObject.set(x, "publicEciesKey", null)
    
    inline def setPublicEciesKeyUndefined: Self = StObject.set(x, "publicEciesKey", js.undefined)
    
    inline def setPublicKey(value: String): Self = StObject.set(x, "publicKey", value.asInstanceOf[js.Any])
    
    inline def setPublicKeyNull: Self = StObject.set(x, "publicKey", null)
    
    inline def setPublicKeyUndefined: Self = StObject.set(x, "publicKey", js.undefined)
  }
}

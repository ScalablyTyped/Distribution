package typings.googleapis.managedidentitiesV1alpha1Mod.managedidentitiesV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaReconfigureTrustRequest extends StObject {
  
  /**
    * The domain trust resource with updated dns conditional forwarder.
    */
  var trust: js.UndefOr[SchemaTrust] = js.undefined
}
object SchemaReconfigureTrustRequest {
  
  inline def apply(): SchemaReconfigureTrustRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReconfigureTrustRequest]
  }
  
  extension [Self <: SchemaReconfigureTrustRequest](x: Self) {
    
    inline def setTrust(value: SchemaTrust): Self = StObject.set(x, "trust", value.asInstanceOf[js.Any])
    
    inline def setTrustUndefined: Self = StObject.set(x, "trust", js.undefined)
  }
}

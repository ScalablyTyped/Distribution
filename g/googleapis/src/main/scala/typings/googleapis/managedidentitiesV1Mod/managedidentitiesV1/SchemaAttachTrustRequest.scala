package typings.googleapis.managedidentitiesV1Mod.managedidentitiesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAttachTrustRequest extends StObject {
  
  /**
    * Required. The domain trust resource.
    */
  var trust: js.UndefOr[SchemaTrust] = js.undefined
}
object SchemaAttachTrustRequest {
  
  inline def apply(): SchemaAttachTrustRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAttachTrustRequest]
  }
  
  extension [Self <: SchemaAttachTrustRequest](x: Self) {
    
    inline def setTrust(value: SchemaTrust): Self = StObject.set(x, "trust", value.asInstanceOf[js.Any])
    
    inline def setTrustUndefined: Self = StObject.set(x, "trust", js.undefined)
  }
}

package typings.googleapis.privatecaV1beta1Mod.privatecaV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaIssuanceModes extends StObject {
  
  /**
    * Required. When true, allows callers to create Certificates by specifying a CertificateConfig.
    */
  var allowConfigBasedIssuance: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Required. When true, allows callers to create Certificates by specifying a CSR.
    */
  var allowCsrBasedIssuance: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaIssuanceModes {
  
  inline def apply(): SchemaIssuanceModes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaIssuanceModes]
  }
  
  extension [Self <: SchemaIssuanceModes](x: Self) {
    
    inline def setAllowConfigBasedIssuance(value: Boolean): Self = StObject.set(x, "allowConfigBasedIssuance", value.asInstanceOf[js.Any])
    
    inline def setAllowConfigBasedIssuanceNull: Self = StObject.set(x, "allowConfigBasedIssuance", null)
    
    inline def setAllowConfigBasedIssuanceUndefined: Self = StObject.set(x, "allowConfigBasedIssuance", js.undefined)
    
    inline def setAllowCsrBasedIssuance(value: Boolean): Self = StObject.set(x, "allowCsrBasedIssuance", value.asInstanceOf[js.Any])
    
    inline def setAllowCsrBasedIssuanceNull: Self = StObject.set(x, "allowCsrBasedIssuance", null)
    
    inline def setAllowCsrBasedIssuanceUndefined: Self = StObject.set(x, "allowCsrBasedIssuance", js.undefined)
  }
}

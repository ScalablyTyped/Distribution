package typings.googleapis.privatecaV1Mod.privatecaV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRsaKeyType extends StObject {
  
  /**
    * Optional. The maximum allowed RSA modulus size (inclusive), in bits. If this is not set, or if set to zero, the service will not enforce an explicit upper bound on RSA modulus sizes.
    */
  var maxModulusSize: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. The minimum allowed RSA modulus size (inclusive), in bits. If this is not set, or if set to zero, the service-level min RSA modulus size will continue to apply.
    */
  var minModulusSize: js.UndefOr[String | Null] = js.undefined
}
object SchemaRsaKeyType {
  
  inline def apply(): SchemaRsaKeyType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRsaKeyType]
  }
  
  extension [Self <: SchemaRsaKeyType](x: Self) {
    
    inline def setMaxModulusSize(value: String): Self = StObject.set(x, "maxModulusSize", value.asInstanceOf[js.Any])
    
    inline def setMaxModulusSizeNull: Self = StObject.set(x, "maxModulusSize", null)
    
    inline def setMaxModulusSizeUndefined: Self = StObject.set(x, "maxModulusSize", js.undefined)
    
    inline def setMinModulusSize(value: String): Self = StObject.set(x, "minModulusSize", value.asInstanceOf[js.Any])
    
    inline def setMinModulusSizeNull: Self = StObject.set(x, "minModulusSize", null)
    
    inline def setMinModulusSizeUndefined: Self = StObject.set(x, "minModulusSize", js.undefined)
  }
}

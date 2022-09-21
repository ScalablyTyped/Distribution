package typings.jose.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JWEKeyManagementHeaderParameters extends StObject {
  
  var apu: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
  
  var apv: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
  
  /**
    * @deprecated You should not use this parameter. It is only really intended for test and vector
    *   validation purposes.
    */
  var epk: js.UndefOr[KeyLike] = js.undefined
  
  /**
    * @deprecated You should not use this parameter. It is only really intended for test and vector
    *   validation purposes.
    */
  var iv: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
  
  /**
    * @deprecated You should not use this parameter. It is only really intended for test and vector
    *   validation purposes.
    */
  var p2c: js.UndefOr[Double] = js.undefined
  
  /**
    * @deprecated You should not use this parameter. It is only really intended for test and vector
    *   validation purposes.
    */
  var p2s: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
}
object JWEKeyManagementHeaderParameters {
  
  inline def apply(): JWEKeyManagementHeaderParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JWEKeyManagementHeaderParameters]
  }
  
  extension [Self <: JWEKeyManagementHeaderParameters](x: Self) {
    
    inline def setApu(value: js.typedarray.Uint8Array): Self = StObject.set(x, "apu", value.asInstanceOf[js.Any])
    
    inline def setApuUndefined: Self = StObject.set(x, "apu", js.undefined)
    
    inline def setApv(value: js.typedarray.Uint8Array): Self = StObject.set(x, "apv", value.asInstanceOf[js.Any])
    
    inline def setApvUndefined: Self = StObject.set(x, "apv", js.undefined)
    
    inline def setEpk(value: KeyLike): Self = StObject.set(x, "epk", value.asInstanceOf[js.Any])
    
    inline def setEpkUndefined: Self = StObject.set(x, "epk", js.undefined)
    
    inline def setIv(value: js.typedarray.Uint8Array): Self = StObject.set(x, "iv", value.asInstanceOf[js.Any])
    
    inline def setIvUndefined: Self = StObject.set(x, "iv", js.undefined)
    
    inline def setP2c(value: Double): Self = StObject.set(x, "p2c", value.asInstanceOf[js.Any])
    
    inline def setP2cUndefined: Self = StObject.set(x, "p2c", js.undefined)
    
    inline def setP2s(value: js.typedarray.Uint8Array): Self = StObject.set(x, "p2s", value.asInstanceOf[js.Any])
    
    inline def setP2sUndefined: Self = StObject.set(x, "p2s", js.undefined)
  }
}

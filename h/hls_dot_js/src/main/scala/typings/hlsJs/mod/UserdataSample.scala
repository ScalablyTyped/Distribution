package typings.hlsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserdataSample extends StObject {
  
  var bytes: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
  
  var payloadType: js.UndefOr[Double] = js.undefined
  
  var pts: Double
  
  var `type`: js.UndefOr[Double] = js.undefined
  
  var userData: js.UndefOr[String] = js.undefined
  
  var userDataBytes: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
  
  var uuid: js.UndefOr[String] = js.undefined
}
object UserdataSample {
  
  inline def apply(pts: Double): UserdataSample = {
    val __obj = js.Dynamic.literal(pts = pts.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserdataSample]
  }
  
  extension [Self <: UserdataSample](x: Self) {
    
    inline def setBytes(value: js.typedarray.Uint8Array): Self = StObject.set(x, "bytes", value.asInstanceOf[js.Any])
    
    inline def setBytesUndefined: Self = StObject.set(x, "bytes", js.undefined)
    
    inline def setPayloadType(value: Double): Self = StObject.set(x, "payloadType", value.asInstanceOf[js.Any])
    
    inline def setPayloadTypeUndefined: Self = StObject.set(x, "payloadType", js.undefined)
    
    inline def setPts(value: Double): Self = StObject.set(x, "pts", value.asInstanceOf[js.Any])
    
    inline def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUserData(value: String): Self = StObject.set(x, "userData", value.asInstanceOf[js.Any])
    
    inline def setUserDataBytes(value: js.typedarray.Uint8Array): Self = StObject.set(x, "userDataBytes", value.asInstanceOf[js.Any])
    
    inline def setUserDataBytesUndefined: Self = StObject.set(x, "userDataBytes", js.undefined)
    
    inline def setUserDataUndefined: Self = StObject.set(x, "userData", js.undefined)
    
    inline def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
    
    inline def setUuidUndefined: Self = StObject.set(x, "uuid", js.undefined)
  }
}

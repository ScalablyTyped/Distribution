package typings.loopback.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Apns extends StObject {
  
  var apns: CerData
  
  var gcm: ServerApiKey
}
object Apns {
  
  inline def apply(apns: CerData, gcm: ServerApiKey): Apns = {
    val __obj = js.Dynamic.literal(apns = apns.asInstanceOf[js.Any], gcm = gcm.asInstanceOf[js.Any])
    __obj.asInstanceOf[Apns]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Apns] (val x: Self) extends AnyVal {
    
    inline def setApns(value: CerData): Self = StObject.set(x, "apns", value.asInstanceOf[js.Any])
    
    inline def setGcm(value: ServerApiKey): Self = StObject.set(x, "gcm", value.asInstanceOf[js.Any])
  }
}

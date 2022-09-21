package typings.mangopay2NodejsSdk.baseMod.base

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Headers
  extends StObject
     with /* header */ StringDictionary[js.UndefOr[String]] {
  
  var Authorization: String
  
  var `Content-Type`: String
  
  var `Idempotency-Key`: String
  
  var `User-Agent`: String
}
object Headers {
  
  inline def apply(Authorization: String, `Content-Type`: String, `Idempotency-Key`: String, `User-Agent`: String): Headers = {
    val __obj = js.Dynamic.literal(Authorization = Authorization.asInstanceOf[js.Any])
    __obj.updateDynamic("Content-Type")(`Content-Type`.asInstanceOf[js.Any])
    __obj.updateDynamic("Idempotency-Key")(`Idempotency-Key`.asInstanceOf[js.Any])
    __obj.updateDynamic("User-Agent")(`User-Agent`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Headers]
  }
  
  extension [Self <: Headers](x: Self) {
    
    inline def setAuthorization(value: String): Self = StObject.set(x, "Authorization", value.asInstanceOf[js.Any])
    
    inline def `setContent-Type`(value: String): Self = StObject.set(x, "Content-Type", value.asInstanceOf[js.Any])
    
    inline def `setIdempotency-Key`(value: String): Self = StObject.set(x, "Idempotency-Key", value.asInstanceOf[js.Any])
    
    inline def `setUser-Agent`(value: String): Self = StObject.set(x, "User-Agent", value.asInstanceOf[js.Any])
  }
}

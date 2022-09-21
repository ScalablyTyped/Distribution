package typings.indySdk.anon

import typings.indySdk.indySdkStrings.ISSUANCE_BY_DEFAULT
import typings.indySdk.indySdkStrings.ISSUANCE_ON_DEMAND
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IssuanceType_ extends StObject {
  
  var issuanceType: ISSUANCE_BY_DEFAULT | ISSUANCE_ON_DEMAND
  
  var maxCredNum: Double
  
  var publicKeys: js.Array[String]
  
  var tailsHash: String
  
  var tailsLocation: String
}
object IssuanceType_ {
  
  inline def apply(
    issuanceType: ISSUANCE_BY_DEFAULT | ISSUANCE_ON_DEMAND,
    maxCredNum: Double,
    publicKeys: js.Array[String],
    tailsHash: String,
    tailsLocation: String
  ): IssuanceType_ = {
    val __obj = js.Dynamic.literal(issuanceType = issuanceType.asInstanceOf[js.Any], maxCredNum = maxCredNum.asInstanceOf[js.Any], publicKeys = publicKeys.asInstanceOf[js.Any], tailsHash = tailsHash.asInstanceOf[js.Any], tailsLocation = tailsLocation.asInstanceOf[js.Any])
    __obj.asInstanceOf[IssuanceType_]
  }
  
  extension [Self <: IssuanceType_](x: Self) {
    
    inline def setIssuanceType(value: ISSUANCE_BY_DEFAULT | ISSUANCE_ON_DEMAND): Self = StObject.set(x, "issuanceType", value.asInstanceOf[js.Any])
    
    inline def setMaxCredNum(value: Double): Self = StObject.set(x, "maxCredNum", value.asInstanceOf[js.Any])
    
    inline def setPublicKeys(value: js.Array[String]): Self = StObject.set(x, "publicKeys", value.asInstanceOf[js.Any])
    
    inline def setPublicKeysVarargs(value: String*): Self = StObject.set(x, "publicKeys", js.Array(value*))
    
    inline def setTailsHash(value: String): Self = StObject.set(x, "tailsHash", value.asInstanceOf[js.Any])
    
    inline def setTailsLocation(value: String): Self = StObject.set(x, "tailsLocation", value.asInstanceOf[js.Any])
  }
}

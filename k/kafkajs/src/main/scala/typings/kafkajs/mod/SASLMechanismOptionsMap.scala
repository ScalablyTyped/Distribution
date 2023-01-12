package typings.kafkajs.mod

import typings.kafkajs.anon.AccessKeyId
import typings.kafkajs.anon.OauthBearerProvider
import typings.kafkajs.anon.Password
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SASLMechanismOptionsMap extends StObject {
  
  var aws: AccessKeyId
  
  var oauthbearer: OauthBearerProvider
  
  var plain: Password
  
  var `scram-sha-256`: Password
  
  var `scram-sha-512`: Password
}
object SASLMechanismOptionsMap {
  
  inline def apply(
    aws: AccessKeyId,
    oauthbearer: OauthBearerProvider,
    plain: Password,
    `scram-sha-256`: Password,
    `scram-sha-512`: Password
  ): SASLMechanismOptionsMap = {
    val __obj = js.Dynamic.literal(aws = aws.asInstanceOf[js.Any], oauthbearer = oauthbearer.asInstanceOf[js.Any], plain = plain.asInstanceOf[js.Any])
    __obj.updateDynamic("scram-sha-256")(`scram-sha-256`.asInstanceOf[js.Any])
    __obj.updateDynamic("scram-sha-512")(`scram-sha-512`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SASLMechanismOptionsMap]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SASLMechanismOptionsMap] (val x: Self) extends AnyVal {
    
    inline def setAws(value: AccessKeyId): Self = StObject.set(x, "aws", value.asInstanceOf[js.Any])
    
    inline def setOauthbearer(value: OauthBearerProvider): Self = StObject.set(x, "oauthbearer", value.asInstanceOf[js.Any])
    
    inline def setPlain(value: Password): Self = StObject.set(x, "plain", value.asInstanceOf[js.Any])
    
    inline def `setScram-sha-256`(value: Password): Self = StObject.set(x, "scram-sha-256", value.asInstanceOf[js.Any])
    
    inline def `setScram-sha-512`(value: Password): Self = StObject.set(x, "scram-sha-512", value.asInstanceOf[js.Any])
  }
}

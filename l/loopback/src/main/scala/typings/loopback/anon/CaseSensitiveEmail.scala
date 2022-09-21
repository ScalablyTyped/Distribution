package typings.loopback.anon

import typings.loopback.mod.ACL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CaseSensitiveEmail extends StObject {
  
  var acls: js.Array[ACL]
  
  var caseSensitiveEmail: Boolean
  
  var emailVerificationRequired: Boolean
  
  var http: Path
  
  var maxTTL: Double
  
  var realmDelimiter: String
  
  var realmRequired: Boolean
  
  var resetPasswordTokenTTL: Double
  
  var saltWorkFactor: Double
  
  var ttl: Double
}
object CaseSensitiveEmail {
  
  inline def apply(
    acls: js.Array[ACL],
    caseSensitiveEmail: Boolean,
    emailVerificationRequired: Boolean,
    http: Path,
    maxTTL: Double,
    realmDelimiter: String,
    realmRequired: Boolean,
    resetPasswordTokenTTL: Double,
    saltWorkFactor: Double,
    ttl: Double
  ): CaseSensitiveEmail = {
    val __obj = js.Dynamic.literal(acls = acls.asInstanceOf[js.Any], caseSensitiveEmail = caseSensitiveEmail.asInstanceOf[js.Any], emailVerificationRequired = emailVerificationRequired.asInstanceOf[js.Any], http = http.asInstanceOf[js.Any], maxTTL = maxTTL.asInstanceOf[js.Any], realmDelimiter = realmDelimiter.asInstanceOf[js.Any], realmRequired = realmRequired.asInstanceOf[js.Any], resetPasswordTokenTTL = resetPasswordTokenTTL.asInstanceOf[js.Any], saltWorkFactor = saltWorkFactor.asInstanceOf[js.Any], ttl = ttl.asInstanceOf[js.Any])
    __obj.asInstanceOf[CaseSensitiveEmail]
  }
  
  extension [Self <: CaseSensitiveEmail](x: Self) {
    
    inline def setAcls(value: js.Array[ACL]): Self = StObject.set(x, "acls", value.asInstanceOf[js.Any])
    
    inline def setAclsVarargs(value: ACL*): Self = StObject.set(x, "acls", js.Array(value*))
    
    inline def setCaseSensitiveEmail(value: Boolean): Self = StObject.set(x, "caseSensitiveEmail", value.asInstanceOf[js.Any])
    
    inline def setEmailVerificationRequired(value: Boolean): Self = StObject.set(x, "emailVerificationRequired", value.asInstanceOf[js.Any])
    
    inline def setHttp(value: Path): Self = StObject.set(x, "http", value.asInstanceOf[js.Any])
    
    inline def setMaxTTL(value: Double): Self = StObject.set(x, "maxTTL", value.asInstanceOf[js.Any])
    
    inline def setRealmDelimiter(value: String): Self = StObject.set(x, "realmDelimiter", value.asInstanceOf[js.Any])
    
    inline def setRealmRequired(value: Boolean): Self = StObject.set(x, "realmRequired", value.asInstanceOf[js.Any])
    
    inline def setResetPasswordTokenTTL(value: Double): Self = StObject.set(x, "resetPasswordTokenTTL", value.asInstanceOf[js.Any])
    
    inline def setSaltWorkFactor(value: Double): Self = StObject.set(x, "saltWorkFactor", value.asInstanceOf[js.Any])
    
    inline def setTtl(value: Double): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
  }
}

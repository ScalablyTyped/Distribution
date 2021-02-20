package typings.loopback.anon

import typings.loopback.mod.ACL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CaseSensitiveEmail extends StObject {
  
  var acls: js.Array[ACL] = js.native
  
  var caseSensitiveEmail: Boolean = js.native
  
  var emailVerificationRequired: Boolean = js.native
  
  var http: Path = js.native
  
  var maxTTL: Double = js.native
  
  var realmDelimiter: String = js.native
  
  var realmRequired: Boolean = js.native
  
  var resetPasswordTokenTTL: Double = js.native
  
  var saltWorkFactor: Double = js.native
  
  var ttl: Double = js.native
}
object CaseSensitiveEmail {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class CaseSensitiveEmailMutableBuilder[Self <: CaseSensitiveEmail] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAcls(value: js.Array[ACL]): Self = StObject.set(x, "acls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAclsVarargs(value: ACL*): Self = StObject.set(x, "acls", js.Array(value :_*))
    
    @scala.inline
    def setCaseSensitiveEmail(value: Boolean): Self = StObject.set(x, "caseSensitiveEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailVerificationRequired(value: Boolean): Self = StObject.set(x, "emailVerificationRequired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttp(value: Path): Self = StObject.set(x, "http", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxTTL(value: Double): Self = StObject.set(x, "maxTTL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRealmDelimiter(value: String): Self = StObject.set(x, "realmDelimiter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRealmRequired(value: Boolean): Self = StObject.set(x, "realmRequired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResetPasswordTokenTTL(value: Double): Self = StObject.set(x, "resetPasswordTokenTTL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSaltWorkFactor(value: Double): Self = StObject.set(x, "saltWorkFactor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTtl(value: Double): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
  }
}

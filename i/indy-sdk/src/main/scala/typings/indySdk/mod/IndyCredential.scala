package typings.indySdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndyCredential extends StObject {
  
  var cred_info: IndyCredentialInfo
  
  var interval: js.UndefOr[NonRevokedInterval] = js.undefined
}
object IndyCredential {
  
  inline def apply(cred_info: IndyCredentialInfo): IndyCredential = {
    val __obj = js.Dynamic.literal(cred_info = cred_info.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndyCredential]
  }
  
  extension [Self <: IndyCredential](x: Self) {
    
    inline def setCred_info(value: IndyCredentialInfo): Self = StObject.set(x, "cred_info", value.asInstanceOf[js.Any])
    
    inline def setInterval(value: NonRevokedInterval): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
    
    inline def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
  }
}

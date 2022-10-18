package typings.kafkajs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteAclFilterResponses extends StObject {
  
  var errorCode: Double
  
  var errorMessage: js.UndefOr[String] = js.undefined
  
  var matchingAcls: js.Array[MatchingAcl]
}
object DeleteAclFilterResponses {
  
  inline def apply(errorCode: Double, matchingAcls: js.Array[MatchingAcl]): DeleteAclFilterResponses = {
    val __obj = js.Dynamic.literal(errorCode = errorCode.asInstanceOf[js.Any], matchingAcls = matchingAcls.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteAclFilterResponses]
  }
  
  extension [Self <: DeleteAclFilterResponses](x: Self) {
    
    inline def setErrorCode(value: Double): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
    
    inline def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
    
    inline def setMatchingAcls(value: js.Array[MatchingAcl]): Self = StObject.set(x, "matchingAcls", value.asInstanceOf[js.Any])
    
    inline def setMatchingAclsVarargs(value: MatchingAcl*): Self = StObject.set(x, "matchingAcls", js.Array(value*))
  }
}

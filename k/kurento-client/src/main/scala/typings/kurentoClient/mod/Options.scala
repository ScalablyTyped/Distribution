package typings.kurentoClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Options extends StObject {
  
  var access_token: js.UndefOr[String] = js.undefined
  
  var duplicates_timeout: js.UndefOr[Double] = js.undefined
  
  var enableTransactions: js.UndefOr[Boolean] = js.undefined
  
  var failAfter: js.UndefOr[Double] = js.undefined
  
  var request_timeout: js.UndefOr[Double] = js.undefined
  
  var response_timeout: js.UndefOr[Double] = js.undefined
  
  var socket: js.UndefOr[Any] = js.undefined
  
  var strict: js.UndefOr[Boolean] = js.undefined
  
  var useImplicitTransactions: js.UndefOr[Boolean] = js.undefined
}
object Options {
  
  inline def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  extension [Self <: Options](x: Self) {
    
    inline def setAccess_token(value: String): Self = StObject.set(x, "access_token", value.asInstanceOf[js.Any])
    
    inline def setAccess_tokenUndefined: Self = StObject.set(x, "access_token", js.undefined)
    
    inline def setDuplicates_timeout(value: Double): Self = StObject.set(x, "duplicates_timeout", value.asInstanceOf[js.Any])
    
    inline def setDuplicates_timeoutUndefined: Self = StObject.set(x, "duplicates_timeout", js.undefined)
    
    inline def setEnableTransactions(value: Boolean): Self = StObject.set(x, "enableTransactions", value.asInstanceOf[js.Any])
    
    inline def setEnableTransactionsUndefined: Self = StObject.set(x, "enableTransactions", js.undefined)
    
    inline def setFailAfter(value: Double): Self = StObject.set(x, "failAfter", value.asInstanceOf[js.Any])
    
    inline def setFailAfterUndefined: Self = StObject.set(x, "failAfter", js.undefined)
    
    inline def setRequest_timeout(value: Double): Self = StObject.set(x, "request_timeout", value.asInstanceOf[js.Any])
    
    inline def setRequest_timeoutUndefined: Self = StObject.set(x, "request_timeout", js.undefined)
    
    inline def setResponse_timeout(value: Double): Self = StObject.set(x, "response_timeout", value.asInstanceOf[js.Any])
    
    inline def setResponse_timeoutUndefined: Self = StObject.set(x, "response_timeout", js.undefined)
    
    inline def setSocket(value: Any): Self = StObject.set(x, "socket", value.asInstanceOf[js.Any])
    
    inline def setSocketUndefined: Self = StObject.set(x, "socket", js.undefined)
    
    inline def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
    
    inline def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
    
    inline def setUseImplicitTransactions(value: Boolean): Self = StObject.set(x, "useImplicitTransactions", value.asInstanceOf[js.Any])
    
    inline def setUseImplicitTransactionsUndefined: Self = StObject.set(x, "useImplicitTransactions", js.undefined)
  }
}

package typings.kurentoClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends StObject {
  
  var access_token: js.UndefOr[String] = js.native
  
  var duplicates_timeout: js.UndefOr[Double] = js.native
  
  var enableTransactions: js.UndefOr[Boolean] = js.native
  
  var failAfter: js.UndefOr[Double] = js.native
  
  var request_timeout: js.UndefOr[Double] = js.native
  
  var response_timeout: js.UndefOr[Double] = js.native
  
  var socket: js.UndefOr[js.Any] = js.native
  
  var strict: js.UndefOr[Boolean] = js.native
  
  var useImplicitTransactions: js.UndefOr[Boolean] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccess_token(value: String): Self = StObject.set(x, "access_token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccess_tokenUndefined: Self = StObject.set(x, "access_token", js.undefined)
    
    @scala.inline
    def setDuplicates_timeout(value: Double): Self = StObject.set(x, "duplicates_timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDuplicates_timeoutUndefined: Self = StObject.set(x, "duplicates_timeout", js.undefined)
    
    @scala.inline
    def setEnableTransactions(value: Boolean): Self = StObject.set(x, "enableTransactions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableTransactionsUndefined: Self = StObject.set(x, "enableTransactions", js.undefined)
    
    @scala.inline
    def setFailAfter(value: Double): Self = StObject.set(x, "failAfter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailAfterUndefined: Self = StObject.set(x, "failAfter", js.undefined)
    
    @scala.inline
    def setRequest_timeout(value: Double): Self = StObject.set(x, "request_timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest_timeoutUndefined: Self = StObject.set(x, "request_timeout", js.undefined)
    
    @scala.inline
    def setResponse_timeout(value: Double): Self = StObject.set(x, "response_timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse_timeoutUndefined: Self = StObject.set(x, "response_timeout", js.undefined)
    
    @scala.inline
    def setSocket(value: js.Any): Self = StObject.set(x, "socket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSocketUndefined: Self = StObject.set(x, "socket", js.undefined)
    
    @scala.inline
    def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
    
    @scala.inline
    def setUseImplicitTransactions(value: Boolean): Self = StObject.set(x, "useImplicitTransactions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseImplicitTransactionsUndefined: Self = StObject.set(x, "useImplicitTransactions", js.undefined)
  }
}

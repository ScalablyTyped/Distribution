package typings.mangopay2NodejsSdk.mod

import typings.mangopay2NodejsSdk.anon.DeepPartialPartialHeaders
import typings.mangopay2NodejsSdk.anon.DeepPartialclientIdstring
import typings.mangopay2NodejsSdk.anon.DeepPartialtimeoutnumber
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent mangopay2-nodejs-sdk.mangopay2-nodejs-sdk/types.DeepPartial<mangopay2-nodejs-sdk.mangopay2-nodejs-sdk.RequestOptions> */
@js.native
trait MethodOptions extends StObject {
  
  var data: js.UndefOr[WithToJson[js.Object] | String] = js.native
  
  var headers: js.UndefOr[DeepPartialPartialHeaders] = js.native
  
  var parameters: js.UndefOr[FilterOptions with PaginationOptions] = js.native
  
  var path: js.UndefOr[DeepPartialclientIdstring] = js.native
  
  var requestConfig: js.UndefOr[DeepPartialtimeoutnumber] = js.native
  
  var responseConfig: js.UndefOr[DeepPartialtimeoutnumber] = js.native
}
object MethodOptions {
  
  @scala.inline
  def apply(): MethodOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MethodOptions]
  }
  
  @scala.inline
  implicit class MethodOptionsMutableBuilder[Self <: MethodOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: WithToJson[js.Object] | String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setHeaders(value: DeepPartialPartialHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setParameters(value: FilterOptions with PaginationOptions): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    @scala.inline
    def setPath(value: DeepPartialclientIdstring): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    @scala.inline
    def setRequestConfig(value: DeepPartialtimeoutnumber): Self = StObject.set(x, "requestConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestConfigUndefined: Self = StObject.set(x, "requestConfig", js.undefined)
    
    @scala.inline
    def setResponseConfig(value: DeepPartialtimeoutnumber): Self = StObject.set(x, "responseConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseConfigUndefined: Self = StObject.set(x, "responseConfig", js.undefined)
  }
}

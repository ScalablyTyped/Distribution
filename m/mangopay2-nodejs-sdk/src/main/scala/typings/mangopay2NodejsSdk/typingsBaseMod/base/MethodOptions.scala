package typings.mangopay2NodejsSdk.typingsBaseMod.base

import typings.mangopay2NodejsSdk.anon.DeepPartialPartialHeaders
import typings.mangopay2NodejsSdk.anon.DeepPartialclientIdstring
import typings.mangopay2NodejsSdk.anon.DeepPartialtimeoutnumber
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent mangopay2-nodejs-sdk.mangopay2-nodejs-sdk/typings/types.DeepPartial<mangopay2-nodejs-sdk.mangopay2-nodejs-sdk/typings/base.base.RequestOptions> */
trait MethodOptions extends StObject {
  
  var data: js.UndefOr[WithToJson[js.Object] | String] = js.undefined
  
  var headers: js.UndefOr[DeepPartialPartialHeaders] = js.undefined
  
  var parameters: js.UndefOr[FilterOptions & PaginationOptions] = js.undefined
  
  var path: js.UndefOr[DeepPartialclientIdstring] = js.undefined
  
  var requestConfig: js.UndefOr[DeepPartialtimeoutnumber] = js.undefined
  
  var responseConfig: js.UndefOr[DeepPartialtimeoutnumber] = js.undefined
}
object MethodOptions {
  
  inline def apply(): MethodOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MethodOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MethodOptions] (val x: Self) extends AnyVal {
    
    inline def setData(value: WithToJson[js.Object] | String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setHeaders(value: DeepPartialPartialHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setParameters(value: FilterOptions & PaginationOptions): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    inline def setPath(value: DeepPartialclientIdstring): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setRequestConfig(value: DeepPartialtimeoutnumber): Self = StObject.set(x, "requestConfig", value.asInstanceOf[js.Any])
    
    inline def setRequestConfigUndefined: Self = StObject.set(x, "requestConfig", js.undefined)
    
    inline def setResponseConfig(value: DeepPartialtimeoutnumber): Self = StObject.set(x, "responseConfig", value.asInstanceOf[js.Any])
    
    inline def setResponseConfigUndefined: Self = StObject.set(x, "responseConfig", js.undefined)
  }
}

package typings.mangopay2NodejsSdk.mod

import typings.mangopay2NodejsSdk.anon.DeepPartialPartialHeaders
import typings.mangopay2NodejsSdk.anon.DeepPartialclientIdstring
import typings.mangopay2NodejsSdk.anon.DeepPartialtimeoutnumber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent mangopay2-nodejs-sdk.mangopay2-nodejs-sdk/types.DeepPartial<mangopay2-nodejs-sdk.mangopay2-nodejs-sdk.RequestOptions> */
@js.native
trait MethodOptions extends js.Object {
  
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
  implicit class MethodOptionsOps[Self <: MethodOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setData(value: WithToJson[js.Object] | String): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setHeaders(value: DeepPartialPartialHeaders): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    
    @scala.inline
    def setParameters(value: FilterOptions with PaginationOptions): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParameters: Self = this.set("parameters", js.undefined)
    
    @scala.inline
    def setPath(value: DeepPartialclientIdstring): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    
    @scala.inline
    def setRequestConfig(value: DeepPartialtimeoutnumber): Self = this.set("requestConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestConfig: Self = this.set("requestConfig", js.undefined)
    
    @scala.inline
    def setResponseConfig(value: DeepPartialtimeoutnumber): Self = this.set("responseConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponseConfig: Self = this.set("responseConfig", js.undefined)
  }
}

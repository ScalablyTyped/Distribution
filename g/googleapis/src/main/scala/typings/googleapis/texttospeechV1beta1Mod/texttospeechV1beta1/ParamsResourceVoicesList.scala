package typings.googleapis.texttospeechV1beta1Mod.texttospeechV1beta1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceVoicesList extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * Optional (but recommended)
    * [BCP-47](https://www.rfc-editor.org/rfc/bcp/bcp47.txt) language tag. If
    * specified, the ListVoices call will only return voices that can be used
    * to synthesize this language_code. E.g. when specifying "en-NZ", you will
    * get supported "en-*" voices; when specifying "no", you will get supported
    * "no-*" (Norwegian) and "nb-*" (Norwegian Bokmal) voices; specifying "zh"
    * will also get supported "cmn-*" voices; specifying "zh-hk" will also get
    * supported "yue-*" voices.
    */
  var languageCode: js.UndefOr[String] = js.native
}
object ParamsResourceVoicesList {
  
  @scala.inline
  def apply(): ParamsResourceVoicesList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceVoicesList]
  }
  
  @scala.inline
  implicit class ParamsResourceVoicesListOps[Self <: ParamsResourceVoicesList] (val x: Self) extends AnyVal {
    
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
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = this.set("auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuth: Self = this.set("auth", js.undefined)
    
    @scala.inline
    def setLanguageCode(value: String): Self = this.set("languageCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLanguageCode: Self = this.set("languageCode", js.undefined)
  }
}

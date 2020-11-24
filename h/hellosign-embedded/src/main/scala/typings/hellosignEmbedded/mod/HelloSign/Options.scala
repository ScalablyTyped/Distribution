package typings.hellosignEmbedded.mod.HelloSign

import typings.hellosignEmbedded.hellosignEmbeddedStrings.cs_CZ
import typings.hellosignEmbedded.hellosignEmbeddedStrings.da_DK
import typings.hellosignEmbedded.hellosignEmbeddedStrings.de_DE
import typings.hellosignEmbedded.hellosignEmbeddedStrings.en_US
import typings.hellosignEmbedded.hellosignEmbeddedStrings.es_ES
import typings.hellosignEmbedded.hellosignEmbeddedStrings.es_MX
import typings.hellosignEmbedded.hellosignEmbeddedStrings.fr_FR
import typings.hellosignEmbedded.hellosignEmbeddedStrings.it_IT
import typings.hellosignEmbedded.hellosignEmbeddedStrings.ja_JP
import typings.hellosignEmbedded.hellosignEmbeddedStrings.nl_NL
import typings.hellosignEmbedded.hellosignEmbeddedStrings.pl_PL
import typings.hellosignEmbedded.hellosignEmbeddedStrings.pt_BR
import typings.hellosignEmbedded.hellosignEmbeddedStrings.sv_SE
import typings.hellosignEmbedded.hellosignEmbeddedStrings.zh_CN
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  var allowCancel: js.UndefOr[Boolean] = js.native
  
  var clientId: js.UndefOr[String] = js.native
  
  var container: js.UndefOr[HTMLElement] = js.native
  
  var debug: js.UndefOr[Boolean] = js.native
  
  var hideHeader: js.UndefOr[Boolean] = js.native
  
  var locale: js.UndefOr[
    sv_SE | ja_JP | es_ES | da_DK | zh_CN | nl_NL | es_MX | de_DE | pl_PL | en_US | it_IT | pt_BR | fr_FR | cs_CZ
  ] = js.native
  
  var redirectTo: js.UndefOr[String] = js.native
  
  var requestingEmail: js.UndefOr[String] = js.native
  
  var skipDomainVerification: js.UndefOr[Boolean] = js.native
  
  var testMode: js.UndefOr[Boolean] = js.native
  
  var timeout: js.UndefOr[Double] = js.native
  
  var whiteLabeling: js.UndefOr[js.Object] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setAllowCancel(value: Boolean): Self = this.set("allowCancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowCancel: Self = this.set("allowCancel", js.undefined)
    
    @scala.inline
    def setClientId(value: String): Self = this.set("clientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientId: Self = this.set("clientId", js.undefined)
    
    @scala.inline
    def setContainer(value: HTMLElement): Self = this.set("container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainer: Self = this.set("container", js.undefined)
    
    @scala.inline
    def setDebug(value: Boolean): Self = this.set("debug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDebug: Self = this.set("debug", js.undefined)
    
    @scala.inline
    def setHideHeader(value: Boolean): Self = this.set("hideHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHideHeader: Self = this.set("hideHeader", js.undefined)
    
    @scala.inline
    def setLocale(
      value: sv_SE | ja_JP | es_ES | da_DK | zh_CN | nl_NL | es_MX | de_DE | pl_PL | en_US | it_IT | pt_BR | fr_FR | cs_CZ
    ): Self = this.set("locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    
    @scala.inline
    def setRedirectTo(value: String): Self = this.set("redirectTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRedirectTo: Self = this.set("redirectTo", js.undefined)
    
    @scala.inline
    def setRequestingEmail(value: String): Self = this.set("requestingEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestingEmail: Self = this.set("requestingEmail", js.undefined)
    
    @scala.inline
    def setSkipDomainVerification(value: Boolean): Self = this.set("skipDomainVerification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkipDomainVerification: Self = this.set("skipDomainVerification", js.undefined)
    
    @scala.inline
    def setTestMode(value: Boolean): Self = this.set("testMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTestMode: Self = this.set("testMode", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
    
    @scala.inline
    def setWhiteLabeling(value: js.Object): Self = this.set("whiteLabeling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWhiteLabeling: Self = this.set("whiteLabeling", js.undefined)
  }
}

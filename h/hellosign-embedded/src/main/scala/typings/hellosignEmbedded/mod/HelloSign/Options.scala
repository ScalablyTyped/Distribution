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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Options extends StObject {
  
  var allowCancel: js.UndefOr[Boolean] = js.undefined
  
  var clientId: js.UndefOr[String] = js.undefined
  
  var container: js.UndefOr[HTMLElement] = js.undefined
  
  var debug: js.UndefOr[Boolean] = js.undefined
  
  var hideHeader: js.UndefOr[Boolean] = js.undefined
  
  var locale: js.UndefOr[
    sv_SE | ja_JP | es_ES | da_DK | zh_CN | nl_NL | es_MX | de_DE | pl_PL | en_US | it_IT | pt_BR | fr_FR | cs_CZ
  ] = js.undefined
  
  var redirectTo: js.UndefOr[String] = js.undefined
  
  var requestingEmail: js.UndefOr[String] = js.undefined
  
  var skipDomainVerification: js.UndefOr[Boolean] = js.undefined
  
  var testMode: js.UndefOr[Boolean] = js.undefined
  
  var timeout: js.UndefOr[Double] = js.undefined
  
  var whiteLabeling: js.UndefOr[js.Object] = js.undefined
}
object Options {
  
  inline def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  extension [Self <: Options](x: Self) {
    
    inline def setAllowCancel(value: Boolean): Self = StObject.set(x, "allowCancel", value.asInstanceOf[js.Any])
    
    inline def setAllowCancelUndefined: Self = StObject.set(x, "allowCancel", js.undefined)
    
    inline def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
    
    inline def setClientIdUndefined: Self = StObject.set(x, "clientId", js.undefined)
    
    inline def setContainer(value: HTMLElement): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
    
    inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
    
    inline def setHideHeader(value: Boolean): Self = StObject.set(x, "hideHeader", value.asInstanceOf[js.Any])
    
    inline def setHideHeaderUndefined: Self = StObject.set(x, "hideHeader", js.undefined)
    
    inline def setLocale(
      value: sv_SE | ja_JP | es_ES | da_DK | zh_CN | nl_NL | es_MX | de_DE | pl_PL | en_US | it_IT | pt_BR | fr_FR | cs_CZ
    ): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    inline def setRedirectTo(value: String): Self = StObject.set(x, "redirectTo", value.asInstanceOf[js.Any])
    
    inline def setRedirectToUndefined: Self = StObject.set(x, "redirectTo", js.undefined)
    
    inline def setRequestingEmail(value: String): Self = StObject.set(x, "requestingEmail", value.asInstanceOf[js.Any])
    
    inline def setRequestingEmailUndefined: Self = StObject.set(x, "requestingEmail", js.undefined)
    
    inline def setSkipDomainVerification(value: Boolean): Self = StObject.set(x, "skipDomainVerification", value.asInstanceOf[js.Any])
    
    inline def setSkipDomainVerificationUndefined: Self = StObject.set(x, "skipDomainVerification", js.undefined)
    
    inline def setTestMode(value: Boolean): Self = StObject.set(x, "testMode", value.asInstanceOf[js.Any])
    
    inline def setTestModeUndefined: Self = StObject.set(x, "testMode", js.undefined)
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    inline def setWhiteLabeling(value: js.Object): Self = StObject.set(x, "whiteLabeling", value.asInstanceOf[js.Any])
    
    inline def setWhiteLabelingUndefined: Self = StObject.set(x, "whiteLabeling", js.undefined)
  }
}

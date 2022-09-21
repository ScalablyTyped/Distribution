package typings.hellosignSdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HelloSign extends StObject {
  
  def _setApiField(key: String, value: Any): Unit
  
  var account: AccountModule
  
  var apiApp: ApiAppModule
  
  var embedded: EmbeddedModule
  
  def getApiField(key: String): Any
  
  def isDev(): Boolean
  
  var oauth: OAuthModule
  
  var reports: ReportsModule
  
  def setApiKey(key: String): Unit
  
  def setClientId(clientId: String): Unit
  
  def setClientSecret(clientSecret: String): Unit
  
  def setHost(host: String, port: String, protocol: String): Unit
  
  def setOauthToken(oauthToken: String): Unit
  
  def setPort(port: String): Unit
  
  def setProtocol(protocol: String): Unit
  
  def setTimeout(timeout: Double): Unit
  
  def setUserPassAuth(username: String, password: String): Unit
  
  var signatureRequest: SignatureRequestModule
  
  var team: TeamModule
  
  var template: TemplateModule
  
  var unclaimedDraft: UnclaimedDraftModule
}
object HelloSign {
  
  inline def apply(
    _setApiField: (String, Any) => Unit,
    account: AccountModule,
    apiApp: ApiAppModule,
    embedded: EmbeddedModule,
    getApiField: String => Any,
    isDev: () => Boolean,
    oauth: OAuthModule,
    reports: ReportsModule,
    setApiKey: String => Unit,
    setClientId: String => Unit,
    setClientSecret: String => Unit,
    setHost: (String, String, String) => Unit,
    setOauthToken: String => Unit,
    setPort: String => Unit,
    setProtocol: String => Unit,
    setTimeout: Double => Unit,
    setUserPassAuth: (String, String) => Unit,
    signatureRequest: SignatureRequestModule,
    team: TeamModule,
    template: TemplateModule,
    unclaimedDraft: UnclaimedDraftModule
  ): HelloSign = {
    val __obj = js.Dynamic.literal(_setApiField = js.Any.fromFunction2(_setApiField), account = account.asInstanceOf[js.Any], apiApp = apiApp.asInstanceOf[js.Any], embedded = embedded.asInstanceOf[js.Any], getApiField = js.Any.fromFunction1(getApiField), isDev = js.Any.fromFunction0(isDev), oauth = oauth.asInstanceOf[js.Any], reports = reports.asInstanceOf[js.Any], setApiKey = js.Any.fromFunction1(setApiKey), setClientId = js.Any.fromFunction1(setClientId), setClientSecret = js.Any.fromFunction1(setClientSecret), setHost = js.Any.fromFunction3(setHost), setOauthToken = js.Any.fromFunction1(setOauthToken), setPort = js.Any.fromFunction1(setPort), setProtocol = js.Any.fromFunction1(setProtocol), setTimeout = js.Any.fromFunction1(setTimeout), setUserPassAuth = js.Any.fromFunction2(setUserPassAuth), signatureRequest = signatureRequest.asInstanceOf[js.Any], team = team.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any], unclaimedDraft = unclaimedDraft.asInstanceOf[js.Any])
    __obj.asInstanceOf[HelloSign]
  }
  
  extension [Self <: HelloSign](x: Self) {
    
    inline def setAccount(value: AccountModule): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
    
    inline def setApiApp(value: ApiAppModule): Self = StObject.set(x, "apiApp", value.asInstanceOf[js.Any])
    
    inline def setEmbedded(value: EmbeddedModule): Self = StObject.set(x, "embedded", value.asInstanceOf[js.Any])
    
    inline def setGetApiField(value: String => Any): Self = StObject.set(x, "getApiField", js.Any.fromFunction1(value))
    
    inline def setIsDev(value: () => Boolean): Self = StObject.set(x, "isDev", js.Any.fromFunction0(value))
    
    inline def setOauth(value: OAuthModule): Self = StObject.set(x, "oauth", value.asInstanceOf[js.Any])
    
    inline def setReports(value: ReportsModule): Self = StObject.set(x, "reports", value.asInstanceOf[js.Any])
    
    inline def setSetApiKey(value: String => Unit): Self = StObject.set(x, "setApiKey", js.Any.fromFunction1(value))
    
    inline def setSetClientId(value: String => Unit): Self = StObject.set(x, "setClientId", js.Any.fromFunction1(value))
    
    inline def setSetClientSecret(value: String => Unit): Self = StObject.set(x, "setClientSecret", js.Any.fromFunction1(value))
    
    inline def setSetHost(value: (String, String, String) => Unit): Self = StObject.set(x, "setHost", js.Any.fromFunction3(value))
    
    inline def setSetOauthToken(value: String => Unit): Self = StObject.set(x, "setOauthToken", js.Any.fromFunction1(value))
    
    inline def setSetPort(value: String => Unit): Self = StObject.set(x, "setPort", js.Any.fromFunction1(value))
    
    inline def setSetProtocol(value: String => Unit): Self = StObject.set(x, "setProtocol", js.Any.fromFunction1(value))
    
    inline def setSetTimeout(value: Double => Unit): Self = StObject.set(x, "setTimeout", js.Any.fromFunction1(value))
    
    inline def setSetUserPassAuth(value: (String, String) => Unit): Self = StObject.set(x, "setUserPassAuth", js.Any.fromFunction2(value))
    
    inline def setSignatureRequest(value: SignatureRequestModule): Self = StObject.set(x, "signatureRequest", value.asInstanceOf[js.Any])
    
    inline def setTeam(value: TeamModule): Self = StObject.set(x, "team", value.asInstanceOf[js.Any])
    
    inline def setTemplate(value: TemplateModule): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    inline def setUnclaimedDraft(value: UnclaimedDraftModule): Self = StObject.set(x, "unclaimedDraft", value.asInstanceOf[js.Any])
    
    inline def set_setApiField(value: (String, Any) => Unit): Self = StObject.set(x, "_setApiField", js.Any.fromFunction2(value))
  }
}

package typings.hellosignSdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("hellosign-sdk", JSImport.Namespace)
@js.native
open class ^ protected ()
  extends StObject
     with HelloSign {
  def this(options: HelloSignOptions) = this()
  
  /* CompleteClass */
  override def _setApiField(key: String, value: Any): Unit = js.native
  
  /* CompleteClass */
  var account: AccountModule = js.native
  
  /* CompleteClass */
  var apiApp: ApiAppModule = js.native
  
  /* CompleteClass */
  var embedded: EmbeddedModule = js.native
  
  /* CompleteClass */
  override def getApiField(key: String): Any = js.native
  
  /* CompleteClass */
  override def isDev(): Boolean = js.native
  
  /* CompleteClass */
  var oauth: OAuthModule = js.native
  
  /* CompleteClass */
  var reports: ReportsModule = js.native
  
  /* CompleteClass */
  override def setApiKey(key: String): Unit = js.native
  
  /* CompleteClass */
  override def setClientId(clientId: String): Unit = js.native
  
  /* CompleteClass */
  override def setClientSecret(clientSecret: String): Unit = js.native
  
  /* CompleteClass */
  override def setHost(host: String, port: String, protocol: String): Unit = js.native
  
  /* CompleteClass */
  override def setOauthToken(oauthToken: String): Unit = js.native
  
  /* CompleteClass */
  override def setPort(port: String): Unit = js.native
  
  /* CompleteClass */
  override def setProtocol(protocol: String): Unit = js.native
  
  /* CompleteClass */
  override def setTimeout(timeout: Double): Unit = js.native
  
  /* CompleteClass */
  override def setUserPassAuth(username: String, password: String): Unit = js.native
  
  /* CompleteClass */
  var signatureRequest: SignatureRequestModule = js.native
  
  /* CompleteClass */
  var team: TeamModule = js.native
  
  /* CompleteClass */
  var template: TemplateModule = js.native
  
  /* CompleteClass */
  var unclaimedDraft: UnclaimedDraftModule = js.native
}

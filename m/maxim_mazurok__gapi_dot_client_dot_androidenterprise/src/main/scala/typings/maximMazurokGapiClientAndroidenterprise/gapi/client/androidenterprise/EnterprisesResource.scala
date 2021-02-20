package typings.maximMazurokGapiClientAndroidenterprise.gapi.client.androidenterprise

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientAndroidenterprise.anon.CallbackUrl
import typings.maximMazurokGapiClientAndroidenterprise.anon.CompletionToken
import typings.maximMazurokGapiClientAndroidenterprise.anon.Domain
import typings.maximMazurokGapiClientAndroidenterprise.anon.Fields
import typings.maximMazurokGapiClientAndroidenterprise.anon.Key
import typings.maximMazurokGapiClientAndroidenterprise.anon.KeyType
import typings.maximMazurokGapiClientAndroidenterprise.anon.Oauthtoken
import typings.maximMazurokGapiClientAndroidenterprise.anon.PrettyPrint
import typings.maximMazurokGapiClientAndroidenterprise.anon.QuotaUser
import typings.maximMazurokGapiClientAndroidenterprise.anon.RequestMode
import typings.maximMazurokGapiClientAndroidenterprise.anon.Resource
import typings.maximMazurokGapiClientAndroidenterprise.anon.UploadType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnterprisesResource extends StObject {
  
  /** Acknowledges notifications that were received from Enterprises.PullNotificationSet to prevent subsequent calls from returning the same notifications. */
  def acknowledgeNotificationSet(): Request[Unit] = js.native
  def acknowledgeNotificationSet(request: Fields): Request[Unit] = js.native
  
  /** Completes the signup flow, by specifying the Completion token and Enterprise token. This request must not be called multiple times for a given Enterprise Token. */
  def completeSignup(): Request[Enterprise] = js.native
  def completeSignup(request: CompletionToken): Request[Enterprise] = js.native
  
  /**
    * Returns a unique token to access an embeddable UI. To generate a web UI, pass the generated token into the managed Google Play javascript API. Each token may only be used to start
    * one UI session. See the javascript API documentation for further information.
    */
  def createWebToken(request: Key): Request[AdministratorWebToken] = js.native
  def createWebToken(request: Oauthtoken, body: AdministratorWebTokenSpec): Request[AdministratorWebToken] = js.native
  
  /** Enrolls an enterprise with the calling EMM. */
  def enroll(request: PrettyPrint): Request[Enterprise] = js.native
  def enroll(request: QuotaUser, body: Enterprise): Request[Enterprise] = js.native
  
  /** Generates a sign-up URL. */
  def generateSignupUrl(): Request[SignupInfo] = js.native
  def generateSignupUrl(request: CallbackUrl): Request[SignupInfo] = js.native
  
  /** Retrieves the name and domain of an enterprise. */
  def get(): Request[Enterprise] = js.native
  def get(request: Oauthtoken): Request[Enterprise] = js.native
  
  /**
    * Returns a service account and credentials. The service account can be bound to the enterprise by calling setAccount. The service account is unique to this enterprise and EMM, and
    * will be deleted if the enterprise is unbound. The credentials contain private key data and are not stored server-side. This method can only be called after calling
    * Enterprises.Enroll or Enterprises.CompleteSignup, and before Enterprises.SetAccount; at other times it will return an error. Subsequent calls after the first will generate a new,
    * unique set of credentials, and invalidate the previously generated credentials. Once the service account is bound to the enterprise, it can be managed using the serviceAccountKeys
    * resource.
    */
  def getServiceAccount(): Request[ServiceAccount] = js.native
  def getServiceAccount(request: KeyType): Request[ServiceAccount] = js.native
  
  /** Returns the store layout for the enterprise. If the store layout has not been set, returns "basic" as the store layout type and no homepage. */
  def getStoreLayout(): Request[StoreLayout] = js.native
  def getStoreLayout(request: Oauthtoken): Request[StoreLayout] = js.native
  
  /**
    * Looks up an enterprise by domain name. This is only supported for enterprises created via the Google-initiated creation flow. Lookup of the id is not needed for enterprises created
    * via the EMM-initiated flow since the EMM learns the enterprise ID in the callback specified in the Enterprises.generateSignupUrl call.
    */
  def list(): Request[EnterprisesListResponse] = js.native
  def list(request: Domain): Request[EnterprisesListResponse] = js.native
  
  /**
    * Pulls and returns a notification set for the enterprises associated with the service account authenticated for the request. The notification set may be empty if no notification are
    * pending. A notification set returned needs to be acknowledged within 20 seconds by calling Enterprises.AcknowledgeNotificationSet, unless the notification set is empty.
    * Notifications that are not acknowledged within the 20 seconds will eventually be included again in the response to another PullNotificationSet request, and those that are never
    * acknowledged will ultimately be deleted according to the Google Cloud Platform Pub/Sub system policy. Multiple requests might be performed concurrently to retrieve notifications, in
    * which case the pending notifications (if any) will be split among each caller, if any are pending. If no notifications are present, an empty notification list is returned.
    * Subsequent requests may return more notifications once they become available.
    */
  def pullNotificationSet(): Request[NotificationSet] = js.native
  def pullNotificationSet(request: RequestMode): Request[NotificationSet] = js.native
  
  /** Sends a test notification to validate the EMM integration with the Google Cloud Pub/Sub service for this enterprise. */
  def sendTestPushNotification(): Request[EnterprisesSendTestPushNotificationResponse] = js.native
  def sendTestPushNotification(request: Oauthtoken): Request[EnterprisesSendTestPushNotificationResponse] = js.native
  
  def setAccount(request: Oauthtoken, body: EnterpriseAccount): Request[EnterpriseAccount] = js.native
  /** Sets the account that will be used to authenticate to the API as the enterprise. */
  def setAccount(request: Resource): Request[EnterpriseAccount] = js.native
  
  def setStoreLayout(request: Oauthtoken, body: StoreLayout): Request[StoreLayout] = js.native
  /**
    * Sets the store layout for the enterprise. By default, storeLayoutType is set to "basic" and the basic store layout is enabled. The basic layout only contains apps approved by the
    * admin, and that have been added to the available product set for a user (using the setAvailableProductSet call). Apps on the page are sorted in order of their product ID value. If
    * you create a custom store layout (by setting storeLayoutType = "custom" and setting a homepage), the basic store layout is disabled.
    */
  def setStoreLayout(request: UploadType): Request[StoreLayout] = js.native
  
  /** Unenrolls an enterprise from the calling EMM. */
  def unenroll(): Request[Unit] = js.native
  def unenroll(request: Oauthtoken): Request[Unit] = js.native
}

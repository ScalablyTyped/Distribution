package typings.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientAndroidpublisher.anon.AltCallback
import typings.maximMazurokGapiClientAndroidpublisher.anon.PageToken
import typings.maximMazurokGapiClientAndroidpublisher.anon.PrettyPrintQuotaUser
import typings.maximMazurokGapiClientAndroidpublisher.anon.ProductIdQuotaUser
import typings.maximMazurokGapiClientAndroidpublisher.anon.QuotaUserRegionsVersionversion
import typings.maximMazurokGapiClientAndroidpublisher.anon.RegionsVersionversionResource
import typings.maximMazurokGapiClientAndroidpublisher.anon.RegionsVersionversionUpdateMask
import typings.maximMazurokGapiClientAndroidpublisher.anon.RegionsVersionversionUploadType
import typings.maximMazurokGapiClientAndroidpublisher.anon.SubscriptionId
import typings.maximMazurokGapiClientAndroidpublisher.anon.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SubscriptionsResource extends StObject {
  
  /** Acknowledges a subscription purchase. */
  def acknowledge(request: SubscriptionId): Request[Unit] = js.native
  def acknowledge(request: Token, body: SubscriptionPurchasesAcknowledgeRequest): Request[Unit] = js.native
  
  /**
    * Archives a subscription. Can only be done if at least one base plan was active in the past, and no base plan is available for new or existing subscribers currently. This action is
    * irreversible, and the subscription ID will remain reserved.
    */
  def archive(request: AltCallback): Request[Subscription] = js.native
  def archive(request: ProductIdQuotaUser, body: ArchiveSubscriptionRequest): Request[Subscription] = js.native
  
  var basePlans: BasePlansResource = js.native
  
  /** Cancels a user's subscription purchase. The subscription remains valid until its expiration time. */
  def cancel(): Request[Unit] = js.native
  def cancel(request: Token): Request[Unit] = js.native
  
  /** Creates a new subscription. Newly added base plans will remain in draft state until activated. */
  def create(request: QuotaUserRegionsVersionversion): Request[Subscription] = js.native
  def create(request: RegionsVersionversionUploadType, body: Subscription): Request[Subscription] = js.native
  
  /** Defers a user's subscription purchase until a specified future expiration time. */
  def defer(request: PrettyPrintQuotaUser): Request[SubscriptionPurchasesDeferResponse] = js.native
  def defer(request: Token, body: SubscriptionPurchasesDeferRequest): Request[SubscriptionPurchasesDeferResponse] = js.native
  
  /** Deletes a subscription. A subscription can only be deleted if it has never had a base plan published. */
  def delete(): Request[Unit] = js.native
  def delete(request: ProductIdQuotaUser): Request[Unit] = js.native
  
  /** Reads a single subscription. */
  /** Checks whether a user's subscription purchase is valid and returns its expiry time. */
  def get(): Request[Subscription] = js.native
  def get(request: ProductIdQuotaUser): Request[Subscription] = js.native
  def get(request: Token): Request[SubscriptionPurchase] = js.native
  
  /** Lists all subscriptions under a given app. */
  def list(): Request[ListSubscriptionsResponse] = js.native
  def list(request: PageToken): Request[ListSubscriptionsResponse] = js.native
  
  /** Updates an existing subscription. */
  def patch(request: RegionsVersionversionResource): Request[Subscription] = js.native
  def patch(request: RegionsVersionversionUpdateMask, body: Subscription): Request[Subscription] = js.native
  
  /** Refunds a user's subscription purchase, but the subscription remains valid until its expiration time and it will continue to recur. */
  def refund(): Request[Unit] = js.native
  def refund(request: Token): Request[Unit] = js.native
  
  /** Refunds and immediately revokes a user's subscription purchase. Access to the subscription will be terminated immediately and it will stop recurring. */
  def revoke(): Request[Unit] = js.native
  def revoke(request: Token): Request[Unit] = js.native
}

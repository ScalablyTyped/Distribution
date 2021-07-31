package typings.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientAndroidpublisher.anon.AccesstokenAlt
import typings.maximMazurokGapiClientAndroidpublisher.anon.AltCallback
import typings.maximMazurokGapiClientAndroidpublisher.anon.SubscriptionId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SubscriptionsResource extends StObject {
  
  def acknowledge(request: AccesstokenAlt, body: SubscriptionPurchasesAcknowledgeRequest): Request[Unit] = js.native
  /** Acknowledges a subscription purchase. */
  def acknowledge(request: SubscriptionId): Request[Unit] = js.native
  
  /** Cancels a user's subscription purchase. The subscription remains valid until its expiration time. */
  def cancel(): Request[Unit] = js.native
  def cancel(request: AccesstokenAlt): Request[Unit] = js.native
  
  def defer(request: AccesstokenAlt, body: SubscriptionPurchasesDeferRequest): Request[SubscriptionPurchasesDeferResponse] = js.native
  /** Defers a user's subscription purchase until a specified future expiration time. */
  def defer(request: AltCallback): Request[SubscriptionPurchasesDeferResponse] = js.native
  
  /** Checks whether a user's subscription purchase is valid and returns its expiry time. */
  def get(): Request[SubscriptionPurchase] = js.native
  def get(request: AccesstokenAlt): Request[SubscriptionPurchase] = js.native
  
  /** Refunds a user's subscription purchase, but the subscription remains valid until its expiration time and it will continue to recur. */
  def refund(): Request[Unit] = js.native
  def refund(request: AccesstokenAlt): Request[Unit] = js.native
  
  /** Refunds and immediately revokes a user's subscription purchase. Access to the subscription will be terminated immediately and it will stop recurring. */
  def revoke(): Request[Unit] = js.native
  def revoke(request: AccesstokenAlt): Request[Unit] = js.native
}

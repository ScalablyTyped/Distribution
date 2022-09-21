package typings.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientAndroidpublisher.anon.AltBasePlanId
import typings.maximMazurokGapiClientAndroidpublisher.anon.BasePlanId
import typings.maximMazurokGapiClientAndroidpublisher.anon.BasePlanIdCallback
import typings.maximMazurokGapiClientAndroidpublisher.anon.FieldsKey
import typings.maximMazurokGapiClientAndroidpublisher.anon.OfferId
import typings.maximMazurokGapiClientAndroidpublisher.anon.PageSize
import typings.maximMazurokGapiClientAndroidpublisher.anon.ProductId
import typings.maximMazurokGapiClientAndroidpublisher.anon.RegionsVersionversion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OffersResource extends StObject {
  
  /** Activates a subscription offer. Once activated, subscription offers will be available to new subscribers. */
  def activate(request: BasePlanId): Request[SubscriptionOffer] = js.native
  def activate(request: OfferId, body: ActivateSubscriptionOfferRequest): Request[SubscriptionOffer] = js.native
  
  /** Creates a new subscription offer. Only auto-renewing base plans can have subscription offers. The offer state will be DRAFT until it is activated. */
  def create(request: ProductId): Request[SubscriptionOffer] = js.native
  def create(request: RegionsVersionversion, body: SubscriptionOffer): Request[SubscriptionOffer] = js.native
  
  /** Deactivates a subscription offer. Once deactivated, existing subscribers will maintain their subscription, but the offer will become unavailable to new subscribers. */
  def deactivate(request: AltBasePlanId): Request[SubscriptionOffer] = js.native
  def deactivate(request: OfferId, body: DeactivateSubscriptionOfferRequest): Request[SubscriptionOffer] = js.native
  
  /** Deletes a subscription offer. Can only be done for draft offers. This action is irreversible. */
  def delete(): Request[Unit] = js.native
  def delete(request: OfferId): Request[Unit] = js.native
  
  /** Reads a single offer */
  def get(): Request[SubscriptionOffer] = js.native
  def get(request: OfferId): Request[SubscriptionOffer] = js.native
  
  /** Lists all offers under a given subscription. */
  def list(): Request[ListSubscriptionOffersResponse] = js.native
  def list(request: PageSize): Request[ListSubscriptionOffersResponse] = js.native
  
  /** Updates an existing subscription offer. */
  def patch(request: BasePlanIdCallback): Request[SubscriptionOffer] = js.native
  def patch(request: FieldsKey, body: SubscriptionOffer): Request[SubscriptionOffer] = js.native
}

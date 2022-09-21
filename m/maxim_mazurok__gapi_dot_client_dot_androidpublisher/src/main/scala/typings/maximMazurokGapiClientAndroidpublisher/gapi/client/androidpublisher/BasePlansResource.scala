package typings.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientAndroidpublisher.anon.KeyOauthtoken
import typings.maximMazurokGapiClientAndroidpublisher.anon.OauthtokenPackageName
import typings.maximMazurokGapiClientAndroidpublisher.anon.PackageNamePrettyPrint
import typings.maximMazurokGapiClientAndroidpublisher.anon.PrettyPrintProductId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BasePlansResource extends StObject {
  
  /** Activates a base plan. Once activated, base plans will be available to new subscribers. */
  def activate(request: KeyOauthtoken): Request[Subscription] = js.native
  def activate(request: OauthtokenPackageName, body: ActivateBasePlanRequest): Request[Subscription] = js.native
  
  def deactivate(request: OauthtokenPackageName, body: DeactivateBasePlanRequest): Request[Subscription] = js.native
  /** Deactivates a base plan. Once deactivated, the base plan will become unavailable to new subscribers, but existing subscribers will maintain their subscription */
  def deactivate(request: PackageNamePrettyPrint): Request[Subscription] = js.native
  
  /** Deletes a base plan. Can only be done for draft base plans. This action is irreversible. */
  def delete(): Request[Unit] = js.native
  def delete(request: OauthtokenPackageName): Request[Unit] = js.native
  
  def migratePrices(request: OauthtokenPackageName, body: MigrateBasePlanPricesRequest): Request[js.Object] = js.native
  /**
    * Migrates subscribers who are receiving an historical subscription price to the currently-offered price for the specified region. Requests will cause price change notifications to be
    * sent to users who are currently receiving an historical price older than the supplied timestamp. Subscribers who do not agree to the new price will have their subscription ended at
    * the next renewal.
    */
  def migratePrices(request: PrettyPrintProductId): Request[js.Object] = js.native
  
  var offers: OffersResource = js.native
}

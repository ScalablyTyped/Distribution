package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientDfareporting.anon.AdvertiserIds
import typings.maximMazurokGapiClientDfareporting.anon.Alt
import typings.maximMazurokGapiClientDfareporting.anon.Callback
import typings.maximMazurokGapiClientDfareporting.anon.Uploadprotocol
import typings.maximMazurokGapiClientDfareporting.anon.Xgafv
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AdvertiserLandingPagesResource extends StObject {
  
  /** Gets one landing page by ID. */
  def get(): Request[LandingPage] = js.native
  def get(request: Alt): Request[LandingPage] = js.native
  
  def insert(request: Callback, body: LandingPage): Request[LandingPage] = js.native
  /** Inserts a new landing page. */
  def insert(request: Uploadprotocol): Request[LandingPage] = js.native
  
  /** Retrieves a list of landing pages. */
  def list(): Request[AdvertiserLandingPagesListResponse] = js.native
  def list(request: AdvertiserIds): Request[AdvertiserLandingPagesListResponse] = js.native
  
  def patch(request: Alt, body: LandingPage): Request[LandingPage] = js.native
  /** Updates an existing advertiser landing page. This method supports patch semantics. */
  def patch(request: Xgafv): Request[LandingPage] = js.native
  
  def update(request: Callback, body: LandingPage): Request[LandingPage] = js.native
  /** Updates an existing landing page. */
  def update(request: Uploadprotocol): Request[LandingPage] = js.native
}

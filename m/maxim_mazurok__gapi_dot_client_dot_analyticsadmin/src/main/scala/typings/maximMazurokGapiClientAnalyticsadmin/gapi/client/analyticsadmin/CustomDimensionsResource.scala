package typings.maximMazurokGapiClientAnalyticsadmin.gapi.client.analyticsadmin

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientAnalyticsadmin.anon.Alt
import typings.maximMazurokGapiClientAnalyticsadmin.anon.KeyName
import typings.maximMazurokGapiClientAnalyticsadmin.anon.KeyOauthtoken
import typings.maximMazurokGapiClientAnalyticsadmin.anon.Name
import typings.maximMazurokGapiClientAnalyticsadmin.anon.NameOauthtoken
import typings.maximMazurokGapiClientAnalyticsadmin.anon.PageSize
import typings.maximMazurokGapiClientAnalyticsadmin.anon.UpdateMask
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomDimensionsResource extends StObject {
  
  /** Archives a CustomDimension on a property. */
  def archive(request: KeyName): Request[js.Object] = js.native
  def archive(request: Name, body: GoogleAnalyticsAdminV1alphaArchiveCustomDimensionRequest): Request[js.Object] = js.native
  
  def create(request: Alt, body: GoogleAnalyticsAdminV1alphaCustomDimension): Request[GoogleAnalyticsAdminV1alphaCustomDimension] = js.native
  /** Creates a CustomDimension. */
  def create(request: KeyOauthtoken): Request[GoogleAnalyticsAdminV1alphaCustomDimension] = js.native
  
  /** Lookup for a single CustomDimension. */
  def get(): Request[GoogleAnalyticsAdminV1alphaCustomDimension] = js.native
  def get(request: Name): Request[GoogleAnalyticsAdminV1alphaCustomDimension] = js.native
  
  /** Lists CustomDimensions on a property. */
  def list(): Request[GoogleAnalyticsAdminV1alphaListCustomDimensionsResponse] = js.native
  def list(request: PageSize): Request[GoogleAnalyticsAdminV1alphaListCustomDimensionsResponse] = js.native
  
  /** Updates a CustomDimension on a property. */
  def patch(request: NameOauthtoken): Request[GoogleAnalyticsAdminV1alphaCustomDimension] = js.native
  def patch(request: UpdateMask, body: GoogleAnalyticsAdminV1alphaCustomDimension): Request[GoogleAnalyticsAdminV1alphaCustomDimension] = js.native
}

package typings.maximMazurokGapiClientAnalytics.gapi.client.analytics

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientAnalytics.anon.AccountIdAlt
import typings.maximMazurokGapiClientAnalytics.anon.AltFieldsKey
import typings.maximMazurokGapiClientAnalytics.anon.FieldsKeyOauthtoken
import typings.maximMazurokGapiClientAnalytics.anon.Maxresults
import typings.maximMazurokGapiClientAnalytics.anon.PrettyPrint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebpropertiesResource extends StObject {
  
  /** Gets a web property to which the user has access. */
  def get(): Request[Webproperty] = js.native
  def get(request: AccountIdAlt): Request[Webproperty] = js.native
  
  /** Create a new property if the account has fewer than 20 properties. Web properties are visible in the Google Analytics interface only if they have at least one profile. */
  def insert(request: AltFieldsKey): Request[Webproperty] = js.native
  def insert(request: PrettyPrint, body: Webproperty): Request[Webproperty] = js.native
  
  /** Lists web properties to which the user has access. */
  def list(): Request[Webproperties] = js.native
  def list(request: Maxresults): Request[Webproperties] = js.native
  
  def patch(request: AccountIdAlt, body: Webproperty): Request[Webproperty] = js.native
  /** Updates an existing web property. This method supports patch semantics. */
  def patch(request: FieldsKeyOauthtoken): Request[Webproperty] = js.native
  
  def update(request: AccountIdAlt, body: Webproperty): Request[Webproperty] = js.native
  /** Updates an existing web property. */
  def update(request: FieldsKeyOauthtoken): Request[Webproperty] = js.native
}

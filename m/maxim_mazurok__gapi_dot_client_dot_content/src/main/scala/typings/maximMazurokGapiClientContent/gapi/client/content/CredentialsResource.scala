package typings.maximMazurokGapiClientContent.gapi.client.content

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientContent.anon.Accesstoken
import typings.maximMazurokGapiClientContent.anon.AccountId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CredentialsResource extends StObject {
  
  /** Uploads credentials for the Merchant Center account. If credentials already exist for this Merchant Center account and purpose, this method updates them. */
  def create(request: Accesstoken): Request[AccountCredentials] = js.native
  def create(request: AccountId, body: AccountCredentials): Request[AccountCredentials] = js.native
}

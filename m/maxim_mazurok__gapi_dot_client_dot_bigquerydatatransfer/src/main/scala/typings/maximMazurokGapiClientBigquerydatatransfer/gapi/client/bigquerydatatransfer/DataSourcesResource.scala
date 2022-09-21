package typings.maximMazurokGapiClientBigquerydatatransfer.gapi.client.bigquerydatatransfer

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientBigquerydatatransfer.anon.Accesstoken
import typings.maximMazurokGapiClientBigquerydatatransfer.anon.Alt
import typings.maximMazurokGapiClientBigquerydatatransfer.anon.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataSourcesResource extends StObject {
  
  /** Returns true if valid credentials exist for the given data source and requesting user. */
  def checkValidCreds(request: Accesstoken): Request[CheckValidCredsResponse] = js.native
  def checkValidCreds(request: Alt, body: CheckValidCredsRequest): Request[CheckValidCredsResponse] = js.native
  
  /** Retrieves a supported data source and returns its settings. */
  def get(): Request[DataSource] = js.native
  def get(request: Alt): Request[DataSource] = js.native
  
  /** Lists supported data sources and returns their settings. */
  def list(): Request[ListDataSourcesResponse] = js.native
  def list(request: Callback): Request[ListDataSourcesResponse] = js.native
}

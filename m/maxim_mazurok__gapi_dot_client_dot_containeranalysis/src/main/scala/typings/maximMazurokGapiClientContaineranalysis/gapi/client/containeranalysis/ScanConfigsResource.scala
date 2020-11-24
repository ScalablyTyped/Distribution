package typings.maximMazurokGapiClientContaineranalysis.gapi.client.containeranalysis

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientContaineranalysis.anon.Key
import typings.maximMazurokGapiClientContaineranalysis.anon.PageSize
import typings.maximMazurokGapiClientContaineranalysis.anon.UploadType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScanConfigsResource extends js.Object {
  
  /** Gets the specified scan configuration. */
  def get(): Request[ScanConfig] = js.native
  def get(request: Key): Request[ScanConfig] = js.native
  
  /** Lists scan configurations for the specified project. */
  def list(): Request[ListScanConfigsResponse] = js.native
  def list(request: PageSize): Request[ListScanConfigsResponse] = js.native
  
  def update(request: Key, body: ScanConfig): Request[ScanConfig] = js.native
  /** Updates the specified scan configuration. */
  def update(request: UploadType): Request[ScanConfig] = js.native
}

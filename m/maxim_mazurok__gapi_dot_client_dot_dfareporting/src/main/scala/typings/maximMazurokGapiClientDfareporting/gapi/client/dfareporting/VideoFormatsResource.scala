package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientDfareporting.anon.Callback
import typings.maximMazurokGapiClientDfareporting.anon.QuotaUserUploadType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VideoFormatsResource extends js.Object {
  
  /** Gets one video format by ID. */
  def get(): Request[VideoFormat] = js.native
  def get(request: QuotaUserUploadType): Request[VideoFormat] = js.native
  
  /** Lists available video formats. */
  def list(): Request[VideoFormatsListResponse] = js.native
  def list(request: Callback): Request[VideoFormatsListResponse] = js.native
}

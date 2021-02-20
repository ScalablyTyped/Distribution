package typings.maximMazurokGapiClientCloudtrace.gapi.client.cloudtrace

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientCloudtrace.anon.Alt
import typings.maximMazurokGapiClientCloudtrace.anon.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TracesResource extends StObject {
  
  def batchWrite(request: Alt, body: BatchWriteSpansRequest): Request[js.Object] = js.native
  /** Sends new spans to new or existing traces. You cannot update existing spans. */
  def batchWrite(request: Callback): Request[js.Object] = js.native
  
  var spans: SpansResource = js.native
}

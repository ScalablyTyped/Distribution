package typings.maximMazurokGapiClientCloudtrace.gapi.client.cloudtrace

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientCloudtrace.anon.Accesstoken
import typings.maximMazurokGapiClientCloudtrace.anon.Alt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpansResource extends js.Object {
  
  /** Creates a new span. */
  def createSpan(request: Accesstoken): Request[Span] = js.native
  def createSpan(request: Alt, body: Span): Request[Span] = js.native
}

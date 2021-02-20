package typings.maximMazurokGapiClientClouderrorreporting.gapi.client.clouderrorreporting

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientClouderrorreporting.anon.Accesstoken
import typings.maximMazurokGapiClientClouderrorreporting.anon.Alt
import typings.maximMazurokGapiClientClouderrorreporting.anon.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventsResource extends StObject {
  
  /** Lists the specified events. */
  def list(): Request[ListEventsResponse] = js.native
  def list(request: Accesstoken): Request[ListEventsResponse] = js.native
  
  /**
    * Report an individual error event. This endpoint accepts **either** an OAuth token, **or** an [API key](https://support.google.com/cloud/answer/6158862) for authentication. To use an
    * API key, append it to the URL as the value of a `key` parameter. For example: `POST https://clouderrorreporting.googleapis.com/v1beta1/{projectName}/events:report?key=123ABC456`
    */
  def report(request: Alt): Request[js.Object] = js.native
  def report(request: Callback, body: ReportedErrorEvent): Request[js.Object] = js.native
}

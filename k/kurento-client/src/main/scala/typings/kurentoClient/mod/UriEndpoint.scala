package typings.kurentoClient.mod

import typings.kurentoClient.anon.EventUriEndpointStateChan
import typings.kurentoClient.kurentoClientStrings.UriEndpointStateChanged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UriEndpoint extends MediaElement {
  
  def getState(): js.Promise[UriEndpointState] = js.native
  def getState(callback: Callback[UriEndpointState]): js.Promise[UriEndpointState] = js.native
  
  def getUri(): js.Promise[String] = js.native
  def getUri(callback: Callback[String]): js.Promise[String] = js.native
  
  @JSName("on")
  def on_UriEndpointStateChanged(
    eventName: UriEndpointStateChanged,
    callback: js.Function1[/* event */ EventUriEndpointStateChan, Unit]
  ): UriEndpoint = js.native
  
  def pause(): js.Promise[UriEndpointState] = js.native
  def pause(callback: Callback[UriEndpointState]): js.Promise[UriEndpointState] = js.native
  
  def stop(): js.Promise[UriEndpointState] = js.native
  def stop(callback: Callback[UriEndpointState]): js.Promise[UriEndpointState] = js.native
}

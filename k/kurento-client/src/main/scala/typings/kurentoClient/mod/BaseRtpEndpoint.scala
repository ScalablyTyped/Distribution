package typings.kurentoClient.mod

import typings.kurentoClient.anon.EventConnectionStateChang
import typings.kurentoClient.anon.EventMediaStateChangedold
import typings.kurentoClient.kurentoClientStrings.ConnectionStateChanged
import typings.kurentoClient.kurentoClientStrings.MediaStateChanged
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseRtpEndpoint
  extends StObject
     with MediaElement {
  
  def getConnectionState(): js.Promise[ConnectionState] = js.native
  def getConnectionState(callback: Callback[ConnectionState]): js.Promise[ConnectionState] = js.native
  
  def getMediaState(): js.Promise[MediaState] = js.native
  def getMediaState(callback: Callback[MediaState]): js.Promise[MediaState] = js.native
  
  @JSName("on")
  def on_ConnectionStateChanged(
    eventName: ConnectionStateChanged,
    callback: js.Function1[/* event */ EventConnectionStateChang, Unit]
  ): BaseRtpEndpoint = js.native
  @JSName("on")
  def on_MediaStateChanged(eventName: MediaStateChanged, callback: js.Function1[/* event */ EventMediaStateChangedold, Unit]): BaseRtpEndpoint = js.native
}

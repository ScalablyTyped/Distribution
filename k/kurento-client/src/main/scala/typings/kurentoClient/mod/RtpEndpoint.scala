package typings.kurentoClient.mod

import typings.kurentoClient.anon.EventOnIceCandidatecandid
import typings.kurentoClient.anon.EventOnKeySoftLimit
import typings.kurentoClient.kurentoClientStrings.OnIceCandidate
import typings.kurentoClient.kurentoClientStrings.OnKeySoftLimit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RtpEndpoint
  extends StObject
     with BaseRtpEndpoint {
  
  @JSName("on")
  def on_OnIceCandidate(event: OnIceCandidate, callback: js.Function1[/* event */ EventOnIceCandidatecandid, Unit]): WebRtcEndpoint = js.native
  @JSName("on")
  def on_OnKeySoftLimit(eventName: OnKeySoftLimit, callback: js.Function1[/* event */ EventOnKeySoftLimit, Unit]): RtpEndpoint = js.native
}

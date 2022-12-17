package typings.kurentoClient.mod

import typings.kurentoClient.anon.EventElementConnectedsink
import typings.kurentoClient.anon.EventElementDisconnecteds
import typings.kurentoClient.anon.EventMediaFlowInStateChan
import typings.kurentoClient.anon.EventMediaFlowOutStateCha
import typings.kurentoClient.anon.EventMediaTranscodingStat
import typings.kurentoClient.kurentoClientStrings.ElementConnected
import typings.kurentoClient.kurentoClientStrings.ElementDisconnected
import typings.kurentoClient.kurentoClientStrings.MediaFlowInStateChange
import typings.kurentoClient.kurentoClientStrings.MediaFlowOutStateChange
import typings.kurentoClient.kurentoClientStrings.MediaTranscodingStateChange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediaElement
  extends StObject
     with MediaObject {
  
  def connect(sink: MediaElement): js.Promise[Unit] = js.native
  def connect(sink: MediaElement, callback: Callback[Unit]): js.Promise[Unit] = js.native
  def connect(sink: MediaElement, mediaType: MediaType): js.Promise[Unit] = js.native
  def connect(sink: MediaElement, mediaType: MediaType, callback: Callback[Unit]): js.Promise[Unit] = js.native
  def connect(sink: MediaElement, mediaType: MediaType, sourceMediaDescription: String): js.Promise[Unit] = js.native
  def connect(sink: MediaElement, mediaType: MediaType, sourceMediaDescription: String, callback: Callback[Unit]): js.Promise[Unit] = js.native
  def connect(
    sink: MediaElement,
    mediaType: MediaType,
    sourceMediaDescription: String,
    sinkMediaDescriptionopt: String
  ): js.Promise[Unit] = js.native
  def connect(
    sink: MediaElement,
    mediaType: MediaType,
    sourceMediaDescription: String,
    sinkMediaDescriptionopt: String,
    callback: Callback[Unit]
  ): js.Promise[Unit] = js.native
  
  def disconnect(sink: MediaElement): js.Promise[Unit] = js.native
  def disconnect(sink: MediaElement, callback: Callback[Unit]): js.Promise[Unit] = js.native
  def disconnect(sink: MediaElement, mediaType: MediaType): js.Promise[Unit] = js.native
  def disconnect(sink: MediaElement, mediaType: MediaType, callback: Callback[Unit]): js.Promise[Unit] = js.native
  def disconnect(sink: MediaElement, mediaType: MediaType, sourceMediaDescription: String): js.Promise[Unit] = js.native
  def disconnect(sink: MediaElement, mediaType: MediaType, sourceMediaDescription: String, callback: Callback[Unit]): js.Promise[Unit] = js.native
  def disconnect(
    sink: MediaElement,
    mediaType: MediaType,
    sourceMediaDescription: String,
    sinkMediaDescriptionopt: String
  ): js.Promise[Unit] = js.native
  def disconnect(
    sink: MediaElement,
    mediaType: MediaType,
    sourceMediaDescription: String,
    sinkMediaDescriptionopt: String,
    callback: Callback[Unit]
  ): js.Promise[Unit] = js.native
  
  def getSinkConnections(): js.Promise[js.Array[ElementConnectionData]] = js.native
  def getSinkConnections(callback: Callback[js.Array[ElementConnectionData]]): js.Promise[js.Array[ElementConnectionData]] = js.native
  def getSinkConnections(mediaType: MediaType): js.Promise[js.Array[ElementConnectionData]] = js.native
  def getSinkConnections(mediaType: MediaType, callback: Callback[js.Array[ElementConnectionData]]): js.Promise[js.Array[ElementConnectionData]] = js.native
  def getSinkConnections(mediaType: MediaType, description: String): js.Promise[js.Array[ElementConnectionData]] = js.native
  def getSinkConnections(mediaType: MediaType, description: String, callback: Callback[js.Array[ElementConnectionData]]): js.Promise[js.Array[ElementConnectionData]] = js.native
  
  def getSourceConnections(): js.Promise[js.Array[ElementConnectionData]] = js.native
  def getSourceConnections(callback: Callback[js.Array[ElementConnectionData]]): js.Promise[js.Array[ElementConnectionData]] = js.native
  def getSourceConnections(mediaType: MediaType): js.Promise[js.Array[ElementConnectionData]] = js.native
  def getSourceConnections(mediaType: MediaType, callback: Callback[js.Array[ElementConnectionData]]): js.Promise[js.Array[ElementConnectionData]] = js.native
  def getSourceConnections(mediaType: MediaType, description: String): js.Promise[js.Array[ElementConnectionData]] = js.native
  def getSourceConnections(mediaType: MediaType, description: String, callback: Callback[js.Array[ElementConnectionData]]): js.Promise[js.Array[ElementConnectionData]] = js.native
  
  def isMediaFlowingIn(mediaType: MediaType): js.Promise[Boolean] = js.native
  def isMediaFlowingIn(mediaType: MediaType, sinkMediaDescription: String): js.Promise[Boolean] = js.native
  def isMediaFlowingIn(mediaType: MediaType, sinkMediaDescription: String, callbackopt: Callback[Boolean]): js.Promise[Boolean] = js.native
  def isMediaFlowingIn(mediaType: MediaType, sinkMediaDescription: Unit, callbackopt: Callback[Boolean]): js.Promise[Boolean] = js.native
  
  def isMediaFlowingOut(mediaType: MediaType): js.Promise[Boolean] = js.native
  def isMediaFlowingOut(mediaType: MediaType, sinkMediaDescription: String): js.Promise[Boolean] = js.native
  def isMediaFlowingOut(mediaType: MediaType, sinkMediaDescription: String, callbackopt: Callback[Boolean]): js.Promise[Boolean] = js.native
  def isMediaFlowingOut(mediaType: MediaType, sinkMediaDescription: Unit, callbackopt: Callback[Boolean]): js.Promise[Boolean] = js.native
  
  @JSName("on")
  def on_ElementConnected(eventName: ElementConnected, callback: js.Function1[/* event */ EventElementConnectedsink, Unit]): MediaElement = js.native
  @JSName("on")
  def on_ElementDisconnected(
    eventName: ElementDisconnected,
    callback: js.Function1[/* event */ EventElementDisconnecteds, Unit]
  ): MediaElement = js.native
  @JSName("on")
  def on_MediaFlowInStateChange(
    eventName: MediaFlowInStateChange,
    callback: js.Function1[/* event */ EventMediaFlowInStateChan, Unit]
  ): MediaElement = js.native
  @JSName("on")
  def on_MediaFlowOutStateChange(
    eventName: MediaFlowOutStateChange,
    callback: js.Function1[/* event */ EventMediaFlowOutStateCha, Unit]
  ): MediaElement = js.native
  @JSName("on")
  def on_MediaTranscodingStateChange(
    eventName: MediaTranscodingStateChange,
    callback: js.Function1[/* event */ EventMediaTranscodingStat, Unit]
  ): MediaElement = js.native
}

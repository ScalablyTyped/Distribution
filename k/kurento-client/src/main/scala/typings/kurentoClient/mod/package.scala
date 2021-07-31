package typings.kurentoClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type Callback[T] = js.Function2[/* error */ typings.kurentoClient.mod.Error, /* result */ T, scala.Unit]

// interface Endpoint extends MediaElement {}
type Endpoint = typings.kurentoClient.mod.MediaElement

type Event[T /* <: java.lang.String */, E /* <: js.Object */] = typings.kurentoClient.mod.BaseEvent[T] & E

type MediaServer = typings.kurentoClient.mod.ServerManager

// interface SdpEndpoint extends SessionEndpoint {}
type SdpEndpoint = typings.kurentoClient.mod.SessionEndpoint

// interface SessionEndpoint extends Endpoint {}
type SessionEndpoint = typings.kurentoClient.mod.Endpoint

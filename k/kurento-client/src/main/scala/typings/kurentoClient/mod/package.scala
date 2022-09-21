package typings.kurentoClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type Callback[T] = js.Function2[/* error */ Error, /* result */ T, Unit]

// tslint:disable-next-line
type Composite = Hub

// interface Endpoint extends MediaElement {}
type Endpoint = MediaElement

type Event[T /* <: String */, E /* <: js.Object */] = BaseEvent[T] & E

// tslint:disable-next-line
type HubPort = MediaElement

type MediaServer = ServerManager

// interface SessionEndpoint extends Endpoint {}
type SessionEndpoint = Endpoint

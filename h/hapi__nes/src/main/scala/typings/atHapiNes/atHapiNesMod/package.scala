package typings.atHapiNes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atHapiNesMod {
  /**
    * TODO (if possible) use a drier, more robust way of doing this that
    * allows for:
    *      * the export to have be of type Hapi.PluginFunction whilst
    *      * also exposing the Client type
    *      * exporting the NesClient as the Client class without having to
    *          duplicate the constructor definition
    *      * and all the type exports from the NesClient namespace (Handler,
    *          ClientOptions, ClientConnectOptions, ClientRequestOptions,
    *          ClientSubscribeFlags)
    */
  type Client = typings.atHapiNes.libClientMod.Client
  type ClientConnectOptions = typings.atHapiNes.libClientMod.Client.ClientConnectOptions
  type ClientOptions = typings.atHapiNes.libClientMod.Client.ClientOptions
  type ClientRequestOptions = typings.atHapiNes.libClientMod.Client.ClientRequestOptions
  type ClientSubscribeFlags = typings.atHapiNes.libClientMod.Client.ClientSubscribeFlags
  type Handler = typings.atHapiNes.libClientMod.Client.Handler
  type ServerOnSubscribe = ServerOnSubscribeWithParams | ServerOnSubscribeWithoutParams
  type ServerOnSubscribeWithParams = js.Function3[/* socket */ Socket, /* path */ String, /* params */ js.Any, js.Promise[js.Any]]
  type ServerOnSubscribeWithoutParams = js.Function2[/* socket */ Socket, /* path */ String, js.Promise[js.Any]]
  type ServerOnUnSubscribe = ServerOnUnSubscribeWithParams | ServerOnUnSubscribeWithoutParams
  type ServerOnUnSubscribeWithParams = js.Function3[/* socket */ Socket, /* path */ String, /* params */ js.Any, Unit]
  type ServerOnUnSubscribeWithoutParams = js.Function2[/* socket */ Socket, /* path */ String, Unit]
}

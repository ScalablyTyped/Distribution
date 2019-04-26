package typings
package atHapiNesLib

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
  type Client = atHapiNesLib.clientMod.^
  type ClientConnectOptions = atHapiNesLib.clientMod.ClientConnectOptions
  type ClientOptions = atHapiNesLib.clientMod.ClientOptions
  type ClientRequestOptions = atHapiNesLib.clientMod.ClientRequestOptions
  type ClientSubscribeFlags = atHapiNesLib.clientMod.ClientSubscribeFlags
  type Handler = atHapiNesLib.clientMod.Handler
  type ServerOnSubscribe = ServerOnSubscribeWithParams | ServerOnSubscribeWithoutParams
  type ServerOnSubscribeWithParams = js.Function3[
    /* socket */ Socket, 
    /* path */ java.lang.String, 
    /* params */ js.Any, 
    js.Promise[js.Any]
  ]
  type ServerOnSubscribeWithoutParams = js.Function2[/* socket */ Socket, /* path */ java.lang.String, js.Promise[js.Any]]
  type ServerOnUnSubscribe = ServerOnUnSubscribeWithParams | ServerOnUnSubscribeWithoutParams
  type ServerOnUnSubscribeWithParams = js.Function3[/* socket */ Socket, /* path */ java.lang.String, /* params */ js.Any, scala.Unit]
  type ServerOnUnSubscribeWithoutParams = js.Function2[/* socket */ Socket, /* path */ java.lang.String, scala.Unit]
}

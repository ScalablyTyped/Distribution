package typings.hapiNes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
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
  type Client = typings.hapiNes.clientMod.Client
  
  type ClientConnectOptions = typings.hapiNes.clientMod.Client.ClientConnectOptions
  
  type ClientOptions = typings.hapiNes.clientMod.Client.ClientOptions
  
  type ClientRequestOptions = typings.hapiNes.clientMod.Client.ClientRequestOptions
  
  type ClientSubscribeFlags = typings.hapiNes.clientMod.Client.ClientSubscribeFlags
  
  type Handler = typings.hapiNes.clientMod.Client.Handler
  
  type ServerOnSubscribe = typings.hapiNes.mod.ServerOnSubscribeWithParams | typings.hapiNes.mod.ServerOnSubscribeWithoutParams
  
  type ServerOnSubscribeWithParams = js.Function3[
    /* socket */ typings.hapiNes.mod.Socket, 
    /* path */ java.lang.String, 
    /* params */ js.Any, 
    js.Promise[js.Any]
  ]
  
  type ServerOnSubscribeWithoutParams = js.Function2[
    /* socket */ typings.hapiNes.mod.Socket, 
    /* path */ java.lang.String, 
    js.Promise[js.Any]
  ]
  
  type ServerOnUnSubscribe = typings.hapiNes.mod.ServerOnUnSubscribeWithParams | typings.hapiNes.mod.ServerOnUnSubscribeWithoutParams
  
  type ServerOnUnSubscribeWithParams = js.Function3[
    /* socket */ typings.hapiNes.mod.Socket, 
    /* path */ java.lang.String, 
    /* params */ js.Any, 
    scala.Unit
  ]
  
  type ServerOnUnSubscribeWithoutParams = js.Function2[/* socket */ typings.hapiNes.mod.Socket, /* path */ java.lang.String, scala.Unit]
}

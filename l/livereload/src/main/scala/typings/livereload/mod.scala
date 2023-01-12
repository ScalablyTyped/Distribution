package typings.livereload

import org.scalablytyped.runtime.Instantiable1
import typings.node.eventsMod.EventEmitter
import typings.node.fsMod.FSWatcher
import typings.node.httpsMod.ServerOptions
import typings.node.nodeColonhttpMod.IncomingMessage
import typings.node.nodeColonhttpMod.ServerResponse
import typings.node.nodeColonnetMod.Socket
import typings.ws.mod.Server
import typings.ws.mod.WebSocket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("livereload", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("livereload", "LiveReloadServer")
  @js.native
  open class LiveReloadServer () extends EventEmitter {
    def this(config: ServerConfig) = this()
    
    def alert(message: String): Unit = js.native
    
    def close(): Unit = js.native
    
    var config: ServerConfig = js.native
    
    def debug(message: String): Unit = js.native
    
    def filterRefresh(filepath: String): Unit = js.native
    
    def listen(): Unit = js.native
    def listen(callback: js.Function0[Unit]): Unit = js.native
    
    def onClose(): Unit = js.native
    def onClose(socket: WebSocket): Unit = js.native
    
    def onConnection(): Unit = js.native
    def onConnection(socket: WebSocket): Unit = js.native
    
    def onError(err: js.Error): Unit = js.native
    
    def refresh(filepath: String): Unit = js.native
    
    def sendAllClients(data: String): Unit = js.native
    
    var server: Server[WebSocket] = js.native
    
    /** Specify path(s) to watch */
    def watch(paths: String): Unit = js.native
    def watch(paths: js.Array[String]): Unit = js.native
    
    var watcher: FSWatcher = js.native
  }
  
  inline def createServer(): LiveReloadServer = ^.asInstanceOf[js.Dynamic].applyDynamic("createServer")().asInstanceOf[LiveReloadServer]
  inline def createServer(config: Unit, callback: js.Function0[Unit]): LiveReloadServer = (^.asInstanceOf[js.Dynamic].applyDynamic("createServer")(config.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[LiveReloadServer]
  inline def createServer(config: CreateServerConfig): LiveReloadServer = ^.asInstanceOf[js.Dynamic].applyDynamic("createServer")(config.asInstanceOf[js.Any]).asInstanceOf[LiveReloadServer]
  inline def createServer(config: CreateServerConfig, callback: js.Function0[Unit]): LiveReloadServer = (^.asInstanceOf[js.Dynamic].applyDynamic("createServer")(config.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[LiveReloadServer]
  
  trait CreateServerConfig
    extends StObject
       with ServerConfig {
    
    var https: js.UndefOr[
        ServerOptions[
          Instantiable1[/* socket */ Socket, IncomingMessage], 
          Instantiable1[
            /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
            ServerResponse[typings.node.httpMod.IncomingMessage]
          ]
        ]
      ] = js.undefined
    
    var noListen: js.UndefOr[Boolean] = js.undefined
  }
  object CreateServerConfig {
    
    inline def apply(): CreateServerConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateServerConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CreateServerConfig] (val x: Self) extends AnyVal {
      
      inline def setHttps(
        value: ServerOptions[
              Instantiable1[/* socket */ Socket, IncomingMessage], 
              Instantiable1[
                /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
                ServerResponse[typings.node.httpMod.IncomingMessage]
              ]
            ]
      ): Self = StObject.set(x, "https", value.asInstanceOf[js.Any])
      
      inline def setHttpsUndefined: Self = StObject.set(x, "https", js.undefined)
      
      inline def setNoListen(value: Boolean): Self = StObject.set(x, "noListen", value.asInstanceOf[js.Any])
      
      inline def setNoListenUndefined: Self = StObject.set(x, "noListen", js.undefined)
    }
  }
  
  trait ServerConfig extends StObject {
    
    var applyCSSLive: js.UndefOr[Boolean] = js.undefined
    
    var applyImgLive: js.UndefOr[Boolean] = js.undefined
    
    /** Logs debug messages to console */
    var debug: js.UndefOr[Boolean] = js.undefined
    
    /** ms to delay browser refresh */
    var delay: js.UndefOr[Double] = js.undefined
    
    /** Extensions to not watch */
    var exclusions: js.UndefOr[js.Array[js.RegExp]] = js.undefined
    
    var extraExts: js.UndefOr[js.Array[String]] = js.undefined
    
    /** File Extensions to watch */
    var exts: js.UndefOr[js.Array[String]] = js.undefined
    
    var originalPath: js.UndefOr[String] = js.undefined
    
    var overrideURL: js.UndefOr[String] = js.undefined
    
    /** Sets server port number: Defaults to 35729 */
    var port: js.UndefOr[Double] = js.undefined
    
    var server: js.UndefOr[
        (typings.node.httpMod.Server[
          Instantiable1[/* socket */ Socket, typings.node.httpMod.IncomingMessage], 
          Instantiable1[
            /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
            typings.node.httpMod.ServerResponse[typings.node.httpMod.IncomingMessage]
          ]
        ]) | (typings.node.httpsMod.Server[
          Instantiable1[/* socket */ Socket, IncomingMessage], 
          Instantiable1[
            /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
            ServerResponse[typings.node.httpMod.IncomingMessage]
          ]
        ])
      ] = js.undefined
    
    var usePolling: js.UndefOr[Boolean] = js.undefined
    
    /** Protocol Version defaults to "7" */
    var version: js.UndefOr[String] = js.undefined
  }
  object ServerConfig {
    
    inline def apply(): ServerConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ServerConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ServerConfig] (val x: Self) extends AnyVal {
      
      inline def setApplyCSSLive(value: Boolean): Self = StObject.set(x, "applyCSSLive", value.asInstanceOf[js.Any])
      
      inline def setApplyCSSLiveUndefined: Self = StObject.set(x, "applyCSSLive", js.undefined)
      
      inline def setApplyImgLive(value: Boolean): Self = StObject.set(x, "applyImgLive", value.asInstanceOf[js.Any])
      
      inline def setApplyImgLiveUndefined: Self = StObject.set(x, "applyImgLive", js.undefined)
      
      inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      inline def setExclusions(value: js.Array[js.RegExp]): Self = StObject.set(x, "exclusions", value.asInstanceOf[js.Any])
      
      inline def setExclusionsUndefined: Self = StObject.set(x, "exclusions", js.undefined)
      
      inline def setExclusionsVarargs(value: js.RegExp*): Self = StObject.set(x, "exclusions", js.Array(value*))
      
      inline def setExtraExts(value: js.Array[String]): Self = StObject.set(x, "extraExts", value.asInstanceOf[js.Any])
      
      inline def setExtraExtsUndefined: Self = StObject.set(x, "extraExts", js.undefined)
      
      inline def setExtraExtsVarargs(value: String*): Self = StObject.set(x, "extraExts", js.Array(value*))
      
      inline def setExts(value: js.Array[String]): Self = StObject.set(x, "exts", value.asInstanceOf[js.Any])
      
      inline def setExtsUndefined: Self = StObject.set(x, "exts", js.undefined)
      
      inline def setExtsVarargs(value: String*): Self = StObject.set(x, "exts", js.Array(value*))
      
      inline def setOriginalPath(value: String): Self = StObject.set(x, "originalPath", value.asInstanceOf[js.Any])
      
      inline def setOriginalPathUndefined: Self = StObject.set(x, "originalPath", js.undefined)
      
      inline def setOverrideURL(value: String): Self = StObject.set(x, "overrideURL", value.asInstanceOf[js.Any])
      
      inline def setOverrideURLUndefined: Self = StObject.set(x, "overrideURL", js.undefined)
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      inline def setServer(
        value: (typings.node.httpMod.Server[
              Instantiable1[/* socket */ Socket, typings.node.httpMod.IncomingMessage], 
              Instantiable1[
                /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
                typings.node.httpMod.ServerResponse[typings.node.httpMod.IncomingMessage]
              ]
            ]) | (typings.node.httpsMod.Server[
              Instantiable1[/* socket */ Socket, IncomingMessage], 
              Instantiable1[
                /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
                ServerResponse[typings.node.httpMod.IncomingMessage]
              ]
            ])
      ): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
      
      inline def setServerUndefined: Self = StObject.set(x, "server", js.undefined)
      
      inline def setUsePolling(value: Boolean): Self = StObject.set(x, "usePolling", value.asInstanceOf[js.Any])
      
      inline def setUsePollingUndefined: Self = StObject.set(x, "usePolling", js.undefined)
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
}

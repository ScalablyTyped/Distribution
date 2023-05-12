package typings.libp2pTcp

import typings.libp2pInterfaceConnection.mod.Connection
import typings.libp2pInterfaceMetrics.mod.CounterGroup
import typings.libp2pInterfaceMetrics.mod.MetricGroup
import typings.libp2pInterfaceMetrics.mod.Metrics
import typings.libp2pInterfaceTransport.mod.Listener
import typings.libp2pInterfaceTransport.mod.Upgrader
import typings.libp2pTcp.mod.TCPCreateListenerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcListenerMod {
  
  @JSImport("@libp2p/tcp/dist/src/listener", "TCPListener")
  @js.native
  open class TCPListener protected () extends Listener {
    def this(context: Context) = this()
    
    /* private */ var addr: Any = js.native
    
    /** Keep track of open connections to destroy in case of timeout */
    /* private */ val connections: Any = js.native
    
    /* private */ val context: Any = js.native
    
    /* private */ var metrics: Any = js.native
    
    /* private */ var netClose: Any = js.native
    
    /* private */ var netListen: Any = js.native
    
    /* private */ var onSocket: Any = js.native
    
    /* private */ val server: Any = js.native
    
    /* private */ var status: Any = js.native
  }
  
  trait CloseServerOnMaxConnectionsOpts extends StObject {
    
    /** Close server once connection count is greater than or equal to `closeAbove` */
    var closeAbove: Double
    
    /** Server listens once connection count is less than `listenBelow` */
    var listenBelow: Double
    
    var onListenError: js.UndefOr[js.Function1[/* err */ js.Error, Unit]] = js.undefined
  }
  object CloseServerOnMaxConnectionsOpts {
    
    inline def apply(closeAbove: Double, listenBelow: Double): CloseServerOnMaxConnectionsOpts = {
      val __obj = js.Dynamic.literal(closeAbove = closeAbove.asInstanceOf[js.Any], listenBelow = listenBelow.asInstanceOf[js.Any])
      __obj.asInstanceOf[CloseServerOnMaxConnectionsOpts]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CloseServerOnMaxConnectionsOpts] (val x: Self) extends AnyVal {
      
      inline def setCloseAbove(value: Double): Self = StObject.set(x, "closeAbove", value.asInstanceOf[js.Any])
      
      inline def setListenBelow(value: Double): Self = StObject.set(x, "listenBelow", value.asInstanceOf[js.Any])
      
      inline def setOnListenError(value: /* err */ js.Error => Unit): Self = StObject.set(x, "onListenError", js.Any.fromFunction1(value))
      
      inline def setOnListenErrorUndefined: Self = StObject.set(x, "onListenError", js.undefined)
    }
  }
  
  trait Context
    extends StObject
       with TCPCreateListenerOptions {
    
    var backlog: js.UndefOr[Double] = js.undefined
    
    var closeServerOnMaxConnections: js.UndefOr[CloseServerOnMaxConnectionsOpts] = js.undefined
    
    @JSName("handler")
    var handler_Context: js.UndefOr[js.Function1[/* conn */ Connection, Unit]] = js.undefined
    
    var maxConnections: js.UndefOr[Double] = js.undefined
    
    var metrics: js.UndefOr[Metrics] = js.undefined
    
    var socketCloseTimeout: js.UndefOr[Double] = js.undefined
    
    var socketInactivityTimeout: js.UndefOr[Double] = js.undefined
  }
  object Context {
    
    inline def apply(upgrader: Upgrader): Context = {
      val __obj = js.Dynamic.literal(upgrader = upgrader.asInstanceOf[js.Any])
      __obj.asInstanceOf[Context]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Context] (val x: Self) extends AnyVal {
      
      inline def setBacklog(value: Double): Self = StObject.set(x, "backlog", value.asInstanceOf[js.Any])
      
      inline def setBacklogUndefined: Self = StObject.set(x, "backlog", js.undefined)
      
      inline def setCloseServerOnMaxConnections(value: CloseServerOnMaxConnectionsOpts): Self = StObject.set(x, "closeServerOnMaxConnections", value.asInstanceOf[js.Any])
      
      inline def setCloseServerOnMaxConnectionsUndefined: Self = StObject.set(x, "closeServerOnMaxConnections", js.undefined)
      
      inline def setHandler(value: /* conn */ Connection => Unit): Self = StObject.set(x, "handler", js.Any.fromFunction1(value))
      
      inline def setHandlerUndefined: Self = StObject.set(x, "handler", js.undefined)
      
      inline def setMaxConnections(value: Double): Self = StObject.set(x, "maxConnections", value.asInstanceOf[js.Any])
      
      inline def setMaxConnectionsUndefined: Self = StObject.set(x, "maxConnections", js.undefined)
      
      inline def setMetrics(value: Metrics): Self = StObject.set(x, "metrics", value.asInstanceOf[js.Any])
      
      inline def setMetricsUndefined: Self = StObject.set(x, "metrics", js.undefined)
      
      inline def setSocketCloseTimeout(value: Double): Self = StObject.set(x, "socketCloseTimeout", value.asInstanceOf[js.Any])
      
      inline def setSocketCloseTimeoutUndefined: Self = StObject.set(x, "socketCloseTimeout", js.undefined)
      
      inline def setSocketInactivityTimeout(value: Double): Self = StObject.set(x, "socketInactivityTimeout", value.asInstanceOf[js.Any])
      
      inline def setSocketInactivityTimeoutUndefined: Self = StObject.set(x, "socketInactivityTimeout", js.undefined)
    }
  }
  
  trait TCPListenerMetrics extends StObject {
    
    var errors: CounterGroup
    
    var events: CounterGroup
    
    var status: MetricGroup
  }
  object TCPListenerMetrics {
    
    inline def apply(errors: CounterGroup, events: CounterGroup, status: MetricGroup): TCPListenerMetrics = {
      val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], events = events.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[TCPListenerMetrics]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TCPListenerMetrics] (val x: Self) extends AnyVal {
      
      inline def setErrors(value: CounterGroup): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      inline def setEvents(value: CounterGroup): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: MetricGroup): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
}

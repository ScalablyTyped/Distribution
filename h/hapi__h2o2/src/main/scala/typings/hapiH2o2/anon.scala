package typings.hapiH2o2

import typings.hapiWreck.anon.PromiseIncomingMessagereq
import typings.hapiWreck.mod.Client
import typings.hapiWreck.mod.Client.Agents
import typings.hapiWreck.mod.Client.Events
import typings.hapiWreck.mod.Client.Options
import typings.hapiWreck.mod.Client.parseCacheControl.Parameters
import typings.hapiWreck.mod.Client.request.Response
import typings.hapiWreck.mod.Client.toReadableStream.Payload
import typings.node.bufferMod.global.Buffer
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<@hapi/wreck.@hapi/wreck.Client> */
  trait PartialClient extends StObject {
    
    var agents: js.UndefOr[Agents] = js.undefined
    
    var defaults: js.UndefOr[js.Function1[/* options */ Options, Client]] = js.undefined
    
    var delete: js.UndefOr[js.Function1[/* uri */ String, js.Promise[Response[Any]]]] = js.undefined
    
    var events: js.UndefOr[Events] = js.undefined
    
    var get: js.UndefOr[js.Function1[/* uri */ String, js.Promise[Response[Any]]]] = js.undefined
    
    var parseCacheControl: js.UndefOr[js.Function1[/* field */ String, Parameters | Null]] = js.undefined
    
    var patch: js.UndefOr[js.Function1[/* uri */ String, js.Promise[Response[Any]]]] = js.undefined
    
    var post: js.UndefOr[js.Function1[/* uri */ String, js.Promise[Response[Any]]]] = js.undefined
    
    var put: js.UndefOr[js.Function1[/* uri */ String, js.Promise[Response[Any]]]] = js.undefined
    
    var read: js.UndefOr[js.Function1[/* res */ Readable, js.Promise[Buffer]]] = js.undefined
    
    var request: js.UndefOr[js.Function2[/* method */ String, /* url */ String, PromiseIncomingMessagereq]] = js.undefined
    
    var toReadableStream: js.UndefOr[js.Function1[/* payload */ Payload, Readable]] = js.undefined
  }
  object PartialClient {
    
    inline def apply(): PartialClient = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialClient]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialClient] (val x: Self) extends AnyVal {
      
      inline def setAgents(value: Agents): Self = StObject.set(x, "agents", value.asInstanceOf[js.Any])
      
      inline def setAgentsUndefined: Self = StObject.set(x, "agents", js.undefined)
      
      inline def setDefaults(value: /* options */ Options => Client): Self = StObject.set(x, "defaults", js.Any.fromFunction1(value))
      
      inline def setDefaultsUndefined: Self = StObject.set(x, "defaults", js.undefined)
      
      inline def setDelete(value: /* uri */ String => js.Promise[Response[Any]]): Self = StObject.set(x, "delete", js.Any.fromFunction1(value))
      
      inline def setDeleteUndefined: Self = StObject.set(x, "delete", js.undefined)
      
      inline def setEvents(value: Events): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      inline def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
      
      inline def setGet(value: /* uri */ String => js.Promise[Response[Any]]): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      inline def setGetUndefined: Self = StObject.set(x, "get", js.undefined)
      
      inline def setParseCacheControl(value: /* field */ String => Parameters | Null): Self = StObject.set(x, "parseCacheControl", js.Any.fromFunction1(value))
      
      inline def setParseCacheControlUndefined: Self = StObject.set(x, "parseCacheControl", js.undefined)
      
      inline def setPatch(value: /* uri */ String => js.Promise[Response[Any]]): Self = StObject.set(x, "patch", js.Any.fromFunction1(value))
      
      inline def setPatchUndefined: Self = StObject.set(x, "patch", js.undefined)
      
      inline def setPost(value: /* uri */ String => js.Promise[Response[Any]]): Self = StObject.set(x, "post", js.Any.fromFunction1(value))
      
      inline def setPostUndefined: Self = StObject.set(x, "post", js.undefined)
      
      inline def setPut(value: /* uri */ String => js.Promise[Response[Any]]): Self = StObject.set(x, "put", js.Any.fromFunction1(value))
      
      inline def setPutUndefined: Self = StObject.set(x, "put", js.undefined)
      
      inline def setRead(value: /* res */ Readable => js.Promise[Buffer]): Self = StObject.set(x, "read", js.Any.fromFunction1(value))
      
      inline def setReadUndefined: Self = StObject.set(x, "read", js.undefined)
      
      inline def setRequest(value: (/* method */ String, /* url */ String) => PromiseIncomingMessagereq): Self = StObject.set(x, "request", js.Any.fromFunction2(value))
      
      inline def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
      
      inline def setToReadableStream(value: /* payload */ Payload => Readable): Self = StObject.set(x, "toReadableStream", js.Any.fromFunction1(value))
      
      inline def setToReadableStreamUndefined: Self = StObject.set(x, "toReadableStream", js.undefined)
    }
  }
}

package typings.jeeJsf

import typings.jeeJsf.jsf.ajax.RequestData
import typings.jeeJsf.jsf.ajax.RequestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object jsf {
    
    object ajax {
      
      @JSGlobal("jsf.ajax")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Register a callback for error handling.
        * @param callback a reference to a function to call on an error
        */
      inline def addOnError(callback: js.Function1[/* data */ RequestData, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addOnError")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      /**
        * Register a callback for event handling.
        * @param callback a reference to a function to call on an event
        */
      inline def addOnEvent(callback: js.Function1[/* data */ RequestData, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addOnEvent")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      /**
        * Send an asynchronous Ajax request to the server.
        * @param source The DOM element that triggered this Ajax request, or an id string of the element to use as the triggering element.
        * @param event The DOM event that triggered this Ajax request. The event argument is optional.
        * @param options The set of available options that can be sent as request parameters to control client and/or server side request processing.
        */
      inline def request(source: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("request")(source.asInstanceOf[js.Any]).asInstanceOf[Unit]
      inline def request(source: Any, event: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(source.asInstanceOf[js.Any], event.asInstanceOf[js.Any])).asInstanceOf[Unit]
      inline def request(source: Any, event: String, options: RequestOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(source.asInstanceOf[js.Any], event.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
      inline def request(source: Any, event: Unit, options: RequestOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(source.asInstanceOf[js.Any], event.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      /**
        * Receive an Ajax response from the server.
        * @param request The XMLHttpRequest instance that contains the status code and response message from the server.
        * @param context An object containing the request context, including the following properties: the source element, per call onerror callback function, and per call onevent callback function.
        * @throws EmptyResponse error if request contains no data
        */
      inline def response(request: Any, context: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("response")(request.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Unit]
    }
  }
}

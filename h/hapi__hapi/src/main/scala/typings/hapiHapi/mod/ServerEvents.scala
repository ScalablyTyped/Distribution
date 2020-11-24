package typings.hapiHapi.mod

import typings.hapiHapi.hapiHapiStrings.log
import typings.hapiHapi.hapiHapiStrings.request
import typings.hapiHapi.hapiHapiStrings.response
import typings.hapiHapi.hapiHapiStrings.route
import typings.hapiHapi.hapiHapiStrings.start
import typings.hapiHapi.hapiHapiStrings.stop
import typings.hapiPodium.mod.Podium
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServerEvents extends Podium {
  
  /**
    * Subscribe to an event where:
    * @param criteria - the subscription criteria which must be one of:
    * * event name string which can be any of the built-in server events
    * * a custom application event registered with server.event().
    * * a criteria object
    * @param listener - the handler method set to receive event updates. The function signature depends on the event argument, and the spread and tags options.
    * @return Return value: none.
    * [See docs](https://github.com/hapijs/hapi/blob/master/API.md#-servereventsoncriteria-listener)
    * See ['log' event](https://github.com/hapijs/hapi/blob/master/API.md#-log-event)
    * See ['request' event](https://github.com/hapijs/hapi/blob/master/API.md#-request-event)
    * See ['response' event](https://github.com/hapijs/hapi/blob/master/API.md#-response-event)
    * See ['route' event](https://github.com/hapijs/hapi/blob/master/API.md#-route-event)
    * See ['start' event](https://github.com/hapijs/hapi/blob/master/API.md#-start-event)
    * See ['stop' event](https://github.com/hapijs/hapi/blob/master/API.md#-stop-event)
    */
  @JSName("on")
  def on_log(criteria: log, listener: LogEventHandler): Unit = js.native
  @JSName("on")
  def on_log(criteria: ServerEventCriteria[log], listener: LogEventHandler): Unit = js.native
  @JSName("on")
  def on_request(criteria: request, listener: RequestEventHandler): Unit = js.native
  @JSName("on")
  def on_request(criteria: ServerEventCriteria[request], listener: RequestEventHandler): Unit = js.native
  @JSName("on")
  def on_response(criteria: response, listener: ResponseEventHandler): Unit = js.native
  @JSName("on")
  def on_response(criteria: ServerEventCriteria[response], listener: ResponseEventHandler): Unit = js.native
  @JSName("on")
  def on_route(criteria: route, listener: RouteEventHandler): Unit = js.native
  @JSName("on")
  def on_route(criteria: ServerEventCriteria[route], listener: RouteEventHandler): Unit = js.native
  @JSName("on")
  def on_start(criteria: start, listener: StartEventHandler): Unit = js.native
  @JSName("on")
  def on_start(criteria: ServerEventCriteria[start], listener: StartEventHandler): Unit = js.native
  @JSName("on")
  def on_stop(criteria: stop, listener: StopEventHandler): Unit = js.native
  @JSName("on")
  def on_stop(criteria: ServerEventCriteria[stop], listener: StopEventHandler): Unit = js.native
  
  /**
    * Same as calling server.events.on() with the count option set to 1.
    * @param criteria - the subscription criteria which must be one of:
    * * event name string which can be any of the built-in server events
    * * a custom application event registered with server.event().
    * * a criteria object
    * @return Return value: a promise that resolves when the event is emitted.
    * [See docs](https://github.com/hapijs/hapi/blob/master/API.md#-await-servereventsoncecriteria)
    */
  def once(criteria: String): js.Promise[_] = js.native
  def once(criteria: ServerEventCriteria[String]): js.Promise[_] = js.native
  /**
    * Same as calling [server.events.on()](https://github.com/hapijs/hapi/blob/master/API.md#server.events.on()) with the count option set to 1.
    * @param criteria - the subscription criteria which must be one of:
    * * event name string which can be any of the built-in server events
    * * a custom application event registered with server.event().
    * * a criteria object
    * @param listener - the handler method set to receive event updates. The function signature depends on the event argument, and the spread and tags options.
    * @return Return value: none.
    * [See docs](https://github.com/hapijs/hapi/blob/master/API.md#-servereventsoncecriteria-listener)
    */
  @JSName("once")
  def once_log(criteria: log, listener: LogEventHandler): Unit = js.native
  @JSName("once")
  def once_log(criteria: ServerEventCriteria[log], listener: LogEventHandler): Unit = js.native
  @JSName("once")
  def once_request(criteria: request, listener: RequestEventHandler): Unit = js.native
  @JSName("once")
  def once_request(criteria: ServerEventCriteria[request], listener: RequestEventHandler): Unit = js.native
  @JSName("once")
  def once_response(criteria: response, listener: ResponseEventHandler): Unit = js.native
  @JSName("once")
  def once_response(criteria: ServerEventCriteria[response], listener: ResponseEventHandler): Unit = js.native
  @JSName("once")
  def once_route(criteria: route, listener: RouteEventHandler): Unit = js.native
  @JSName("once")
  def once_route(criteria: ServerEventCriteria[route], listener: RouteEventHandler): Unit = js.native
  @JSName("once")
  def once_start(criteria: start, listener: StartEventHandler): Unit = js.native
  @JSName("once")
  def once_start(criteria: ServerEventCriteria[start], listener: StartEventHandler): Unit = js.native
  @JSName("once")
  def once_stop(criteria: stop, listener: StopEventHandler): Unit = js.native
  @JSName("once")
  def once_stop(criteria: ServerEventCriteria[stop], listener: StopEventHandler): Unit = js.native
}

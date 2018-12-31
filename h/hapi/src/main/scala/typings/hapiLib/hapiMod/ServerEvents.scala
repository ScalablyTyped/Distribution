package typings
package hapiLib.hapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServerEvents
  extends podiumLib.podiumMod.Podium {
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
  def on_log(criteria: hapiLib.hapiLibStrings.log, listener: LogEventHandler): scala.Unit = js.native
  @JSName("on")
  def on_log(criteria: ServerEventCriteria[hapiLib.hapiLibStrings.log], listener: LogEventHandler): scala.Unit = js.native
  @JSName("on")
  def on_request(criteria: hapiLib.hapiLibStrings.request, listener: RequestEventHandler): scala.Unit = js.native
  @JSName("on")
  def on_request(criteria: ServerEventCriteria[hapiLib.hapiLibStrings.request], listener: RequestEventHandler): scala.Unit = js.native
  @JSName("on")
  def on_response(criteria: hapiLib.hapiLibStrings.response, listener: ResponseEventHandler): scala.Unit = js.native
  @JSName("on")
  def on_response(criteria: ServerEventCriteria[hapiLib.hapiLibStrings.response], listener: ResponseEventHandler): scala.Unit = js.native
  @JSName("on")
  def on_route(criteria: hapiLib.hapiLibStrings.route, listener: RouteEventHandler): scala.Unit = js.native
  @JSName("on")
  def on_route(criteria: ServerEventCriteria[hapiLib.hapiLibStrings.route], listener: RouteEventHandler): scala.Unit = js.native
  @JSName("on")
  def on_start(criteria: hapiLib.hapiLibStrings.start, listener: StartEventHandler): scala.Unit = js.native
  @JSName("on")
  def on_start(criteria: ServerEventCriteria[hapiLib.hapiLibStrings.start], listener: StartEventHandler): scala.Unit = js.native
  @JSName("on")
  def on_stop(criteria: hapiLib.hapiLibStrings.stop, listener: StopEventHandler): scala.Unit = js.native
  @JSName("on")
  def on_stop(criteria: ServerEventCriteria[hapiLib.hapiLibStrings.stop], listener: StopEventHandler): scala.Unit = js.native
  def once(criteria: ServerEventCriteria[java.lang.String]): js.Promise[_] = js.native
  /**
    * Same as calling server.events.on() with the count option set to 1.
    * @param criteria - the subscription criteria which must be one of:
    * * event name string which can be any of the built-in server events
    * * a custom application event registered with server.event().
    * * a criteria object
    * @return Return value: a promise that resolves when the event is emitted.
    * [See docs](https://github.com/hapijs/hapi/blob/master/API.md#-await-servereventsoncecriteria)
    */
  def once(criteria: java.lang.String): js.Promise[_] = js.native
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
  def once_log(criteria: hapiLib.hapiLibStrings.log, listener: LogEventHandler): scala.Unit = js.native
  @JSName("once")
  def once_log(criteria: ServerEventCriteria[hapiLib.hapiLibStrings.log], listener: LogEventHandler): scala.Unit = js.native
  @JSName("once")
  def once_request(criteria: hapiLib.hapiLibStrings.request, listener: RequestEventHandler): scala.Unit = js.native
  @JSName("once")
  def once_request(criteria: ServerEventCriteria[hapiLib.hapiLibStrings.request], listener: RequestEventHandler): scala.Unit = js.native
  @JSName("once")
  def once_response(criteria: hapiLib.hapiLibStrings.response, listener: ResponseEventHandler): scala.Unit = js.native
  @JSName("once")
  def once_response(criteria: ServerEventCriteria[hapiLib.hapiLibStrings.response], listener: ResponseEventHandler): scala.Unit = js.native
  @JSName("once")
  def once_route(criteria: hapiLib.hapiLibStrings.route, listener: RouteEventHandler): scala.Unit = js.native
  @JSName("once")
  def once_route(criteria: ServerEventCriteria[hapiLib.hapiLibStrings.route], listener: RouteEventHandler): scala.Unit = js.native
  @JSName("once")
  def once_start(criteria: hapiLib.hapiLibStrings.start, listener: StartEventHandler): scala.Unit = js.native
  @JSName("once")
  def once_start(criteria: ServerEventCriteria[hapiLib.hapiLibStrings.start], listener: StartEventHandler): scala.Unit = js.native
  @JSName("once")
  def once_stop(criteria: hapiLib.hapiLibStrings.stop, listener: StopEventHandler): scala.Unit = js.native
  @JSName("once")
  def once_stop(criteria: ServerEventCriteria[hapiLib.hapiLibStrings.stop], listener: StopEventHandler): scala.Unit = js.native
}


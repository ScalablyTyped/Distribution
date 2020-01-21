package typings.maquette.interfacesMod

import typings.std.Event_
import typings.std.HTMLElement
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectionOptions extends ProjectorOptions {
  /**
    * May be used to intercept registration of event-handlers.
    *
    * Used by the [[Projector]] to wrap eventHandler-calls to call [[scheduleRender]] as well.
    *
    * @param propertyName             The name of the property to be assigned, for example onclick
    * @param eventHandler             The function that was registered on the [[VNode]]
    * @param domNode                  The real DOM element
    * @param properties               The whole set of properties that was put on the VNode
    * @returns                        The function that is to be placed on the DOM node as the event handler, instead of `eventHandler`.
    */
  var eventHandlerInterceptor: js.UndefOr[EventHandlerInterceptor] = js.undefined
  /**
    * Only for internal use. Used for rendering SVG Nodes.
    */
  val namespace: js.UndefOr[String] = js.undefined
}

object ProjectionOptions {
  @scala.inline
  def apply(
    eventHandlerInterceptor: (/* propertyName */ String, /* eventHandler */ js.Function, /* domNode */ Node, /* properties */ VNodeProperties) => js.UndefOr[js.Function] = null,
    namespace: String = null,
    performanceLogger: (/* eventType */ PerformanceLoggerEvent, /* trigger */ js.UndefOr[Event_]) => Unit = null,
    styleApplyer: (/* domNode */ HTMLElement, /* styleName */ String, /* value */ String) => Unit = null
  ): ProjectionOptions = {
    val __obj = js.Dynamic.literal()
    if (eventHandlerInterceptor != null) __obj.updateDynamic("eventHandlerInterceptor")(js.Any.fromFunction4(eventHandlerInterceptor))
    if (namespace != null) __obj.updateDynamic("namespace")(namespace.asInstanceOf[js.Any])
    if (performanceLogger != null) __obj.updateDynamic("performanceLogger")(js.Any.fromFunction2(performanceLogger))
    if (styleApplyer != null) __obj.updateDynamic("styleApplyer")(js.Any.fromFunction3(styleApplyer))
    __obj.asInstanceOf[ProjectionOptions]
  }
}


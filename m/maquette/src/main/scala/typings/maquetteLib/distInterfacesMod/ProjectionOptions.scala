package typings
package maquetteLib.distInterfacesMod

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
  val namespace: js.UndefOr[java.lang.String] = js.undefined
}

object ProjectionOptions {
  @scala.inline
  def apply(
    eventHandlerInterceptor: EventHandlerInterceptor = null,
    namespace: java.lang.String = null,
    performanceLogger: ProjectorPerformanceLogger = null,
    styleApplyer: js.Function3[
      /* domNode */ stdLib.HTMLElement, 
      /* styleName */ java.lang.String, 
      /* value */ java.lang.String, 
      scala.Unit
    ] = null
  ): ProjectionOptions = {
    val __obj = js.Dynamic.literal()
    if (eventHandlerInterceptor != null) __obj.updateDynamic("eventHandlerInterceptor")(eventHandlerInterceptor)
    if (namespace != null) __obj.updateDynamic("namespace")(namespace)
    if (performanceLogger != null) __obj.updateDynamic("performanceLogger")(performanceLogger)
    if (styleApplyer != null) __obj.updateDynamic("styleApplyer")(styleApplyer)
    __obj.asInstanceOf[ProjectionOptions]
  }
}


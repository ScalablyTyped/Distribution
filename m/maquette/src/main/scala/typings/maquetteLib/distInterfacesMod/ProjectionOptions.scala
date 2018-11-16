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


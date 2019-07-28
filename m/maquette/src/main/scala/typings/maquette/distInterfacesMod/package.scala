package typings.maquette

import typings.std.Event
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distInterfacesMod {
  type EventHandlerInterceptor = js.Function4[
    /* propertyName */ String, 
    /* eventHandler */ js.Function, 
    /* domNode */ Node, 
    /* properties */ VNodeProperties, 
    js.UndefOr[js.Function]
  ]
  type ProjectorPerformanceLogger = js.Function2[/* eventType */ PerformanceLoggerEvent, /* trigger */ js.UndefOr[Event], Unit]
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - typings.maquette.distInterfacesMod.VNode
    - typings.maquette.distInterfacesMod.VNodeChildren
    - typings.maquette.maquetteNumbers.`false`
    - scala.Null
    - `js.undefined`
    - scala.Nothing
  */
  type VNodeChild = js.UndefOr[_VNodeChild | String | Null]
}

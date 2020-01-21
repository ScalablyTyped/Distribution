package typings.maquette

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object interfacesMod {
  type EventHandlerInterceptor = js.Function4[
    /* propertyName */ java.lang.String, 
    /* eventHandler */ js.Function, 
    /* domNode */ typings.std.Node, 
    /* properties */ typings.maquette.interfacesMod.VNodeProperties, 
    js.UndefOr[js.Function]
  ]
  type ProjectorPerformanceLogger = js.Function2[
    /* eventType */ typings.maquette.interfacesMod.PerformanceLoggerEvent, 
    /* trigger */ js.UndefOr[typings.std.Event_], 
    scala.Unit
  ]
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - typings.maquette.interfacesMod.VNode
    - typings.maquette.interfacesMod.VNodeChildren
    - typings.maquette.maquetteBooleans.`false`
    - scala.Null
    - `js.undefined`
  */
  type VNodeChild = js.UndefOr[typings.maquette.interfacesMod._VNodeChild | java.lang.String | scala.Null]
}

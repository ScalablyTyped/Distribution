package typings
package maquetteLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distInterfacesMod {
  type EventHandlerInterceptor = js.Function4[
    /* propertyName */ java.lang.String, 
    /* eventHandler */ js.Function, 
    /* domNode */ stdLib.Node, 
    /* properties */ VNodeProperties, 
    js.UndefOr[js.Function]
  ]
  type ProjectorPerformanceLogger = js.Function2[
    /* eventType */ PerformanceLoggerEvent, 
    /* trigger */ js.UndefOr[stdLib.Event], 
    scala.Unit
  ]
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - VNode
    - VNodeChildren
    - maquetteLib.maquetteLibNumbers.`false`
    - scala.Null
    - `js.undefined`
    - scala.Nothing
  */
  type VNodeChild = js.UndefOr[_VNodeChild | java.lang.String | scala.Null]
}

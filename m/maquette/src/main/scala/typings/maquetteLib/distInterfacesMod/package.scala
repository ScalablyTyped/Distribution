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
  type VNodeChild = js.UndefOr[
    java.lang.String | VNode | VNodeChildren | maquetteLib.maquetteLibNumbers.`false` | scala.Null
  ]
}

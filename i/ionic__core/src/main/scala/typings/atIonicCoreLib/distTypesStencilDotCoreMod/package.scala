package typings
package atIonicCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distTypesStencilDotCoreMod {
  type EventListenerEnable = js.Function5[
    /* instance */ js.Any, 
    /* eventName */ java.lang.String, 
    /* enabled */ scala.Boolean, 
    /* attachTo */ js.UndefOr[java.lang.String | stdLib.Element], 
    /* passive */ js.UndefOr[scala.Boolean], 
    scala.Unit
  ]
  type FunctionalComponent[T] = js.Function3[
    /* props */ T, 
    /* children */ js.Array[FVNode], 
    /* utils */ FunctionalUtilities, 
    FVNode | js.Array[FVNode]
  ]
  type RafCallback = js.Function1[/* timeStamp */ scala.Double, scala.Unit]
}

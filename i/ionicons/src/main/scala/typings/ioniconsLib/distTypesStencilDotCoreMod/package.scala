package typings
package ioniconsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distTypesStencilDotCoreMod {
  type ChildType = VNode | scala.Double | java.lang.String
  type FunctionalComponent[T] = js.Function3[
    /* props */ T, 
    /* children */ js.Array[VNode], 
    /* utils */ FunctionalUtilities, 
    VNode | js.Array[VNode]
  ]
  type PropsType = VNodeProdData | scala.Double | java.lang.String | scala.Null
  type RafCallback = js.Function1[/* timeStamp */ scala.Double, scala.Unit]
}

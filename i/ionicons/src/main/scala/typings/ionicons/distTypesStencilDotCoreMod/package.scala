package typings.ionicons

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distTypesStencilDotCoreMod {
  type ChildType = VNode | Double | String
  type FunctionalComponent[T] = js.Function3[
    /* props */ T, 
    /* children */ js.Array[VNode], 
    /* utils */ FunctionalUtilities, 
    VNode | js.Array[VNode]
  ]
  type PropsType = VNodeProdData | Double | String | Null
  type RafCallback = js.Function1[/* timeStamp */ Double, Unit]
}

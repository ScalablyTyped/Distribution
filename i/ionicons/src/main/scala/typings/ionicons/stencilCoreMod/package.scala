package typings.ionicons

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object stencilCoreMod {
  type ChildType = typings.ionicons.stencilCoreMod.VNode | scala.Double | java.lang.String
  type FunctionalComponent[T] = js.Function3[
    /* props */ T, 
    /* children */ js.Array[typings.ionicons.stencilCoreMod.VNode], 
    /* utils */ typings.ionicons.stencilCoreMod.FunctionalUtilities, 
    typings.ionicons.stencilCoreMod.VNode | js.Array[typings.ionicons.stencilCoreMod.VNode]
  ]
  type PropsType = typings.ionicons.stencilCoreMod.VNodeProdData | scala.Double | java.lang.String | scala.Null
  type RafCallback = js.Function1[/* timeStamp */ scala.Double, scala.Unit]
}

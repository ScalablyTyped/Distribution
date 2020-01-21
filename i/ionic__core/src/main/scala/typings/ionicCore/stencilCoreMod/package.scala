package typings.ionicCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object stencilCoreMod {
  type ChildType = typings.ionicCore.stencilCoreMod.VNode | scala.Double | java.lang.String
  type FunctionalComponent[T] = js.Function3[
    /* props */ T, 
    /* children */ js.Array[typings.ionicCore.stencilCoreMod.VNode], 
    /* utils */ typings.ionicCore.stencilCoreMod.FunctionalUtilities, 
    typings.ionicCore.stencilCoreMod.VNode | js.Array[typings.ionicCore.stencilCoreMod.VNode]
  ]
  type PropsType = typings.ionicCore.stencilCoreMod.VNodeProdData | scala.Double | java.lang.String | scala.Null
  type RafCallback = js.Function1[/* timeStamp */ scala.Double, scala.Unit]
}

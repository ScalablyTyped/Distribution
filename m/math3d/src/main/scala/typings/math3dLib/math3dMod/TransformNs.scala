package typings
package math3dLib.math3dMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("math3d", "Transform")
@js.native
object TransformNs extends js.Object {
  @js.native
  sealed trait Space extends js.Object
  
  @js.native
  object Space extends js.Object {
    @js.native
    sealed trait Self
      extends math3dLib.math3dMod.TransformNs.Space
    
    @js.native
    sealed trait World
      extends math3dLib.math3dMod.TransformNs.Space
    
    /* 0 */ val Self: Self with scala.Double = js.native
    /* 1 */ val World: World with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[math3dLib.math3dMod.TransformNs.Space with scala.Double] = js.native
  }
  
}


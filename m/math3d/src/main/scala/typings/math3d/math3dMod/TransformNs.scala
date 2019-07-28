package typings.math3d.math3dMod

import typings.math3d.math3dMod.TransformNs.Space
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
    sealed trait Self extends Space
    
    @js.native
    sealed trait World extends Space
    
    /* 0 */ val Self: typings.math3d.math3dMod.TransformNs.Space.Self with Double = js.native
    /* 1 */ val World: typings.math3d.math3dMod.TransformNs.Space.World with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Space with Double] = js.native
  }
  
}


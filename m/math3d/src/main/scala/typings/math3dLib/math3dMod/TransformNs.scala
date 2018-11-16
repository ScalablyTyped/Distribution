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
    
    val Self: Self with java.lang.String = js.native
    val World: World with java.lang.String = js.native
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[math3dLib.math3dMod.TransformNs.Space with java.lang.String] = js.native
  }
  
}


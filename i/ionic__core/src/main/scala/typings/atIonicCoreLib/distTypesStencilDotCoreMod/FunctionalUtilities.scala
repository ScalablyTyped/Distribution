package typings
package atIonicCoreLib.distTypesStencilDotCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FunctionalUtilities extends js.Object {
  def forEach(
    children: js.Array[FVNode],
    cb: js.Function3[
      /* vnode */ ChildNode, 
      /* index */ scala.Double, 
      /* array */ js.Array[FVNode], 
      scala.Unit
    ]
  ): scala.Unit
  def map(
    children: js.Array[FVNode],
    cb: js.Function3[
      /* vnode */ ChildNode, 
      /* index */ scala.Double, 
      /* array */ js.Array[FVNode], 
      ChildNode
    ]
  ): js.Array[FVNode]
}

object FunctionalUtilities {
  @scala.inline
  def apply(
    forEach: (js.Array[FVNode], js.Function3[
      /* vnode */ ChildNode, 
      /* index */ scala.Double, 
      /* array */ js.Array[FVNode], 
      scala.Unit
    ]) => scala.Unit,
    map: (js.Array[FVNode], js.Function3[
      /* vnode */ ChildNode, 
      /* index */ scala.Double, 
      /* array */ js.Array[FVNode], 
      ChildNode
    ]) => js.Array[FVNode]
  ): FunctionalUtilities = {
    val __obj = js.Dynamic.literal(forEach = js.Any.fromFunction2(forEach), map = js.Any.fromFunction2(map))
  
    __obj.asInstanceOf[FunctionalUtilities]
  }
}


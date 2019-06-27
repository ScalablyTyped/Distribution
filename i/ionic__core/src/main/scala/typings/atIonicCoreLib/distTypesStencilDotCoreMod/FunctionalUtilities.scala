package typings
package atIonicCoreLib.distTypesStencilDotCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FunctionalUtilities extends js.Object {
  def forEach(
    children: js.Array[VNode],
    cb: js.Function3[
      /* vnode */ ChildNode, 
      /* index */ scala.Double, 
      /* array */ js.Array[ChildNode], 
      scala.Unit
    ]
  ): scala.Unit
  def map(
    children: js.Array[VNode],
    cb: js.Function3[
      /* vnode */ ChildNode, 
      /* index */ scala.Double, 
      /* array */ js.Array[ChildNode], 
      ChildNode
    ]
  ): js.Array[VNode]
}

object FunctionalUtilities {
  @scala.inline
  def apply(
    forEach: (js.Array[VNode], js.Function3[
      /* vnode */ ChildNode, 
      /* index */ scala.Double, 
      /* array */ js.Array[ChildNode], 
      scala.Unit
    ]) => scala.Unit,
    map: (js.Array[VNode], js.Function3[
      /* vnode */ ChildNode, 
      /* index */ scala.Double, 
      /* array */ js.Array[ChildNode], 
      ChildNode
    ]) => js.Array[VNode]
  ): FunctionalUtilities = {
    val __obj = js.Dynamic.literal(forEach = js.Any.fromFunction2(forEach), map = js.Any.fromFunction2(map))
  
    __obj.asInstanceOf[FunctionalUtilities]
  }
}


package typings.ionicons.stencilPublicRuntimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FunctionalUtilities extends StObject {
  
  def forEach(
    children: js.Array[VNode],
    cb: js.Function3[/* vnode */ ChildNode, /* index */ Double, /* array */ js.Array[ChildNode], Unit]
  ): Unit
  
  def map(
    children: js.Array[VNode],
    cb: js.Function3[/* vnode */ ChildNode, /* index */ Double, /* array */ js.Array[ChildNode], ChildNode]
  ): js.Array[VNode]
}
object FunctionalUtilities {
  
  @scala.inline
  def apply(
    forEach: (js.Array[VNode], js.Function3[/* vnode */ ChildNode, /* index */ Double, /* array */ js.Array[ChildNode], Unit]) => Unit,
    map: (js.Array[VNode], js.Function3[/* vnode */ ChildNode, /* index */ Double, /* array */ js.Array[ChildNode], ChildNode]) => js.Array[VNode]
  ): FunctionalUtilities = {
    val __obj = js.Dynamic.literal(forEach = js.Any.fromFunction2(forEach), map = js.Any.fromFunction2(map))
    __obj.asInstanceOf[FunctionalUtilities]
  }
  
  @scala.inline
  implicit class FunctionalUtilitiesMutableBuilder[Self <: FunctionalUtilities] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setForEach(
      value: (js.Array[VNode], js.Function3[/* vnode */ ChildNode, /* index */ Double, /* array */ js.Array[ChildNode], Unit]) => Unit
    ): Self = StObject.set(x, "forEach", js.Any.fromFunction2(value))
    
    @scala.inline
    def setMap(
      value: (js.Array[VNode], js.Function3[/* vnode */ ChildNode, /* index */ Double, /* array */ js.Array[ChildNode], ChildNode]) => js.Array[VNode]
    ): Self = StObject.set(x, "map", js.Any.fromFunction2(value))
  }
}

package typings.konva.anon

import org.scalablytyped.runtime.Instantiable0
import typings.konva.nodeMod.Node
import typings.konva.nodeMod.NodeConfig
import typings.konva.utilMod.Collection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofCollection
  extends StObject
     with Instantiable0[Collection[Node[NodeConfig]]] {
  
  def _mapMethod(methodName: js.Any): Unit = js.native
  
  def mapMethods(constructor: js.Function): Unit = js.native
  
  def toCollection[ChildNode /* <: Node[NodeConfig] */](arr: js.Array[ChildNode]): Collection[ChildNode] = js.native
}

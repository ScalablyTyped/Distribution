package typings.konva.anon

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.konva.nodeMod.Node
import typings.konva.nodeMod.NodeConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofNode
  extends Instantiable0[Node[NodeConfig]]
     with Instantiable1[
      /* import warning: RewrittenClass.unapply cls was tparam Config */ /* config */ js.Any, 
      Node[NodeConfig]
    ] {
  
  def _createNode(obj: js.Any): js.Any = js.native
  def _createNode(obj: js.Any, container: js.Any): js.Any = js.native
  
  def create(data: js.Any): js.Any = js.native
  def create(data: js.Any, container: js.Any): js.Any = js.native
}

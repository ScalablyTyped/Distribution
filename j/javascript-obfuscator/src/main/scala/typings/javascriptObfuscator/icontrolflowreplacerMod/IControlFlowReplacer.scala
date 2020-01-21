package typings.javascriptObfuscator.icontrolflowreplacerMod

import typings.javascriptObfuscator.tcontrolflowstorageMod.TControlFlowStorage
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IControlFlowReplacer extends js.Object {
  /**
    * @param node
    * @param parentNode
    * @param controlFlowStorage
    * @returns ESTree.Node
    */
  def replace(node: Node, parentNode: Node, controlFlowStorage: TControlFlowStorage): Node
}

object IControlFlowReplacer {
  @scala.inline
  def apply(replace: (Node, Node, TControlFlowStorage) => Node): IControlFlowReplacer = {
    val __obj = js.Dynamic.literal(replace = js.Any.fromFunction3(replace))
  
    __obj.asInstanceOf[IControlFlowReplacer]
  }
}


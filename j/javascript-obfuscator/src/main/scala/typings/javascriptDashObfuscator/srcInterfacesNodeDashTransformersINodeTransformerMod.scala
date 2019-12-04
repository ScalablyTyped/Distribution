package typings.javascriptDashObfuscator

import typings.estraverse.estraverseMod.VisitorOption
import typings.javascriptDashObfuscator.srcInterfacesNodeDashTransformersIVisitorMod.IVisitor
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("javascript-obfuscator/src/interfaces/node-transformers/INodeTransformer", JSImport.Namespace)
@js.native
object srcInterfacesNodeDashTransformersINodeTransformerMod extends js.Object {
  @js.native
  trait INodeTransformer extends js.Object {
    /**
      * @param {Node} node
      * @param {Node | null} parentNode
      */
    var analyzeNode: js.UndefOr[js.Function2[/* node */ Node, /* parentNode */ Node | Null, Unit]] = js.native
    /**
      * @param {Node} node
      * @param {Node | null} parentNode
      */
    var restoreNode: js.UndefOr[js.Function2[/* node */ Node, /* parentNode */ Node | Null, Unit]] = js.native
    /**
      * @param {TransformationStage} transformationStage
      * @returns {IVisitor | null}
      */
    def getVisitor(
      transformationStage: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TransformationStage */ js.Any
    ): IVisitor[Node] | Null = js.native
    def transformNode(node: Node): Node | VisitorOption = js.native
    /**
      * @param {Node} node
      * @param {Node | null} parentNode
      * @returns {Node | VisitorOption}
      */
    def transformNode(node: Node, parentNode: Node): Node | VisitorOption = js.native
  }
  
}


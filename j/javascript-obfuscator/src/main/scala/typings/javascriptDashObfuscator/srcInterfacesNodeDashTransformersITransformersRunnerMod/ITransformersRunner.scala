package typings.javascriptDashObfuscator.srcInterfacesNodeDashTransformersITransformersRunnerMod

import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITransformersRunner extends js.Object {
  /**
    * @param {T} astTree
    * @param {NodeTransformer[]} nodeTransformers
    * @param {TransformationStage} transformationStage
    * @returns {T}
    */
  def transform[T /* <: Node */](
    astTree: T,
    nodeTransformers: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeTransformer */ _
    ],
    transformationStage: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TransformationStage */ js.Any
  ): T
}

object ITransformersRunner {
  @scala.inline
  def apply(
    transform: (js.Any, js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeTransformer */ _
    ], /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TransformationStage */ js.Any) => js.Any
  ): ITransformersRunner = {
    val __obj = js.Dynamic.literal(transform = js.Any.fromFunction3(transform))
  
    __obj.asInstanceOf[ITransformersRunner]
  }
}


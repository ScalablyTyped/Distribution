package typings.javascriptObfuscator

import typings.javascriptObfuscator.icontrolflowreplacerMod.IControlFlowReplacer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("javascript-obfuscator/src/types/container/node-transformers/TControlFlowReplacerFactory", JSImport.Namespace)
@js.native
object tcontrolflowreplacerfactoryMod extends js.Object {
  type TControlFlowReplacerFactory = js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ControlFlowReplacer */ /* replacer */ js.Any, 
    IControlFlowReplacer
  ]
}


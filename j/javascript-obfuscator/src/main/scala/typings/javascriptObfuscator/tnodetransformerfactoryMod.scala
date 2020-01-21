package typings.javascriptObfuscator

import typings.javascriptObfuscator.inodetransformerMod.INodeTransformer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("javascript-obfuscator/src/types/container/node-transformers/TNodeTransformerFactory", JSImport.Namespace)
@js.native
object tnodetransformerfactoryMod extends js.Object {
  type TNodeTransformerFactory = js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeTransformer */ /* nodeTransformerName */ js.Any, 
    INodeTransformer
  ]
}


package typings.javascriptObfuscator

import typings.javascriptObfuscator.icustomnodeMod.ICustomNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("javascript-obfuscator/src/types/container/custom-nodes/TCustomNodeFactory", JSImport.Namespace)
@js.native
object tcustomnodefactoryMod extends js.Object {
  type TCustomNodeFactory = js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CustomNode */ /* customNodeName */ js.Any, 
    ICustomNode
  ]
}


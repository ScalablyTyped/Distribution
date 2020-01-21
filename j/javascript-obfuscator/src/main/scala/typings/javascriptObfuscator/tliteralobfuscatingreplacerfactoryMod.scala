package typings.javascriptObfuscator

import typings.javascriptObfuscator.iobfuscatingreplacerMod.IObfuscatingReplacer
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("javascript-obfuscator/src/types/container/node-transformers/TLiteralObfuscatingReplacerFactory", JSImport.Namespace)
@js.native
object tliteralobfuscatingreplacerfactoryMod extends js.Object {
  type TLiteralObfuscatingReplacerFactory = js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify LiteralObfuscatingReplacer */ /* replacer */ js.Any, 
    IObfuscatingReplacer[Node]
  ]
}


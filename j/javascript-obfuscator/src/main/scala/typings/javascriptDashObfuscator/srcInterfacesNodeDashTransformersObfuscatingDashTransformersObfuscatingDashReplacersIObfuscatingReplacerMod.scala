package typings.javascriptDashObfuscator

import typings.javascriptDashObfuscator.srcTypesNodeTNodeWithLexicalScopeMod.TNodeWithLexicalScope
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("javascript-obfuscator/src/interfaces/node-transformers/obfuscating-transformers/obfuscating-replacers/IObfuscatingReplacer", JSImport.Namespace)
@js.native
object srcInterfacesNodeDashTransformersObfuscatingDashTransformersObfuscatingDashReplacersIObfuscatingReplacerMod extends js.Object {
  @js.native
  trait IObfuscatingReplacer[T] extends js.Object {
    /**
      * @param {SimpleLiteral["value"]} nodeValue
      * @param {TNodeWithLexicalScope} lexicalScopeNode
      * @param {number} nodeIdentifier
      * @returns {T}
      */
    @JSName("replace")
    def replace_value(
      nodeValue: /* import warning: importer.ImportType#apply Failed type conversion: javascript-obfuscator.estree.SimpleLiteral['value'] */ js.Any
    ): T = js.native
    @JSName("replace")
    def replace_value(
      nodeValue: /* import warning: importer.ImportType#apply Failed type conversion: javascript-obfuscator.estree.SimpleLiteral['value'] */ js.Any,
      lexicalScopeNode: TNodeWithLexicalScope
    ): T = js.native
    @JSName("replace")
    def replace_value(
      nodeValue: /* import warning: importer.ImportType#apply Failed type conversion: javascript-obfuscator.estree.SimpleLiteral['value'] */ js.Any,
      lexicalScopeNode: TNodeWithLexicalScope,
      nodeIdentifier: Double
    ): T = js.native
  }
  
}


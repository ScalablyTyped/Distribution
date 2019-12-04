package typings.javascriptDashObfuscator

import typings.javascriptDashObfuscator.estreeMod.Identifier
import typings.javascriptDashObfuscator.srcInterfacesNodeDashTransformersObfuscatingDashTransformersObfuscatingDashReplacersIObfuscatingReplacerMod.IObfuscatingReplacer
import typings.javascriptDashObfuscator.srcTypesNodeTNodeWithLexicalScopeMod.TNodeWithLexicalScope
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("javascript-obfuscator/src/interfaces/node-transformers/obfuscating-transformers/obfuscating-replacers/IIdentifierObfuscatingReplacer", JSImport.Namespace)
@js.native
object srcInterfacesNodeDashTransformersObfuscatingDashTransformersObfuscatingDashReplacersIIdentifierObfuscatingReplacerMod extends js.Object {
  @js.native
  trait IIdentifierObfuscatingReplacer extends IObfuscatingReplacer[Identifier] {
    /**
      * @param {string} nodeValue
      * @param {TNodeWithLexicalScope} lexicalScopeNode
      */
    def storeGlobalName(nodeValue: String, lexicalScopeNode: TNodeWithLexicalScope): Unit = js.native
    /**
      * @param {string} nodeValue
      * @param {TNodeWithLexicalScope} lexicalScopeNode
      */
    def storeLocalName(nodeValue: String, lexicalScopeNode: TNodeWithLexicalScope): Unit = js.native
  }
  
}


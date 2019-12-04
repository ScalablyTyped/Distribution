package typings.javascriptDashObfuscator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("javascript-obfuscator/src/interfaces/generators/identifier-names-generators/IIdentifierNamesGenerator", JSImport.Namespace)
@js.native
object srcInterfacesGeneratorsIdentifierDashNamesDashGeneratorsIIdentifierNamesGeneratorMod extends js.Object {
  @js.native
  trait IIdentifierNamesGenerator extends js.Object {
    /**
      * @param {number} nameLength
      * @returns {string}
      */
    def generate(): String = js.native
    def generate(nameLength: Double): String = js.native
    /**
      * @param {number} nameLength
      * @returns {string}
      */
    def generateWithPrefix(): String = js.native
    def generateWithPrefix(nameLength: Double): String = js.native
    /**
      * @param {string} identifierName
      * @returns {boolean}
      */
    def isValidIdentifierName(identifierName: String): Boolean = js.native
  }
  
}


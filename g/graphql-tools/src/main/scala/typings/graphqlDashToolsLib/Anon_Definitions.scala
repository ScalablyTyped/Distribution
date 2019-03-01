package typings
package graphqlDashToolsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Definitions extends js.Object {
  var definitions: js.Array[graphqlLib.languageAstMod.DefinitionNode]
}

object Anon_Definitions {
  @scala.inline
  def apply(definitions: js.Array[graphqlLib.languageAstMod.DefinitionNode]): Anon_Definitions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("definitions")(definitions)
    __obj.asInstanceOf[Anon_Definitions]
  }
}


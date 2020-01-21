package typings.graphqlTools

import typings.graphql.astMod.DefinitionNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDefinitions extends js.Object {
  var definitions: js.Array[DefinitionNode]
}

object AnonDefinitions {
  @scala.inline
  def apply(definitions: js.Array[DefinitionNode]): AnonDefinitions = {
    val __obj = js.Dynamic.literal(definitions = definitions.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDefinitions]
  }
}


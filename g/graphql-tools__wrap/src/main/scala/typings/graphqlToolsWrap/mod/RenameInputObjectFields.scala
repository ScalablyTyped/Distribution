package typings.graphqlToolsWrap.mod

import typings.graphql.definitionMod.GraphQLInputFieldConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@graphql-tools/wrap", "RenameInputObjectFields")
@js.native
class RenameInputObjectFields protected ()
  extends typings.graphqlToolsWrap.transformsMod.RenameInputObjectFields {
  def this(renamer: js.Function3[
        /* typeName */ String, 
        /* fieldName */ String, 
        /* inputFieldConfig */ GraphQLInputFieldConfig, 
        String
      ]) = this()
}


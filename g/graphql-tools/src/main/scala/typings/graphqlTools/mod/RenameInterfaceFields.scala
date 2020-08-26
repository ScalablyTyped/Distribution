package typings.graphqlTools.mod

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.definitionMod.GraphQLFieldConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-tools", "RenameInterfaceFields")
@js.native
class RenameInterfaceFields protected ()
  extends typings.graphqlToolsWrap.mod.RenameInterfaceFields {
  def this(renamer: js.Function3[
        /* typeName */ String, 
        /* fieldName */ String, 
        /* fieldConfig */ GraphQLFieldConfig[_, _, StringDictionary[_]], 
        String
      ]) = this()
}


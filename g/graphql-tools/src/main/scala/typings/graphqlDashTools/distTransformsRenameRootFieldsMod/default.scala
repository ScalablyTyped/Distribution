package typings.graphqlDashTools.distTransformsRenameRootFieldsMod

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.graphqlMod.GraphQLSchema
import typings.graphql.typeDefinitionMod.GraphQLField
import typings.graphqlDashTools.graphqlDashToolsStrings.Mutation
import typings.graphqlDashTools.graphqlDashToolsStrings.Query
import typings.graphqlDashTools.graphqlDashToolsStrings.Subscription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-tools/dist/transforms/RenameRootFields", JSImport.Default)
@js.native
class default protected () extends RenameRootFields {
  def this(renamer: js.Function3[
        /* operation */ Query | Mutation | Subscription, 
        /* name */ String, 
        /* field */ GraphQLField[_, _, StringDictionary[_]], 
        String
      ]) = this()
  /* CompleteClass */
  override var transformer: js.Any = js.native
  /* CompleteClass */
  @JSName("transformSchema")
  override def transformSchema_MRenameRootFields(originalSchema: GraphQLSchema): GraphQLSchema = js.native
}


package typings.graphqlDashTools.distTransformsFilterRootFieldsMod

import typings.graphql.graphqlMod.GraphQLSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-tools/dist/transforms/FilterRootFields", JSImport.Default)
@js.native
class default protected () extends FilterRootFields {
  def this(filter: RootFilter) = this()
  /* CompleteClass */
  override var transformer: js.Any = js.native
  /* CompleteClass */
  @JSName("transformSchema")
  override def transformSchema_MFilterRootFields(originalSchema: GraphQLSchema): GraphQLSchema = js.native
}


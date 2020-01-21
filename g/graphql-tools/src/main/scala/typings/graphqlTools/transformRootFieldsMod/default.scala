package typings.graphqlTools.transformRootFieldsMod

import typings.graphql.mod.GraphQLSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-tools/dist/transforms/TransformRootFields", JSImport.Default)
@js.native
class default protected () extends TransformRootFields {
  def this(transform: RootTransformer) = this()
  /* CompleteClass */
  override var transform: js.Any = js.native
  /* CompleteClass */
  @JSName("transformSchema")
  override def transformSchema_MTransformRootFields(originalSchema: GraphQLSchema): GraphQLSchema = js.native
}


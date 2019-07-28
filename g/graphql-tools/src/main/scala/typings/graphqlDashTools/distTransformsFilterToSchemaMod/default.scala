package typings.graphqlDashTools.distTransformsFilterToSchemaMod

import typings.graphql.graphqlMod.GraphQLSchema
import typings.graphqlDashTools.distInterfacesMod.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-tools/dist/transforms/FilterToSchema", JSImport.Default)
@js.native
class default protected () extends FilterToSchema {
  def this(targetSchema: GraphQLSchema) = this()
  /* CompleteClass */
  override var targetSchema: js.Any = js.native
  /* CompleteClass */
  @JSName("transformRequest")
  override def transformRequest_MFilterToSchema(originalRequest: Request): Request = js.native
}


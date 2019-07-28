package typings.graphqlDashTools.distTransformsExpandAbstractTypesMod

import typings.graphql.graphqlMod.GraphQLSchema
import typings.graphqlDashTools.distInterfacesMod.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-tools/dist/transforms/ExpandAbstractTypes", JSImport.Default)
@js.native
class default protected () extends ExpandAbstractTypes {
  def this(transformedSchema: GraphQLSchema, targetSchema: GraphQLSchema) = this()
  /* CompleteClass */
  override var mapping: js.Any = js.native
  /* CompleteClass */
  override var reverseMapping: js.Any = js.native
  /* CompleteClass */
  override var targetSchema: js.Any = js.native
  /* CompleteClass */
  @JSName("transformRequest")
  override def transformRequest_MExpandAbstractTypes(originalRequest: Request): Request = js.native
}


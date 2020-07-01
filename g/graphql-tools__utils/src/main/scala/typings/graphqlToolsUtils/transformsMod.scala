package typings.graphqlToolsUtils

import typings.graphql.mod.GraphQLSchema
import typings.graphqlToolsUtils.interfacesMod.Request
import typings.graphqlToolsUtils.interfacesMod.Transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@graphql-tools/utils/transforms", JSImport.Namespace)
@js.native
object transformsMod extends js.Object {
  def applyRequestTransforms(originalRequest: Request, transforms: js.Array[Transform]): Request = js.native
  def applyResultTransforms(originalResult: js.Any, transforms: js.Array[Transform]): js.Any = js.native
  def applySchemaTransforms(originalSchema: GraphQLSchema, transforms: js.Array[Transform]): GraphQLSchema = js.native
}


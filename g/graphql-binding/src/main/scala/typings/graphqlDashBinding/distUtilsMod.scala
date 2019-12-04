package typings.graphqlDashBinding

import typings.graphql.graphqlMod.GraphQLSchema
import typings.graphql.typeDefinitionMod.GraphQLOutputType
import typings.graphql.typeDefinitionMod.GraphQLResolveInfo
import typings.graphqlDashBinding.distTypesMod.Operation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-binding/dist/utils", JSImport.Namespace)
@js.native
object distUtilsMod extends js.Object {
  def forwardTo(bindingName: String): js.Function4[
    /* parent */ js.Any, 
    /* args */ js.Any, 
    /* context */ js.Any, 
    /* info */ GraphQLResolveInfo, 
    _
  ] = js.native
  def getTypeForRootFieldName(rootFieldName: String, operation: Operation, schema: GraphQLSchema): GraphQLOutputType = js.native
  def isScalar(t: GraphQLOutputType): Boolean = js.native
  def printDocumentFromInfo(info: GraphQLResolveInfo): String = js.native
}


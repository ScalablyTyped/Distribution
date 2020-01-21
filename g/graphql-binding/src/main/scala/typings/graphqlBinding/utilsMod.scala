package typings.graphqlBinding

import typings.graphql.definitionMod.GraphQLOutputType
import typings.graphql.definitionMod.GraphQLResolveInfo
import typings.graphql.mod.GraphQLSchema
import typings.graphqlBinding.distTypesMod.Operation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-binding/dist/utils", JSImport.Namespace)
@js.native
object utilsMod extends js.Object {
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


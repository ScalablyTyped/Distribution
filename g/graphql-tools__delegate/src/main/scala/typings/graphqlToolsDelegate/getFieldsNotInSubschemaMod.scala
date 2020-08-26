package typings.graphqlToolsDelegate

import typings.graphql.astMod.FieldNode
import typings.graphql.definitionMod.GraphQLResolveInfo
import typings.graphql.mod.GraphQLSchema
import typings.graphqlToolsDelegate.typesMod.MergedTypeInfo
import typings.graphqlToolsDelegate.typesMod.SubschemaConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@graphql-tools/delegate/results/getFieldsNotInSubschema", JSImport.Namespace)
@js.native
object getFieldsNotInSubschemaMod extends js.Object {
  def getFieldsNotInSubschema(A1: GraphQLResolveInfo, A2: GraphQLSchema, A3: MergedTypeInfo, A4: String): js.Array[FieldNode] = js.native
  def getFieldsNotInSubschema(A1: GraphQLResolveInfo, A2: SubschemaConfig, A3: MergedTypeInfo, A4: String): js.Array[FieldNode] = js.native
}


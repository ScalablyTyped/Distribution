package typings.graphqlToolsDelegate

import typings.graphql.astMod.OperationTypeNode
import typings.graphql.mod.GraphQLObjectType
import typings.graphql.mod.GraphQLSchema
import typings.graphqlToolsDelegate.typesMod.ICreateRequest
import typings.graphqlToolsDelegate.typesMod.ICreateRequestFromInfo
import typings.graphqlToolsUtils.interfacesMod.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@graphql-tools/delegate/createRequest", JSImport.Namespace)
@js.native
object createRequestMod extends js.Object {
  def createRequest(
    hasSourceSchemaSourceParentTypeSourceFieldNameFragmentsVariableDefinitionsVariableValuesTargetOperationNameTargetOperationTargetFieldNameSelectionSetFieldNodes: ICreateRequest
  ): Request = js.native
  def createRequestFromInfo(hasInfoOperationNameOperationFieldNameSelectionSetFieldNodes: ICreateRequestFromInfo): Request = js.native
  def getDelegatingOperation(parentType: GraphQLObjectType[_, _], schema: GraphQLSchema): OperationTypeNode = js.native
}


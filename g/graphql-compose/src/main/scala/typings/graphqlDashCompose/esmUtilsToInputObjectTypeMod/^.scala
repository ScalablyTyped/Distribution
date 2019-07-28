package typings.graphqlDashCompose.esmUtilsToInputObjectTypeMod

import typings.graphql.typeDefinitionMod.GraphQLInputType
import typings.graphql.typeDefinitionMod.GraphQLType
import typings.graphqlDashCompose.esmInputTypeComposerMod.InputTypeComposer
import typings.graphqlDashCompose.esmInterfaceTypeComposerMod.InterfaceTypeComposer
import typings.graphqlDashCompose.esmObjectTypeComposerMod.ObjectTypeComposer
import typings.graphqlDashCompose.esmSchemaComposerMod.SchemaComposer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-compose/esm/utils/toInputObjectType", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def convertInputObjectField(field: GraphQLType, opts: ConvertInputObjectFieldOpts, schemaComposer: SchemaComposer[_]): GraphQLInputType | Null = js.native
  def toInputObjectType[TContext](tc: InterfaceTypeComposer[_, TContext]): InputTypeComposer[TContext] = js.native
  def toInputObjectType[TContext](tc: InterfaceTypeComposer[_, TContext], opts: ToInputObjectTypeOpts): InputTypeComposer[TContext] = js.native
  def toInputObjectType[TContext](tc: ObjectTypeComposer[_, TContext]): InputTypeComposer[TContext] = js.native
  def toInputObjectType[TContext](tc: ObjectTypeComposer[_, TContext], opts: ToInputObjectTypeOpts): InputTypeComposer[TContext] = js.native
}


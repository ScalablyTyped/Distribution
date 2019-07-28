package typings.graphqlDashCompose.libUtilsToInputObjectTypeMod

import typings.graphql.typeDefinitionMod.GraphQLInputType
import typings.graphql.typeDefinitionMod.GraphQLType
import typings.graphqlDashCompose.libInputTypeComposerMod.InputTypeComposer
import typings.graphqlDashCompose.libInterfaceTypeComposerMod.InterfaceTypeComposer
import typings.graphqlDashCompose.libObjectTypeComposerMod.ObjectTypeComposer
import typings.graphqlDashCompose.libSchemaComposerMod.SchemaComposer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-compose/lib/utils/toInputObjectType", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def convertInputObjectField(field: GraphQLType, opts: ConvertInputObjectFieldOpts, schemaComposer: SchemaComposer[_]): GraphQLInputType | Null = js.native
  def toInputObjectType[TContext](tc: InterfaceTypeComposer[_, TContext]): InputTypeComposer[TContext] = js.native
  def toInputObjectType[TContext](tc: InterfaceTypeComposer[_, TContext], opts: ToInputObjectTypeOpts): InputTypeComposer[TContext] = js.native
  def toInputObjectType[TContext](tc: ObjectTypeComposer[_, TContext]): InputTypeComposer[TContext] = js.native
  def toInputObjectType[TContext](tc: ObjectTypeComposer[_, TContext], opts: ToInputObjectTypeOpts): InputTypeComposer[TContext] = js.native
}


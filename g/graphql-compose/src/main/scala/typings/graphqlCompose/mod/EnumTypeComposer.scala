package typings.graphqlCompose.mod

import typings.graphqlCompose.enumTypeComposerMod.EnumTypeComposeDefinition
import typings.graphqlCompose.graphqlMod.GraphQLEnumType
import typings.graphqlCompose.schemaComposerMod.SchemaComposer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-compose", "EnumTypeComposer")
@js.native
class EnumTypeComposer[TContext] protected ()
  extends typings.graphqlCompose.enumTypeComposerMod.EnumTypeComposer[TContext] {
  def this(gqType: GraphQLEnumType, schemaComposer: SchemaComposer[TContext]) = this()
}

/* static members */
@JSImport("graphql-compose", "EnumTypeComposer")
@js.native
object EnumTypeComposer extends js.Object {
  /**
    * Create `EnumTypeComposer` with adding it by name to the `SchemaComposer`. This type became avaliable in SDL by its name.
    */
  def create[TCtx](typeDef: EnumTypeComposeDefinition, schemaComposer: SchemaComposer[TCtx]): typings.graphqlCompose.enumTypeComposerMod.EnumTypeComposer[TCtx] = js.native
  /**
    * Create `EnumTypeComposer` without adding it to the `SchemaComposer`. This method may be usefull in plugins, when you need to create type temporary.
    */
  def createTemp[TCtx](typeDef: EnumTypeComposeDefinition): typings.graphqlCompose.enumTypeComposerMod.EnumTypeComposer[TCtx] = js.native
  def createTemp[TCtx](typeDef: EnumTypeComposeDefinition, schemaComposer: SchemaComposer[TCtx]): typings.graphqlCompose.enumTypeComposerMod.EnumTypeComposer[TCtx] = js.native
}


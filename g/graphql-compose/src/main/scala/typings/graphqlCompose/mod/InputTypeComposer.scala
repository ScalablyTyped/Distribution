package typings.graphqlCompose.mod

import typings.graphqlCompose.graphqlMod.GraphQLInputObjectType
import typings.graphqlCompose.inputTypeComposerMod.InputTypeComposeDefinition
import typings.graphqlCompose.schemaComposerMod.SchemaComposer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-compose", "InputTypeComposer")
@js.native
class InputTypeComposer[TContext] protected ()
  extends typings.graphqlCompose.inputTypeComposerMod.InputTypeComposer[TContext] {
  def this(gqType: GraphQLInputObjectType, schemaComposer: SchemaComposer[TContext]) = this()
}

/* static members */
@JSImport("graphql-compose", "InputTypeComposer")
@js.native
object InputTypeComposer extends js.Object {
  /**
    * Create `InputTypeComposer` with adding it by name to the `SchemaComposer`.
    */
  def create[TCtx](typeDef: InputTypeComposeDefinition, schemaComposer: SchemaComposer[TCtx]): typings.graphqlCompose.inputTypeComposerMod.InputTypeComposer[TCtx] = js.native
  /**
    * Create `InputTypeComposer` without adding it to the `SchemaComposer`. This method may be usefull in plugins, when you need to create type temporary.
    */
  def createTemp[TCtx](typeDef: InputTypeComposeDefinition): typings.graphqlCompose.inputTypeComposerMod.InputTypeComposer[TCtx] = js.native
  def createTemp[TCtx](typeDef: InputTypeComposeDefinition, schemaComposer: SchemaComposer[TCtx]): typings.graphqlCompose.inputTypeComposerMod.InputTypeComposer[TCtx] = js.native
}


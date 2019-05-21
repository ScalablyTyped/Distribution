package typings
package graphqlDashComposeLib.esmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-compose/esm", "EnumTypeComposer")
@js.native
class EnumTypeComposer[TContext] protected ()
  extends graphqlDashComposeLib.esmEnumTypeComposerMod.EnumTypeComposer[TContext] {
  def this(gqType: graphqlDashComposeLib.esmGraphqlMod.GraphQLEnumType, schemaComposer: graphqlDashComposeLib.esmSchemaComposerMod.SchemaComposer[TContext]) = this()
}

/* static members */
@JSImport("graphql-compose/esm", "EnumTypeComposer")
@js.native
object EnumTypeComposer extends js.Object {
  /**
    * Create `EnumTypeComposer` with adding it by name to the `SchemaComposer`. This type became avaliable in SDL by its name.
    */
  def create[TCtx](
    typeDef: graphqlDashComposeLib.esmEnumTypeComposerMod.EnumTypeComposeDefinition,
    schemaComposer: graphqlDashComposeLib.esmSchemaComposerMod.SchemaComposer[TCtx]
  ): graphqlDashComposeLib.esmEnumTypeComposerMod.EnumTypeComposer[TCtx] = js.native
  /**
    * Create `EnumTypeComposer` without adding it to the `SchemaComposer`. This method may be usefull in plugins, when you need to create type temporary.
    */
  def createTemp[TCtx](typeDef: graphqlDashComposeLib.esmEnumTypeComposerMod.EnumTypeComposeDefinition): graphqlDashComposeLib.esmEnumTypeComposerMod.EnumTypeComposer[TCtx] = js.native
  def createTemp[TCtx](
    typeDef: graphqlDashComposeLib.esmEnumTypeComposerMod.EnumTypeComposeDefinition,
    schemaComposer: graphqlDashComposeLib.esmSchemaComposerMod.SchemaComposer[TCtx]
  ): graphqlDashComposeLib.esmEnumTypeComposerMod.EnumTypeComposer[TCtx] = js.native
}


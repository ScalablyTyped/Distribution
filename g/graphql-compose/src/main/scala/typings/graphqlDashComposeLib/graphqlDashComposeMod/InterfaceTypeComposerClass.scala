package typings
package graphqlDashComposeLib.graphqlDashComposeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-compose", "InterfaceTypeComposerClass")
@js.native
class InterfaceTypeComposerClass[TSource, TContext] protected ()
  extends graphqlDashComposeLib.libInterfaceTypeComposerMod.InterfaceTypeComposer[TSource, TContext] {
  def this(gqType: graphqlLib.graphqlMod.GraphQLInterfaceType) = this()
}

/* static members */
@JSImport("graphql-compose", "InterfaceTypeComposerClass")
@js.native
object InterfaceTypeComposerClass extends js.Object {
  var schemaComposer: graphqlDashComposeLib.libSchemaComposerMod.SchemaComposer[_] = js.native
  def create[TSrc, TCtx](typeDef: graphqlDashComposeLib.libInterfaceTypeComposerMod.InterfaceTypeComposerDefinition[TCtx]): graphqlDashComposeLib.libInterfaceTypeComposerMod.InterfaceTypeComposer[TSrc, TCtx] = js.native
  def createTemp[TSrc, TCtx](typeDef: graphqlDashComposeLib.libInterfaceTypeComposerMod.InterfaceTypeComposerDefinition[TCtx]): graphqlDashComposeLib.libInterfaceTypeComposerMod.InterfaceTypeComposer[TSrc, TCtx] = js.native
}


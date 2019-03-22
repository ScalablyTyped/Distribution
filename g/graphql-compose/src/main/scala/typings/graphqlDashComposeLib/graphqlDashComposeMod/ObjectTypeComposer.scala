package typings
package graphqlDashComposeLib.graphqlDashComposeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-compose", "ObjectTypeComposer")
@js.native
class ObjectTypeComposer[TSource, TContext] protected ()
  extends graphqlDashComposeLib.libObjectTypeComposerMod.ObjectTypeComposer[TSource, TContext] {
  def this(gqType: graphqlLib.graphqlMod.GraphQLObjectType[_, _, org.scalablytyped.runtime.StringDictionary[_]], schemaComposer: graphqlDashComposeLib.libSchemaComposerMod.SchemaComposer[TContext]) = this()
}

/* static members */
@JSImport("graphql-compose", "ObjectTypeComposer")
@js.native
object ObjectTypeComposer extends js.Object {
  def create[TSrc, TCtx](
    typeDef: graphqlDashComposeLib.libObjectTypeComposerMod.ObjectTypeComposeDefinition[TSrc, TCtx],
    schemaComposer: graphqlDashComposeLib.libSchemaComposerMod.SchemaComposer[TCtx]
  ): graphqlDashComposeLib.libObjectTypeComposerMod.ObjectTypeComposer[TSrc, TCtx] = js.native
  def createTemp[TSrc, TCtx](typeDef: graphqlDashComposeLib.libObjectTypeComposerMod.ObjectTypeComposeDefinition[TSrc, TCtx]): graphqlDashComposeLib.libObjectTypeComposerMod.ObjectTypeComposer[TSrc, TCtx] = js.native
  def createTemp[TSrc, TCtx](
    typeDef: graphqlDashComposeLib.libObjectTypeComposerMod.ObjectTypeComposeDefinition[TSrc, TCtx],
    schemaComposer: graphqlDashComposeLib.libSchemaComposerMod.SchemaComposer[TCtx]
  ): graphqlDashComposeLib.libObjectTypeComposerMod.ObjectTypeComposer[TSrc, TCtx] = js.native
}

